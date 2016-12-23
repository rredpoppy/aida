
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
 *         &lt;group ref="{http://aida.dcsplus.net/ws/2010}PackAvailResultGroup"/>
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
    "_package"
})
@XmlRootElement(name = "AIDA_PackAvailRS")
public class AIDAPackAvailRS {

    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "Success")
    protected AIDAPackAvailRS.Success success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "Package")
    protected AIDAPackAvailRS.Package _package;
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
     *     {@link AIDAPackAvailRS.Success }
     *     
     */
    public AIDAPackAvailRS.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAPackAvailRS.Success }
     *     
     */
    public void setSuccess(AIDAPackAvailRS.Success value) {
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
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAPackAvailRS.Package }
     *     
     */
    public AIDAPackAvailRS.Package getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAPackAvailRS.Package }
     *     
     */
    public void setPackage(AIDAPackAvailRS.Package value) {
        this._package = value;
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
     *         &lt;element name="PackEntry">
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
     *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Configuration">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Tour" type="{http://aida.dcsplus.net/ws/2010}PackEntryTour" minOccurs="0"/>
     *                             &lt;element name="Accommodation" type="{http://aida.dcsplus.net/ws/2010}PackEntryAcc" maxOccurs="unbounded"/>
     *                             &lt;element name="Transportation" type="{http://aida.dcsplus.net/ws/2010}PackEntryTransp" maxOccurs="2" minOccurs="0"/>
     *                             &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
     *                             &lt;element name="Rate" type="{http://aida.dcsplus.net/ws/2010}PriceRateType" minOccurs="0"/>
     *                             &lt;element name="Availability" type="{http://aida.dcsplus.net/ws/2010}PackAvailType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
     *                   &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                 &lt;attribute name="DateStart" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="DateEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://aida.dcsplus.net/ws/2010}PackAttributesGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "packEntry"
    })
    public static class Package {

        @XmlElement(name = "PackEntry", required = true)
        protected AIDAPackAvailRS.Package.PackEntry packEntry;
        @XmlAttribute(name = "ID", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;
        @XmlAttribute(name = "Type", required = true)
        protected PackageType type;
        @XmlAttribute(name = "Name", required = true)
        protected String name;
        @XmlAttribute(name = "Currency", required = true)
        protected String currency;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Category")
        protected String category;
        @XmlAttribute(name = "ValidFrom")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar validFrom;
        @XmlAttribute(name = "ValidUntil")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar validUntil;

        /**
         * Gets the value of the packEntry property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAPackAvailRS.Package.PackEntry }
         *     
         */
        public AIDAPackAvailRS.Package.PackEntry getPackEntry() {
            return packEntry;
        }

        /**
         * Sets the value of the packEntry property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAPackAvailRS.Package.PackEntry }
         *     
         */
        public void setPackEntry(AIDAPackAvailRS.Package.PackEntry value) {
            this.packEntry = value;
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
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link PackageType }
         *     
         */
        public PackageType getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link PackageType }
         *     
         */
        public void setType(PackageType value) {
            this.type = value;
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
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
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
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategory() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategory(String value) {
            this.category = value;
        }

        /**
         * Gets the value of the validFrom property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValidFrom() {
            return validFrom;
        }

        /**
         * Sets the value of the validFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValidFrom(XMLGregorianCalendar value) {
            this.validFrom = value;
        }

        /**
         * Gets the value of the validUntil property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValidUntil() {
            return validUntil;
        }

        /**
         * Sets the value of the validUntil property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValidUntil(XMLGregorianCalendar value) {
            this.validUntil = value;
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
         *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Configuration">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Tour" type="{http://aida.dcsplus.net/ws/2010}PackEntryTour" minOccurs="0"/>
         *                   &lt;element name="Accommodation" type="{http://aida.dcsplus.net/ws/2010}PackEntryAcc" maxOccurs="unbounded"/>
         *                   &lt;element name="Transportation" type="{http://aida.dcsplus.net/ws/2010}PackEntryTransp" maxOccurs="2" minOccurs="0"/>
         *                   &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
         *                   &lt;element name="Rate" type="{http://aida.dcsplus.net/ws/2010}PriceRateType" minOccurs="0"/>
         *                   &lt;element name="Availability" type="{http://aida.dcsplus.net/ws/2010}PackAvailType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
         *         &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *       &lt;attribute name="DateStart" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="DateEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "extraServices",
            "configuration",
            "cancelPenalties",
            "cancelPenaltiesInfo"
        })
        public static class PackEntry {

            @XmlElement(name = "ExtraServices")
            protected AIDAPackAvailRS.Package.PackEntry.ExtraServices extraServices;
            @XmlElement(name = "Configuration", required = true)
            protected AIDAPackAvailRS.Package.PackEntry.Configuration configuration;
            @XmlElement(name = "CancelPenalties")
            protected CancelPenaltiesType cancelPenalties;
            @XmlElement(name = "CancelPenaltiesInfo")
            protected String cancelPenaltiesInfo;
            @XmlAttribute(name = "ID", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger id;
            @XmlAttribute(name = "DateStart", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateStart;
            @XmlAttribute(name = "DateEnd", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateEnd;

            /**
             * Gets the value of the extraServices property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAPackAvailRS.Package.PackEntry.ExtraServices }
             *     
             */
            public AIDAPackAvailRS.Package.PackEntry.ExtraServices getExtraServices() {
                return extraServices;
            }

            /**
             * Sets the value of the extraServices property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAPackAvailRS.Package.PackEntry.ExtraServices }
             *     
             */
            public void setExtraServices(AIDAPackAvailRS.Package.PackEntry.ExtraServices value) {
                this.extraServices = value;
            }

            /**
             * Gets the value of the configuration property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAPackAvailRS.Package.PackEntry.Configuration }
             *     
             */
            public AIDAPackAvailRS.Package.PackEntry.Configuration getConfiguration() {
                return configuration;
            }

            /**
             * Sets the value of the configuration property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAPackAvailRS.Package.PackEntry.Configuration }
             *     
             */
            public void setConfiguration(AIDAPackAvailRS.Package.PackEntry.Configuration value) {
                this.configuration = value;
            }

            /**
             * Gets the value of the cancelPenalties property.
             * 
             * @return
             *     possible object is
             *     {@link CancelPenaltiesType }
             *     
             */
            public CancelPenaltiesType getCancelPenalties() {
                return cancelPenalties;
            }

            /**
             * Sets the value of the cancelPenalties property.
             * 
             * @param value
             *     allowed object is
             *     {@link CancelPenaltiesType }
             *     
             */
            public void setCancelPenalties(CancelPenaltiesType value) {
                this.cancelPenalties = value;
            }

            /**
             * Gets the value of the cancelPenaltiesInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCancelPenaltiesInfo() {
                return cancelPenaltiesInfo;
            }

            /**
             * Sets the value of the cancelPenaltiesInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCancelPenaltiesInfo(String value) {
                this.cancelPenaltiesInfo = value;
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
             * Gets the value of the dateStart property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateStart() {
                return dateStart;
            }

            /**
             * Sets the value of the dateStart property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateStart(XMLGregorianCalendar value) {
                this.dateStart = value;
            }

            /**
             * Gets the value of the dateEnd property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateEnd() {
                return dateEnd;
            }

            /**
             * Sets the value of the dateEnd property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateEnd(XMLGregorianCalendar value) {
                this.dateEnd = value;
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
             *         &lt;element name="Tour" type="{http://aida.dcsplus.net/ws/2010}PackEntryTour" minOccurs="0"/>
             *         &lt;element name="Accommodation" type="{http://aida.dcsplus.net/ws/2010}PackEntryAcc" maxOccurs="unbounded"/>
             *         &lt;element name="Transportation" type="{http://aida.dcsplus.net/ws/2010}PackEntryTransp" maxOccurs="2" minOccurs="0"/>
             *         &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
             *         &lt;element name="Rate" type="{http://aida.dcsplus.net/ws/2010}PriceRateType" minOccurs="0"/>
             *         &lt;element name="Availability" type="{http://aida.dcsplus.net/ws/2010}PackAvailType" minOccurs="0"/>
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
                "tour",
                "accommodation",
                "transportation",
                "price",
                "rate",
                "availability"
            })
            public static class Configuration {

                @XmlElement(name = "Tour")
                protected PackEntryTour tour;
                @XmlElement(name = "Accommodation", required = true)
                protected List<PackEntryAcc> accommodation;
                @XmlElement(name = "Transportation")
                protected List<PackEntryTransp> transportation;
                @XmlElement(name = "Price", required = true)
                protected PriceType price;
                @XmlElement(name = "Rate")
                protected PriceRateType rate;
                @XmlElement(name = "Availability")
                protected PackAvailType availability;

                /**
                 * Gets the value of the tour property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PackEntryTour }
                 *     
                 */
                public PackEntryTour getTour() {
                    return tour;
                }

                /**
                 * Sets the value of the tour property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PackEntryTour }
                 *     
                 */
                public void setTour(PackEntryTour value) {
                    this.tour = value;
                }

                /**
                 * Gets the value of the accommodation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the accommodation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAccommodation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PackEntryAcc }
                 * 
                 * 
                 */
                public List<PackEntryAcc> getAccommodation() {
                    if (accommodation == null) {
                        accommodation = new ArrayList<PackEntryAcc>();
                    }
                    return this.accommodation;
                }

                /**
                 * Gets the value of the transportation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the transportation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTransportation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PackEntryTransp }
                 * 
                 * 
                 */
                public List<PackEntryTransp> getTransportation() {
                    if (transportation == null) {
                        transportation = new ArrayList<PackEntryTransp>();
                    }
                    return this.transportation;
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
                 * Gets the value of the rate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PriceRateType }
                 *     
                 */
                public PriceRateType getRate() {
                    return rate;
                }

                /**
                 * Sets the value of the rate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PriceRateType }
                 *     
                 */
                public void setRate(PriceRateType value) {
                    this.rate = value;
                }

                /**
                 * Gets the value of the availability property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PackAvailType }
                 *     
                 */
                public PackAvailType getAvailability() {
                    return availability;
                }

                /**
                 * Sets the value of the availability property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PackAvailType }
                 *     
                 */
                public void setAvailability(PackAvailType value) {
                    this.availability = value;
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
             *         &lt;element name="ExtraService" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                protected List<AIDAPackAvailRS.Package.PackEntry.ExtraServices.ExtraService> extraService;

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
                 * {@link AIDAPackAvailRS.Package.PackEntry.ExtraServices.ExtraService }
                 * 
                 * 
                 */
                public List<AIDAPackAvailRS.Package.PackEntry.ExtraServices.ExtraService> getExtraService() {
                    if (extraService == null) {
                        extraService = new ArrayList<AIDAPackAvailRS.Package.PackEntry.ExtraServices.ExtraService>();
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
                 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class ExtraService {

                    @XmlAttribute(name = "ID", required = true)
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger id;
                    @XmlAttribute(name = "Name", required = true)
                    protected String name;
                    @XmlAttribute(name = "Type", required = true)
                    protected String type;
                    @XmlAttribute(name = "Mandatory", required = true)
                    protected boolean mandatory;

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
                     * Gets the value of the type property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Sets the value of the type property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * Gets the value of the mandatory property.
                     * 
                     */
                    public boolean isMandatory() {
                        return mandatory;
                    }

                    /**
                     * Sets the value of the mandatory property.
                     * 
                     */
                    public void setMandatory(boolean value) {
                        this.mandatory = value;
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
