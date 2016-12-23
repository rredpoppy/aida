
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
 *         &lt;group ref="{http://aida.dcsplus.net/ws/2010}PackExtraServicesResultGroup"/>
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
@XmlRootElement(name = "AIDA_PackExtraServicesRS")
public class AIDAPackExtraServicesRS {

    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "Success")
    protected AIDAPackExtraServicesRS.Success success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "Package")
    protected AIDAPackExtraServicesRS.Package _package;
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
     *     {@link AIDAPackExtraServicesRS.Success }
     *     
     */
    public AIDAPackExtraServicesRS.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAPackExtraServicesRS.Success }
     *     
     */
    public void setSuccess(AIDAPackExtraServicesRS.Success value) {
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
     *     {@link AIDAPackExtraServicesRS.Package }
     *     
     */
    public AIDAPackExtraServicesRS.Package getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAPackExtraServicesRS.Package }
     *     
     */
    public void setPackage(AIDAPackExtraServicesRS.Package value) {
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
     *                                     &lt;sequence>
     *                                       &lt;element name="Service">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType" minOccurs="0"/>
     *                                                 &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                               &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="GroupService" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                               &lt;attribute name="Stars" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                               &lt;attribute name="DurationTimeUnit" use="required" type="{http://aida.dcsplus.net/ws/2010}DurationTimeUnitType" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ServiceEntries" type="{http://aida.dcsplus.net/ws/2010}ServiceEntriesType" minOccurs="0"/>
     *                                       &lt;element name="BookingRules">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PaxTypeAllowed" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Type" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeWithInfantType" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="AllPaxBook" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                                                 &lt;element name="RoomRequests" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="RoomRequest" maxOccurs="unbounded">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="MandatoryGuests" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="Guest" maxOccurs="unbounded">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
     *                                                                                       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                                                                                       &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
     *                                                                   &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
     *                                       &lt;element name="PriceSets" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PriceSet" type="{http://aida.dcsplus.net/ws/2010}PriceSetType" maxOccurs="unbounded"/>
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
     *                                                 &lt;element name="Supplement" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                                         &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="PriceSetID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="DepartureCities" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType" maxOccurs="unbounded"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        protected AIDAPackExtraServicesRS.Package.PackEntry packEntry;
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
         *     {@link AIDAPackExtraServicesRS.Package.PackEntry }
         *     
         */
        public AIDAPackExtraServicesRS.Package.PackEntry getPackEntry() {
            return packEntry;
        }

        /**
         * Sets the value of the packEntry property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAPackExtraServicesRS.Package.PackEntry }
         *     
         */
        public void setPackEntry(AIDAPackExtraServicesRS.Package.PackEntry value) {
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
         *                           &lt;sequence>
         *                             &lt;element name="Service">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType" minOccurs="0"/>
         *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="GroupService" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                                     &lt;attribute name="Stars" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                                     &lt;attribute name="DurationTimeUnit" use="required" type="{http://aida.dcsplus.net/ws/2010}DurationTimeUnitType" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ServiceEntries" type="{http://aida.dcsplus.net/ws/2010}ServiceEntriesType" minOccurs="0"/>
         *                             &lt;element name="BookingRules">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="PaxTypeAllowed" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Type" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeWithInfantType" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="AllPaxBook" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *                                       &lt;element name="RoomRequests" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="RoomRequest" maxOccurs="unbounded">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="MandatoryGuests" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="Guest" maxOccurs="unbounded">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
         *                                                                             &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                                                                             &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
         *                                                         &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
         *                             &lt;element name="PriceSets" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="PriceSet" type="{http://aida.dcsplus.net/ws/2010}PriceSetType" maxOccurs="unbounded"/>
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
         *                                       &lt;element name="Supplement" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                                               &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="PriceSetID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="DepartureCities" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType" maxOccurs="unbounded"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
            "extraServices"
        })
        public static class PackEntry {

            @XmlElement(name = "ExtraServices")
            protected AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices extraServices;
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
             *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices }
             *     
             */
            public AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices getExtraServices() {
                return extraServices;
            }

            /**
             * Sets the value of the extraServices property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices }
             *     
             */
            public void setExtraServices(AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices value) {
                this.extraServices = value;
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
             *                             &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType" minOccurs="0"/>
             *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="GroupService" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                           &lt;attribute name="Stars" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                           &lt;attribute name="DurationTimeUnit" use="required" type="{http://aida.dcsplus.net/ws/2010}DurationTimeUnitType" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="ServiceEntries" type="{http://aida.dcsplus.net/ws/2010}ServiceEntriesType" minOccurs="0"/>
             *                   &lt;element name="BookingRules">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="PaxTypeAllowed" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Type" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeWithInfantType" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="AllPaxBook" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
             *                             &lt;element name="RoomRequests" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="RoomRequest" maxOccurs="unbounded">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="MandatoryGuests" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="Guest" maxOccurs="unbounded">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
             *                                                                   &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *                                                                   &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
             *                                               &lt;attribute name="IndexNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
             *                   &lt;element name="PriceSets" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="PriceSet" type="{http://aida.dcsplus.net/ws/2010}PriceSetType" maxOccurs="unbounded"/>
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
             *                             &lt;element name="Supplement" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="PriceSetID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="DepartureCities" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType" maxOccurs="unbounded"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                protected List<AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService> extraService;

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
                 * {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService }
                 * 
                 * 
                 */
                public List<AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService> getExtraService() {
                    if (extraService == null) {
                        extraService = new ArrayList<AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService>();
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
                 *                   &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType" minOccurs="0"/>
                 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="GroupService" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *                 &lt;attribute name="Stars" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *                 &lt;attribute name="DurationTimeUnit" use="required" type="{http://aida.dcsplus.net/ws/2010}DurationTimeUnitType" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="ServiceEntries" type="{http://aida.dcsplus.net/ws/2010}ServiceEntriesType" minOccurs="0"/>
                 *         &lt;element name="BookingRules">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="PaxTypeAllowed" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Type" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeWithInfantType" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="AllPaxBook" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                 *                   &lt;element name="RoomRequests" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="RoomRequest" maxOccurs="unbounded">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
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
                 *                                                         &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="PriceSets" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="PriceSet" type="{http://aida.dcsplus.net/ws/2010}PriceSetType" maxOccurs="unbounded"/>
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
                 *                   &lt;element name="Supplement" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="PriceSetID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="DepartureCities" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType" maxOccurs="unbounded"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                    "serviceEntries",
                    "bookingRules",
                    "priceSets",
                    "supplements",
                    "departureCities"
                })
                public static class ExtraService {

                    @XmlElement(name = "Service", required = true)
                    protected AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.Service service;
                    @XmlElement(name = "ServiceEntries")
                    protected ServiceEntriesType serviceEntries;
                    @XmlElement(name = "BookingRules", required = true)
                    protected AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules bookingRules;
                    @XmlElement(name = "PriceSets")
                    protected AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.PriceSets priceSets;
                    @XmlElement(name = "Supplements")
                    protected AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.Supplements supplements;
                    @XmlElement(name = "DepartureCities")
                    protected AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.DepartureCities departureCities;
                    @XmlAttribute(name = "Mandatory")
                    protected Boolean mandatory;

                    /**
                     * Gets the value of the service property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.Service }
                     *     
                     */
                    public AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.Service getService() {
                        return service;
                    }

                    /**
                     * Sets the value of the service property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.Service }
                     *     
                     */
                    public void setService(AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.Service value) {
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
                     * Gets the value of the bookingRules property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules }
                     *     
                     */
                    public AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules getBookingRules() {
                        return bookingRules;
                    }

                    /**
                     * Sets the value of the bookingRules property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules }
                     *     
                     */
                    public void setBookingRules(AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules value) {
                        this.bookingRules = value;
                    }

                    /**
                     * Gets the value of the priceSets property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.PriceSets }
                     *     
                     */
                    public AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.PriceSets getPriceSets() {
                        return priceSets;
                    }

                    /**
                     * Sets the value of the priceSets property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.PriceSets }
                     *     
                     */
                    public void setPriceSets(AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.PriceSets value) {
                        this.priceSets = value;
                    }

                    /**
                     * Gets the value of the supplements property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.Supplements }
                     *     
                     */
                    public AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.Supplements getSupplements() {
                        return supplements;
                    }

                    /**
                     * Sets the value of the supplements property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.Supplements }
                     *     
                     */
                    public void setSupplements(AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.Supplements value) {
                        this.supplements = value;
                    }

                    /**
                     * Gets the value of the departureCities property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.DepartureCities }
                     *     
                     */
                    public AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.DepartureCities getDepartureCities() {
                        return departureCities;
                    }

                    /**
                     * Sets the value of the departureCities property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.DepartureCities }
                     *     
                     */
                    public void setDepartureCities(AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.DepartureCities value) {
                        this.departureCities = value;
                    }

                    /**
                     * Gets the value of the mandatory property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isMandatory() {
                        return mandatory;
                    }

                    /**
                     * Sets the value of the mandatory property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setMandatory(Boolean value) {
                        this.mandatory = value;
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
                     *         &lt;element name="PaxTypeAllowed" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Type" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeWithInfantType" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="AllPaxBook" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
                     *         &lt;element name="RoomRequests" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="RoomRequest" maxOccurs="unbounded">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
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
                     *                                               &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                        "paxTypeAllowed",
                        "allPaxBook",
                        "roomRequests"
                    })
                    public static class BookingRules {

                        @XmlElement(name = "PaxTypeAllowed", required = true)
                        protected List<AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.PaxTypeAllowed> paxTypeAllowed;
                        @XmlElement(name = "AllPaxBook")
                        protected boolean allPaxBook;
                        @XmlElement(name = "RoomRequests")
                        protected AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests roomRequests;

                        /**
                         * Gets the value of the paxTypeAllowed property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the paxTypeAllowed property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getPaxTypeAllowed().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.PaxTypeAllowed }
                         * 
                         * 
                         */
                        public List<AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.PaxTypeAllowed> getPaxTypeAllowed() {
                            if (paxTypeAllowed == null) {
                                paxTypeAllowed = new ArrayList<AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.PaxTypeAllowed>();
                            }
                            return this.paxTypeAllowed;
                        }

                        /**
                         * Gets the value of the allPaxBook property.
                         * 
                         */
                        public boolean isAllPaxBook() {
                            return allPaxBook;
                        }

                        /**
                         * Sets the value of the allPaxBook property.
                         * 
                         */
                        public void setAllPaxBook(boolean value) {
                            this.allPaxBook = value;
                        }

                        /**
                         * Gets the value of the roomRequests property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests }
                         *     
                         */
                        public AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests getRoomRequests() {
                            return roomRequests;
                        }

                        /**
                         * Sets the value of the roomRequests property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests }
                         *     
                         */
                        public void setRoomRequests(AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests value) {
                            this.roomRequests = value;
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
                         *       &lt;attribute name="Type" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeWithInfantType" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class PaxTypeAllowed {

                            @XmlAttribute(name = "Type")
                            protected AgeQualifyingCodeWithInfantType type;

                            /**
                             * Gets the value of the type property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link AgeQualifyingCodeWithInfantType }
                             *     
                             */
                            public AgeQualifyingCodeWithInfantType getType() {
                                return type;
                            }

                            /**
                             * Sets the value of the type property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link AgeQualifyingCodeWithInfantType }
                             *     
                             */
                            public void setType(AgeQualifyingCodeWithInfantType value) {
                                this.type = value;
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
                         *                                     &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                        public static class RoomRequests {

                            @XmlElement(name = "RoomRequest", required = true)
                            protected List<AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests.RoomRequest> roomRequest;

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
                             * {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests.RoomRequest }
                             * 
                             * 
                             */
                            public List<AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests.RoomRequest> getRoomRequest() {
                                if (roomRequest == null) {
                                    roomRequest = new ArrayList<AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests.RoomRequest>();
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
                             *                           &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                                "mandatoryGuests"
                            })
                            public static class RoomRequest {

                                @XmlElement(name = "MandatoryGuests")
                                protected AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests.RoomRequest.MandatoryGuests mandatoryGuests;
                                @XmlAttribute(name = "IndexNumber")
                                @XmlSchemaType(name = "positiveInteger")
                                protected BigInteger indexNumber;

                                /**
                                 * Gets the value of the mandatoryGuests property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests.RoomRequest.MandatoryGuests }
                                 *     
                                 */
                                public AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests.RoomRequest.MandatoryGuests getMandatoryGuests() {
                                    return mandatoryGuests;
                                }

                                /**
                                 * Sets the value of the mandatoryGuests property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests.RoomRequest.MandatoryGuests }
                                 *     
                                 */
                                public void setMandatoryGuests(AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests.RoomRequest.MandatoryGuests value) {
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
                                 *                 &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                                    protected List<AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests.RoomRequest.MandatoryGuests.Guest> guest;

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
                                     * {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests.RoomRequest.MandatoryGuests.Guest }
                                     * 
                                     * 
                                     */
                                    public List<AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests.RoomRequest.MandatoryGuests.Guest> getGuest() {
                                        if (guest == null) {
                                            guest = new ArrayList<AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.BookingRules.RoomRequests.RoomRequest.MandatoryGuests.Guest>();
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
                                     *       &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                                        @XmlAttribute(name = "Count", required = true)
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
                     *         &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType" maxOccurs="unbounded"/>
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
                        "city"
                    })
                    public static class DepartureCities {

                        @XmlElement(name = "City", required = true)
                        protected List<CityType> city;

                        /**
                         * Gets the value of the city property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the city property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getCity().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link CityType }
                         * 
                         * 
                         */
                        public List<CityType> getCity() {
                            if (city == null) {
                                city = new ArrayList<CityType>();
                            }
                            return this.city;
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
                     *         &lt;element name="PriceSet" type="{http://aida.dcsplus.net/ws/2010}PriceSetType" maxOccurs="unbounded"/>
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
                        "priceSet"
                    })
                    public static class PriceSets {

                        @XmlElement(name = "PriceSet", required = true)
                        protected List<PriceSetType> priceSet;

                        /**
                         * Gets the value of the priceSet property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the priceSet property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getPriceSet().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PriceSetType }
                         * 
                         * 
                         */
                        public List<PriceSetType> getPriceSet() {
                            if (priceSet == null) {
                                priceSet = new ArrayList<PriceSetType>();
                            }
                            return this.priceSet;
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
                     *         &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType" minOccurs="0"/>
                     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                     *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *       &lt;attribute name="GroupService" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                     *       &lt;attribute name="Stars" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                     *       &lt;attribute name="DurationTimeUnit" use="required" type="{http://aida.dcsplus.net/ws/2010}DurationTimeUnitType" />
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

                        @XmlElement(name = "Type")
                        protected ServiceType type;
                        @XmlElement(name = "Description")
                        protected String description;
                        @XmlAttribute(name = "ID", required = true)
                        @XmlSchemaType(name = "positiveInteger")
                        protected BigInteger id;
                        @XmlAttribute(name = "Name", required = true)
                        protected String name;
                        @XmlAttribute(name = "GroupService")
                        protected Boolean groupService;
                        @XmlAttribute(name = "Stars")
                        @XmlSchemaType(name = "positiveInteger")
                        protected BigInteger stars;
                        @XmlAttribute(name = "DurationTimeUnit", required = true)
                        protected DurationTimeUnitType durationTimeUnit;

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
                         * Gets the value of the groupService property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public Boolean isGroupService() {
                            return groupService;
                        }

                        /**
                         * Sets the value of the groupService property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setGroupService(Boolean value) {
                            this.groupService = value;
                        }

                        /**
                         * Gets the value of the stars property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getStars() {
                            return stars;
                        }

                        /**
                         * Sets the value of the stars property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setStars(BigInteger value) {
                            this.stars = value;
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
                     *         &lt;element name="Supplement" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="PriceSetID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                        "supplement"
                    })
                    public static class Supplements {

                        @XmlElement(name = "Supplement", required = true)
                        protected List<AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.Supplements.Supplement> supplement;

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
                         * {@link AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.Supplements.Supplement }
                         * 
                         * 
                         */
                        public List<AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.Supplements.Supplement> getSupplement() {
                            if (supplement == null) {
                                supplement = new ArrayList<AIDAPackExtraServicesRS.Package.PackEntry.ExtraServices.ExtraService.Supplements.Supplement>();
                            }
                            return this.supplement;
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
                         *       &lt;attribute name="PriceSetID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Supplement {

                            @XmlAttribute(name = "ID", required = true)
                            @XmlSchemaType(name = "positiveInteger")
                            protected BigInteger id;
                            @XmlAttribute(name = "Name", required = true)
                            protected String name;
                            @XmlAttribute(name = "PriceSetID")
                            @XmlSchemaType(name = "positiveInteger")
                            protected BigInteger priceSetID;

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
                             * Gets the value of the priceSetID property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getPriceSetID() {
                                return priceSetID;
                            }

                            /**
                             * Sets the value of the priceSetID property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setPriceSetID(BigInteger value) {
                                this.priceSetID = value;
                            }

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
