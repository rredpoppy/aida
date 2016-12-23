
package com.whitecitycode.aida;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies a collection of configuration data for the secondary service
 * 
 * <p>Java class for SecondServConfigurationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondServConfigurationDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}ConfigurationDataType">
 *       &lt;sequence>
 *         &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType" minOccurs="0"/>
 *         &lt;element name="DepartureCity" type="{http://aida.dcsplus.net/ws/2010}CityType" minOccurs="0"/>
 *         &lt;element name="Supplements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Supplement" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondServConfigurationDataType", propOrder = {
    "guestsCount",
    "departureCity",
    "supplements"
})
public class SecondServConfigurationDataType
    extends ConfigurationDataType
{

    @XmlElement(name = "GuestsCount")
    protected GuestsCountType guestsCount;
    @XmlElement(name = "DepartureCity")
    protected CityType departureCity;
    @XmlElement(name = "Supplements")
    protected SecondServConfigurationDataType.Supplements supplements;

    /**
     * Gets the value of the guestsCount property.
     * 
     * @return
     *     possible object is
     *     {@link GuestsCountType }
     *     
     */
    public GuestsCountType getGuestsCount() {
        return guestsCount;
    }

    /**
     * Sets the value of the guestsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestsCountType }
     *     
     */
    public void setGuestsCount(GuestsCountType value) {
        this.guestsCount = value;
    }

    /**
     * Gets the value of the departureCity property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getDepartureCity() {
        return departureCity;
    }

    /**
     * Sets the value of the departureCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setDepartureCity(CityType value) {
        this.departureCity = value;
    }

    /**
     * Gets the value of the supplements property.
     * 
     * @return
     *     possible object is
     *     {@link SecondServConfigurationDataType.Supplements }
     *     
     */
    public SecondServConfigurationDataType.Supplements getSupplements() {
        return supplements;
    }

    /**
     * Sets the value of the supplements property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondServConfigurationDataType.Supplements }
     *     
     */
    public void setSupplements(SecondServConfigurationDataType.Supplements value) {
        this.supplements = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Supplement" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "supplement"
    })
    public static class Supplements {

        @XmlElement(name = "Supplement", required = true)
        protected List<SecondServConfigurationDataType.Supplements.Supplement> supplement;

        /**
         * Gets the value of the supplement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supplement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupplement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SecondServConfigurationDataType.Supplements.Supplement }
         * 
         * 
         */
        public List<SecondServConfigurationDataType.Supplements.Supplement> getSupplement() {
            if (supplement == null) {
                supplement = new ArrayList<SecondServConfigurationDataType.Supplements.Supplement>();
            }
            return this.supplement;
        }


        /**
         * Describes the specific structure of a supplement element
         * 
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Supplement {

            @XmlAttribute(name = "ID")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger id;
            @XmlAttribute(name = "Name")
            protected String name;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setID(BigInteger value) {
                this.id = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }

    }

}
