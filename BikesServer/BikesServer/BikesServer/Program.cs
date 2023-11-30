using Bikes;
using ConsoleApp_for_Self_Hosted_WS.ServiceReference1;
using System;
using System.Collections.Generic;


// add the WCF ServiceModel namespace 
using System.ServiceModel;
using System.ServiceModel.Description;
using System.Threading.Tasks;

namespace BikesServer
{
    class Program
    {
        static async Task Main(string[] args)
        {
            try
            {
                //Create a URI to serve as the base address
                //Be careful to run Visual Studio as Admistrator or to allow VS to open new port netsh command. 
                // Example : netsh http add urlacl url=http://+:80/MyUri user=DOMAIN\user
                Uri httpUrl = new Uri("http://localhost:8733/Design_Time_Addresses/Bikes/Service1/");
                BikeService service = new BikeService();

                //Create ServiceHost
                ServiceHost host = new ServiceHost(typeof(BikeService), httpUrl);

                // Multiple end points can be added to the Service using AddServiceEndpoint() method.
                // Host.Open() will run the service, so that it can be used by any client.

                WSHttpBinding binding = new WSHttpBinding();
                binding.MaxReceivedMessageSize = int.MaxValue;

                // Example adding :
                // Uri tcpUrl = new Uri("net.tcp://localhost:8090/MyService/SimpleCalculator");
                // ServiceHost host = new ServiceHost(typeof(MyCalculatorService.SimpleCalculator), httpUrl, tcpUrl);

                //Add a service endpoint
                host.AddServiceEndpoint(typeof(IBikeService),new BasicHttpBinding(), "");

                //Enable metadata exchange
                ServiceMetadataBehavior smb = new ServiceMetadataBehavior();
                smb.HttpGetEnabled = true;
                host.Description.Behaviors.Add(smb);

                /*Step[] steps = await service.GetItinerarySteps("88 Boulevard de Strasbourg,toulouse", "71 Rue Renan,Lyon");
                List<String> types = (await service.GetItineraryCoordinates("88 Boulevard de Strasbourg,toulouse", "71 Rue Renan,Lyon")).type;*/


                //Start the Service
                host.Open();

                /*for(int i = 0; i < types.Count; i++)
                {
                    Console.WriteLine(types[i]);
                }*/

                Console.WriteLine("Service is host at " + httpUrl);
                Console.WriteLine("Host is running... Press <Enter> key to stop");
                Console.ReadLine();
            }
            catch (Exception ex)
            {
                Console.WriteLine($"Exception: {ex.Message}");
            }

        }
    }
}
