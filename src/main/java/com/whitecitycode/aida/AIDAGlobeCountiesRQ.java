
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
 *                   &lt;element name="County" type="{http://aida.dcsplus.net/ws/2010}CountyType" minOccurs="0"/>
 *                   &lt;element name="Country" type="{http://aida.dcsplus.net/ws/2010}CountryType" minOccurs="0"/>
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
@XmlRootElement(name = "AIDA_GlobeCountiesRQ")
public class AIDAGlobeCountiesRQ {

    @XmlElement(name = "Filters")
    protected AIDAGlobeCountiesRQ.Filters filters;

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAGlobeCountiesRQ.Filters }
     *     
     */
    public AIDAGlobeCountiesRQ.Filters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAGlobeCountiesRQ.Filters }
     *     
     */
    public void setFilters(AIDAGlobeCountiesRQ.Filters value) {
        this.filters = value;
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
     *         &lt;element name="County" type="{http://aida.dcsplus.net/ws/2010}CountyType" minOccurs="0"/>
     *         &lt;element name="Country" type="{http://aida.dcsplus.net/ws/2010}CountryType" minOccurs="0"/>
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
        "county",
        "country"
    })
    public static class Filters {

        @XmlElement(name = "County")
        protected CountyType county;
        @XmlElement(name = "Country")
        protected CountryType country;

        /**
         * Gets the value of the county property.
         * 
         * @return
         *     possible object is
         *     {@link CountyType }
         *     
         */
        public CountyType getCounty() {
            return county;
        }

        /**
         * Sets the value of the county property.
         * 
         * @param value
         *     allowed object is
         *     {@link CountyType }
         *     
         */
        public void setCounty(CountyType value) {
            this.county = value;
        }

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link CountryType }
         *     
         */
        public CountryType getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link CountryType }
         *     
         */
        public void setCountry(CountryType value) {
            this.country = value;
        }

    }

}
