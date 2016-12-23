
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Includes same information as TransferSegmentPartType, but also more details about pick up and drop off location
 * 
 * <p>Java class for TransferSegmentPartExtendedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferSegmentPartExtendedType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}TransferSegmentPartType">
 *       &lt;sequence>
 *         &lt;element name="LocationDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferSegmentPartExtendedType", propOrder = {
    "locationDetails"
})
public class TransferSegmentPartExtendedType
    extends TransferSegmentPartType
{

    @XmlElement(name = "LocationDetails")
    protected String locationDetails;

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDetails(String value) {
        this.locationDetails = value;
    }

}
