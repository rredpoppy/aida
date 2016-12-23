
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
@XmlRootElement(name = "AIDA_GlobeCountriesRQ")
public class AIDAGlobeCountriesRQ {

    @XmlElement(name = "Filters")
    protected AIDAGlobeCountriesRQ.Filters filters;

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAGlobeCountriesRQ.Filters }
     *     
     */
    public AIDAGlobeCountriesRQ.Filters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAGlobeCountriesRQ.Filters }
     *     
     */
    public void setFilters(AIDAGlobeCountriesRQ.Filters value) {
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
        "country"
    })
    public static class Filters {

        @XmlElement(name = "Country")
        protected CountryType country;

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
