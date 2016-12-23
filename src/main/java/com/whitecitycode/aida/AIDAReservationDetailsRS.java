
package com.whitecitycode.aida;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Errors" type="{http://aida.dcsplus.net/ws/2010}ErrorsType"/>
 *         &lt;group ref="{http://aida.dcsplus.net/ws/2010}ReservationDetailsResultGroup"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://aida.dcsplus.net/ws/2010}PayloadAttributesGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "errors",
    "pos",
    "success",
    "warnings",
    "reservationDetails"
})
@XmlRootElement(name = "AIDA_ReservationDetailsRS")
public class AIDAReservationDetailsRS {

    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "Success")
    protected AIDAReservationDetailsRS.Success success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "ReservationDetails")
    protected AIDAReservationDetailsRS.ReservationDetails reservationDetails;
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "RequestHost")
    protected String requestHost;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link POSType }
     *     
     */
    public POSType getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSType }
     *     
     */
    public void setPOS(POSType value) {
        this.pos = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAReservationDetailsRS.Success }
     *     
     */
    public AIDAReservationDetailsRS.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAReservationDetailsRS.Success }
     *     
     */
    public void setSuccess(AIDAReservationDetailsRS.Success value) {
        this.success = value;
    }

    /**
     * Gets the value of the warnings property.
     * 
     * @return
     *     possible object is
     *     {@link WarningsType }
     *     
     */
    public WarningsType getWarnings() {
        return warnings;
    }

    /**
     * Sets the value of the warnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarningsType }
     *     
     */
    public void setWarnings(WarningsType value) {
        this.warnings = value;
    }

    /**
     * Gets the value of the reservationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAReservationDetailsRS.ReservationDetails }
     *     
     */
    public AIDAReservationDetailsRS.ReservationDetails getReservationDetails() {
        return reservationDetails;
    }

    /**
     * Sets the value of the reservationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAReservationDetailsRS.ReservationDetails }
     *     
     */
    public void setReservationDetails(AIDAReservationDetailsRS.ReservationDetails value) {
        this.reservationDetails = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Gets the value of the requestHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestHost() {
        return requestHost;
    }

    /**
     * Sets the value of the requestHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestHost(String value) {
        this.requestHost = value;
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
     *         &lt;element name="Components">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PackageComponent" type="{http://aida.dcsplus.net/ws/2010}ResPackageComponentType" minOccurs="0"/>
     *                   &lt;element name="BundleComponent" type="{http://aida.dcsplus.net/ws/2010}ResBundleComponentType" minOccurs="0"/>
     *                   &lt;element name="TourServiceComponent" type="{http://aida.dcsplus.net/ws/2010}ResTourServiceComponentType" minOccurs="0"/>
     *                   &lt;element name="AccommodationComponent" type="{http://aida.dcsplus.net/ws/2010}ResAccommodationComponentType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="TransportationComponent" type="{http://aida.dcsplus.net/ws/2010}ResTransportationComponentType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="SecondaryServiceComponent" type="{http://aida.dcsplus.net/ws/2010}ResSecondaryServiceComponentType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="TransferServiceComponent" type="{http://aida.dcsplus.net/ws/2010}ResTransferComponentType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Customers">
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
     *         &lt;element name="Reservation" type="{http://aida.dcsplus.net/ws/2010}ReservationDataType"/>
     *         &lt;element name="GlobalInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BackOfficeRemarks" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BackOfficeRemark" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "components",
        "customers",
        "reservation",
        "globalInfo"
    })
    public static class ReservationDetails {

        @XmlElement(name = "Components", required = true)
        protected AIDAReservationDetailsRS.ReservationDetails.Components components;
        @XmlElement(name = "Customers", required = true)
        protected AIDAReservationDetailsRS.ReservationDetails.Customers customers;
        @XmlElement(name = "Reservation", required = true)
        protected ReservationDataType reservation;
        @XmlElement(name = "GlobalInfo")
        protected AIDAReservationDetailsRS.ReservationDetails.GlobalInfo globalInfo;

        /**
         * Gets the value of the components property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAReservationDetailsRS.ReservationDetails.Components }
         *     
         */
        public AIDAReservationDetailsRS.ReservationDetails.Components getComponents() {
            return components;
        }

        /**
         * Sets the value of the components property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAReservationDetailsRS.ReservationDetails.Components }
         *     
         */
        public void setComponents(AIDAReservationDetailsRS.ReservationDetails.Components value) {
            this.components = value;
        }

        /**
         * Gets the value of the customers property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAReservationDetailsRS.ReservationDetails.Customers }
         *     
         */
        public AIDAReservationDetailsRS.ReservationDetails.Customers getCustomers() {
            return customers;
        }

        /**
         * Sets the value of the customers property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAReservationDetailsRS.ReservationDetails.Customers }
         *     
         */
        public void setCustomers(AIDAReservationDetailsRS.ReservationDetails.Customers value) {
            this.customers = value;
        }

        /**
         * Gets the value of the reservation property.
         * 
         * @return
         *     possible object is
         *     {@link ReservationDataType }
         *     
         */
        public ReservationDataType getReservation() {
            return reservation;
        }

        /**
         * Sets the value of the reservation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationDataType }
         *     
         */
        public void setReservation(ReservationDataType value) {
            this.reservation = value;
        }

        /**
         * Gets the value of the globalInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAReservationDetailsRS.ReservationDetails.GlobalInfo }
         *     
         */
        public AIDAReservationDetailsRS.ReservationDetails.GlobalInfo getGlobalInfo() {
            return globalInfo;
        }

        /**
         * Sets the value of the globalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAReservationDetailsRS.ReservationDetails.GlobalInfo }
         *     
         */
        public void setGlobalInfo(AIDAReservationDetailsRS.ReservationDetails.GlobalInfo value) {
            this.globalInfo = value;
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
         *         &lt;element name="PackageComponent" type="{http://aida.dcsplus.net/ws/2010}ResPackageComponentType" minOccurs="0"/>
         *         &lt;element name="BundleComponent" type="{http://aida.dcsplus.net/ws/2010}ResBundleComponentType" minOccurs="0"/>
         *         &lt;element name="TourServiceComponent" type="{http://aida.dcsplus.net/ws/2010}ResTourServiceComponentType" minOccurs="0"/>
         *         &lt;element name="AccommodationComponent" type="{http://aida.dcsplus.net/ws/2010}ResAccommodationComponentType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="TransportationComponent" type="{http://aida.dcsplus.net/ws/2010}ResTransportationComponentType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="SecondaryServiceComponent" type="{http://aida.dcsplus.net/ws/2010}ResSecondaryServiceComponentType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="TransferServiceComponent" type="{http://aida.dcsplus.net/ws/2010}ResTransferComponentType" maxOccurs="unbounded" minOccurs="0"/>
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
            "transferServiceComponent"
        })
        public static class Components {

            @XmlElement(name = "PackageComponent")
            protected ResPackageComponentType packageComponent;
            @XmlElement(name = "BundleComponent")
            protected ResBundleComponentType bundleComponent;
            @XmlElement(name = "TourServiceComponent")
            protected ResTourServiceComponentType tourServiceComponent;
            @XmlElement(name = "AccommodationComponent")
            protected List<ResAccommodationComponentType> accommodationComponent;
            @XmlElement(name = "TransportationComponent")
            protected List<ResTransportationComponentType> transportationComponent;
            @XmlElement(name = "SecondaryServiceComponent")
            protected List<ResSecondaryServiceComponentType> secondaryServiceComponent;
            @XmlElement(name = "TransferServiceComponent")
            protected List<ResTransferComponentType> transferServiceComponent;

            /**
             * Gets the value of the packageComponent property.
             * 
             * @return
             *     possible object is
             *     {@link ResPackageComponentType }
             *     
             */
            public ResPackageComponentType getPackageComponent() {
                return packageComponent;
            }

            /**
             * Sets the value of the packageComponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link ResPackageComponentType }
             *     
             */
            public void setPackageComponent(ResPackageComponentType value) {
                this.packageComponent = value;
            }

            /**
             * Gets the value of the bundleComponent property.
             * 
             * @return
             *     possible object is
             *     {@link ResBundleComponentType }
             *     
             */
            public ResBundleComponentType getBundleComponent() {
                return bundleComponent;
            }

            /**
             * Sets the value of the bundleComponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link ResBundleComponentType }
             *     
             */
            public void setBundleComponent(ResBundleComponentType value) {
                this.bundleComponent = value;
            }

            /**
             * Gets the value of the tourServiceComponent property.
             * 
             * @return
             *     possible object is
             *     {@link ResTourServiceComponentType }
             *     
             */
            public ResTourServiceComponentType getTourServiceComponent() {
                return tourServiceComponent;
            }

            /**
             * Sets the value of the tourServiceComponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link ResTourServiceComponentType }
             *     
             */
            public void setTourServiceComponent(ResTourServiceComponentType value) {
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
             * {@link ResAccommodationComponentType }
             * 
             * 
             */
            public List<ResAccommodationComponentType> getAccommodationComponent() {
                if (accommodationComponent == null) {
                    accommodationComponent = new ArrayList<ResAccommodationComponentType>();
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
             * {@link ResTransportationComponentType }
             * 
             * 
             */
            public List<ResTransportationComponentType> getTransportationComponent() {
                if (transportationComponent == null) {
                    transportationComponent = new ArrayList<ResTransportationComponentType>();
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
             * {@link ResSecondaryServiceComponentType }
             * 
             * 
             */
            public List<ResSecondaryServiceComponentType> getSecondaryServiceComponent() {
                if (secondaryServiceComponent == null) {
                    secondaryServiceComponent = new ArrayList<ResSecondaryServiceComponentType>();
                }
                return this.secondaryServiceComponent;
            }

            /**
             * Gets the value of the transferServiceComponent property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the transferServiceComponent property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTransferServiceComponent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ResTransferComponentType }
             * 
             * 
             */
            public List<ResTransferComponentType> getTransferServiceComponent() {
                if (transferServiceComponent == null) {
                    transferServiceComponent = new ArrayList<ResTransferComponentType>();
                }
                return this.transferServiceComponent;
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
         *         &lt;element name="BackOfficeRemarks" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BackOfficeRemark" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
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
        @XmlType(name = "", propOrder = {
            "backOfficeRemarks"
        })
        public static class GlobalInfo {

            @XmlElement(name = "BackOfficeRemarks")
            protected AIDAReservationDetailsRS.ReservationDetails.GlobalInfo.BackOfficeRemarks backOfficeRemarks;

            /**
             * Gets the value of the backOfficeRemarks property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAReservationDetailsRS.ReservationDetails.GlobalInfo.BackOfficeRemarks }
             *     
             */
            public AIDAReservationDetailsRS.ReservationDetails.GlobalInfo.BackOfficeRemarks getBackOfficeRemarks() {
                return backOfficeRemarks;
            }

            /**
             * Sets the value of the backOfficeRemarks property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAReservationDetailsRS.ReservationDetails.GlobalInfo.BackOfficeRemarks }
             *     
             */
            public void setBackOfficeRemarks(AIDAReservationDetailsRS.ReservationDetails.GlobalInfo.BackOfficeRemarks value) {
                this.backOfficeRemarks = value;
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
             *         &lt;element name="BackOfficeRemark" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
                "backOfficeRemark"
            })
            public static class BackOfficeRemarks {

                @XmlElement(name = "BackOfficeRemark", required = true)
                protected List<String> backOfficeRemark;

                /**
                 * Gets the value of the backOfficeRemark property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the backOfficeRemark property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBackOfficeRemark().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getBackOfficeRemark() {
                    if (backOfficeRemark == null) {
                        backOfficeRemark = new ArrayList<String>();
                    }
                    return this.backOfficeRemark;
                }

            }

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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Success {


    }

}
