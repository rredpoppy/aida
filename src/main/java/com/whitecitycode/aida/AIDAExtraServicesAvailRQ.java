
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
 *         &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
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
    "guestsCount",
    "service"
})
@XmlRootElement(name = "AIDA_ExtraServicesAvailRQ")
public class AIDAExtraServicesAvailRQ {

    @XmlElement(name = "GuestsCount", required = true)
    protected GuestsCountType guestsCount;
    @XmlElement(name = "Service", required = true)
    protected AIDAExtraServicesAvailRQ.Service service;

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
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAExtraServicesAvailRQ.Service }
     *     
     */
    public AIDAExtraServicesAvailRQ.Service getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAExtraServicesAvailRQ.Service }
     *     
     */
    public void setService(AIDAExtraServicesAvailRQ.Service value) {
        this.service = value;
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
        protected AIDAExtraServicesAvailRQ.Service.BookOption bookOption;
        @XmlAttribute(name = "ID", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;

        /**
         * Gets the value of the bookOption property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAExtraServicesAvailRQ.Service.BookOption }
         *     
         */
        public AIDAExtraServicesAvailRQ.Service.BookOption getBookOption() {
            return bookOption;
        }

        /**
         * Sets the value of the bookOption property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAExtraServicesAvailRQ.Service.BookOption }
         *     
         */
        public void setBookOption(AIDAExtraServicesAvailRQ.Service.BookOption value) {
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
            protected AIDAExtraServicesAvailRQ.Service.BookOption.DateOption dateOption;
            @XmlElement(name = "Supplements")
            protected AIDAExtraServicesAvailRQ.Service.BookOption.Supplements supplements;
            @XmlAttribute(name = "ID", required = true)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger id;

            /**
             * Gets the value of the dateOption property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAExtraServicesAvailRQ.Service.BookOption.DateOption }
             *     
             */
            public AIDAExtraServicesAvailRQ.Service.BookOption.DateOption getDateOption() {
                return dateOption;
            }

            /**
             * Sets the value of the dateOption property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAExtraServicesAvailRQ.Service.BookOption.DateOption }
             *     
             */
            public void setDateOption(AIDAExtraServicesAvailRQ.Service.BookOption.DateOption value) {
                this.dateOption = value;
            }

            /**
             * Gets the value of the supplements property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAExtraServicesAvailRQ.Service.BookOption.Supplements }
             *     
             */
            public AIDAExtraServicesAvailRQ.Service.BookOption.Supplements getSupplements() {
                return supplements;
            }

            /**
             * Sets the value of the supplements property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAExtraServicesAvailRQ.Service.BookOption.Supplements }
             *     
             */
            public void setSupplements(AIDAExtraServicesAvailRQ.Service.BookOption.Supplements value) {
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
