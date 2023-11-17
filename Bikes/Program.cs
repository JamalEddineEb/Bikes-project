using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


// add the WCF ServiceModel namespace 
using System.ServiceModel;
using System.ServiceModel.Description;
using Bikes;

namespace ConsoleApp_for_Self_Hosted_WS
{
    class Program
    {
        static void Main(string[] args)
        {

            ServiceHost host = new ServiceHost(typeof(BikeService));


            //Start the Service
            host.Open();

            Console.WriteLine("Service is host at " + DateTime.Now.ToString());
            Console.WriteLine("Host is running... Press <Enter> key to stop");
            Console.ReadLine();

        }
    }
}
