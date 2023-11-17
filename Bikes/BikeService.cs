using Bikes.Data_types;
using http_console;
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
using Contract = http_console.Contract;

namespace Bikes
{
    // REMARQUE : vous pouvez utiliser la commande Renommer du menu Refactoriser pour changer le nom de classe "Service1" à la fois dans le code et le fichier de configuration.
    public class BikeService : IBikeService
    {
        string apiKey = "5ac79e15e6fab096879404ee6c57e8da02ad4f1d";
        private static readonly HttpClient client = new HttpClient();




        public async Task<List<Contract>> GetContracts(string stationName)
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
                Console.WriteLine($"An error occurred: {ex.Message}");
                throw; // Handle or log the exception as needed
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

        public async Task<string> GetCity(Position position)
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
                Localistaion localisation = DeserializeResponse<Localistaion>(responseBody);
                return localisation?.address?.city ?? localisation?.address?.town;
            }
            catch (Exception ex)
            {
                Console.WriteLine($"An error occurred: {ex.Message}");
                throw ex;
            }
        }



            public T DeserializeResponse<T>(string response)
            {
                return JsonSerializer.Deserialize<T>(response);
            }
        }
}
