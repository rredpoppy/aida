
package com.whitecitycode.aida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Includes information that is not specific to any service, but to the reservation as a whole 
 * 
 * <p>Java class for ReservationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialOffer" type="{http://aida.dcsplus.net/ws/2010}SpecialOfferType" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
 *         &lt;element name="ResServices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PackageComponent" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" minOccurs="0"/>
 *                   &lt;element name="BundleComponent" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" minOccurs="0"/>
 *                   &lt;element name="TourServiceComponent" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" minOccurs="0"/>
 *                   &lt;element name="AccommodationComponent" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="TransportationComponent" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="SecondaryServiceComponent" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="TransferComponent" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://aida.dcsplus.net/ws/2010}BigIntID" />
 *       &lt;attribute name="Code" type="{http://aida.dcsplus.net/ws/2010}ReservationCodeType" />
 *       &lt;attribute name="Status" type="{http://aida.dcsplus.net/ws/2010}ReservationStsType" />
 *       &lt;attribute name="PaymentStatus" type="{http://aida.dcsplus.net/ws/2010}ReservationPaymentStsType" />
 *       &lt;attribute name="TotalPriceVoucherPayment" type="{http://aida.dcsplus.net/ws/2010}ReservationPaymentVoucher" />
 *       &lt;attribute name="TourOperatorConfirmationStatus" type="{http://aida.dcsplus.net/ws/2010}TourOperatorConfirmationStsType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationDataType", propOrder = {
    "specialOffer",
    "price",
    "resServices"
})
public class ReservationDataType {

    @XmlElement(name = "SpecialOffer")
    protected SpecialOfferType specialOffer;
    @XmlElement(name = "Price")
    protected PriceType price;
    @XmlElement(name = "ResServices")
    protected ReservationDataType.ResServices resServices;
    @XmlAttribute(name = "ID", required = true)
    protected long id;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Status")
    protected ReservationStsType status;
    @XmlAttribute(name = "PaymentStatus")
    protected ReservationPaymentStsType paymentStatus;
    @XmlAttribute(name = "TotalPriceVoucherPayment")
    protected String totalPriceVoucherPayment;
    @XmlAttribute(name = "TourOperatorConfirmationStatus")
    protected TourOperatorConfirmationStsType tourOperatorConfirmationStatus;

    /**
     * Gets the value of the specialOffer property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialOfferType }
     *     
     */
    public SpecialOfferType getSpecialOffer() {
        return specialOffer;
    }

    /**
     * Sets the value of the specialOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialOfferType }
     *     
     */
    public void setSpecialOffer(SpecialOfferType value) {
        this.specialOffer = value;
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
     * Gets the value of the resServices property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationDataType.ResServices }
     *     
     */
    public ReservationDataType.ResServices getResServices() {
        return resServices;
    }

