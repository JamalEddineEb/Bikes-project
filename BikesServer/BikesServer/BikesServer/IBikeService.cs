using Bikes;
using ConsoleApp_for_Self_Hosted_WS.ServiceReference1;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace Bikes
{
    // REMARQUE : vous pouvez utiliser la commande Renommer du menu Refactoriser pour changer le nom d'interface "IService1" à la fois dans le code et le fichier de configuration.
    [ServiceContract]
    public interface IBikeService
    {

        [OperationContract]
        Task<Station[]> getStationsFromCityName(string city);
        [OperationContract]
        Task<Step[]> GetFootSteps(string origin, string destination);

        [OperationContract]
        Task<Station> GetNearestStationWithAvailableBikes(string address);

        [OperationContract]
        Task<(List<List<double>> walkingCoordinates, List<string> type)> GetItineraryCoordinates(string origin, string destination);
        [OperationContract]
        Task<Step[]> GetItinerarySteps(string origin, string destination);

        [OperationContract]
        Task<PositionStrings> getPositionFromAddress(string address);

    }    
}
