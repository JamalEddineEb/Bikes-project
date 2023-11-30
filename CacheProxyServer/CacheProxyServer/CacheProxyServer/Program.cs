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
        static void Main(string[] args)
        {
            try
            {
                //Create a URI to serve as the base address
                //Be careful to run Visual Studio as Admistrator or to allow VS to open new port netsh command. 
                // Example : netsh http add urlacl url=http://+:80/MyUri user=DOMAIN\user
                Uri httpUrl = new Uri("http://localhost:8090/MyService/CacheProxyServer/");
                StationsElementProxy stationsElementProxy = new StationsElementProxy();

                //Create ServiceHost
                ServiceHost host = new ServiceHost(typeof(StationsElementProxy), httpUrl);

                // Multiple end points can be added to the Service using AddServiceEndpoint() method.
                // Host.Open() will run the service, so that it can be used by any client.

                WSHttpBinding binding = new WSHttpBinding();
                binding.MaxReceivedMessageSize = int.MaxValue;

                // Example adding :
                // Uri tcpUrl = new Uri("net.tcp://localhost:8090/MyService/SimpleCalculator");
                // ServiceHost host = new ServiceHost(typeof(MyCalculatorService.SimpleCalculator), httpUrl, tcpUrl);

                //Add a service endpoint
                host.AddServiceEndpoint(typeof(IStationsElementsProxy), new WSHttpBinding(), "");

                //Enable metadata exchange
                ServiceMetadataBehavior smb = new ServiceMetadataBehavior();
                smb.HttpGetEnabled = true;
                host.Description.Behaviors.Add(smb);

                //Start the Service
                host.Open();

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
