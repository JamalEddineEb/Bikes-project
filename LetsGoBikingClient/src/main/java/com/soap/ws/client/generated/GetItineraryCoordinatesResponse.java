
package com.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetItineraryCoordinatesResult" type="{http://schemas.datacontract.org/2004/07/System}ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0dMmj3_Sh" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getItineraryCoordinatesResult"
})
@XmlRootElement(name = "GetItineraryCoordinatesResponse")
public class GetItineraryCoordinatesResponse {

    @XmlElement(name = "GetItineraryCoordinatesResult")
    protected ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh getItineraryCoordinatesResult;

    /**
     * Obtient la valeur de la propriété getItineraryCoordinatesResult.
     * 
     * @return
     *     possible object is
     *     {@link ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh }
     *     
     */
    public ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh getGetItineraryCoordinatesResult() {
        return getItineraryCoordinatesResult;
    }

    /**
     * Définit la valeur de la propriété getItineraryCoordinatesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh }
     *     
     */
    public void setGetItineraryCoordinatesResult(ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh value) {
        this.getItineraryCoordinatesResult = value;
    }

}
