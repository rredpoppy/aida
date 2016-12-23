
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes conditions that restrict the way a service can be configured and purchased.
 * 
 * <p>Java class for BookingRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxTotalOccupancy" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType" minOccurs="0"/>
 *         &lt;element name="MinTotalOccupancy" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingRuleType", propOrder = {
    "maxTotalOccupancy",
    "minTotalOccupancy"
})
public class BookingRuleType {

    @XmlElement(name = "MaxTotalOccupancy")
    protected GuestsCountType maxTotalOccupancy;
    @XmlElement(name = "MinTotalOccupancy")
    protected GuestsCountType minTotalOccupancy;

    /**
     * Gets the value of the maxTotalOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link GuestsCountType }
     *     
     */
    public GuestsCountType getMaxTotalOccupancy() {
        return maxTotalOccupancy;
    }

    /**
     * Sets the value of the maxTotalOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestsCountType }
     *     
     */
    public void setMaxTotalOccupancy(GuestsCountType value) {
        this.maxTotalOccupancy = value;
    }

    /**
     * Gets the value of the minTotalOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link GuestsCountType }
     *     
     */
    public GuestsCountType getMinTotalOccupancy() {
        return minTotalOccupancy;
    }

    /**
     * Sets the value of the minTotalOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestsCountType }
     *     
     */
    public void setMinTotalOccupancy(GuestsCountType value) {
        this.minTotalOccupancy = value;
    }

}
