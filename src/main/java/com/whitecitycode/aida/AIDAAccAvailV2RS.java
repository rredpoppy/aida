
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
 *         &lt;group ref="{http://aida.dcsplus.net/ws/2010}AccAvailResultsGroupV2"/>
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
    "accUnit",
    "nationality"
})
@XmlRootElement(name = "AIDA_AccAvailV2RS")
public class AIDAAccAvailV2RS {

    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "Success")
    protected AIDAAccAvailV2RS.Success success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "AccUnit")
    protected AIDAAccAvailV2RS.AccUnit accUnit;
    @XmlElement(name = "Nationality")
    protected Object nationality;
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
     *     {@link AIDAAccAvailV2RS.Success }
     *     
     */
    public AIDAAccAvailV2RS.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccAvailV2RS.Success }
     *     
     */
    public void setSuccess(AIDAAccAvailV2RS.Success value) {
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
     *     {@link AIDAAccAvailV2RS.AccUnit }
     *     
     */
    public AIDAAccAvailV2RS.AccUnit getAccUnit() {
        return accUnit;
    }

    /**
     * Sets the value of the accUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccAvailV2RS.AccUnit }
     *     
     */
    public void setAccUnit(AIDAAccAvailV2RS.AccUnit value) {
        this.accUnit = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNationality(Object value) {
        this.nationality = value;
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
     *                   &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                                                           &lt;element name="RoomInfo" type="{http://aida.dcsplus.net/ws/2010}RoomInfoType"/>
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
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType"/>
     *                                                                                       &lt;/sequence>
     *                                                                                       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                                                                       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                                                                               &lt;element name="Rate" type="{http://aida.dcsplus.net/ws/2010}ServiceRateType"/>
     *                                                                               &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
     *                                                                               &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                                                           &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
     *                                                           &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                   &lt;element name="Rate" type="{http://aida.dcsplus.net/ws/2010}AccServiceRateType"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LockedDuration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SeniorMinAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Stars" use="required" type="{http://aida.dcsplus.net/ws/2010}ServiceStarsType" />
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
        "accService"
    })
    public static class AccUnit {

        @XmlElement(name = "Type", required = true)
        protected ServiceType type;
        @XmlElement(name = "Descriptions")
        protected AIDAAccAvailV2RS.AccUnit.Descriptions descriptions;
        @XmlElement(name = "Destination", required = true)
        protected LocalizationType destination;
        @XmlElement(name = "Availability", required = true)
        protected AIDAAccAvailV2RS.AccUnit.Availability availability;
        @XmlElement(name = "TourOperatorConfirmation")
        protected AIDAAccAvailV2RS.AccUnit.TourOperatorConfirmation tourOperatorConfirmation;
        @XmlElement(name = "AccRateType")
        protected AccRateTypeType accRateType;
        @XmlElement(name = "AccService", required = true)
        protected AIDAAccAvailV2RS.AccUnit.AccService accService;
        @XmlAttribute(name = "ID", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;
        @XmlAttribute(name = "Name", required = true)
        protected String name;
        @XmlAttribute(name = "Stars", required = true)
        protected int stars;

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
         *     {@link AIDAAccAvailV2RS.AccUnit.Descriptions }
         *     
         */
        public AIDAAccAvailV2RS.AccUnit.Descriptions getDescriptions() {
            return descriptions;
        }

        /**
         * Sets the value of the descriptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccAvailV2RS.AccUnit.Descriptions }
         *     
         */
        public void setDescriptions(AIDAAccAvailV2RS.AccUnit.Descriptions value) {
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
         *     {@link AIDAAccAvailV2RS.AccUnit.Availability }
         *     
         */
        public AIDAAccAvailV2RS.AccUnit.Availability getAvailability() {
            return availability;
        }

        /**
         * Sets the value of the availability property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccAvailV2RS.AccUnit.Availability }
         *     
         */
        public void setAvailability(AIDAAccAvailV2RS.AccUnit.Availability value) {
            this.availability = value;
        }

        /**
         * Gets the value of the tourOperatorConfirmation property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccAvailV2RS.AccUnit.TourOperatorConfirmation }
         *     
         */
        public AIDAAccAvailV2RS.AccUnit.TourOperatorConfirmation getTourOperatorConfirmation() {
            return tourOperatorConfirmation;
        }

        /**
         * Sets the value of the tourOperatorConfirmation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccAvailV2RS.AccUnit.TourOperatorConfirmation }
         *     
         */
        public void setTourOperatorConfirmation(AIDAAccAvailV2RS.AccUnit.TourOperatorConfirmation value) {
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
         * Gets the value of the accService property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccAvailV2RS.AccUnit.AccService }
         *     
         */
        public AIDAAccAvailV2RS.AccUnit.AccService getAccService() {
            return accService;
        }

        /**
         * Sets the value of the accService property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccAvailV2RS.AccUnit.AccService }
         *     
         */
        public void setAccService(AIDAAccAvailV2RS.AccUnit.AccService value) {
            this.accService = value;
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
         */
        public int getStars() {
            return stars;
        }

        /**
         * Sets the value of the stars property.
         * 
         */
        public void setStars(int value) {
            this.stars = value;
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
         *                                                 &lt;element name="RoomInfo" type="{http://aida.dcsplus.net/ws/2010}RoomInfoType"/>
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
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType"/>
         *                                                                             &lt;/sequence>
         *                                                                             &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                                                                             &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                                                                     &lt;element name="Rate" type="{http://aida.dcsplus.net/ws/2010}ServiceRateType"/>
         *                                                                     &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
         *                                                                     &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *                                                 &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
         *                                                 &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *         &lt;element name="Rate" type="{http://aida.dcsplus.net/ws/2010}AccServiceRateType"/>
         *       &lt;/sequence>
         *       &lt;attribute name="LockedDuration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SeniorMinAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
            protected AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests roomRequests;
            @XmlElement(name = "Rate", required = true)
            protected AccServiceRateType rate;
            @XmlAttribute(name = "LockedDuration")
            protected String lockedDuration;
            @XmlAttribute(name = "SeniorMinAge")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger seniorMinAge;

            /**
             * Gets the value of the roomRequests property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests }
             *     
             */
            public AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests getRoomRequests() {
                return roomRequests;
            }

            /**
             * Sets the value of the roomRequests property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests }
             *     
             */
            public void setRoomRequests(AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests value) {
                this.roomRequests = value;
            }

            /**
             * Gets the value of the rate property.
             * 
             * @return
             *     possible object is
             *     {@link AccServiceRateType }
             *     
             */
            public AccServiceRateType getRate() {
                return rate;
            }

            /**
             * Sets the value of the rate property.
             * 
             * @param value
             *     allowed object is
             *     {@link AccServiceRateType }
             *     
             */
            public void setRate(AccServiceRateType value) {
                this.rate = value;
            }

            /**
             * Gets the value of the lockedDuration property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLockedDuration() {
                return lockedDuration;
            }

            /**
             * Sets the value of the lockedDuration property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLockedDuration(String value) {
                this.lockedDuration = value;
            }

            /**
             * Gets the value of the seniorMinAge property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSeniorMinAge() {
                return seniorMinAge;
            }

            /**
             * Sets the value of the seniorMinAge property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSeniorMinAge(BigInteger value) {
                this.seniorMinAge = value;
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
             *                                       &lt;element name="RoomInfo" type="{http://aida.dcsplus.net/ws/2010}RoomInfoType"/>
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
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType"/>
             *                                                                   &lt;/sequence>
             *                                                                   &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                                                                   &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *                                                           &lt;element name="Rate" type="{http://aida.dcsplus.net/ws/2010}ServiceRateType"/>
             *                                                           &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
             *                                                           &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
             *                                       &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
             *                                       &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                protected List<AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest> roomRequest;

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
                 * {@link AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest }
                 * 
                 * 
                 */
                public List<AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest> getRoomRequest() {
                    if (roomRequest == null) {
                        roomRequest = new ArrayList<AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest>();
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
                 *                             &lt;element name="RoomInfo" type="{http://aida.dcsplus.net/ws/2010}RoomInfoType"/>
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
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType"/>
                 *                                                         &lt;/sequence>
                 *                                                         &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *                                                         &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                 *                                                 &lt;element name="Rate" type="{http://aida.dcsplus.net/ws/2010}ServiceRateType"/>
                 *                                                 &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
                 *                                                 &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                 *                             &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
                 *                             &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "rooms"
                })
                public static class RoomRequest {

                    @XmlElement(name = "Rooms", required = true)
                    protected AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms rooms;
                    @XmlAttribute(name = "IndexNumber", required = true)
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger indexNumber;

                    /**
                     * Gets the value of the rooms property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms }
                     *     
                     */
                    public AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms getRooms() {
                        return rooms;
                    }

                    /**
                     * Sets the value of the rooms property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms }
                     *     
                     */
                    public void setRooms(AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms value) {
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
                     *                   &lt;element name="RoomInfo" type="{http://aida.dcsplus.net/ws/2010}RoomInfoType"/>
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
                     *                                                 &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType"/>
                     *                                               &lt;/sequence>
                     *                                               &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                     *                                               &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                     *                                       &lt;element name="Rate" type="{http://aida.dcsplus.net/ws/2010}ServiceRateType"/>
                     *                                       &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
                     *                                       &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                     *                   &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
                     *                   &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        protected List<AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room> room;

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
                         * {@link AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room }
                         * 
                         * 
                         */
                        public List<AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room> getRoom() {
                            if (room == null) {
                                room = new ArrayList<AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room>();
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
                         *         &lt;element name="RoomInfo" type="{http://aida.dcsplus.net/ws/2010}RoomInfoType"/>
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
                         *                                       &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType"/>
                         *                                     &lt;/sequence>
                         *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                         *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                         *                             &lt;element name="Rate" type="{http://aida.dcsplus.net/ws/2010}ServiceRateType"/>
                         *                             &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
                         *                             &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                         *         &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
                         *         &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                            "roomInfo",
                            "extraServices",
                            "cancelPenalties",
                            "cancelPenaltiesInfo"
                        })
                        public static class Room {

                            @XmlElement(name = "RoomInfo", required = true)
                            protected RoomInfoType roomInfo;
                            @XmlElement(name = "ExtraServices")
                            protected AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices extraServices;
                            @XmlElement(name = "CancelPenalties")
                            protected CancelPenaltiesType cancelPenalties;
                            @XmlElement(name = "CancelPenaltiesInfo")
                            protected String cancelPenaltiesInfo;
                            @XmlAttribute(name = "ID", required = true)
                            protected String id;

                            /**
                             * Gets the value of the roomInfo property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link RoomInfoType }
                             *     
                             */
                            public RoomInfoType getRoomInfo() {
                                return roomInfo;
                            }

                            /**
                             * Sets the value of the roomInfo property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link RoomInfoType }
                             *     
                             */
                            public void setRoomInfo(RoomInfoType value) {
                                this.roomInfo = value;
                            }

                            /**
                             * Gets the value of the extraServices property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices }
                             *     
                             */
                            public AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices getExtraServices() {
                                return extraServices;
                            }

                            /**
                             * Sets the value of the extraServices property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices }
                             *     
                             */
                            public void setExtraServices(AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices value) {
                                this.extraServices = value;
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
                             *                           &lt;sequence>
                             *                             &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType"/>
                             *                           &lt;/sequence>
                             *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                             *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                             *                   &lt;element name="Rate" type="{http://aida.dcsplus.net/ws/2010}ServiceRateType"/>
                             *                   &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
                             *                   &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                                protected List<AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService> extraService;

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
                                 * {@link AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService }
                                 * 
                                 * 
                                 */
                                public List<AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService> getExtraService() {
                                    if (extraService == null) {
                                        extraService = new ArrayList<AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService>();
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
                                 *                 &lt;/sequence>
                                 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                                 *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                                 *         &lt;element name="Rate" type="{http://aida.dcsplus.net/ws/2010}ServiceRateType"/>
                                 *         &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
                                 *         &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                                    "rate",
                                    "cancelPenalties",
                                    "cancelPenaltiesInfo"
                                })
                                public static class ExtraService {

                                    @XmlElement(name = "Service", required = true)
                                    protected AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.Service service;
                                    @XmlElement(name = "ServiceDates", required = true)
                                    protected AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.ServiceDates serviceDates;
                                    @XmlElement(name = "GuestsCount", required = true)
                                    protected GuestsCountType guestsCount;
                                    @XmlElement(name = "Rate", required = true)
                                    protected ServiceRateType rate;
                                    @XmlElement(name = "CancelPenalties")
                                    protected CancelPenaltiesType cancelPenalties;
                                    @XmlElement(name = "CancelPenaltiesInfo")
                                    protected String cancelPenaltiesInfo;

                                    /**
                                     * Gets the value of the service property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.Service }
                                     *     
                                     */
                                    public AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.Service getService() {
                                        return service;
                                    }

                                    /**
                                     * Sets the value of the service property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.Service }
                                     *     
                                     */
                                    public void setService(AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.Service value) {
                                        this.service = value;
                                    }

                                    /**
                                     * Gets the value of the serviceDates property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.ServiceDates }
                                     *     
                                     */
                                    public AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.ServiceDates getServiceDates() {
                                        return serviceDates;
                                    }

                                    /**
                                     * Sets the value of the serviceDates property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.ServiceDates }
                                     *     
                                     */
                                    public void setServiceDates(AIDAAccAvailV2RS.AccUnit.AccService.RoomRequests.RoomRequest.Rooms.Room.ExtraServices.ExtraService.ServiceDates value) {
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
                                     *     {@link ServiceRateType }
                                     *     
                                     */
                                    public ServiceRateType getRate() {
                                        return rate;
                                    }

                                    /**
                                     * Sets the value of the rate property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link ServiceRateType }
                                     *     
                                     */
                                    public void setRate(ServiceRateType value) {
                                        this.rate = value;
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
                                     *       &lt;/sequence>
                                     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                                        "type"
                                    })
                                    public static class Service {

                                        @XmlElement(name = "Type", required = true)
                                        protected ServiceType type;
                                        @XmlAttribute(name = "ID", required = true)
                                        @XmlSchemaType(name = "positiveInteger")
                                        protected BigInteger id;
                                        @XmlAttribute(name = "Name", required = true)
                                        protected String name;

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
         *         &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
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

            @XmlElement(name = "ShortDescription", required = true)
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
