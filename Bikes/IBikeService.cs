﻿using Bikes;
using Bikes.Data_types;
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
        Task<List<Station>> GetStationsFromAddress(string address);

        [OperationContract]
        Task<PositionStrings> getPositionFromAddress(string address);

        [OperationContract]
        Task<double> CalculateDistance(string origin, string destination);

        [OperationContract]
        Task<Station> GetNearestStation(string address);

        /*[OperationContract]
        Task<List<Contract>> GetContracts(string stationName);   

        [OperationContract]
        Task<string> GetCityFromPosition(Position position);

        [OperationContract]
        Task<List<Place>> GetPlacesFromAddress(string address);

        [OperationContract]
        Task<List<Station>> GetStations(string contractName);*/


        // TODO: ajoutez vos opérations de service ici
    }

    // Utilisez un contrat de données comme indiqué dans l'exemple ci-après pour ajouter les types composites aux opérations de service.
    // Vous pouvez ajouter des fichiers XSD au projet. Une fois le projet généré, vous pouvez utiliser directement les types de données qui y sont définis, avec l'espace de noms "Bikes.ContractType".
    [DataContract]
    public class CompositeType
    {
        bool boolValue = true;
        string stringValue = "Hello ";

        [DataMember]
        public bool BoolValue
        {
            get { return boolValue; }
            set { boolValue = value; }
        }

        [DataMember]
        public string StringValue
        {
            get { return stringValue; }
            set { stringValue = value; }
        }
    }
}
