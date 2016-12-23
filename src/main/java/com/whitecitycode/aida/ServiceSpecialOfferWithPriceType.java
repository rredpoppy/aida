
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents a special offer rate that applies to a service rate. Includes pricing information as well.
 * 
 * <p>Java class for ServiceSpecialOfferWithPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSpecialOfferWithPriceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}ServiceSpecialOfferType">
 *       &lt;sequence>
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
@XmlType(name = "ServiceSpecialOfferWithPriceType", propOrder = {
    "price"
})
public class ServiceSpecialOfferWithPriceType
    extends ServiceSpecialOfferType
{

    @XmlElement(name = "Price", required = true)
    protected PriceType price;

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
