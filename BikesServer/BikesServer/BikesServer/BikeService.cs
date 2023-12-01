using Bikes;
using System;
using System.Collections.Generic;
using System.Diagnostics.Contracts;
using System.Linq;
using System.Net.Http;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Text.Json;
using System.Threading.Tasks;
using System.Web;
using System.Net;
using System.ServiceModel.Description;
using System.Security.Policy;
using System.Globalization;
using ConsoleApp_for_Self_Hosted_WS.ServiceReference1;
using System.Device.Location;
using System.Web.UI.WebControls;

namespace Bikes
{
    // REMARQUE : vous pouvez utiliser la commande Renommer du menu Refactoriser pour changer le nom de classe "Service1" à la fois dans le code et le fichier de configuration.
    public class BikeService : IBikeService
    {
        string jcdecauxApiKey = "5ac79e15e6fab096879404ee6c57e8da02ad4f1d";
        string routingApiKey = "5b3ce3597851110001cf62488e092239ad124963a1770aa1414560e8";
        StationsElementsProxyClient stationsProxy = new StationsElementsProxyClient();
        
        private static readonly HttpClient client = new HttpClient();

        public async Task<Station[]> GetStationsFromAddress(string address)
        {
            Task<List<Place>> originsTask = GetPlacesFromAddress(address);


            List<Place> places = await originsTask;

            if (places == null)
            {
                throw new Exception("Non-existent address : " + address);
            }

            else
            {
                string cityName = places[0].address.city;
                return await getStationsFromCityName(cityName);
            }
        }

        public async Task<Step[]> GetFootSteps(string origin, string destination)
        {
            PositionStrings originPosition = await getPositionFromAddress(origin);
            PositionStrings destinationPosition = await getPositionFromAddress(destination);

            string uri = $"https://api.openrouteservice.org/v2/directions/foot-walking?api_key={routingApiKey}&start={originPosition.lon},{originPosition.lat}&end={destinationPosition.lon},{destinationPosition.lat}";
            Routing routing = await GetRouting(uri);
            return routing.features[0].properties.segments[0].steps;

        }

        public async Task<Step[]> GetCyclingSteps(string origin, string destination)
        {
            PositionStrings originPosition = await getPositionFromAddress(origin);
            PositionStrings destinationPosition = await getPositionFromAddress(destination);

            string uri = $"https://api.openrouteservice.org/v2/directions/cycling-regular?api_key={routingApiKey}&start={originPosition.lon},{originPosition.lat}&end={destinationPosition.lon},{destinationPosition.lat}";
            Routing routing = await GetRouting(uri);
            return routing.features[0].properties.segments[0].steps;

        }

        public async Task<List<List<double>>> GetFootCoordinates(string originLon, string originLat, string destinationLon, string destinationLat)
        {
            string uri = $"https://api.openrouteservice.org/v2/directions/foot-walking?api_key={routingApiKey}&start={originLon},{originLat}&end={destinationLon},{destinationLat}";
            Routing routing = await GetRouting(uri);
            return routing.features[0].geometry.coordinates;

        }

        public async Task<List<List<double>>> GetCyclingCoordinates(string originLon, string originLat, string destinationLon, string destinationLat)
        {
            string uri = $"https://api.openrouteservice.org/v2/directions/cycling-regular?api_key={routingApiKey}&start={originLon},{originLat}&end={destinationLon},{destinationLat}";
            Routing routing = await GetRouting(uri);
            return routing.features[0].geometry.coordinates;

        }


        public async Task<Station> GetNearestStationWithAvailableBikes(string address)
        {
            try
            {
                // Get the position (latitude and longitude) for the provided address
                PositionStrings addressPosition = await getPositionFromAddress(address);


                GeoCoordinate addressCoordinates = new GeoCoordinate(parseDouble(addressPosition.lat), parseDouble(addressPosition.lon));



                // Get the list of stations based on the provided address
                Station[] stations = await GetStationsFromAddress(address);


                // Initialize variables for tracking the nearest station and the minimum distance
                Station nearest = null;
                double minDistance = double.MaxValue;

                // Iterate through each station to find the nearest one
                foreach (Station station in stations)
                {
                    if (station.available_bikes > 0)
                    {
                        GeoCoordinate stationCoordinates = new GeoCoordinate(station.position.lat, station.position.lng);

                        // Calculate the distance between the address position and the station's position
                        double distance = addressCoordinates.GetDistanceTo(stationCoordinates);
                        // Check if the current station is closer than the previous nearest station
                        if (distance < minDistance)
                        {
                            minDistance = distance;
                            nearest = station;
                        }
                    }
                }

                // Return the nearest station
                return nearest;
                
            }
            catch(Exception ex)
            {
                throw new Exception($"{ex.Message}");
            }
        }

