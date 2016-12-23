
package com.whitecitycode.aida;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Service">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BookOption">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DateOption">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateRangeType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Supplements" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Supplement" type="{http://aida.dcsplus.net/ws/2010}SupplementIDType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
 *         &lt;element name="GlobalInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "service",
    "customers",
    "globalInfo"
})
@XmlRootElement(name = "AIDA_ExtraServicesBookRQ")
public class AIDAExtraServicesBookRQ {

    @XmlElement(name = "Service", required = true)
    protected AIDAExtraServicesBookRQ.Service service;
    @XmlElement(name = "Customers", required = true)
    protected AIDAExtraServicesBookRQ.Customers customers;
    @XmlElement(name = "GlobalInfo")
    protected AIDAExtraServicesBookRQ.GlobalInfo globalInfo;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAExtraServicesBookRQ.Service }
     *     
     */
    public AIDAExtraServicesBookRQ.Service getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAExtraServicesBookRQ.Service }
     *     
     */
    public void setService(AIDAExtraServicesBookRQ.Service value) {
        this.service = value;
    }

    /**
     * Gets the value of the customers property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAExtraServicesBookRQ.Customers }
     *     
     */
    public AIDAExtraServicesBookRQ.Customers getCustomers() {
        return customers;
    }

    /**
     * Sets the value of the customers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAExtraServicesBookRQ.Customers }
     *     
     */
    public void setCustomers(AIDAExtraServicesBookRQ.Customers value) {
        this.customers = value;
    }

    /**
     * Gets the value of the globalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAExtraServicesBookRQ.GlobalInfo }
     *     
     */
    public AIDAExtraServicesBookRQ.GlobalInfo getGlobalInfo() {
        return globalInfo;
    }

    /**
     * Sets the value of the globalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAExtraServicesBookRQ.GlobalInfo }
     *     
     */
    public void setGlobalInfo(AIDAExtraServicesBookRQ.GlobalInfo value) {
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
     *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "comments",
        "remarks",
        "backOfficeRemarks"
    })
    public static class GlobalInfo {

        @XmlElement(name = "Comments")
        protected String comments;
        @XmlElement(name = "Remarks")
        protected String remarks;
        @XmlElement(name = "BackOfficeRemarks")
        protected AIDAExtraServicesBookRQ.GlobalInfo.BackOfficeRemarks backOfficeRemarks;

        /**
         * Gets the value of the comments property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComments() {
            return comments;
        }

        /**
         * Sets the value of the comments property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComments(String value) {
            this.comments = value;
        }

        /**
         * Gets the value of the remarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemarks() {
            return remarks;
        }

        /**
         * Sets the value of the remarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemarks(String value) {
            this.remarks = value;
        }

        /**
         * Gets the value of the backOfficeRemarks property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAExtraServicesBookRQ.GlobalInfo.BackOfficeRemarks }
         *     
         */
        public AIDAExtraServicesBookRQ.GlobalInfo.BackOfficeRemarks getBackOfficeRemarks() {
            return backOfficeRemarks;
        }

        /**
         * Sets the value of the backOfficeRemarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAExtraServicesBookRQ.GlobalInfo.BackOfficeRemarks }
         *     
         */
        public void setBackOfficeRemarks(AIDAExtraServicesBookRQ.GlobalInfo.BackOfficeRemarks value) {
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
     *         &lt;element name="BookOption">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DateOption">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateRangeType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Supplements" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Supplement" type="{http://aida.dcsplus.net/ws/2010}SupplementIDType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bookOption"
    })
    public static class Service {

        @XmlElement(name = "BookOption", required = true)
        protected AIDAExtraServicesBookRQ.Service.BookOption bookOption;
        @XmlAttribute(name = "ID", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;

        /**
         * Gets the value of the bookOption property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAExtraServicesBookRQ.Service.BookOption }
         *     
         */
        public AIDAExtraServicesBookRQ.Service.BookOption getBookOption() {
            return bookOption;
        }

        /**
         * Sets the value of the bookOption property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAExtraServicesBookRQ.Service.BookOption }
         *     
         */
        public void setBookOption(AIDAExtraServicesBookRQ.Service.BookOption value) {
            this.bookOption = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setID(BigInteger value) {
            this.id = value;
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
         *         &lt;element name="DateOption">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateRangeType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Supplements" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Supplement" type="{http://aida.dcsplus.net/ws/2010}SupplementIDType" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "dateOption",
            "supplements"
        })
        public static class BookOption {

            @XmlElement(name = "DateOption", required = true)
            protected AIDAExtraServicesBookRQ.Service.BookOption.DateOption dateOption;
            @XmlElement(name = "Supplements")
            protected AIDAExtraServicesBookRQ.Service.BookOption.Supplements supplements;
            @XmlAttribute(name = "ID", required = true)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger id;

            /**
             * Gets the value of the dateOption property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAExtraServicesBookRQ.Service.BookOption.DateOption }
             *     
             */
            public AIDAExtraServicesBookRQ.Service.BookOption.DateOption getDateOption() {
                return dateOption;
            }

            /**
             * Sets the value of the dateOption property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAExtraServicesBookRQ.Service.BookOption.DateOption }
             *     
             */
            public void setDateOption(AIDAExtraServicesBookRQ.Service.BookOption.DateOption value) {
                this.dateOption = value;
            }

            /**
             * Gets the value of the supplements property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAExtraServicesBookRQ.Service.BookOption.Supplements }
             *     
             */
            public AIDAExtraServicesBookRQ.Service.BookOption.Supplements getSupplements() {
                return supplements;
            }

            /**
             * Sets the value of the supplements property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAExtraServicesBookRQ.Service.BookOption.Supplements }
             *     
             */
            public void setSupplements(AIDAExtraServicesBookRQ.Service.BookOption.Supplements value) {
                this.supplements = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getID() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setID(BigInteger value) {
                this.id = value;
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
             *         &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateRangeType"/>
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
                "dateRange"
            })
            public static class DateOption {

                @XmlElement(name = "DateRange", required = true)
                protected DateRangeType dateRange;

                /**
                 * Gets the value of the dateRange property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DateRangeType }
                 *     
                 */
                public DateRangeType getDateRange() {
                    return dateRange;
                }

                /**
                 * Sets the value of the dateRange property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DateRangeType }
                 *     
                 */
                public void setDateRange(DateRangeType value) {
                    this.dateRange = value;
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
             *         &lt;element name="Supplement" type="{http://aida.dcsplus.net/ws/2010}SupplementIDType" maxOccurs="unbounded"/>
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
                "supplement"
            })
            public static class Supplements {

                @XmlElement(name = "Supplement", required = true)
                protected List<SupplementIDType> supplement;

                /**
                 * Gets the value of the supplement property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the supplement property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSupplement().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SupplementIDType }
                 * 
                 * 
                 */
                public List<SupplementIDType> getSupplement() {
                    if (supplement == null) {
                        supplement = new ArrayList<SupplementIDType>();
                    }
                    return this.supplement;
                }

            }

        }

    }

}
