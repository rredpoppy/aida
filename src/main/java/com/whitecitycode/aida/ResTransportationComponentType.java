
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a transportation service on a reservation
 * 
 * <p>Java class for ResTransportationComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResTransportationComponentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}TransportationComponentType">
 *       &lt;sequence>
 *         &lt;element name="ResService" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" minOccurs="0"/>
 *         &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResTransportationComponentType", propOrder = {
    "resService",
    "cancelPenalties",
    "cancelPenaltiesInfo"
})
public class ResTransportationComponentType
    extends TransportationComponentType
{

    @XmlElement(name = "ResService")
    protected ResServiceType resService;
    @XmlElement(name = "CancelPenalties")
    protected CancelPenaltiesType cancelPenalties;
    @XmlElement(name = "CancelPenaltiesInfo")
    protected String cancelPenaltiesInfo;

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

    /**
     * Gets the value of the cancelPenalties property.
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * Sets the value of the cancelPenalties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPenalties(CancelPenaltiesType value) {
        this.cancelPenalties = value;
    }

    /**
     * Gets the value of the cancelPenaltiesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelPenaltiesInfo() {
        return cancelPenaltiesInfo;
    }

    /**
     * Sets the value of the cancelPenaltiesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelPenaltiesInfo(String value) {
        this.cancelPenaltiesInfo = value;
    }

}
