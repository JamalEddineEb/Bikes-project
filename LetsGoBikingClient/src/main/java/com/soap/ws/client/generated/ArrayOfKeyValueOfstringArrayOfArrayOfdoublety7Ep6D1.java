
package com.soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfKeyValueOfstringArrayOfArrayOfdoublety7Ep6D1 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfstringArrayOfArrayOfdoublety7Ep6D1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfstringArrayOfArrayOfdoublety7Ep6D1" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfArrayOfdouble"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfstringArrayOfArrayOfdoublety7Ep6D1", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", propOrder = {
    "keyValueOfstringArrayOfArrayOfdoublety7Ep6D1"
})
public class ArrayOfKeyValueOfstringArrayOfArrayOfdoublety7Ep6D1 {

    @XmlElement(name = "KeyValueOfstringArrayOfArrayOfdoublety7Ep6D1")
    protected List<ArrayOfKeyValueOfstringArrayOfArrayOfdoublety7Ep6D1 .KeyValueOfstringArrayOfArrayOfdoublety7Ep6D1> keyValueOfstringArrayOfArrayOfdoublety7Ep6D1;

    /**
     * Gets the value of the keyValueOfstringArrayOfArrayOfdoublety7Ep6D1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfstringArrayOfArrayOfdoublety7Ep6D1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfstringArrayOfArrayOfdoublety7Ep6D1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfstringArrayOfArrayOfdoublety7Ep6D1 .KeyValueOfstringArrayOfArrayOfdoublety7Ep6D1 }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfstringArrayOfArrayOfdoublety7Ep6D1 .KeyValueOfstringArrayOfArrayOfdoublety7Ep6D1> getKeyValueOfstringArrayOfArrayOfdoublety7Ep6D1() {
        if (keyValueOfstringArrayOfArrayOfdoublety7Ep6D1 == null) {
            keyValueOfstringArrayOfArrayOfdoublety7Ep6D1 = new ArrayList<ArrayOfKeyValueOfstringArrayOfArrayOfdoublety7Ep6D1 .KeyValueOfstringArrayOfArrayOfdoublety7Ep6D1>();
        }
        return this.keyValueOfstringArrayOfArrayOfdoublety7Ep6D1;
    }


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
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Value" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfArrayOfdouble"/&gt;
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
        "key",
        "value"
    })
    public static class KeyValueOfstringArrayOfArrayOfdoublety7Ep6D1 {

        @XmlElement(name = "Key", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", required = true, nillable = true)
        protected String key;
        @XmlElement(name = "Value", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", required = true, nillable = true)
        protected ArrayOfArrayOfdouble value;

        /**
         * Obtient la valeur de la propriété key.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Définit la valeur de la propriété key.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

        /**
         * Obtient la valeur de la propriété value.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfArrayOfdouble }
         *     
         */
        public ArrayOfArrayOfdouble getValue() {
            return value;
        }

        /**
         * Définit la valeur de la propriété value.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfArrayOfdouble }
         *     
         */
        public void setValue(ArrayOfArrayOfdouble value) {
            this.value = value;
        }

    }

}
