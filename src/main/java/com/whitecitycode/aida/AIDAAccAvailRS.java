
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
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;group ref="{http://aida.dcsplus.net/ws/2010}AccAvailResultsGroup"/>
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
    "accUnit"
})
@XmlRootElement(name = "AIDA_AccAvailRS")
public class AIDAAccAvailRS {

    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "Success")
    protected AIDAAccAvailRS.Success success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "AccUnit")
    protected AIDAAccAvailRS.AccUnit accUnit;
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
     *     {@link AIDAAccAvailRS.Success }
     *     
     */
    public AIDAAccAvailRS.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccAvailRS.Success }
     *     
     */
    public void setSuccess(AIDAAccAvailRS.Success value) {
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
     * Gets the value of the accUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAAccAvailRS.AccUnit }
     *     
     */
    public AIDAAccAvailRS.AccUnit getAccUnit() {
        return accUnit;
    }

    /**
     * Sets the value of the accUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccAvailRS.AccUnit }
     *     
     */
    public void setAccUnit(AIDAAccAvailRS.AccUnit value) {
        this.accUnit = value;
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
     *         &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType"/>
     *         &lt;element name="Descriptions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Destination" type="{http://aida.dcsplus.net/ws/2010}LocalizationType"/>
     *         &lt;element name="Availability">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TourOperatorConfirmation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}TourOperatorConfirmationStsType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AccRateType" type="{http://aida.dcsplus.net/ws/2010}AccRateTypeType" minOccurs="0"/>
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
     *                             &lt;element name="RoomType" type="{http://aida.dcsplus.net/ws/2010}RoomElementType"/>
     *                             &lt;element name="RoomTypeCategory" type="{http://aida.dcsplus.net/ws/2010}RoomTypeCategoryType"/>
     *                             &lt;element name="Feature" type="{http://aida.dcsplus.net/ws/2010}FeatureElementType"/>
     *                             &lt;element name="Occupancy" type="{http://aida.dcsplus.net/ws/2010}OccupancyElementType"/>
     *                             &lt;element name="Availability">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *                                                 &lt;element name="GuestsCount">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="GuestCount" maxOccurs="unbounded">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
     *                                                                   &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                                                   &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
     *                                                 &lt;element name="Rates" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Rate" maxOccurs="unbounded">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                   &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                                                   &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="SelectedRate" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="DateStart" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                                               &lt;attribute name="DateEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
     *                             &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RateId" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="SpoId" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SubservicesList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Subservice" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Rates" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Rate" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                               &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="LimitedPeriod" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="GroupSale" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="SingleDate" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Stars" type="{http://aida.dcsplus.net/ws/2010}ServiceStarsType" />
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
        "descriptions",
        "destination",
        "availability",
        "tourOperatorConfirmation",
        "accRateType",
        "rooms",
        "subservicesList"
    })
    public static class AccUnit {

        @XmlElement(name = "Type", required = true)
        protected ServiceType type;
        @XmlElement(name = "Descriptions")
        protected AIDAAccAvailRS.AccUnit.Descriptions descriptions;
        @XmlElement(name = "Destination", required = true)
        protected LocalizationType destination;
        @XmlElement(name = "Availability", required = true)
        protected AIDAAccAvailRS.AccUnit.Availability availability;
        @XmlElement(name = "TourOperatorConfirmation")
        protected AIDAAccAvailRS.AccUnit.TourOperatorConfirmation tourOperatorConfirmation;
        @XmlElement(name = "AccRateType")
        protected AccRateTypeType accRateType;
        @XmlElement(name = "Rooms", required = true)
        protected AIDAAccAvailRS.AccUnit.Rooms rooms;
        @XmlElement(name = "SubservicesList")
        protected AIDAAccAvailRS.AccUnit.SubservicesList subservicesList;
        @XmlAttribute(name = "ID")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "Stars")
        protected Integer stars;

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
         * Gets the value of the descriptions property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccAvailRS.AccUnit.Descriptions }
         *     
         */
        public AIDAAccAvailRS.AccUnit.Descriptions getDescriptions() {
            return descriptions;
        }

        /**
         * Sets the value of the descriptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccAvailRS.AccUnit.Descriptions }
         *     
         */
        public void setDescriptions(AIDAAccAvailRS.AccUnit.Descriptions value) {
            this.descriptions = value;
        }

        /**
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link LocalizationType }
         *     
         */
        public LocalizationType getDestination() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link LocalizationType }
         *     
         */
        public void setDestination(LocalizationType value) {
            this.destination = value;
        }

        /**
         * Gets the value of the availability property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccAvailRS.AccUnit.Availability }
         *     
         */
        public AIDAAccAvailRS.AccUnit.Availability getAvailability() {
            return availability;
        }

        /**
         * Sets the value of the availability property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccAvailRS.AccUnit.Availability }
         *     
         */
        public void setAvailability(AIDAAccAvailRS.AccUnit.Availability value) {
            this.availability = value;
        }

        /**
         * Gets the value of the tourOperatorConfirmation property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccAvailRS.AccUnit.TourOperatorConfirmation }
         *     
         */
        public AIDAAccAvailRS.AccUnit.TourOperatorConfirmation getTourOperatorConfirmation() {
            return tourOperatorConfirmation;
        }

        /**
         * Sets the value of the tourOperatorConfirmation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccAvailRS.AccUnit.TourOperatorConfirmation }
         *     
         */
        public void setTourOperatorConfirmation(AIDAAccAvailRS.AccUnit.TourOperatorConfirmation value) {
            this.tourOperatorConfirmation = value;
        }

        /**
         * Gets the value of the accRateType property.
         * 
         * @return
         *     possible object is
         *     {@link AccRateTypeType }
         *     
         */
        public AccRateTypeType getAccRateType() {
            return accRateType;
        }

        /**
         * Sets the value of the accRateType property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccRateTypeType }
         *     
         */
        public void setAccRateType(AccRateTypeType value) {
            this.accRateType = value;
        }

        /**
         * Gets the value of the rooms property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccAvailRS.AccUnit.Rooms }
         *     
         */
        public AIDAAccAvailRS.AccUnit.Rooms getRooms() {
            return rooms;
        }

        /**
         * Sets the value of the rooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccAvailRS.AccUnit.Rooms }
         *     
         */
        public void setRooms(AIDAAccAvailRS.AccUnit.Rooms value) {
            this.rooms = value;
        }

        /**
         * Gets the value of the subservicesList property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccAvailRS.AccUnit.SubservicesList }
         *     
         */
        public AIDAAccAvailRS.AccUnit.SubservicesList getSubservicesList() {
            return subservicesList;
        }

        /**
         * Sets the value of the subservicesList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccAvailRS.AccUnit.SubservicesList }
         *     
         */
        public void setSubservicesList(AIDAAccAvailRS.AccUnit.SubservicesList value) {
            this.subservicesList = value;
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
         * Gets the value of the stars property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getStars() {
            return stars;
        }

        /**
         * Sets the value of the stars property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setStars(Integer value) {
            this.stars = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Availability {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Status", required = true)
            protected AvailableStsType status;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link AvailableStsType }
             *     
             */
            public AvailableStsType getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link AvailableStsType }
             *     
             */
            public void setStatus(AvailableStsType value) {
                this.status = value;
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
         *         &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "shortDescription"
        })
        public static class Descriptions {

            @XmlElement(name = "ShortDescription")
            protected String shortDescription;

            /**
             * Gets the value of the shortDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShortDescription() {
                return shortDescription;
            }

            /**
             * Sets the value of the shortDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShortDescription(String value) {
                this.shortDescription = value;
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
         *         &lt;element name="Room" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RoomType" type="{http://aida.dcsplus.net/ws/2010}RoomElementType"/>
         *                   &lt;element name="RoomTypeCategory" type="{http://aida.dcsplus.net/ws/2010}RoomTypeCategoryType"/>
         *                   &lt;element name="Feature" type="{http://aida.dcsplus.net/ws/2010}FeatureElementType"/>
         *                   &lt;element name="Occupancy" type="{http://aida.dcsplus.net/ws/2010}OccupancyElementType"/>
         *                   &lt;element name="Availability">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
         *                                       &lt;element name="GuestsCount">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="GuestCount" maxOccurs="unbounded">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
         *                                                         &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                                                         &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
         *                                       &lt;element name="Rates" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Rate" maxOccurs="unbounded">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                         &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                                                         &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="SelectedRate" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="DateStart" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                                     &lt;attribute name="DateEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
         *                   &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="RateId" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="SpoId" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
            protected List<AIDAAccAvailRS.AccUnit.Rooms.Room> room;
            @XmlAttribute(name = "RateId")
            protected BigInteger rateId;
            @XmlAttribute(name = "SpoId")
            protected BigInteger spoId;

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
             * {@link AIDAAccAvailRS.AccUnit.Rooms.Room }
             * 
             * 
             */
            public List<AIDAAccAvailRS.AccUnit.Rooms.Room> getRoom() {
                if (room == null) {
                    room = new ArrayList<AIDAAccAvailRS.AccUnit.Rooms.Room>();
                }
                return this.room;
            }

            /**
             * Gets the value of the rateId property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRateId() {
                return rateId;
            }

            /**
             * Sets the value of the rateId property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRateId(BigInteger value) {
                this.rateId = value;
            }

            /**
             * Gets the value of the spoId property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSpoId() {
                return spoId;
            }

            /**
             * Sets the value of the spoId property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSpoId(BigInteger value) {
                this.spoId = value;
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
             *         &lt;element name="RoomType" type="{http://aida.dcsplus.net/ws/2010}RoomElementType"/>
             *         &lt;element name="RoomTypeCategory" type="{http://aida.dcsplus.net/ws/2010}RoomTypeCategoryType"/>
             *         &lt;element name="Feature" type="{http://aida.dcsplus.net/ws/2010}FeatureElementType"/>
             *         &lt;element name="Occupancy" type="{http://aida.dcsplus.net/ws/2010}OccupancyElementType"/>
             *         &lt;element name="Availability">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
             *                             &lt;element name="GuestsCount">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="GuestCount" maxOccurs="unbounded">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
             *                                               &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                                               &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
             *                             &lt;element name="Rates" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Rate" maxOccurs="unbounded">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                               &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                                               &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="SelectedRate" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="DateStart" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
             *                           &lt;attribute name="DateEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
             *         &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "roomType",
                "roomTypeCategory",
                "feature",
                "occupancy",
                "availability",
                "extraServices",
                "price",
                "cancelPenalties"
            })
            public static class Room {

                @XmlElement(name = "RoomType", required = true)
                protected RoomElementType roomType;
                @XmlElement(name = "RoomTypeCategory", required = true)
                protected RoomTypeCategoryType roomTypeCategory;
                @XmlElement(name = "Feature", required = true)
                protected FeatureElementType feature;
                @XmlElement(name = "Occupancy", required = true)
                protected OccupancyElementType occupancy;
                @XmlElement(name = "Availability", required = true)
                protected AIDAAccAvailRS.AccUnit.Rooms.Room.Availability availability;
                @XmlElement(name = "ExtraServices")
                protected AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices extraServices;
                @XmlElement(name = "Price", required = true)
                protected PriceType price;
                @XmlElement(name = "CancelPenalties")
                protected CancelPenaltiesType cancelPenalties;
                @XmlAttribute(name = "ID", required = true)
                protected String id;
                @XmlAttribute(name = "Count", required = true)
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger count;

                /**
                 * Gets the value of the roomType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RoomElementType }
                 *     
                 */
                public RoomElementType getRoomType() {
                    return roomType;
                }

                /**
                 * Sets the value of the roomType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RoomElementType }
                 *     
                 */
                public void setRoomType(RoomElementType value) {
                    this.roomType = value;
                }

                /**
                 * Gets the value of the roomTypeCategory property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RoomTypeCategoryType }
                 *     
                 */
                public RoomTypeCategoryType getRoomTypeCategory() {
                    return roomTypeCategory;
                }

                /**
                 * Sets the value of the roomTypeCategory property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RoomTypeCategoryType }
                 *     
                 */
                public void setRoomTypeCategory(RoomTypeCategoryType value) {
                    this.roomTypeCategory = value;
                }

                /**
                 * Gets the value of the feature property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FeatureElementType }
                 *     
                 */
                public FeatureElementType getFeature() {
                    return feature;
                }

                /**
                 * Sets the value of the feature property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FeatureElementType }
                 *     
                 */
                public void setFeature(FeatureElementType value) {
                    this.feature = value;
                }

                /**
                 * Gets the value of the occupancy property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OccupancyElementType }
                 *     
                 */
                public OccupancyElementType getOccupancy() {
                    return occupancy;
                }

                /**
                 * Sets the value of the occupancy property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OccupancyElementType }
                 *     
                 */
                public void setOccupancy(OccupancyElementType value) {
                    this.occupancy = value;
                }

                /**
                 * Gets the value of the availability property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AIDAAccAvailRS.AccUnit.Rooms.Room.Availability }
                 *     
                 */
                public AIDAAccAvailRS.AccUnit.Rooms.Room.Availability getAvailability() {
                    return availability;
                }

                /**
                 * Sets the value of the availability property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AIDAAccAvailRS.AccUnit.Rooms.Room.Availability }
                 *     
                 */
                public void setAvailability(AIDAAccAvailRS.AccUnit.Rooms.Room.Availability value) {
                    this.availability = value;
                }

                /**
                 * Gets the value of the extraServices property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices }
                 *     
                 */
                public AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices getExtraServices() {
                    return extraServices;
                }

                /**
                 * Sets the value of the extraServices property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices }
                 *     
                 */
                public void setExtraServices(AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices value) {
                    this.extraServices = value;
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


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Availability {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Status", required = true)
                    protected AvailableStsType status;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the status property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AvailableStsType }
                     *     
                     */
                    public AvailableStsType getStatus() {
                        return status;
                    }

                    /**
                     * Sets the value of the status property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AvailableStsType }
                     *     
                     */
                    public void setStatus(AvailableStsType value) {
                        this.status = value;
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
                 *                   &lt;element name="GuestsCount">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="GuestCount" maxOccurs="unbounded">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
                 *                                     &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *                                     &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
                 *                   &lt;element name="Rates" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Rate" maxOccurs="unbounded">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                     &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *                                     &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="SelectedRate" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="DateStart" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
                 *                 &lt;attribute name="DateEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
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
                    protected List<AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService> extraService;

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
                     * {@link AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService }
                     * 
                     * 
                     */
                    public List<AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService> getExtraService() {
                        if (extraService == null) {
                            extraService = new ArrayList<AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService>();
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
                     *         &lt;element name="GuestsCount">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="GuestCount" maxOccurs="unbounded">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
                     *                           &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                     *                           &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
                     *         &lt;element name="Rates" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Rate" maxOccurs="unbounded">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                           &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                     *                           &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="SelectedRate" type="{http://www.w3.org/2001/XMLSchema}integer" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
                     *       &lt;/sequence>
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
                        "service",
                        "guestsCount",
                        "price",
                        "rates",
                        "cancelPenalties"
                    })
                    public static class ExtraService {

                        @XmlElement(name = "Service", required = true)
                        protected AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.Service service;
                        @XmlElement(name = "GuestsCount", required = true)
                        protected AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount guestsCount;
                        @XmlElement(name = "Price")
                        protected PriceType price;
                        @XmlElement(name = "Rates")
                        protected AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.Rates rates;
                        @XmlElement(name = "CancelPenalties")
                        protected CancelPenaltiesType cancelPenalties;
                        @XmlAttribute(name = "DateStart", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar dateStart;
                        @XmlAttribute(name = "DateEnd", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar dateEnd;

                        /**
                         * Gets the value of the service property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.Service }
                         *     
                         */
                        public AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.Service getService() {
                            return service;
                        }

                        /**
                         * Sets the value of the service property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.Service }
                         *     
                         */
                        public void setService(AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.Service value) {
                            this.service = value;
                        }

                        /**
                         * Gets the value of the guestsCount property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount }
                         *     
                         */
                        public AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount getGuestsCount() {
                            return guestsCount;
                        }

                        /**
                         * Sets the value of the guestsCount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount }
                         *     
                         */
                        public void setGuestsCount(AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount value) {
                            this.guestsCount = value;
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
                         * Gets the value of the rates property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.Rates }
                         *     
                         */
                        public AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.Rates getRates() {
                            return rates;
                        }

                        /**
                         * Sets the value of the rates property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.Rates }
                         *     
                         */
                        public void setRates(AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.Rates value) {
                            this.rates = value;
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
                         *         &lt;element name="GuestCount" maxOccurs="unbounded">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
                         *                 &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                         *                 &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                            "guestCount"
                        })
                        public static class GuestsCount {

                            @XmlElement(name = "GuestCount", required = true)
                            protected List<AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount.GuestCount> guestCount;

                            /**
                             * Gets the value of the guestCount property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the guestCount property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getGuestCount().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount.GuestCount }
                             * 
                             * 
                             */
                            public List<AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount.GuestCount> getGuestCount() {
                                if (guestCount == null) {
                                    guestCount = new ArrayList<AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount.GuestCount>();
                                }
                                return this.guestCount;
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
                             *       &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                             *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class GuestCount {

                                @XmlAttribute(name = "AgeQualifyingCode", required = true)
                                protected AgeQualifyingCodeType ageQualifyingCode;
                                @XmlAttribute(name = "Count", required = true)
                                @XmlSchemaType(name = "positiveInteger")
                                protected BigInteger count;
                                @XmlAttribute(name = "Age")
                                @XmlSchemaType(name = "positiveInteger")
                                protected BigInteger age;

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
                         *                   &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *                 &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                         *                 &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *       &lt;attribute name="SelectedRate" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
                            protected List<AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.Rates.Rate> rate;
                            @XmlAttribute(name = "SelectedRate")
                            protected BigInteger selectedRate;

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
                             * {@link AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.Rates.Rate }
                             * 
                             * 
                             */
                            public List<AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.Rates.Rate> getRate() {
                                if (rate == null) {
                                    rate = new ArrayList<AIDAAccAvailRS.AccUnit.Rooms.Room.ExtraServices.ExtraService.Rates.Rate>();
                                }
                                return this.rate;
                            }

                            /**
                             * Gets the value of the selectedRate property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getSelectedRate() {
                                return selectedRate;
                            }

                            /**
                             * Sets the value of the selectedRate property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setSelectedRate(BigInteger value) {
                                this.selectedRate = value;
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
                             *         &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
                             *       &lt;/sequence>
                             *       &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                             *       &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                            public static class Rate {

                                @XmlElement(name = "Price")
                                protected PriceType price;
                                @XmlAttribute(name = "RateId", required = true)
                                protected BigInteger rateId;
                                @XmlAttribute(name = "RateName")
                                protected String rateName;

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
                                 * Gets the value of the rateId property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public BigInteger getRateId() {
                                    return rateId;
                                }

                                /**
                                 * Sets the value of the rateId property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public void setRateId(BigInteger value) {
                                    this.rateId = value;
                                }

                                /**
                                 * Gets the value of the rateName property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getRateName() {
                                    return rateName;
                                }

                                /**
                                 * Sets the value of the rateName property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setRateName(String value) {
                                    this.rateName = value;
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
         *         &lt;element name="Subservice" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Rates" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Rate" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                                     &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="LimitedPeriod" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="GroupSale" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="SingleDate" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
            "subservice"
        })
        public static class SubservicesList {

            @XmlElement(name = "Subservice", required = true)
            protected List<AIDAAccAvailRS.AccUnit.SubservicesList.Subservice> subservice;

            /**
             * Gets the value of the subservice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the subservice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubservice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AIDAAccAvailRS.AccUnit.SubservicesList.Subservice }
             * 
             * 
             */
            public List<AIDAAccAvailRS.AccUnit.SubservicesList.Subservice> getSubservice() {
                if (subservice == null) {
                    subservice = new ArrayList<AIDAAccAvailRS.AccUnit.SubservicesList.Subservice>();
                }
                return this.subservice;
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
             *         &lt;element name="Rates" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Rate" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                           &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="LimitedPeriod" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="GroupSale" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="SingleDate" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                "rates"
            })
            public static class Subservice {

                @XmlElement(name = "Description")
                protected String description;
                @XmlElement(name = "Rates")
                protected AIDAAccAvailRS.AccUnit.SubservicesList.Subservice.Rates rates;
                @XmlAttribute(name = "ID", required = true)
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger id;
                @XmlAttribute(name = "Name", required = true)
                protected String name;
                @XmlAttribute(name = "Mandatory", required = true)
                protected boolean mandatory;
                @XmlAttribute(name = "LimitedPeriod", required = true)
                protected boolean limitedPeriod;
                @XmlAttribute(name = "GroupSale", required = true)
                protected boolean groupSale;
                @XmlAttribute(name = "SingleDate", required = true)
                protected boolean singleDate;

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
                 * Gets the value of the rates property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AIDAAccAvailRS.AccUnit.SubservicesList.Subservice.Rates }
                 *     
                 */
                public AIDAAccAvailRS.AccUnit.SubservicesList.Subservice.Rates getRates() {
                    return rates;
                }

                /**
                 * Sets the value of the rates property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AIDAAccAvailRS.AccUnit.SubservicesList.Subservice.Rates }
                 *     
                 */
                public void setRates(AIDAAccAvailRS.AccUnit.SubservicesList.Subservice.Rates value) {
                    this.rates = value;
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

                /**
                 * Gets the value of the limitedPeriod property.
                 * 
                 */
                public boolean isLimitedPeriod() {
                    return limitedPeriod;
                }

                /**
                 * Sets the value of the limitedPeriod property.
                 * 
                 */
                public void setLimitedPeriod(boolean value) {
                    this.limitedPeriod = value;
                }

                /**
                 * Gets the value of the groupSale property.
                 * 
                 */
                public boolean isGroupSale() {
                    return groupSale;
                }

                /**
                 * Sets the value of the groupSale property.
                 * 
                 */
                public void setGroupSale(boolean value) {
                    this.groupSale = value;
                }

                /**
                 * Gets the value of the singleDate property.
                 * 
                 */
                public boolean isSingleDate() {
                    return singleDate;
                }

                /**
                 * Sets the value of the singleDate property.
                 * 
                 */
                public void setSingleDate(boolean value) {
                    this.singleDate = value;
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
                 *                 &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *                 &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    protected List<AIDAAccAvailRS.AccUnit.SubservicesList.Subservice.Rates.Rate> rate;

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
                     * {@link AIDAAccAvailRS.AccUnit.SubservicesList.Subservice.Rates.Rate }
                     * 
                     * 
                     */
                    public List<AIDAAccAvailRS.AccUnit.SubservicesList.Subservice.Rates.Rate> getRate() {
                        if (rate == null) {
                            rate = new ArrayList<AIDAAccAvailRS.AccUnit.SubservicesList.Subservice.Rates.Rate>();
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
                     *       &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                     *       &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                        @XmlAttribute(name = "RateId", required = true)
                        protected BigInteger rateId;
                        @XmlAttribute(name = "RateName")
                        protected String rateName;

                        /**
                         * Gets the value of the rateId property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getRateId() {
                            return rateId;
                        }

                        /**
                         * Sets the value of the rateId property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setRateId(BigInteger value) {
                            this.rateId = value;
                        }

                        /**
                         * Gets the value of the rateName property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRateName() {
                            return rateName;
                        }

                        /**
                         * Sets the value of the rateName property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRateName(String value) {
                            this.rateName = value;
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
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}TourOperatorConfirmationStsType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class TourOperatorConfirmation {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Status", required = true)
            protected TourOperatorConfirmationStsType status;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link TourOperatorConfirmationStsType }
             *     
             */
            public TourOperatorConfirmationStsType getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link TourOperatorConfirmationStsType }
             *     
             */
            public void setStatus(TourOperatorConfirmationStsType value) {
                this.status = value;
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
