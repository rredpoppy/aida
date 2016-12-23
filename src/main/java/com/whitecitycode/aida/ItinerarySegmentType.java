
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a segment of an itinerary, which is formed from 2 locations (departure and arrival)
 * 
 * <p>Java class for ItinerarySegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItinerarySegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Departure" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentLocationType"/>
 *         &lt;element name="Arrival" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentLocationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItinerarySegmentType", propOrder = {
    "departure",
    "arrival"
})
public class ItinerarySegmentType {

    @XmlElement(name = "Departure", required = true)
    protected ItinerarySegmentLocationType departure;
    @XmlElement(name = "Arrival", required = true)
    protected ItinerarySegmentLocationType arrival;

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link ItinerarySegmentLocationType }
     *     
     */
    public ItinerarySegmentLocationType getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinerarySegmentLocationType }
     *     
     */
    public void setDeparture(ItinerarySegmentLocationType value) {
        this.departure = value;
    }

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link ItinerarySegmentLocationType }
     *     
     */
    public ItinerarySegmentLocationType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinerarySegmentLocationType }
     *     
     */
    public void setArrival(ItinerarySegmentLocationType value) {
        this.arrival = value;
    }

}
