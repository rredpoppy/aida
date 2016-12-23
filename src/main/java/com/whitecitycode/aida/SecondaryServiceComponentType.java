
package com.whitecitycode.aida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Specific structure of a secondary service component in a package.
 * 			
 * 
 * <p>Java class for SecondaryServiceComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondaryServiceComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service" type="{http://aida.dcsplus.net/ws/2010}SecondaryServiceElementType"/>
 *         &lt;element name="ServiceEntries" type="{http://aida.dcsplus.net/ws/2010}ServiceEntriesType" minOccurs="0"/>
 *         &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType" minOccurs="0"/>
 *         &lt;element name="BookingRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BookingRule" type="{http://aida.dcsplus.net/ws/2010}BookingRuleType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ConfigurationData" type="{http://aida.dcsplus.net/ws/2010}SecondServConfigurationDataType" minOccurs="0"/>
 *         &lt;element name="Customers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Customer" type="{http://aida.dcsplus.net/ws/2010}CustomerElementType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ResGlobalInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ResServiceID" type="{http://aida.dcsplus.net/ws/2010}BigIntID" />
 *                 &lt;attribute name="ResServiceSts" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondaryServiceComponentType", propOrder = {
    "service",
    "serviceEntries",
    "guestsCount",
    "bookingRules",
    "configurationData",
    "customers",
    "resGlobalInfo"
})
@XmlSeeAlso({
    com.whitecitycode.aida.AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices.ExtraService.class,
    ResSecondaryServiceComponentType.class
})
public class SecondaryServiceComponentType {

    @XmlElement(name = "Service", required = true)
    protected SecondaryServiceElementType service;
    @XmlElement(name = "ServiceEntries")
    protected ServiceEntriesType serviceEntries;
    @XmlElement(name = "GuestsCount")
    protected GuestsCountType guestsCount;
    @XmlElement(name = "BookingRules")
    protected SecondaryServiceComponentType.BookingRules bookingRules;
    @XmlElement(name = "ConfigurationData")
    protected SecondServConfigurationDataType configurationData;
    @XmlElement(name = "Customers")
    protected SecondaryServiceComponentType.Customers customers;
    @XmlElement(name = "ResGlobalInfo")
    protected SecondaryServiceComponentType.ResGlobalInfo resGlobalInfo;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryServiceElementType }
     *     
     */
    public SecondaryServiceElementType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryServiceElementType }
     *     
     */
    public void setService(SecondaryServiceElementType value) {
        this.service = value;
    }

    /**
     * Gets the value of the serviceEntries property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEntriesType }
     *     
     */
    public ServiceEntriesType getServiceEntries() {
        return serviceEntries;
    }

    /**
     * Sets the value of the serviceEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEntriesType }
     *     
     */
    public void setServiceEntries(ServiceEntriesType value) {
        this.serviceEntries = value;
    }

    /**
     * Gets the value of the guestsCount property.
     * 
     * @return
     *     possible object is
     *     {@link GuestsCountType }
     *     
     */
    public GuestsCountType getGuestsCount() {
        return guestsCount;
    }

    /**
     * Sets the value of the guestsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestsCountType }
     *     
     */
    public void setGuestsCount(GuestsCountType value) {
        this.guestsCount = value;
    }

    /**
     * Gets the value of the bookingRules property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryServiceComponentType.BookingRules }
     *     
     */
    public SecondaryServiceComponentType.BookingRules getBookingRules() {
        return bookingRules;
    }

    /**
     * Sets the value of the bookingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryServiceComponentType.BookingRules }
     *     
     */
    public void setBookingRules(SecondaryServiceComponentType.BookingRules value) {
        this.bookingRules = value;
    }

    /**
     * Gets the value of the configurationData property.
     * 
     * @return
     *     possible object is
     *     {@link SecondServConfigurationDataType }
     *     
     */
    public SecondServConfigurationDataType getConfigurationData() {
        return configurationData;
    }

    /**
     * Sets the value of the configurationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondServConfigurationDataType }
     *     
     */
    public void setConfigurationData(SecondServConfigurationDataType value) {
        this.configurationData = value;
    }

    /**
     * Gets the value of the customers property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryServiceComponentType.Customers }
     *     
     */
    public SecondaryServiceComponentType.Customers getCustomers() {
        return customers;
    }

    /**
     * Sets the value of the customers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryServiceComponentType.Customers }
     *     
     */
    public void setCustomers(SecondaryServiceComponentType.Customers value) {
        this.customers = value;
    }

    /**
     * Gets the value of the resGlobalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryServiceComponentType.ResGlobalInfo }
     *     
     */
    public SecondaryServiceComponentType.ResGlobalInfo getResGlobalInfo() {
        return resGlobalInfo;
    }

    /**
     * Sets the value of the resGlobalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryServiceComponentType.ResGlobalInfo }
     *     
     */
    public void setResGlobalInfo(SecondaryServiceComponentType.ResGlobalInfo value) {
        this.resGlobalInfo = value;
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
     *         &lt;element name="BookingRule" type="{http://aida.dcsplus.net/ws/2010}BookingRuleType" maxOccurs="unbounded"/>
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
        "bookingRule"
    })
    public static class BookingRules {

        @XmlElement(name = "BookingRule", required = true)
        protected List<BookingRuleType> bookingRule;

        /**
         * Gets the value of the bookingRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookingRuleType }
         * 
         * 
         */
        public List<BookingRuleType> getBookingRule() {
            if (bookingRule == null) {
                bookingRule = new ArrayList<BookingRuleType>();
            }
            return this.bookingRule;
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
     *         &lt;element name="Customer" type="{http://aida.dcsplus.net/ws/2010}CustomerElementType" maxOccurs="unbounded"/>
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
        "customer"
    })
    public static class Customers {

        @XmlElement(name = "Customer", required = true)
        protected List<CustomerElementType> customer;

        /**
         * Gets the value of the customer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomerElementType }
         * 
         * 
         */
        public List<CustomerElementType> getCustomer() {
            if (customer == null) {
                customer = new ArrayList<CustomerElementType>();
            }
            return this.customer;
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
     *         &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ResServiceID" type="{http://aida.dcsplus.net/ws/2010}BigIntID" />
     *       &lt;attribute name="ResServiceSts" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "price"
    })
    public static class ResGlobalInfo {

        @XmlElement(name = "Price", required = true)
        protected PriceType price;
        @XmlAttribute(name = "ResServiceID")
        protected Long resServiceID;
        @XmlAttribute(name = "ResServiceSts")
        protected AvailableStsType resServiceSts;

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
         * Gets the value of the resServiceID property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getResServiceID() {
            return resServiceID;
        }

        /**
         * Sets the value of the resServiceID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setResServiceID(Long value) {
            this.resServiceID = value;
        }

        /**
         * Gets the value of the resServiceSts property.
         * 
         * @return
         *     possible object is
         *     {@link AvailableStsType }
         *     
         */
        public AvailableStsType getResServiceSts() {
            return resServiceSts;
        }

        /**
         * Sets the value of the resServiceSts property.
         * 
         * @param value
         *     allowed object is
         *     {@link AvailableStsType }
         *     
         */
        public void setResServiceSts(AvailableStsType value) {
            this.resServiceSts = value;
        }

    }

}
