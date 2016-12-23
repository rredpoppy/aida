
package com.whitecitycode.aida;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Offers information about a special offer that a room result may have. 
 * 
 * <p>Java class for RoomResultSpecialOfferPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomResultSpecialOfferPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
 *         &lt;element name="ExtraServices" type="{http://aida.dcsplus.net/ws/2010}RoomExtraServiceRatesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomResultSpecialOfferPriceType", propOrder = {
    "price",
    "extraServices"
})
public class RoomResultSpecialOfferPriceType {

    @XmlElement(name = "Price", required = true)
    protected PriceType price;
    @XmlElement(name = "ExtraServices")
    protected RoomExtraServiceRatesType extraServices;
    @XmlAttribute(name = "RefID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger refID;

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
     * Gets the value of the extraServices property.
     * 
     * @return
     *     possible object is
     *     {@link RoomExtraServiceRatesType }
     *     
     */
    public RoomExtraServiceRatesType getExtraServices() {
        return extraServices;
    }

    /**
     * Sets the value of the extraServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomExtraServiceRatesType }
     *     
     */
    public void setExtraServices(RoomExtraServiceRatesType value) {
        this.extraServices = value;
    }

    /**
     * Gets the value of the refID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefID(BigInteger value) {
        this.refID = value;
    }

}
