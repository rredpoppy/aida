
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Filters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Location" type="{http://aida.dcsplus.net/ws/2010}LocationType" minOccurs="0"/>
 *                   &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType" minOccurs="0"/>
 *                 &lt;/sequence>
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
    "filters"
})
@XmlRootElement(name = "AIDA_GlobeLocationsRQ")
public class AIDAGlobeLocationsRQ {

    @XmlElement(name = "Filters")
    protected AIDAGlobeLocationsRQ.Filters filters;

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAGlobeLocationsRQ.Filters }
     *     
     */
    public AIDAGlobeLocationsRQ.Filters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAGlobeLocationsRQ.Filters }
     *     
     */
    public void setFilters(AIDAGlobeLocationsRQ.Filters value) {
        this.filters = value;
    }


    /**
     * Filters that can be used when calling the GetLocations method
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Location" type="{http://aida.dcsplus.net/ws/2010}LocationType" minOccurs="0"/>
     *         &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType" minOccurs="0"/>
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
        "location",
        "city"
    })
    public static class Filters {

        @XmlElement(name = "Location")
        protected LocationType location;
        @XmlElement(name = "City")
        protected CityType city;

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

    }

}
