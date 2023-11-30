using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace Bikes
{
    public class Place
    {
        public Address address { get; set; }
    }
    public class Address
    {
        public string city { get; set; }
    }
}