        public async Task<Station> GetNearestStationWithAvailableBikeStands(string address)
        {
            try
            {
                // Get the position (latitude and longitude) for the provided address
                PositionStrings addressPosition = await getPositionFromAddress(address);


                GeoCoordinate addressCoordinates = new GeoCoordinate(parseDouble(addressPosition.lat), parseDouble(addressPosition.lon));



                // Get the list of stations based on the provided address
                Station[] stations = await GetStationsFromAddress(address);


                // Initialize variables for tracking the nearest station and the minimum distance
                Station nearest = null;
                double minDistance = double.MaxValue;

                // Iterate through each station to find the nearest one
                foreach (Station station in stations)
                {
                    if (station.available_bike_stands > 0)
                    {
                        GeoCoordinate stationCoordinates = new GeoCoordinate(station.position.lat, station.position.lng);

                        // Calculate the distance between the address position and the station's position
                        double distance = addressCoordinates.GetDistanceTo(stationCoordinates);
                        // Check if the current station is closer than the previous nearest station
                        if (distance < minDistance)
                        {
                            minDistance = distance;
                            nearest = station;
                        }
                    }
                }

                // Return the nearest station
                return nearest;

            }
            catch (Exception ex)
            {
                throw new Exception($"{ex.Message}");
            }
        }

        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        public async Task<(List<List<double>> walkingCoordinates, List<string> type)> GetItineraryCoordinates(string origin, string destination)
        {
            try
            {
                var nearestStationOriginResult = await GetNearestStationWithAvailableBikes(origin);
                var nearestStationDestinationResult = await GetNearestStationWithAvailableBikeStands(destination);
                Position nearestStationOrigin = nearestStationOriginResult.position;
                Position nearestStationDestination = nearestStationDestinationResult.position;

                PositionStrings originPosition = await getPositionFromAddress(origin);
                PositionStrings destinationPosition = await getPositionFromAddress(destination);


                // Check if either result is null
                if (nearestStationOriginResult == null || nearestStationDestinationResult == null)
                {
                    // Handle the case where the closest station is null
                    // Assuming the person has to go on foot for the entire distance
                    List<List<double>> footCoordinates = await GetFootCoordinates(originPosition.lon, originPosition.lat, destinationPosition.lon, destinationPosition.lat);
                    return (walkingCoordinates: footCoordinates, type: new List<string> { "walking" });
                }



                double distanceToOriginStation = await CalculateDistance(originPosition.lon, originPosition.lat, nearestStationOrigin.lng.ToString(CultureInfo.InvariantCulture), nearestStationOrigin.lat.ToString(CultureInfo.InvariantCulture));
                double distanceStationToDestination = await CalculateDistance(destinationPosition.lon, destinationPosition.lat, nearestStationDestination.lng.ToString(CultureInfo.InvariantCulture), nearestStationDestination.lat.ToString(CultureInfo.InvariantCulture));

                double distanceToDestination = await CalculateDistance(origin, destination);
                if (distanceToOriginStation + distanceStationToDestination >= distanceToDestination)
                {
                    // If walking is preferred due to distance
                    List<List<double>> footCoordinates = await GetFootCoordinates(originPosition.lon, originPosition.lat, destinationPosition.lon, destinationPosition.lat);
                    return (walkingCoordinates: footCoordinates, type: Enumerable.Repeat("walking", footCoordinates.Count).ToList());
                }
                else
                {
                    List<List<double>> footCoordinates1 = await GetFootCoordinates(originPosition.lon, originPosition.lat, nearestStationOrigin.lng.ToString(CultureInfo.InvariantCulture), nearestStationOrigin.lat.ToString(CultureInfo.InvariantCulture));
                    List<List<double>> cyclingCoordinates = await GetCyclingCoordinates(nearestStationOrigin.lng.ToString(CultureInfo.InvariantCulture), nearestStationOrigin.lat.ToString(CultureInfo.InvariantCulture), nearestStationDestination.lng.ToString(CultureInfo.InvariantCulture), nearestStationDestination.lat.ToString(CultureInfo.InvariantCulture));
                    List<List<double>> footCoordinates2 = await GetFootCoordinates(nearestStationDestination.lng.ToString(CultureInfo.InvariantCulture), nearestStationDestination.lat.ToString(CultureInfo.InvariantCulture), destinationPosition.lon, destinationPosition.lat);

                    List<List<double>> walkingCoordinates = new List<List<double>>();
                    walkingCoordinates.AddRange(footCoordinates1);
                    walkingCoordinates.AddRange(cyclingCoordinates);
                    walkingCoordinates.AddRange(footCoordinates2);

                    List<string> types = new List<string>();
                    types.AddRange(Enumerable.Repeat("walking", footCoordinates1.Count));
                    types.AddRange(Enumerable.Repeat("biking", cyclingCoordinates.Count));
                    types.AddRange(Enumerable.Repeat("walking", footCoordinates2.Count));

                    return (walkingCoordinates: walkingCoordinates, type: types);
                }
            }
            catch (Exception ex)
            {
                /*try
                {
                    // Handle exceptions, returning walking as a default type
                    List<List<double>> footCoordinates = await GetFootCoordinates(origin, destination);
                    return (walkingCoordinates: footCoordinates, type: Enumerable.Repeat("walking", footCoordinates.Count).ToList());
                }
                catch (Exception)
                {*/
                throw new Exception(ex.Message);
                //}
            }
        }





