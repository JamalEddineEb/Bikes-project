using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bikes.Data_types
{
    public class Localistaion
    {
        public Address address {  get; set; }
    }

    public class Address
    {
        public string city { get; set; }
        public string town { get; set; }
        public string country { get; set; }
    }
}
