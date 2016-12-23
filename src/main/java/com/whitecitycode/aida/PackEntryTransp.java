
package com.whitecitycode.aida;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Describes the structure and contents of a transportation service within a package entry
 * 
 * <p>Java class for PackEntryTransp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackEntryTransp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Departure">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType"/>
 *                   &lt;element name="Location" type="{http://aida.dcsplus.net/ws/2010}LocationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Arrival">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType"/>
 *                   &lt;element name="Location" type="{http://aida.dcsplus.net/ws/2010}LocationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackEntryTransp", propOrder = {
    "departure",
    "arrival"
})
public class PackEntryTransp {

    @XmlElement(name = "Departure", required = true)
    protected PackEntryTransp.Departure departure;
    @XmlElement(name = "Arrival", required = true)
    protected PackEntryTransp.Arrival arrival;
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    @XmlAttribute(name = "ServiceID", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger serviceID;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link PackEntryTransp.Departure }
     *     
     */
    public PackEntryTransp.Departure getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackEntryTransp.Departure }
     *     
     */
    public void setDeparture(PackEntryTransp.Departure value) {
        this.departure = value;
    }

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link PackEntryTransp.Arrival }
     *     
     */
    public PackEntryTransp.Arrival getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackEntryTransp.Arrival }
     *     
     */
    public void setArrival(PackEntryTransp.Arrival value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServiceID(BigInteger value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     *         &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType"/>
     *         &lt;element name="Location" type="{http://aida.dcsplus.net/ws/2010}LocationType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "city",
        "location"
    })
    public static class Arrival {

        @XmlElement(name = "City", required = true)
        protected CityType city;
        @XmlElement(name = "Location")
        protected LocationType location;
        @XmlAttribute(name = "Date", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "Time", required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar time;

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link CityType }
         *     
         */
        public CityType getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link CityType }
         *     
         */
        public void setCity(CityType value) {
            this.city = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link LocationType }
         *     
         */
        public LocationType getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationType }
         *     
         */
        public void setLocation(LocationType value) {
            this.location = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTime(XMLGregorianCalendar value) {
            this.time = value;
        }

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
     *         &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType"/>
     *         &lt;element name="Location" type="{http://aida.dcsplus.net/ws/2010}LocationType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "city",
        "location"
    })
    public static class Departure {

        @XmlElement(name = "City", required = true)
        protected CityType city;
        @XmlElement(name = "Location")
        protected LocationType location;
        @XmlAttribute(name = "Carrier")
        protected String carrier;
        @XmlAttribute(name = "Date", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "Time", required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar time;

        /**
         * Gets the value of the city property.
         * 
         * @return
         *     possible object is
         *     {@link CityType }
         *     
         */
        public CityType getCity() {
            return city;
        }

        /**
         * Sets the value of the city property.
         * 
         * @param value
         *     allowed object is
         *     {@link CityType }
         *     
         */
        public void setCity(CityType value) {
            this.city = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link LocationType }
         *     
         */
        public LocationType getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocationType }
         *     
         */
        public void setLocation(LocationType value) {
            this.location = value;
        }

        /**
         * Gets the value of the carrier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarrier() {
            return carrier;
        }

        /**
         * Sets the value of the carrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarrier(String value) {
            this.carrier = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTime(XMLGregorianCalendar value) {
            this.time = value;
        }

    }

}