        public async Task<Step[]> GetItinerarySteps(string origin, string destination)
            {
                try
                {
                    var nearestStationOriginResult = await GetNearestStationWithAvailableBikes(origin);
                    var nearestStationDestinationResult = await GetNearestStationWithAvailableBikeStands(destination);


                    // Check if either result is null
                    if (nearestStationOriginResult == null || nearestStationDestinationResult == null)
                    {
                        return await GetFootSteps(origin, destination);
                    }

                    string nearestStationOrigin = nearestStationOriginResult.address+", "+nearestStationOriginResult.contract_name;
                    string nearestStationDestination = nearestStationDestinationResult.address+", "+nearestStationDestinationResult.contract_name;

                    double distanceToOriginStation = await CalculateDistance(origin, nearestStationOrigin);
                    double distanceStationToDestination = await CalculateDistance(destination, nearestStationDestination);

                    double distanceToDestination = await CalculateDistance(origin, destination);
                    if (distanceToOriginStation + distanceStationToDestination >= distanceToDestination)
                    {
                        Console.WriteLine(distanceStationToDestination+"+"+distanceToOriginStation+">="+distanceToDestination);
                        return await GetFootSteps(origin, destination);
                    }
                    else
                    {
                        Step[] footSteps1 = await GetFootSteps(origin, nearestStationOrigin);
                        Step[] cyclingSteps = await GetCyclingSteps(nearestStationOrigin, nearestStationDestination);
                        Step[] footSteps2 = await GetFootSteps(nearestStationDestination, destination);

                        Step takeBike = new Step();
                        takeBike.instruction = "Take a bike";
                        takeBike.distance = 0;

                        Step returnBike = new Step();
                        returnBike.instruction = "Return the bike";
                        returnBike.distance = 0;


                        return footSteps1
                                 .Concat(new[] { takeBike })
                                 .Concat(cyclingSteps)
                                 .Concat(new[] { returnBike })
                                 .Concat(footSteps2)
                                 .ToArray();

                }
                }
                catch (Exception ex)
                {
                    try
                    {
                        return await GetFootSteps(origin, destination);
                    }
                    catch (Exception)
                    {
                        throw new Exception(ex.Message);
                    }
                }
            }

            //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

            public async Task<Station[]> getStationsFromCityName(string city)
        {
            try
            {
                string uri = $"https://api.jcdecaux.com/vls/v1/stations?contract={city}&apiKey={jcdecauxApiKey}";
                return (await stationsProxy.GeStationstWithSecondsAsync(uri,3000));
            }
            catch (Exception ex)
            {
                throw new Exception($"An error occurred: {ex.Message}");
            }
        }

