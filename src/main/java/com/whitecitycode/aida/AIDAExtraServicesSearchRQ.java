
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateRangeType"/>
 *         &lt;element name="Destination" type="{http://aida.dcsplus.net/ws/2010}DestinationFilterType"/>
 *         &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
 *         &lt;element name="Service" type="{http://aida.dcsplus.net/ws/2010}ServiceFilterType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShowRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dateRange",
    "destination",
    "guestsCount",
    "service"
})
@XmlRootElement(name = "AIDA_ExtraServicesSearchRQ")
public class AIDAExtraServicesSearchRQ {

    @XmlElement(name = "DateRange", required = true)
    protected DateRangeType dateRange;
    @XmlElement(name = "Destination", required = true)
    protected DestinationFilterType destination;
    @XmlElement(name = "GuestsCount", required = true)
    protected GuestsCountType guestsCount;
    @XmlElement(name = "Service")
    protected ServiceFilterType service;
    @XmlAttribute(name = "ShowRequest")
    protected Boolean showRequest;

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRangeType }
     *     
     */
    public DateRangeType getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRangeType }
     *     
     */
    public void setDateRange(DateRangeType value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationFilterType }
     *     
     */
    public DestinationFilterType getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationFilterType }
     *     
     */
    public void setDestination(DestinationFilterType value) {
        this.destination = value;
    }

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
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFilterType }
     *     
     */
    public ServiceFilterType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFilterType }
     *     
     */
    public void setService(ServiceFilterType value) {
        this.service = value;
    }

    /**
     * Gets the value of the showRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowRequest() {
        return showRequest;
    }

    /**
     * Sets the value of the showRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowRequest(Boolean value) {
        this.showRequest = value;
    }

}
