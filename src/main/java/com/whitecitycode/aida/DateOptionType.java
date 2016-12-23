
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a specific date option of an extra service or activity. 
 * 
 * <p>Java class for DateOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateRangeWithDurationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateOptionType", propOrder = {
    "dateRange"
})
@XmlSeeAlso({
    DateOptionWithAvailabilityAndPriceType.class
})
public class DateOptionType {

    @XmlElement(name = "DateRange", required = true)
    protected DateRangeWithDurationType dateRange;

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRangeWithDurationType }
     *     
     */
    public DateRangeWithDurationType getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRangeWithDurationType }
     *     
     */
    public void setDateRange(DateRangeWithDurationType value) {
        this.dateRange = value;
    }

}