        public async Task<List<Place>> GetPlacesFromAddress(string address)
        {

            try
            {
                string encodedAddress = HttpUtility.UrlEncode(address);
                string url = $"https://nominatim.openstreetmap.org/search?q={encodedAddress}&format=json&polygon_kml=1&addressdetails=1";

                client.DefaultRequestHeaders.Add("User-Agent", "bikes app");

                HttpResponseMessage response = await client.GetAsync(url);

                response.EnsureSuccessStatusCode();

                string responseBody = await response.Content.ReadAsStringAsync();

                // Deserialize the response and return the result wrapped in Task
                List<Place> places = DeserializeResponse<List<Place>>(responseBody);
                return places;
            }

            catch (Exception ex)
            {
                throw new Exception($"An error occurred: {ex.Message}");
            }
        }

        public async Task<PositionStrings> getPositionFromAddress(string address)
        {
            using (HttpClient client = new HttpClient())
            {
                string url = $"https://nominatim.openstreetmap.org/search?format=json&q={HttpUtility.UrlEncode(address)}";

                client.DefaultRequestHeaders.Add("User-Agent", "bikes app");

                HttpResponseMessage response = await client.GetAsync(url);


                if (response.IsSuccessStatusCode)
                {
                    string responseBody = await response.Content.ReadAsStringAsync();

                    PositionStrings[] positions = DeserializeResponse<PositionStrings[]>(responseBody);
                    if(positions.Length == 0)
                    {
                        {
                            throw new Exception($"Non-existent origin address : {address}");
                        }
                    }
                    
                    return positions[0];
                }
                else
                {
                    throw new Exception($"Error: {response.StatusCode}");
                }
            }
        }

        public async Task<double> CalculateDistance(string origin , string destination)
        {
                string originLon = (await getPositionFromAddress(origin)).lon;
                string originLat = (await getPositionFromAddress(origin)).lat;

                string destinationLon = (await getPositionFromAddress(destination)).lon;
                string destinationLat = (await getPositionFromAddress(destination)).lat;

                return await CalculateDistance(originLon, originLat, destinationLon, destinationLat);
                
        }

        private async Task<Routing> GetRouting(string uri)
        {
            try
            {
                HttpResponseMessage response = await client.GetAsync(uri);
                response.EnsureSuccessStatusCode();

                string responseBody = await response.Content.ReadAsStringAsync();

                return DeserializeResponse<Routing>(responseBody);
            }
            catch (Exception ex)
            {
                throw new Exception($"An error occurred: {ex.Message}");
            }
        }
        private async Task<double> CalculateDistance(string originLon, string originLat, string destinationLon, string destinationLat)
        {
            string uri = $"https://api.openrouteservice.org/v2/directions/foot-walking?api_key={routingApiKey}&start={originLon},{originLat}&end={destinationLon},{destinationLat}";

            
            Routing routing = await GetRouting(uri);

            double distance = routing.features[0].properties.summary.distance;

            // Deserialize the response and return the result wrapped in Task
            return distance;
        }



        
        /*public async Task<string> GetCityFromPosition(Position position)
        {
            try
            {
                string baseUrl = "https://nominatim.openstreetmap.org/";
                string endpoint = "reverse";

                client.DefaultRequestHeaders.Add("User-Agent", "bikes app");

                HttpResponseMessage response = await client.GetAsync($"{baseUrl}{endpoint}?format=json&lat={position.lat}&lon={position.lng}");

                response.EnsureSuccessStatusCode();

                string responseBody = await response.Content.ReadAsStringAsync();

                // Deserialize the response and return the result wrapped in Task
                Place localisation = DeserializeResponse<Place>(responseBody);
                return localisation?.address?.city ?? localisation?.address?.town;
            }
            catch (Exception ex)
            {
                Console.WriteLine($"An error occurred: {ex.Message}");
                throw ex;
            }
        }*/




        public T DeserializeResponse<T>(string response)
            {
                return JsonSerializer.Deserialize<T>(response);
            }
        private double parseDouble(string d)
        {
            return Double.Parse(d, new CultureInfo("en-US"));
        }
        }

 
}
