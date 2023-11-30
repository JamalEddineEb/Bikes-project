
package com.soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0dMmj3_Sh complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0dMmj3_Sh"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Item1" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfArrayOfdouble"/&gt;
 *         &lt;element name="Item2" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0dMmj3_Sh", namespace = "http://schemas.datacontract.org/2004/07/System", propOrder = {
    "item1",
    "item2"
})
public class ValueTupleOfArrayOfArrayOfdoubleArrayOfstring0DMmj3Sh {

    @XmlElement(name = "Item1", required = true, nillable = true)
    protected ArrayOfArrayOfdouble item1;
    @XmlElement(name = "Item2", required = true, nillable = true)
    protected ArrayOfstring item2;

    /**
     * Obtient la valeur de la propriété item1.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfdouble }
     *     
     */
    public ArrayOfArrayOfdouble getItem1() {
        return item1;
    }

    /**
     * Définit la valeur de la propriété item1.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfdouble }
     *     
     */
    public void setItem1(ArrayOfArrayOfdouble value) {
        this.item1 = value;
    }

    /**
     * Obtient la valeur de la propriété item2.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getItem2() {
        return item2;
    }

    /**
     * Définit la valeur de la propriété item2.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setItem2(ArrayOfstring value) {
        this.item2 = value;
    }

}
