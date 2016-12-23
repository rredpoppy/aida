
package com.whitecitycode.aida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for RoomResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Availability">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
 *         &lt;element name="ExtraServices" type="{http://aida.dcsplus.net/ws/2010}RoomExtraServiceRatesType" minOccurs="0"/>
 *         &lt;element name="SpecialOfferPrices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SpecialOffer" type="{http://aida.dcsplus.net/ws/2010}RoomResultSpecialOfferPriceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="RefID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomResultType", propOrder = {
    "availability",
    "price",
    "extraServices",
    "specialOfferPrices"
})
public class RoomResultType {

    @XmlElement(name = "Availability", required = true)
    protected RoomResultType.Availability availability;
    @XmlElement(name = "Price", required = true)
    protected PriceType price;
    @XmlElement(name = "ExtraServices")
    protected RoomExtraServiceRatesType extraServices;
    @XmlElement(name = "SpecialOfferPrices")
    protected RoomResultType.SpecialOfferPrices specialOfferPrices;
    @XmlAttribute(name = "RefID", required = true)
    protected String refID;

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link RoomResultType.Availability }
     *     
     */
    public RoomResultType.Availability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomResultType.Availability }
     *     
     */
    public void setAvailability(RoomResultType.Availability value) {
        this.availability = value;
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
     * Gets the value of the specialOfferPrices property.
     * 
     * @return
     *     possible object is
     *     {@link RoomResultType.SpecialOfferPrices }
     *     
     */
    public RoomResultType.SpecialOfferPrices getSpecialOfferPrices() {
        return specialOfferPrices;
    }

    /**
     * Sets the value of the specialOfferPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomResultType.SpecialOfferPrices }
     *     
     */
    public void setSpecialOfferPrices(RoomResultType.SpecialOfferPrices value) {
        this.specialOfferPrices = value;
    }

    /**
     * Gets the value of the refID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefID() {
        return refID;
    }

    /**
     * Sets the value of the refID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefID(String value) {
        this.refID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Availability {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Status", required = true)
        protected AvailableStsType status;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link AvailableStsType }
         *     
         */
        public AvailableStsType getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link AvailableStsType }
         *     
         */
        public void setStatus(AvailableStsType value) {
            this.status = value;
        }

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
     *         &lt;element name="SpecialOffer" type="{http://aida.dcsplus.net/ws/2010}RoomResultSpecialOfferPriceType" maxOccurs="unbounded"/>
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
    public static class SpecialOfferPrices {

        @XmlElement(name = "SpecialOffer", required = true)
        protected List<RoomResultSpecialOfferPriceType> specialOffer;

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
         * {@link RoomResultSpecialOfferPriceType }
         * 
         * 
         */
        public List<RoomResultSpecialOfferPriceType> getSpecialOffer() {
            if (specialOffer == null) {
                specialOffer = new ArrayList<RoomResultSpecialOfferPriceType>();
            }
            return this.specialOffer;
        }

    }

}
