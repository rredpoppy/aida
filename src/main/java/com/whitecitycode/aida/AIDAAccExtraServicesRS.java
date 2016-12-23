
package com.whitecitycode.aida;

import java.math.BigDecimal;
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
 *         &lt;group ref="{http://aida.dcsplus.net/ws/2010}AccExtraServicesResultGroup"/>
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
    "extraServices"
})
@XmlRootElement(name = "AIDA_AccExtraServicesRS")
public class AIDAAccExtraServicesRS {

    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "Success")
    protected AIDAAccExtraServicesRS.Success success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "ExtraServices")
    protected AIDAAccExtraServicesRS.ExtraServices extraServices;
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
     *     {@link AIDAAccExtraServicesRS.Success }
     *     
     */
    public AIDAAccExtraServicesRS.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccExtraServicesRS.Success }
     *     
     */
    public void setSuccess(AIDAAccExtraServicesRS.Success value) {
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
     * Gets the value of the extraServices property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAAccExtraServicesRS.ExtraServices }
     *     
     */
    public AIDAAccExtraServicesRS.ExtraServices getExtraServices() {
        return extraServices;
    }

    /**
     * Sets the value of the extraServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccExtraServicesRS.ExtraServices }
     *     
     */
    public void setExtraServices(AIDAAccExtraServicesRS.ExtraServices value) {
        this.extraServices = value;
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
     *         &lt;element name="ExtraService" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Service">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType"/>
     *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="DurationTimeUnit" use="required" type="{http://aida.dcsplus.net/ws/2010}DurationTimeUnitType" />
     *                           &lt;attribute name="PeriodType" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                 &lt;enumeration value="period"/>
     *                                 &lt;enumeration value="dateSingle"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="GroupService" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="BookingRules" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RoomRequest" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ServiceDates">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="FlexibleDates" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                               &lt;attribute name="PeriodSelection">
     *                                                 &lt;simpleType>
     *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                     &lt;enumeration value="multiple"/>
     *                                                     &lt;enumeration value="single"/>
     *                                                     &lt;enumeration value="all"/>
     *                                                   &lt;/restriction>
     *                                                 &lt;/simpleType>
     *                                               &lt;/attribute>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="MandatoryGuests" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Guest" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
     *                                                         &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                                                         &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
     *                                     &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Rates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Rate" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        protected List<AIDAAccExtraServicesRS.ExtraServices.ExtraService> extraService;

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
         * {@link AIDAAccExtraServicesRS.ExtraServices.ExtraService }
         * 
         * 
         */
        public List<AIDAAccExtraServicesRS.ExtraServices.ExtraService> getExtraService() {
            if (extraService == null) {
                extraService = new ArrayList<AIDAAccExtraServicesRS.ExtraServices.ExtraService>();
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
         *                 &lt;sequence>
         *                   &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType"/>
         *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="DurationTimeUnit" use="required" type="{http://aida.dcsplus.net/ws/2010}DurationTimeUnitType" />
         *                 &lt;attribute name="PeriodType" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;enumeration value="period"/>
         *                       &lt;enumeration value="dateSingle"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="GroupService" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="BookingRules" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RoomRequest" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ServiceDates">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="FlexibleDates" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                     &lt;attribute name="PeriodSelection">
         *                                       &lt;simpleType>
         *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                           &lt;enumeration value="multiple"/>
         *                                           &lt;enumeration value="single"/>
         *                                           &lt;enumeration value="all"/>
         *                                         &lt;/restriction>
         *                                       &lt;/simpleType>
         *                                     &lt;/attribute>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="MandatoryGuests" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Guest" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
         *                                               &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                                               &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
         *                           &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Rates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Rate" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "bookingRules",
            "rates"
        })
        public static class ExtraService {

            @XmlElement(name = "Service", required = true)
            protected AIDAAccExtraServicesRS.ExtraServices.ExtraService.Service service;
            @XmlElement(name = "BookingRules")
            protected AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules bookingRules;
            @XmlElement(name = "Rates", required = true)
            protected AIDAAccExtraServicesRS.ExtraServices.ExtraService.Rates rates;

            /**
             * Gets the value of the service property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAAccExtraServicesRS.ExtraServices.ExtraService.Service }
             *     
             */
            public AIDAAccExtraServicesRS.ExtraServices.ExtraService.Service getService() {
                return service;
            }

            /**
             * Sets the value of the service property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAAccExtraServicesRS.ExtraServices.ExtraService.Service }
             *     
             */
            public void setService(AIDAAccExtraServicesRS.ExtraServices.ExtraService.Service value) {
                this.service = value;
            }

            /**
             * Gets the value of the bookingRules property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules }
             *     
             */
            public AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules getBookingRules() {
                return bookingRules;
            }

            /**
             * Sets the value of the bookingRules property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules }
             *     
             */
            public void setBookingRules(AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules value) {
                this.bookingRules = value;
            }

            /**
             * Gets the value of the rates property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAAccExtraServicesRS.ExtraServices.ExtraService.Rates }
             *     
             */
            public AIDAAccExtraServicesRS.ExtraServices.ExtraService.Rates getRates() {
                return rates;
            }

            /**
             * Sets the value of the rates property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAAccExtraServicesRS.ExtraServices.ExtraService.Rates }
             *     
             */
            public void setRates(AIDAAccExtraServicesRS.ExtraServices.ExtraService.Rates value) {
                this.rates = value;
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
             *                   &lt;element name="ServiceDates">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="FlexibleDates" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                           &lt;attribute name="PeriodSelection">
             *                             &lt;simpleType>
             *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                 &lt;enumeration value="multiple"/>
             *                                 &lt;enumeration value="single"/>
             *                                 &lt;enumeration value="all"/>
             *                               &lt;/restriction>
             *                             &lt;/simpleType>
             *                           &lt;/attribute>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="MandatoryGuests" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Guest" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
             *                                     &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *                                     &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
             *                 &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
            public static class BookingRules {

                @XmlElement(name = "RoomRequest", required = true)
                protected List<AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest> roomRequest;

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
                 * {@link AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest }
                 * 
                 * 
                 */
                public List<AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest> getRoomRequest() {
                    if (roomRequest == null) {
                        roomRequest = new ArrayList<AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest>();
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
                 *         &lt;element name="ServiceDates">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="FlexibleDates" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                 &lt;attribute name="PeriodSelection">
                 *                   &lt;simpleType>
                 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                       &lt;enumeration value="multiple"/>
                 *                       &lt;enumeration value="single"/>
                 *                       &lt;enumeration value="all"/>
                 *                     &lt;/restriction>
                 *                   &lt;/simpleType>
                 *                 &lt;/attribute>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="MandatoryGuests" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Guest" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
                 *                           &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                 *                           &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                 *       &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "serviceDates",
                    "mandatoryGuests"
                })
                public static class RoomRequest {

                    @XmlElement(name = "ServiceDates", required = true)
                    protected AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest.ServiceDates serviceDates;
                    @XmlElement(name = "MandatoryGuests")
                    protected AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest.MandatoryGuests mandatoryGuests;
                    @XmlAttribute(name = "IndexNumber")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger indexNumber;

                    /**
                     * Gets the value of the serviceDates property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest.ServiceDates }
                     *     
                     */
                    public AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest.ServiceDates getServiceDates() {
                        return serviceDates;
                    }

                    /**
                     * Sets the value of the serviceDates property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest.ServiceDates }
                     *     
                     */
                    public void setServiceDates(AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest.ServiceDates value) {
                        this.serviceDates = value;
                    }

                    /**
                     * Gets the value of the mandatoryGuests property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest.MandatoryGuests }
                     *     
                     */
                    public AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest.MandatoryGuests getMandatoryGuests() {
                        return mandatoryGuests;
                    }

                    /**
                     * Sets the value of the mandatoryGuests property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest.MandatoryGuests }
                     *     
                     */
                    public void setMandatoryGuests(AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest.MandatoryGuests value) {
                        this.mandatoryGuests = value;
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
                     *         &lt;element name="Guest" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
                     *                 &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                     *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                        "guest"
                    })
                    public static class MandatoryGuests {

                        @XmlElement(name = "Guest", required = true)
                        protected List<AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest.MandatoryGuests.Guest> guest;

                        /**
                         * Gets the value of the guest property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the guest property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getGuest().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest.MandatoryGuests.Guest }
                         * 
                         * 
                         */
                        public List<AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest.MandatoryGuests.Guest> getGuest() {
                            if (guest == null) {
                                guest = new ArrayList<AIDAAccExtraServicesRS.ExtraServices.ExtraService.BookingRules.RoomRequest.MandatoryGuests.Guest>();
                            }
                            return this.guest;
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
                         *       &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
                         *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                         *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Guest {

                            @XmlAttribute(name = "AgeQualifyingCode", required = true)
                            protected AgeQualifyingCodeType ageQualifyingCode;
                            @XmlAttribute(name = "Age")
                            @XmlSchemaType(name = "nonNegativeInteger")
                            protected BigInteger age;
                            @XmlAttribute(name = "Count")
                            @XmlSchemaType(name = "positiveInteger")
                            protected BigInteger count;

                            /**
                             * Gets the value of the ageQualifyingCode property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link AgeQualifyingCodeType }
                             *     
                             */
                            public AgeQualifyingCodeType getAgeQualifyingCode() {
                                return ageQualifyingCode;
                            }

                            /**
                             * Sets the value of the ageQualifyingCode property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link AgeQualifyingCodeType }
                             *     
                             */
                            public void setAgeQualifyingCode(AgeQualifyingCodeType value) {
                                this.ageQualifyingCode = value;
                            }

                            /**
                             * Gets the value of the age property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getAge() {
                                return age;
                            }

                            /**
                             * Sets the value of the age property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setAge(BigInteger value) {
                                this.age = value;
                            }

                            /**
                             * Gets the value of the count property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getCount() {
                                return count;
                            }

                            /**
                             * Sets the value of the count property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setCount(BigInteger value) {
                                this.count = value;
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
                     *         &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType" maxOccurs="unbounded" minOccurs="0"/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="FlexibleDates" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *       &lt;attribute name="PeriodSelection">
                     *         &lt;simpleType>
                     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *             &lt;enumeration value="multiple"/>
                     *             &lt;enumeration value="single"/>
                     *             &lt;enumeration value="all"/>
                     *           &lt;/restriction>
                     *         &lt;/simpleType>
                     *       &lt;/attribute>
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

                        @XmlElement(name = "DateRange")
                        protected List<DateTimeRangeType> dateRange;
                        @XmlAttribute(name = "FlexibleDates", required = true)
                        protected boolean flexibleDates;
                        @XmlAttribute(name = "PeriodSelection")
                        protected String periodSelection;

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

                        /**
                         * Gets the value of the flexibleDates property.
                         * 
                         */
                        public boolean isFlexibleDates() {
                            return flexibleDates;
                        }

                        /**
                         * Sets the value of the flexibleDates property.
                         * 
                         */
                        public void setFlexibleDates(boolean value) {
                            this.flexibleDates = value;
                        }

                        /**
                         * Gets the value of the periodSelection property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPeriodSelection() {
                            return periodSelection;
                        }

                        /**
                         * Sets the value of the periodSelection property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPeriodSelection(String value) {
                            this.periodSelection = value;
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
             *       &lt;sequence>
             *         &lt;element name="Rate" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "rate"
            })
            public static class Rates {

                @XmlElement(name = "Rate", required = true)
                protected List<AIDAAccExtraServicesRS.ExtraServices.ExtraService.Rates.Rate> rate;

                /**
                 * Gets the value of the rate property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the rate property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRate().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AIDAAccExtraServicesRS.ExtraServices.ExtraService.Rates.Rate }
                 * 
                 * 
                 */
                public List<AIDAAccExtraServicesRS.ExtraServices.ExtraService.Rates.Rate> getRate() {
                    if (rate == null) {
                        rate = new ArrayList<AIDAAccExtraServicesRS.ExtraServices.ExtraService.Rates.Rate>();
                    }
                    return this.rate;
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
                 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "description"
                })
                public static class Rate {

                    @XmlElement(name = "Description")
                    protected String description;
                    @XmlAttribute(name = "ID", required = true)
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected BigInteger id;
                    @XmlAttribute(name = "Name", required = true)
                    protected String name;

                    /**
                     * Gets the value of the description property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescription() {
                        return description;
                    }

                    /**
                     * Sets the value of the description property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescription(String value) {
                        this.description = value;
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
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
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
             *         &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType"/>
             *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="DurationTimeUnit" use="required" type="{http://aida.dcsplus.net/ws/2010}DurationTimeUnitType" />
             *       &lt;attribute name="PeriodType" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;enumeration value="period"/>
             *             &lt;enumeration value="dateSingle"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="GroupService" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "type",
                "description"
            })
            public static class Service {

                @XmlElement(name = "Type", required = true)
                protected ServiceType type;
                @XmlElement(name = "Description")
                protected String description;
                @XmlAttribute(name = "ID", required = true)
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger id;
                @XmlAttribute(name = "Name", required = true)
                protected String name;
                @XmlAttribute(name = "DurationTimeUnit", required = true)
                protected DurationTimeUnitType durationTimeUnit;
                @XmlAttribute(name = "PeriodType", required = true)
                protected String periodType;
                @XmlAttribute(name = "GroupService", required = true)
                protected boolean groupService;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ServiceType }
                 *     
                 */
                public ServiceType getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ServiceType }
                 *     
                 */
                public void setType(ServiceType value) {
                    this.type = value;
                }

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescription(String value) {
                    this.description = value;
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
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the durationTimeUnit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DurationTimeUnitType }
                 *     
                 */
                public DurationTimeUnitType getDurationTimeUnit() {
                    return durationTimeUnit;
                }

                /**
                 * Sets the value of the durationTimeUnit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DurationTimeUnitType }
                 *     
                 */
                public void setDurationTimeUnit(DurationTimeUnitType value) {
                    this.durationTimeUnit = value;
                }

                /**
                 * Gets the value of the periodType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPeriodType() {
                    return periodType;
                }

                /**
                 * Sets the value of the periodType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPeriodType(String value) {
                    this.periodType = value;
                }

                /**
                 * Gets the value of the groupService property.
                 * 
                 */
                public boolean isGroupService() {
                    return groupService;
                }

                /**
                 * Sets the value of the groupService property.
                 * 
                 */
                public void setGroupService(boolean value) {
                    this.groupService = value;
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
