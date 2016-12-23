
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Extends the simple date option type with information regarding availability and price. 
 * 
 * <p>Java class for DateOptionWithAvailabilityAndPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateOptionWithAvailabilityAndPriceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}DateOptionType">
 *       &lt;sequence>
 *         &lt;element name="Availability" type="{http://aida.dcsplus.net/ws/2010}AvailabilityType"/>
 *         &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateOptionWithAvailabilityAndPriceType", propOrder = {
    "availability",
    "price"
})
public class DateOptionWithAvailabilityAndPriceType
    extends DateOptionType
{

    @XmlElement(name = "Availability", required = true)
    protected AvailabilityType availability;
    @XmlElement(name = "Price", required = true)
    protected PriceType price;

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link AvailabilityType }
     *     
     */
    public AvailabilityType getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailabilityType }
     *     
     */
    public void setAvailability(AvailabilityType value) {
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

}
