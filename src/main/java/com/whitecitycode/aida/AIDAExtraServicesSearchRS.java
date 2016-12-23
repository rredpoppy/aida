
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
 *         &lt;group ref="{http://aida.dcsplus.net/ws/2010}ExtraServicesSearchResultsGroup"/>
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
    "guestsCount",
    "services"
})
@XmlRootElement(name = "AIDA_ExtraServicesSearchRS")
public class AIDAExtraServicesSearchRS {

    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "Success")
    protected AIDAExtraServicesSearchRS.Success success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "GuestsCount")
    protected GuestsCountType guestsCount;
    @XmlElement(name = "Services")
    protected AIDAExtraServicesSearchRS.Services services;
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
     *     {@link AIDAExtraServicesSearchRS.Success }
     *     
     */
    public AIDAExtraServicesSearchRS.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAExtraServicesSearchRS.Success }
     *     
     */
    public void setSuccess(AIDAExtraServicesSearchRS.Success value) {
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
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAExtraServicesSearchRS.Services }
     *     
     */
    public AIDAExtraServicesSearchRS.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAExtraServicesSearchRS.Services }
     *     
     */
    public void setServices(AIDAExtraServicesSearchRS.Services value) {
        this.services = value;
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
     *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://aida.dcsplus.net/ws/2010}ExtraServiceBaseDetailsType">
     *                 &lt;sequence>
     *                   &lt;element name="BookOptions">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BookOption" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="DateOptions">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="DateOption" type="{http://aida.dcsplus.net/ws/2010}DateOptionWithAvailabilityAndPriceType" maxOccurs="unbounded"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Supplements" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Supplement" type="{http://aida.dcsplus.net/ws/2010}SupplementType" maxOccurs="unbounded"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
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
     *               &lt;/extension>
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
        "service"
    })
    public static class Services {

        @XmlElement(name = "Service")
        protected List<AIDAExtraServicesSearchRS.Services.Service> service;

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AIDAExtraServicesSearchRS.Services.Service }
         * 
         * 
         */
        public List<AIDAExtraServicesSearchRS.Services.Service> getService() {
            if (service == null) {
                service = new ArrayList<AIDAExtraServicesSearchRS.Services.Service>();
            }
            return this.service;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}ExtraServiceBaseDetailsType">
         *       &lt;sequence>
         *         &lt;element name="BookOptions">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BookOption" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="DateOptions">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="DateOption" type="{http://aida.dcsplus.net/ws/2010}DateOptionWithAvailabilityAndPriceType" maxOccurs="unbounded"/>
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
         *                                       &lt;element name="Supplement" type="{http://aida.dcsplus.net/ws/2010}SupplementType" maxOccurs="unbounded"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
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
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "bookOptions"
        })
        public static class Service
            extends ExtraServiceBaseDetailsType
        {

            @XmlElement(name = "BookOptions", required = true)
            protected AIDAExtraServicesSearchRS.Services.Service.BookOptions bookOptions;

            /**
             * Gets the value of the bookOptions property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAExtraServicesSearchRS.Services.Service.BookOptions }
             *     
             */
            public AIDAExtraServicesSearchRS.Services.Service.BookOptions getBookOptions() {
                return bookOptions;
            }

            /**
             * Sets the value of the bookOptions property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAExtraServicesSearchRS.Services.Service.BookOptions }
             *     
             */
            public void setBookOptions(AIDAExtraServicesSearchRS.Services.Service.BookOptions value) {
                this.bookOptions = value;
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
             *         &lt;element name="BookOption" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="DateOptions">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="DateOption" type="{http://aida.dcsplus.net/ws/2010}DateOptionWithAvailabilityAndPriceType" maxOccurs="unbounded"/>
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
             *                             &lt;element name="Supplement" type="{http://aida.dcsplus.net/ws/2010}SupplementType" maxOccurs="unbounded"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
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
                "bookOption"
            })
            public static class BookOptions {

                @XmlElement(name = "BookOption", required = true)
                protected List<AIDAExtraServicesSearchRS.Services.Service.BookOptions.BookOption> bookOption;

                /**
                 * Gets the value of the bookOption property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the bookOption property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBookOption().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AIDAExtraServicesSearchRS.Services.Service.BookOptions.BookOption }
                 * 
                 * 
                 */
                public List<AIDAExtraServicesSearchRS.Services.Service.BookOptions.BookOption> getBookOption() {
                    if (bookOption == null) {
                        bookOption = new ArrayList<AIDAExtraServicesSearchRS.Services.Service.BookOptions.BookOption>();
                    }
                    return this.bookOption;
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
                 *         &lt;element name="DateOptions">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="DateOption" type="{http://aida.dcsplus.net/ws/2010}DateOptionWithAvailabilityAndPriceType" maxOccurs="unbounded"/>
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
                 *                   &lt;element name="Supplement" type="{http://aida.dcsplus.net/ws/2010}SupplementType" maxOccurs="unbounded"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
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
                    "description",
                    "dateOptions",
                    "supplements"
                })
                public static class BookOption {

                    @XmlElement(name = "Description")
                    protected String description;
                    @XmlElement(name = "DateOptions", required = true)
                    protected AIDAExtraServicesSearchRS.Services.Service.BookOptions.BookOption.DateOptions dateOptions;
                    @XmlElement(name = "Supplements")
                    protected AIDAExtraServicesSearchRS.Services.Service.BookOptions.BookOption.Supplements supplements;
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
                     * Gets the value of the dateOptions property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDAExtraServicesSearchRS.Services.Service.BookOptions.BookOption.DateOptions }
                     *     
                     */
                    public AIDAExtraServicesSearchRS.Services.Service.BookOptions.BookOption.DateOptions getDateOptions() {
                        return dateOptions;
                    }

                    /**
                     * Sets the value of the dateOptions property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDAExtraServicesSearchRS.Services.Service.BookOptions.BookOption.DateOptions }
                     *     
                     */
                    public void setDateOptions(AIDAExtraServicesSearchRS.Services.Service.BookOptions.BookOption.DateOptions value) {
                        this.dateOptions = value;
                    }

                    /**
                     * Gets the value of the supplements property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDAExtraServicesSearchRS.Services.Service.BookOptions.BookOption.Supplements }
                     *     
                     */
                    public AIDAExtraServicesSearchRS.Services.Service.BookOptions.BookOption.Supplements getSupplements() {
                        return supplements;
                    }

                    /**
                     * Sets the value of the supplements property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDAExtraServicesSearchRS.Services.Service.BookOptions.BookOption.Supplements }
                     *     
                     */
                    public void setSupplements(AIDAExtraServicesSearchRS.Services.Service.BookOptions.BookOption.Supplements value) {
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
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="DateOption" type="{http://aida.dcsplus.net/ws/2010}DateOptionWithAvailabilityAndPriceType" maxOccurs="unbounded"/>
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
                        "dateOption"
                    })
                    public static class DateOptions {

                        @XmlElement(name = "DateOption", required = true)
                        protected List<DateOptionWithAvailabilityAndPriceType> dateOption;

                        /**
                         * Gets the value of the dateOption property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the dateOption property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getDateOption().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link DateOptionWithAvailabilityAndPriceType }
                         * 
                         * 
                         */
                        public List<DateOptionWithAvailabilityAndPriceType> getDateOption() {
                            if (dateOption == null) {
                                dateOption = new ArrayList<DateOptionWithAvailabilityAndPriceType>();
                            }
                            return this.dateOption;
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
                     *         &lt;element name="Supplement" type="{http://aida.dcsplus.net/ws/2010}SupplementType" maxOccurs="unbounded"/>
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
                        protected List<SupplementType> supplement;

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
                         * {@link SupplementType }
                         * 
                         * 
                         */
                        public List<SupplementType> getSupplement() {
                            if (supplement == null) {
                                supplement = new ArrayList<SupplementType>();
                            }
                            return this.supplement;
                        }

                    }

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
