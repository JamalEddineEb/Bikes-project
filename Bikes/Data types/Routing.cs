using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web.UI.WebControls;

namespace Bikes.Data_types
{
    public class Routing
    {
        public List<Feature> features {  get; set; }
    }

    public class Feature
    {
        public Properties properties { get; set; }
    }

    public class Properties
    {
        public Summary summary { get; set; }
    }

    public class Summary
    {
        public double distance { get; set; }
        public double duration { get; set; }
    }
}
