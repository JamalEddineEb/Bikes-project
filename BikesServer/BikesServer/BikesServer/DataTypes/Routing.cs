using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Web.Management;
using System.Web.UI.WebControls;

namespace Bikes
{
    internal class Routing
    {
        public Features[] features {  get; set; }
    }
    public class Features
    {
        public Properties properties { get; set; }
        public Geometry geometry { get; set; }
    }
    public class Geometry
    {
        public List<List<double>> coordinates { get; set; }
    }
    public class Properties
    {
        public Summary summary { get; set; }
        public Segment[] segments { get; set; }
    }
    public class Segment
    {
        public double distance { get; set; }
        public Step[] steps { get; set; }
    }
    public class Step
    {
        public double distance { get; set; }
        public string instruction { get; set; }
    }
    public class Summary
    {
        public double distance{ get; set; }
    }
}
