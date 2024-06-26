
package com.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Station complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Station"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="available_bike_stands" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="available_bikes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="contract_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="position" type="{http://schemas.datacontract.org/2004/07/BikesServer}Position" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Station", namespace = "http://schemas.datacontract.org/2004/07/BikesServer", propOrder = {
    "address",
    "availableBikeStands",
    "availableBikes",
    "contractName",
    "name",
    "number",
    "position"
})
public class Station {

    @XmlElementRef(name = "address", namespace = "http://schemas.datacontract.org/2004/07/BikesServer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address;
    @XmlElement(name = "available_bike_stands")
    protected Integer availableBikeStands;
    @XmlElement(name = "available_bikes")
    protected Integer availableBikes;
    @XmlElementRef(name = "contract_name", namespace = "http://schemas.datacontract.org/2004/07/BikesServer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractName;
    @XmlElementRef(name = "name", namespace = "http://schemas.datacontract.org/2004/07/BikesServer", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    protected Integer number;
    @XmlElementRef(name = "position", namespace = "http://schemas.datacontract.org/2004/07/BikesServer", type = JAXBElement.class, required = false)
    protected JAXBElement<Position> position;

    /**
     * Obtient la valeur de la propriété address.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress() {
        return address;
    }

    /**
     * Définit la valeur de la propriété address.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress(JAXBElement<String> value) {
        this.address = value;
    }

    /**
     * Obtient la valeur de la propriété availableBikeStands.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableBikeStands() {
        return availableBikeStands;
    }

    /**
     * Définit la valeur de la propriété availableBikeStands.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableBikeStands(Integer value) {
        this.availableBikeStands = value;
    }

    /**
     * Obtient la valeur de la propriété availableBikes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableBikes() {
        return availableBikes;
    }

    /**
     * Définit la valeur de la propriété availableBikes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableBikes(Integer value) {
        this.availableBikes = value;
    }

    /**
     * Obtient la valeur de la propriété contractName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractName() {
        return contractName;
    }

    /**
     * Définit la valeur de la propriété contractName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractName(JAXBElement<String> value) {
        this.contractName = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété number.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Définit la valeur de la propriété number.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Obtient la valeur de la propriété position.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Position }{@code >}
     *     
     */
    public JAXBElement<Position> getPosition() {
        return position;
    }

    /**
     * Définit la valeur de la propriété position.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Position }{@code >}
     *     
     */
    public void setPosition(JAXBElement<Position> value) {
        this.position = value;
    }

}
