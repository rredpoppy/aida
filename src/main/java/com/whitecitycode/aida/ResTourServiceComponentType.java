
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies a tour service on a reservation. It includes the same information like the tour service component type, but also has information about the reservation service. 
 * 
 * <p>Java class for ResTourServiceComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResTourServiceComponentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}TourServiceComponentType">
 *       &lt;sequence>
 *         &lt;element name="ResService" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResTourServiceComponentType", propOrder = {
    "resService"
})
public class ResTourServiceComponentType
    extends TourServiceComponentType
{

    @XmlElement(name = "ResService")
    protected ResServiceType resService;

    /**
     * Gets the value of the resService property.
     * 
     * @return
     *     possible object is
     *     {@link ResServiceType }
     *     
     */
    public ResServiceType getResService() {
        return resService;
    }

    /**
     * Sets the value of the resService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResServiceType }
     *     
     */
    public void setResService(ResServiceType value) {
        this.resService = value;
    }

}
