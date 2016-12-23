
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specific structure describing a secondary service. It includes general details about the service. All this data is immuable (does not change with booking environment)
 * 
 * <p>Java class for SecondaryServiceElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondaryServiceElementType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}ServiceElementType">
 *       &lt;sequence>
 *         &lt;element name="Localization" type="{http://aida.dcsplus.net/ws/2010}LocalizationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DurationTimeUnit" type="{http://aida.dcsplus.net/ws/2010}DurationTimeUnitType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondaryServiceElementType", propOrder = {
    "localization"
})
public class SecondaryServiceElementType
    extends ServiceElementType
{

    @XmlElement(name = "Localization")
    protected LocalizationType localization;
    @XmlAttribute(name = "DurationTimeUnit")
    protected DurationTimeUnitType durationTimeUnit;

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizationType }
     *     
     */
    public LocalizationType getLocalization() {
        return localization;
    }

    /**
     * Sets the value of the localization property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizationType }
     *     
     */
    public void setLocalization(LocalizationType value) {
        this.localization = value;
    }

    /**
     * Gets the value of the durationTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DurationTimeUnitType }
     *     
     */
    public DurationTimeUnitType getDurationTimeUnit() {
        return durationTimeUnit;
    }

    /**
     * Sets the value of the durationTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationTimeUnitType }
     *     
     */
    public void setDurationTimeUnit(DurationTimeUnitType value) {
        this.durationTimeUnit = value;
    }

}
