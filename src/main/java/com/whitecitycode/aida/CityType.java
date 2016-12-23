
package com.whitecitycode.aida;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Information that identifies a city. If the city has a text description, it will be offered as the city element's content.
 * 
 * <p>Java class for CityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CityType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ISO3" type="{http://aida.dcsplus.net/ws/2010}ISO3Code" />
 *       &lt;attribute name="CountryID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="RegionID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="CountyID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Latitude" type="{http://aida.dcsplus.net/ws/2010}StringLength1to16" />
 *       &lt;attribute name="Longitude" type="{http://aida.dcsplus.net/ws/2010}StringLength1to16" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityType", propOrder = {
    "value"
})
public class CityType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger id;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "ISO3")
    protected String iso3;
    @XmlAttribute(name = "CountryID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger countryID;
    @XmlAttribute(name = "RegionID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger regionID;
    @XmlAttribute(name = "CountyID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger countyID;
    @XmlAttribute(name = "Latitude")
    protected String latitude;
    @XmlAttribute(name = "Longitude")
    protected String longitude;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

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

    /**
     * Gets the value of the iso3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISO3() {
        return iso3;
    }

    /**
     * Sets the value of the iso3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISO3(String value) {
        this.iso3 = value;
    }

    /**
     * Gets the value of the countryID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountryID() {
        return countryID;
    }

    /**
     * Sets the value of the countryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountryID(BigInteger value) {
        this.countryID = value;
    }

    /**
     * Gets the value of the regionID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegionID() {
        return regionID;
    }

    /**
     * Sets the value of the regionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRegionID(BigInteger value) {
        this.regionID = value;
    }

    /**
     * Gets the value of the countyID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountyID() {
        return countyID;
    }

    /**
     * Sets the value of the countyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountyID(BigInteger value) {
        this.countyID = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

}
