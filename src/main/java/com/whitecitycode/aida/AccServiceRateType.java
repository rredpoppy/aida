
package com.whitecitycode.aida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents an extension of the service price rate, which applies only for accommodation services.
 * 
 * <p>Java class for AccServiceRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccServiceRateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}ServiceRateWithPriceType">
 *       &lt;sequence>
 *         &lt;element name="SpecialOffers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SpecialOffer" type="{http://aida.dcsplus.net/ws/2010}ServiceSpecialOfferWithPriceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccServiceRateType", propOrder = {
    "specialOffers"
})
public class AccServiceRateType
    extends ServiceRateWithPriceType
{

    @XmlElement(name = "SpecialOffers")
    protected AccServiceRateType.SpecialOffers specialOffers;

    /**
     * Gets the value of the specialOffers property.
     * 
     * @return
     *     possible object is
     *     {@link AccServiceRateType.SpecialOffers }
     *     
     */
    public AccServiceRateType.SpecialOffers getSpecialOffers() {
        return specialOffers;
    }

    /**
     * Sets the value of the specialOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccServiceRateType.SpecialOffers }
     *     
     */
    public void setSpecialOffers(AccServiceRateType.SpecialOffers value) {
        this.specialOffers = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SpecialOffer" type="{http://aida.dcsplus.net/ws/2010}ServiceSpecialOfferWithPriceType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "specialOffer"
    })
    public static class SpecialOffers {

        @XmlElement(name = "SpecialOffer", required = true)
        protected List<ServiceSpecialOfferWithPriceType> specialOffer;

        /**
         * Gets the value of the specialOffer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialOffer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialOffer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceSpecialOfferWithPriceType }
         * 
         * 
         */
        public List<ServiceSpecialOfferWithPriceType> getSpecialOffer() {
            if (specialOffer == null) {
                specialOffer = new ArrayList<ServiceSpecialOfferWithPriceType>();
            }
            return this.specialOffer;
        }

    }

}
