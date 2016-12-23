
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Specific structure of a tour service component in a package.
 * 			
 * 
 * <p>Java class for TourServiceComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourServiceComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service" type="{http://aida.dcsplus.net/ws/2010}ServiceElementType"/>
 *         &lt;element name="ServiceEntries" type="{http://aida.dcsplus.net/ws/2010}ServiceEntriesType" minOccurs="0"/>
 *         &lt;element name="ConfigurationData" type="{http://aida.dcsplus.net/ws/2010}ConfigurationDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TourServiceComponentType", propOrder = {
    "service",
    "serviceEntries",
    "configurationData"
})
@XmlSeeAlso({
    ResTourServiceComponentType.class
})
public class TourServiceComponentType {

    @XmlElement(name = "Service", required = true)
    protected ServiceElementType service;
    @XmlElement(name = "ServiceEntries")
    protected ServiceEntriesType serviceEntries;
    @XmlElement(name = "ConfigurationData")
    protected ConfigurationDataType configurationData;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceElementType }
     *     
     */
    public ServiceElementType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceElementType }
     *     
     */
    public void setService(ServiceElementType value) {
        this.service = value;
    }

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
     * Gets the value of the configurationData property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationDataType }
     *     
     */
    public ConfigurationDataType getConfigurationData() {
        return configurationData;
    }

    /**
     * Sets the value of the configurationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationDataType }
     *     
     */
    public void setConfigurationData(ConfigurationDataType value) {
        this.configurationData = value;
    }

}