    /**
     * Sets the value of the resServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationDataType.ResServices }
     *     
     */
    public void setResServices(ReservationDataType.ResServices value) {
        this.resServices = value;
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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
     * Gets the value of the paymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationPaymentStsType }
     *     
     */
    public ReservationPaymentStsType getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Sets the value of the paymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationPaymentStsType }
     *     
     */
    public void setPaymentStatus(ReservationPaymentStsType value) {
        this.paymentStatus = value;
    }

    /**
     * Gets the value of the totalPriceVoucherPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPriceVoucherPayment() {
        return totalPriceVoucherPayment;
    }

    /**
     * Sets the value of the totalPriceVoucherPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPriceVoucherPayment(String value) {
        this.totalPriceVoucherPayment = value;
    }

    /**
     * Gets the value of the tourOperatorConfirmationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TourOperatorConfirmationStsType }
     *     
     */
    public TourOperatorConfirmationStsType getTourOperatorConfirmationStatus() {
        return tourOperatorConfirmationStatus;
    }

    /**
     * Sets the value of the tourOperatorConfirmationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourOperatorConfirmationStsType }
     *     
     */
    public void setTourOperatorConfirmationStatus(TourOperatorConfirmationStsType value) {
        this.tourOperatorConfirmationStatus = value;
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
     *         &lt;element name="PackageComponent" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" minOccurs="0"/>
     *         &lt;element name="BundleComponent" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" minOccurs="0"/>
     *         &lt;element name="TourServiceComponent" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" minOccurs="0"/>
     *         &lt;element name="AccommodationComponent" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="TransportationComponent" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="SecondaryServiceComponent" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="TransferComponent" type="{http://aida.dcsplus.net/ws/2010}ResServiceType" maxOccurs="unbounded" minOccurs="0"/>
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
        "packageComponent",
        "bundleComponent",
        "tourServiceComponent",
        "accommodationComponent",
        "transportationComponent",
        "secondaryServiceComponent",
        "transferComponent"
    })
    public static class ResServices {

        @XmlElement(name = "PackageComponent")
        protected ResServiceType packageComponent;
        @XmlElement(name = "BundleComponent")
        protected ResServiceType bundleComponent;
        @XmlElement(name = "TourServiceComponent")
        protected ResServiceType tourServiceComponent;
        @XmlElement(name = "AccommodationComponent")
        protected List<ResServiceType> accommodationComponent;
        @XmlElement(name = "TransportationComponent")
        protected List<ResServiceType> transportationComponent;
        @XmlElement(name = "SecondaryServiceComponent")
        protected List<ResServiceType> secondaryServiceComponent;
        @XmlElement(name = "TransferComponent")
        protected List<ResServiceType> transferComponent;

        /**
         * Gets the value of the packageComponent property.
         * 
         * @return
         *     possible object is
         *     {@link ResServiceType }
         *     
         */
        public ResServiceType getPackageComponent() {
            return packageComponent;
        }

        /**
         * Sets the value of the packageComponent property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResServiceType }
         *     
         */
        public void setPackageComponent(ResServiceType value) {
            this.packageComponent = value;
        }

        /**
         * Gets the value of the bundleComponent property.
         * 
         * @return
         *     possible object is
         *     {@link ResServiceType }
         *     
         */
        public ResServiceType getBundleComponent() {
            return bundleComponent;
        }

        /**
         * Sets the value of the bundleComponent property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResServiceType }
         *     
         */
        public void setBundleComponent(ResServiceType value) {
            this.bundleComponent = value;
        }

        /**
         * Gets the value of the tourServiceComponent property.
         * 
         * @return
         *     possible object is
         *     {@link ResServiceType }
         *     
         */
        public ResServiceType getTourServiceComponent() {
            return tourServiceComponent;
        }

        /**
         * Sets the value of the tourServiceComponent property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResServiceType }
         *     
         */
        public void setTourServiceComponent(ResServiceType value) {
            this.tourServiceComponent = value;
        }

        /**
         * Gets the value of the accommodationComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accommodationComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccommodationComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResServiceType }
         * 
         * 
         */
        public List<ResServiceType> getAccommodationComponent() {
            if (accommodationComponent == null) {
                accommodationComponent = new ArrayList<ResServiceType>();
            }
            return this.accommodationComponent;
        }

        /**
         * Gets the value of the transportationComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transportationComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransportationComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResServiceType }
         * 
         * 
         */
        public List<ResServiceType> getTransportationComponent() {
            if (transportationComponent == null) {
                transportationComponent = new ArrayList<ResServiceType>();
            }
            return this.transportationComponent;
        }

        /**
         * Gets the value of the secondaryServiceComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the secondaryServiceComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSecondaryServiceComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResServiceType }
         * 
         * 
         */
        public List<ResServiceType> getSecondaryServiceComponent() {
            if (secondaryServiceComponent == null) {
                secondaryServiceComponent = new ArrayList<ResServiceType>();
            }
            return this.secondaryServiceComponent;
        }

        /**
         * Gets the value of the transferComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transferComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransferComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResServiceType }
         * 
         * 
         */
        public List<ResServiceType> getTransferComponent() {
            if (transferComponent == null) {
                transferComponent = new ArrayList<ResServiceType>();
            }
            return this.transferComponent;
        }

    }

}
