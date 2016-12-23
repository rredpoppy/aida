
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Includes information that is specific to a reservation service.
 * 
 * <p>Java class for ResServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
 *         &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="PriceSet" type="{http://aida.dcsplus.net/ws/2010}PriceSetType" minOccurs="0"/>
 *         &lt;element name="AccRateType" type="{http://aida.dcsplus.net/ws/2010}AccRateTypeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://aida.dcsplus.net/ws/2010}BigIntID" />
 *       &lt;attribute name="Status" type="{http://aida.dcsplus.net/ws/2010}ReservationStsType" />
 *       &lt;attribute name="ECN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResServiceType", propOrder = {
    "dateRange",
    "price",
    "cancelPenalties",
    "priceSet",
    "accRateType"
})
@XmlSeeAlso({
    com.whitecitycode.aida.ResBundleComponentType.ResService.class,
    TransferResServiceType.class
})
public class ResServiceType {

    @XmlElement(name = "DateRange")
    protected DateTimeRangeType dateRange;
    @XmlElement(name = "Price")
    protected PriceType price;
    @XmlElement(name = "CancelPenalties")
    protected CancelPenaltiesType cancelPenalties;
    @XmlElement(name = "PriceSet")
    protected PriceSetType priceSet;
    @XmlElement(name = "AccRateType")
    protected AccRateTypeType accRateType;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "Status")
    protected ReservationStsType status;
    @XmlAttribute(name = "ECN")
    protected String ecn;

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRangeType }
     *     
     */
    public DateTimeRangeType getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRangeType }
     *     
     */
    public void setDateRange(DateTimeRangeType value) {
        this.dateRange = value;
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
     * Gets the value of the priceSet property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSetType }
     *     
     */
    public PriceSetType getPriceSet() {
        return priceSet;
    }

    /**
     * Sets the value of the priceSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSetType }
     *     
     */
    public void setPriceSet(PriceSetType value) {
        this.priceSet = value;
    }

    /**
     * Gets the value of the accRateType property.
     * 
     * @return
     *     possible object is
     *     {@link AccRateTypeType }
     *     
     */
    public AccRateTypeType getAccRateType() {
        return accRateType;
    }

    /**
     * Sets the value of the accRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccRateTypeType }
     *     
     */
    public void setAccRateType(AccRateTypeType value) {
        this.accRateType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationStsType }
     *     
     */
    public ReservationStsType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationStsType }
     *     
     */
    public void setStatus(ReservationStsType value) {
        this.status = value;
    }

    /**
     * Gets the value of the ecn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECN() {
        return ecn;
    }

    /**
     * Sets the value of the ecn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECN(String value) {
        this.ecn = value;
    }

}
