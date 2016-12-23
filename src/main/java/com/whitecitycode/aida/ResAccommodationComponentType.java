
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies a tour service on a reservation. It includes the same information like the tour service component type, but also has information about the reservation service. 
 * 
 * <p>Java class for ResAccommodationComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResAccommodationComponentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}AccommodationComponentType">
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
@XmlType(name = "ResAccommodationComponentType", propOrder = {
    "resService",
    "cancelPenalties",
    "cancelPenaltiesInfo"
})
public class ResAccommodationComponentType
    extends AccommodationComponentType
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
