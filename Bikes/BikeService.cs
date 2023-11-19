using Bikes.Data_types;
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
using Contract = Bikes.Contract;
using System.Web;
using System.Net;
using System.ServiceModel.Description;
using System.Security.Policy;
using System.Device.Location;
using System.Globalization;

namespace Bikes
{
    // REMARQUE : vous pouvez utiliser la commande Renommer du menu Refactoriser pour changer le nom de classe "Service1" à la fois dans le code et le fichier de configuration.
    public class BikeService : IBikeService
    {
        string jcdecauxApiKey = "5ac79e15e6fab096879404ee6c57e8da02ad4f1d";
        string routingApiKey = "5b3ce3597851110001cf62488e092239ad124963a1770aa1414560e8";
        private static readonly HttpClient client = new HttpClient();

        public async Task<List<Station>> GetStationsFromAddress(string address)
        {
            Task<List<Place>> originsTask = GetPlacesFromAddress(address);

            List<Place> places = await originsTask;

            if (places == null || places.Count != 1)
            {
                throw new Exception("Non-existent or ambiguous origin address.");
            }

            else
            {
                string cityName = places[0].address.city;
                return await getStationsFromCityName(cityName);
            }
        }

        public async Task<Station> GetNearestStation(string address)
        {
            try
            {
                // Get the position (latitude and longitude) for the provided address
                PositionStrings addressPosition = await getPositionFromAddress(address);
                
                GeoCoordinate addressCoordinates = new GeoCoordinate(parseDouble(addressPosition.lat), parseDouble(addressPosition.lon));


                // Get the list of stations based on the provided address
                List<Station> stations = await GetStationsFromAddress(address);

                // Initialize variables for tracking the nearest station and the minimum distance
                Station nearest = null;
                double minDistance = double.MaxValue;

                // Iterate through each station to find the nearest one
                foreach (Station station in stations)
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

                // Return the nearest station
                return nearest;
            }
            catch(Exception ex)
            {
                throw new Exception($"{ex.Message}");
            }
        }

        private async Task<List<Station>> getStationsFromCityName(string city)
        {
            try
            {
                string uri = $"https://api.jcdecaux.com/vls/v1/stations?contract={city}&apiKey={jcdecauxApiKey}";
                HttpResponseMessage response = await client.GetAsync(uri);
                response.EnsureSuccessStatusCode();

                string responseBody = await response.Content.ReadAsStringAsync();

                // Deserialize the response and return the result wrapped in Task
                return DeserializeResponse<List<Station>>(responseBody);
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

                    List<PositionStrings> positions = DeserializeResponse<List<PositionStrings>>(responseBody);

                    if(positions.Count != 1)
                    {
                        {
                            throw new Exception($"Non-existent or ambiguous origin address : {address}");
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

        private async Task<double> CalculateDistance(string originLon, string originLat, string destinationLon, string destinationLat)
        {
            try
            {
                string uri = $"https://api.openrouteservice.org/v2/directions/foot-walking?api_key={routingApiKey}&start={originLon},{originLat}&end={destinationLon},{destinationLat}";

                HttpResponseMessage response = await client.GetAsync(uri);
                response.EnsureSuccessStatusCode();

                string responseBody = await response.Content.ReadAsStringAsync();

                Routing routing = DeserializeResponse<Routing>(responseBody);

                double distance = routing.features[0].properties.summary.distance;

                // Deserialize the response and return the result wrapped in Task
                return distance;
            }
            catch (Exception ex)
            {
                throw new Exception($"An error occurred: {ex.Message}");
            }
        }



        /*public async Task<List<Contract>> GetContracts(string stationName)
        {
            try
            {
                string baseUrl = "https://api.jcdecaux.com/vls/v1/";
                string endpoint = "contracts";

                HttpResponseMessage response = await client.GetAsync($"{baseUrl}{endpoint}?apiKey={apiKey}");
                response.EnsureSuccessStatusCode();

                string responseBody = await response.Content.ReadAsStringAsync();

                // Deserialize the response and return the result wrapped in Task
                return DeserializeResponse<List<Contract>>(responseBody);
            }
            catch (Exception ex)
            {
                throw new Exception($"An error occurred: {ex.Message}");
            }
        }

        public async Task<List<Station>> GetStations(string contractName)
        {
            try
            {
                string baseUrl = "https://api.jcdecaux.com/vls/v1/";
                string endpoint = "stations";


                HttpResponseMessage response = await client.GetAsync($"{baseUrl}{endpoint}?contract={contractName}&apiKey={apiKey}");
                response.EnsureSuccessStatusCode();

                string responseBody = await response.Content.ReadAsStringAsync();

                // Deserialize the response and return the result wrapped in Task
                return DeserializeResponse<List<Station>>(responseBody);
            }
            catch (Exception ex)
            {
                Console.WriteLine($"An error occurred: {ex.Message}");
                throw ex;
            }
        }

        public async Task<string> GetCityFromPosition(Position position)
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
