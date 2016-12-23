
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
 *         &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType"/>
 *         &lt;element name="AccService">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomRequests">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RoomRequest" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
 *                                       &lt;element name="Rooms">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Room" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ExtraServices" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="ExtraService" maxOccurs="unbounded">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="Service">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="ServiceDates">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType" maxOccurs="unbounded"/>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
 *                                                                               &lt;element name="Rate">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="IndexNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Rate">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SpecialOffer" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "dateRange",
    "accService",
    "nationality"
})
@XmlRootElement(name = "AIDA_AccAvailV2RQ")
public class AIDAAccAvailV2RQ {

    @XmlElement(name = "DateRange", required = true)
    protected DateTimeRangeType dateRange;
    @XmlElement(name = "AccService", required = true)
    protected AIDAAccAvailV2RQ.AccService accService;
    @XmlElement(name = "Nationality")
    protected String nationality;

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
     * Gets the value of the accService property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAAccAvailV2RQ.AccService }
     *     
     */
    public AIDAAccAvailV2RQ.AccService getAccService() {
        return accService;
    }

    /**
     * Sets the value of the accService property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccAvailV2RQ.AccService }
     *     
     */
    public void setAccService(AIDAAccAvailV2RQ.AccService value) {
        this.accService = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
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
     *         &lt;element name="RoomRequests">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RoomRequest" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
     *                             &lt;element name="Rooms">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Room" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ExtraServices" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="ExtraService" maxOccurs="unbounded">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="Service">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="ServiceDates">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType" maxOccurs="unbounded"/>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
     *                                                                     &lt;element name="Rate">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="IndexNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Rate">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SpecialOffer" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
        "roomRequests",
        "rate"
    })
    public static class AccService {

        @XmlElement(name = "RoomRequests", required = true)
        protected AIDAAccAvailV2RQ.AccService.RoomRequests roomRequests;
        @XmlElement(name = "Rate", required = true)
        protected AIDAAccAvailV2RQ.AccService.Rate rate;
        @XmlAttribute(name = "ID", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;

        /**
         * Gets the value of the roomRequests property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccAvailV2RQ.AccService.RoomRequests }
         *     
         */
        public AIDAAccAvailV2RQ.AccService.RoomRequests getRoomRequests() {
            return roomRequests;
        }

        /**
         * Sets the value of the roomRequests property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccAvailV2RQ.AccService.RoomRequests }
         *     
         */
        public void setRoomRequests(AIDAAccAvailV2RQ.AccService.RoomRequests value) {
            this.roomRequests = value;
        }

        /**
         * Gets the value of the rate property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccAvailV2RQ.AccService.Rate }
         *     
         */
        public AIDAAccAvailV2RQ.AccService.Rate getRate() {
            return rate;
        }

        /**
         * Sets the value of the rate property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccAvailV2RQ.AccService.Rate }
         *     
         */
        public void setRate(AIDAAccAvailV2RQ.AccService.Rate value) {
            this.rate = value;
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
         *         &lt;element name="SpecialOffer" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
            "specialOffer"
        })
        public static class Rate {

            @XmlElement(name = "SpecialOffer")
            protected AIDAAccAvailV2RQ.AccService.Rate.SpecialOffer specialOffer;
            @XmlAttribute(name = "ID", required = true)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger id;

            /**
             * Gets the value of the specialOffer property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAAccAvailV2RQ.AccService.Rate.SpecialOffer }
             *     
             */
            public AIDAAccAvailV2RQ.AccService.Rate.SpecialOffer getSpecialOffer() {
                return specialOffer;
            }

            /**
             * Sets the value of the specialOffer property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAAccAvailV2RQ.AccService.Rate.SpecialOffer }
             *     
             */
            public void setSpecialOffer(AIDAAccAvailV2RQ.AccService.Rate.SpecialOffer value) {
                this.specialOffer = value;
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
             *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SpecialOffer {

                @XmlAttribute(name = "ID", required = true)
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger id;

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
         *         &lt;element name="RoomRequest" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
         *                   &lt;element name="Rooms">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Room" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ExtraServices" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="ExtraService" maxOccurs="unbounded">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="Service">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="ServiceDates">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType" maxOccurs="unbounded"/>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
         *                                                           &lt;element name="Rate">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="IndexNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
            "roomRequest"
        })
        public static class RoomRequests {

            @XmlElement(name = "RoomRequest", required = true)
            protected List<AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest> roomRequest;

            /**
             * Gets the value of the roomRequest property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the roomRequest property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRoomRequest().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest }
             * 
             * 
             */
            public List<AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest> getRoomRequest() {
                if (roomRequest == null) {
                    roomRequest = new ArrayList<AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest>();
                }
                return this.roomRequest;
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
             *         &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
             *         &lt;element name="Rooms">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Room" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ExtraServices" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="ExtraService" maxOccurs="unbounded">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="Service">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="ServiceDates">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType" maxOccurs="unbounded"/>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
             *                                                 &lt;element name="Rate">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *       &lt;attribute name="IndexNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                "rooms"
            })
            public static class RoomRequest {

                @XmlElement(name = "GuestsCount", required = true)
                protected GuestsCountType guestsCount;
                @XmlElement(name = "Rooms", required = true)
                protected AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms rooms;
                @XmlAttribute(name = "IndexNumber", required = true)
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger indexNumber;

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
                 * Gets the value of the rooms property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms }
                 *     
                 */
                public AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms getRooms() {
                    return rooms;
                }

                /**
                 * Sets the value of the rooms property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms }
                 *     
                 */
                public void setRooms(AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms value) {
                    this.rooms = value;
                }

                /**
                 * Gets the value of the indexNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getIndexNumber() {
                    return indexNumber;
                }

                /**
                 * Sets the value of the indexNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setIndexNumber(BigInteger value) {
                    this.indexNumber = value;
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
                 *         &lt;element name="Room" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ExtraServices" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="ExtraService" maxOccurs="unbounded">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="Service">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="ServiceDates">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType" maxOccurs="unbounded"/>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
                 *                                       &lt;element name="Rate">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "room"
                })
                public static class Rooms {

                    @XmlElement(name = "Room", required = true)
                    protected List<AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room> room;

                    /**
                     * Gets the value of the room property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the room property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getRoom().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room }
                     * 
                     * 
                     */
                    public List<AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room> getRoom() {
                        if (room == null) {
                            room = new ArrayList<AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room>();
                        }
                        return this.room;
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
                     *         &lt;element name="ExtraServices" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="ExtraService" maxOccurs="unbounded">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="Service">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                             &lt;element name="ServiceDates">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType" maxOccurs="unbounded"/>
                     *                                     &lt;/sequence>
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                             &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
                     *                             &lt;element name="Rate">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
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
                     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "extraServices"
                    })
                    public static class Room {

                        @XmlElement(name = "ExtraServices")
                        protected AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices extraServices;
                        @XmlAttribute(name = "ID", required = true)
                        protected String id;

                        /**
                         * Gets the value of the extraServices property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices }
                         *     
                         */
                        public AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices getExtraServices() {
                            return extraServices;
                        }

                        /**
                         * Sets the value of the extraServices property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices }
                         *     
                         */
                        public void setExtraServices(AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices value) {
                            this.extraServices = value;
                        }

                        /**
                         * Gets the value of the id property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getID() {
                            return id;
                        }

                        /**
                         * Sets the value of the id property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setID(String value) {
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
                         *         &lt;element name="ExtraService" maxOccurs="unbounded">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Service">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                   &lt;element name="ServiceDates">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType" maxOccurs="unbounded"/>
                         *                           &lt;/sequence>
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                   &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
                         *                   &lt;element name="Rate">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
                            "extraService"
                        })
                        public static class ExtraServices {

                            @XmlElement(name = "ExtraService", required = true)
                            protected List<AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService> extraService;

                            /**
                             * Gets the value of the extraService property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the extraService property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getExtraService().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService }
                             * 
                             * 
                             */
                            public List<AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService> getExtraService() {
                                if (extraService == null) {
                                    extraService = new ArrayList<AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService>();
                                }
                                return this.extraService;
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
                             *         &lt;element name="Service">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *         &lt;element name="ServiceDates">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType" maxOccurs="unbounded"/>
                             *                 &lt;/sequence>
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *         &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
                             *         &lt;element name="Rate">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
                                "serviceDates",
                                "guestsCount",
                                "rate"
                            })
                            public static class ExtraService {

                                @XmlElement(name = "Service", required = true)
                                protected AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.Service service;
                                @XmlElement(name = "ServiceDates", required = true)
                                protected AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.ServiceDates serviceDates;
                                @XmlElement(name = "GuestsCount", required = true)
                                protected GuestsCountType guestsCount;
                                @XmlElement(name = "Rate", required = true)
                                protected AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.Rate rate;

                                /**
                                 * Gets the value of the service property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.Service }
                                 *     
                                 */
                                public AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.Service getService() {
                                    return service;
                                }

                                /**
                                 * Sets the value of the service property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.Service }
                                 *     
                                 */
                                public void setService(AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.Service value) {
                                    this.service = value;
                                }

                                /**
                                 * Gets the value of the serviceDates property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.ServiceDates }
                                 *     
                                 */
                                public AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.ServiceDates getServiceDates() {
                                    return serviceDates;
                                }

                                /**
                                 * Sets the value of the serviceDates property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.ServiceDates }
                                 *     
                                 */
                                public void setServiceDates(AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.ServiceDates value) {
                                    this.serviceDates = value;
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
                                 * Gets the value of the rate property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.Rate }
                                 *     
                                 */
                                public AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.Rate getRate() {
                                    return rate;
                                }

                                /**
                                 * Sets the value of the rate property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.Rate }
                                 *     
                                 */
                                public void setRate(AIDAAccAvailV2RQ.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.Rate value) {
                                    this.rate = value;
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
                                 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "")
                                public static class Rate {

                                    @XmlAttribute(name = "ID", required = true)
                                    @XmlSchemaType(name = "nonNegativeInteger")
                                    protected BigInteger id;

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
                                 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "")
                                public static class Service {

                                    @XmlAttribute(name = "ID", required = true)
                                    @XmlSchemaType(name = "positiveInteger")
                                    protected BigInteger id;

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
                                 *         &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType" maxOccurs="unbounded"/>
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
                                public static class ServiceDates {

                                    @XmlElement(name = "DateRange", required = true)
                                    protected List<DateTimeRangeType> dateRange;

                                    /**
                                     * Gets the value of the dateRange property.
                                     * 
                                     * <p>
                                     * This accessor method returns a reference to the live list,
                                     * not a snapshot. Therefore any modification you make to the
                                     * returned list will be present inside the JAXB object.
                                     * This is why there is not a <CODE>set</CODE> method for the dateRange property.
                                     * 
                                     * <p>
                                     * For example, to add a new item, do as follows:
                                     * <pre>
                                     *    getDateRange().add(newItem);
                                     * </pre>
                                     * 
                                     * 
                                     * <p>
                                     * Objects of the following type(s) are allowed in the list
                                     * {@link DateTimeRangeType }
                                     * 
                                     * 
                                     */
                                    public List<DateTimeRangeType> getDateRange() {
                                        if (dateRange == null) {
                                            dateRange = new ArrayList<DateTimeRangeType>();
                                        }
                                        return this.dateRange;
                                    }

                                }

                            }

                        }

                    }

                }

            }

        }

    }

}
