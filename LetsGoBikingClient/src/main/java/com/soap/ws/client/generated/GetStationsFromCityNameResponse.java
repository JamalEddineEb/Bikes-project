
package com.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="getStationsFromCityNameResult" type="{http://schemas.datacontract.org/2004/07/BikesServer}ArrayOfStation" minOccurs="0"/&gt;
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
    "getStationsFromCityNameResult"
})
@XmlRootElement(name = "getStationsFromCityNameResponse")
public class GetStationsFromCityNameResponse {

    @XmlElementRef(name = "getStationsFromCityNameResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStation> getStationsFromCityNameResult;

    /**
     * Obtient la valeur de la propriété getStationsFromCityNameResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStation }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStation> getGetStationsFromCityNameResult() {
        return getStationsFromCityNameResult;
    }

    /**
     * Définit la valeur de la propriété getStationsFromCityNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStation }{@code >}
     *     
     */
    public void setGetStationsFromCityNameResult(JAXBElement<ArrayOfStation> value) {
        this.getStationsFromCityNameResult = value;
    }

}
