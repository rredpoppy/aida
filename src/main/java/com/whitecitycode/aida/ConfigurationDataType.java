
package com.whitecitycode.aida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the selected service configurations and also includes information about price and availability
 * 
 * <p>Java class for ConfigurationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceEntries" type="{http://aida.dcsplus.net/ws/2010}ServiceEntriesType"/>
 *         &lt;element name="Itinerary" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Segment" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Availability" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationDataType", propOrder = {
    "serviceEntries",
    "itinerary",
    "availability",
    "price"
})
@XmlSeeAlso({
    SecondServConfigurationDataType.class,
    AccConfigurationDataType.class
})
public class ConfigurationDataType {

    @XmlElement(name = "ServiceEntries", required = true)
    protected ServiceEntriesType serviceEntries;
    @XmlElement(name = "Itinerary")
    protected ConfigurationDataType.Itinerary itinerary;
    @XmlElement(name = "Availability")
    protected ConfigurationDataType.Availability availability;
    @XmlElement(name = "Price")
    protected PriceType price;

    /**
     * Gets the value of the serviceEntries property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEntriesType }
     *     
     */
    public ServiceEntriesType getServiceEntries() {
        return serviceEntries;
    }

    /**
     * Sets the value of the serviceEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEntriesType }
     *     
     */
    public void setServiceEntries(ServiceEntriesType value) {
        this.serviceEntries = value;
    }

    /**
     * Gets the value of the itinerary property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationDataType.Itinerary }
     *     
     */
    public ConfigurationDataType.Itinerary getItinerary() {
        return itinerary;
    }

    /**
     * Sets the value of the itinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationDataType.Itinerary }
     *     
     */
    public void setItinerary(ConfigurationDataType.Itinerary value) {
        this.itinerary = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationDataType.Availability }
     *     
     */
    public ConfigurationDataType.Availability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationDataType.Availability }
     *     
     */
    public void setAvailability(ConfigurationDataType.Availability value) {
        this.availability = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
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
     *       &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Availability {

        @XmlAttribute(name = "Status", required = true)
        protected AvailableStsType status;

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link AvailableStsType }
         *     
         */
        public AvailableStsType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link AvailableStsType }
         *     
         */
        public void setStatus(AvailableStsType value) {
            this.status = value;
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
     *         &lt;element name="Segment" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentType" maxOccurs="unbounded"/>
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
        "segment"
    })
    public static class Itinerary {

        @XmlElement(name = "Segment", required = true)
        protected List<ItinerarySegmentType> segment;

        /**
         * Gets the value of the segment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItinerarySegmentType }
         * 
         * 
         */
        public List<ItinerarySegmentType> getSegment() {
            if (segment == null) {
                segment = new ArrayList<ItinerarySegmentType>();
            }
            return this.segment;
        }

    }

}
