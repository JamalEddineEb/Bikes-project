using System;
using System.Collections.Generic;
using System.Net.Http;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text.Json;

namespace BikesServer
{

    [DataContract]
    public class StationsElement
    {
        [DataMember]
        public List<Station> stations;

        [OperationContract]
        public List<Station> GetStations()
        {
            return stations;
        }

        public StationsElement(string apiUrl)
        {
            PopulateData(apiUrl);
        }

        private async void PopulateData(string apiUrl)
        {
            using (var client = new HttpClient())
            {
                try
                {
                    HttpResponseMessage response = await client.GetAsync(apiUrl);
                    response.EnsureSuccessStatusCode();

                    string responseBody = await response.Content.ReadAsStringAsync();

                    // Deserialize the response and return the result wrapped in Task
                    stations = JsonSerializer.Deserialize<List<Station>>(responseBody);
                }
                catch (Exception ex)
                {
                    throw new Exception($"An error occurred: {ex.Message}");
                }
            }
        }
    }

    public class Station
    {
        public string name { get; set; }
        public int number { get; set; }
        public Position position { get; set; }
        public string contract_name { get; set; }
        public string address { get; set; }
        public int available_bike_stands { get; set; }
        public int available_bikes { get; set; }
    }
    public class Position
    {
        public double lat { get; set; }
        public double lng { get; set; }
    }
}
