using System;
using System.Collections.Generic;
using System.ServiceModel;
using System.Threading.Tasks;

namespace BikesServer
{
    [ServiceContract]
    public interface IStationsElementsProxy
    {
        [OperationContract(Name = "GetStations")]
        Task<List<Station>> Get(string CacheItemName);

        [OperationContract(Name = "GeStationstWithSeconds")]
        Task<List<Station>> Get(string CacheItemName, double dt_seconds);

        [OperationContract(Name = "GeStationstWithOffset")]
        Task<List<Station>> Get(string CacheItemName, DateTimeOffset dt);
    }
}
