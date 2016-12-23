
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
 *         &lt;group ref="{http://aida.dcsplus.net/ws/2010}AccSearchResultsGroup"/>
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
    "accUnits"
})
@XmlRootElement(name = "AIDA_AccSearchRS")
public class AIDAAccSearchRS {

    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "Success")
    protected AIDAAccSearchRS.Success success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "AccUnits")
    protected AIDAAccSearchRS.AccUnits accUnits;
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
     *     {@link AIDAAccSearchRS.Success }
     *     
     */
    public AIDAAccSearchRS.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccSearchRS.Success }
     *     
     */
    public void setSuccess(AIDAAccSearchRS.Success value) {
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
     * Gets the value of the accUnits property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAAccSearchRS.AccUnits }
     *     
     */
    public AIDAAccSearchRS.AccUnits getAccUnits() {
        return accUnits;
    }

    /**
     * Sets the value of the accUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccSearchRS.AccUnits }
     *     
     */
    public void setAccUnits(AIDAAccSearchRS.AccUnits value) {
        this.accUnits = value;
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
     *         &lt;element name="AccUnit" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType"/>
     *                   &lt;element name="Descriptions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Destination" type="{http://aida.dcsplus.net/ws/2010}LocalizationType"/>
     *                   &lt;element name="RoomStays">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="RoomStay" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Service" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Supplier" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                                         &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Rooms">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Room" maxOccurs="unbounded">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="RoomType" type="{http://aida.dcsplus.net/ws/2010}RoomElementType"/>
     *                                                                     &lt;element name="RoomTypeCategory" type="{http://aida.dcsplus.net/ws/2010}RoomTypeCategoryType"/>
     *                                                                     &lt;element name="Feature" type="{http://aida.dcsplus.net/ws/2010}FeatureElementType"/>
     *                                                                     &lt;element name="Occupancy" type="{http://aida.dcsplus.net/ws/2010}OccupancyElementType"/>
     *                                                                     &lt;element name="Availability">
     *                                                                       &lt;complexType>
     *                                                                         &lt;simpleContent>
     *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                             &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
     *                                                                             &lt;attribute name="MinAvailable" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                                                           &lt;/extension>
     *                                                                         &lt;/simpleContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
     *                                                                     &lt;element name="Rates" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="Rate" maxOccurs="unbounded">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
     *                                                                                         &lt;element name="RateSpo" maxOccurs="unbounded" minOccurs="0">
     *                                                                                           &lt;complexType>
     *                                                                                             &lt;complexContent>
     *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                                 &lt;sequence>
     *                                                                                                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                                                 &lt;/sequence>
     *                                                                                                 &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                                                                                 &lt;attribute name="SupplierPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                                                                                 &lt;attribute name="Commission" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                                                                                 &lt;attribute name="Tax" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                                                                                 &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                                                                                                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                               &lt;/restriction>
     *                                                                                             &lt;/complexContent>
     *                                                                                           &lt;/complexType>
     *                                                                                         &lt;/element>
     *                                                                                         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                                         &lt;element name="RateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                                       &lt;/sequence>
     *                                                                                       &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                                                                       &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                       &lt;attribute name="RateTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                                                                                       &lt;attribute name="RateTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="ExtraServicesRef" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="ExtraServiceRef" maxOccurs="unbounded">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
     *                                                                   &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                                               &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                               &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                   &lt;element name="ExtraServices" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ExtraService" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://aida.dcsplus.net/ws/2010}SecondaryServiceComponentType">
     *                                     &lt;sequence>
     *                                       &lt;element name="MandatoryRates" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="MandatoryRate" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
     *                                     &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/extension>
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
     *                 &lt;attribute name="Stars" use="required" type="{http://aida.dcsplus.net/ws/2010}ServiceStarsType" />
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
        "accUnit"
    })
    public static class AccUnits {

        @XmlElement(name = "AccUnit")
        protected List<AIDAAccSearchRS.AccUnits.AccUnit> accUnit;

        /**
         * Gets the value of the accUnit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accUnit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccUnit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AIDAAccSearchRS.AccUnits.AccUnit }
         * 
         * 
         */
        public List<AIDAAccSearchRS.AccUnits.AccUnit> getAccUnit() {
            if (accUnit == null) {
                accUnit = new ArrayList<AIDAAccSearchRS.AccUnits.AccUnit>();
            }
            return this.accUnit;
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
         *         &lt;element name="RoomStays">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="RoomStay" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Service" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Supplier" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                                               &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
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
         *                                                           &lt;element name="RoomType" type="{http://aida.dcsplus.net/ws/2010}RoomElementType"/>
         *                                                           &lt;element name="RoomTypeCategory" type="{http://aida.dcsplus.net/ws/2010}RoomTypeCategoryType"/>
         *                                                           &lt;element name="Feature" type="{http://aida.dcsplus.net/ws/2010}FeatureElementType"/>
         *                                                           &lt;element name="Occupancy" type="{http://aida.dcsplus.net/ws/2010}OccupancyElementType"/>
         *                                                           &lt;element name="Availability">
         *                                                             &lt;complexType>
         *                                                               &lt;simpleContent>
         *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                   &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
         *                                                                   &lt;attribute name="MinAvailable" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                                                                 &lt;/extension>
         *                                                               &lt;/simpleContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
         *                                                           &lt;element name="Rates" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="Rate" maxOccurs="unbounded">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
         *                                                                               &lt;element name="RateSpo" maxOccurs="unbounded" minOccurs="0">
         *                                                                                 &lt;complexType>
         *                                                                                   &lt;complexContent>
         *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                                       &lt;sequence>
         *                                                                                         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                                                       &lt;/sequence>
         *                                                                                       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                                                                                       &lt;attribute name="SupplierPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                                                                                       &lt;attribute name="Commission" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                                                                                       &lt;attribute name="Tax" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                                                                                       &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *                                                                                       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                                     &lt;/restriction>
         *                                                                                   &lt;/complexContent>
         *                                                                                 &lt;/complexType>
         *                                                                               &lt;/element>
         *                                                                               &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                                               &lt;element name="RateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                                             &lt;/sequence>
         *                                                                             &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                                                                             &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                             &lt;attribute name="RateTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *                                                                             &lt;attribute name="RateTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                           &lt;/restriction>
         *                                                                         &lt;/complexContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="ExtraServicesRef" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="ExtraServiceRef" maxOccurs="unbounded">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
         *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *         &lt;element name="ExtraServices" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ExtraService" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://aida.dcsplus.net/ws/2010}SecondaryServiceComponentType">
         *                           &lt;sequence>
         *                             &lt;element name="MandatoryRates" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="MandatoryRate" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
         *                           &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/extension>
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
            "roomStays",
            "extraServices"
        })
        public static class AccUnit {

            @XmlElement(name = "Type", required = true)
            protected ServiceType type;
            @XmlElement(name = "Descriptions")
            protected AIDAAccSearchRS.AccUnits.AccUnit.Descriptions descriptions;
            @XmlElement(name = "Destination", required = true)
            protected LocalizationType destination;
            @XmlElement(name = "RoomStays", required = true)
            protected AIDAAccSearchRS.AccUnits.AccUnit.RoomStays roomStays;
            @XmlElement(name = "ExtraServices")
            protected AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices extraServices;
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
             *     {@link AIDAAccSearchRS.AccUnits.AccUnit.Descriptions }
             *     
             */
            public AIDAAccSearchRS.AccUnits.AccUnit.Descriptions getDescriptions() {
                return descriptions;
            }

            /**
             * Sets the value of the descriptions property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAAccSearchRS.AccUnits.AccUnit.Descriptions }
             *     
             */
            public void setDescriptions(AIDAAccSearchRS.AccUnits.AccUnit.Descriptions value) {
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
             * Gets the value of the roomStays property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays }
             *     
             */
            public AIDAAccSearchRS.AccUnits.AccUnit.RoomStays getRoomStays() {
                return roomStays;
            }

            /**
             * Sets the value of the roomStays property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays }
             *     
             */
            public void setRoomStays(AIDAAccSearchRS.AccUnits.AccUnit.RoomStays value) {
                this.roomStays = value;
            }

            /**
             * Gets the value of the extraServices property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices }
             *     
             */
            public AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices getExtraServices() {
                return extraServices;
            }

            /**
             * Sets the value of the extraServices property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices }
             *     
             */
            public void setExtraServices(AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices value) {
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
             *         &lt;element name="ExtraService" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://aida.dcsplus.net/ws/2010}SecondaryServiceComponentType">
             *                 &lt;sequence>
             *                   &lt;element name="MandatoryRates" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="MandatoryRate" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
             *                 &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                "extraService"
            })
            public static class ExtraServices {

                @XmlElement(name = "ExtraService", required = true)
                protected List<AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices.ExtraService> extraService;

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
                 * {@link AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices.ExtraService }
                 * 
                 * 
                 */
                public List<AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices.ExtraService> getExtraService() {
                    if (extraService == null) {
                        extraService = new ArrayList<AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices.ExtraService>();
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
                 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}SecondaryServiceComponentType">
                 *       &lt;sequence>
                 *         &lt;element name="MandatoryRates" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="MandatoryRate" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                 *       &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "mandatoryRates"
                })
                public static class ExtraService
                    extends SecondaryServiceComponentType
                {

                    @XmlElement(name = "MandatoryRates")
                    protected AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices.ExtraService.MandatoryRates mandatoryRates;
                    @XmlAttribute(name = "Mandatory", required = true)
                    protected boolean mandatory;

                    /**
                     * Gets the value of the mandatoryRates property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices.ExtraService.MandatoryRates }
                     *     
                     */
                    public AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices.ExtraService.MandatoryRates getMandatoryRates() {
                        return mandatoryRates;
                    }

                    /**
                     * Sets the value of the mandatoryRates property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices.ExtraService.MandatoryRates }
                     *     
                     */
                    public void setMandatoryRates(AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices.ExtraService.MandatoryRates value) {
                        this.mandatoryRates = value;
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
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="MandatoryRate" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                        "mandatoryRate"
                    })
                    public static class MandatoryRates {

                        @XmlElement(name = "MandatoryRate", required = true)
                        protected List<AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices.ExtraService.MandatoryRates.MandatoryRate> mandatoryRate;

                        /**
                         * Gets the value of the mandatoryRate property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the mandatoryRate property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getMandatoryRate().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices.ExtraService.MandatoryRates.MandatoryRate }
                         * 
                         * 
                         */
                        public List<AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices.ExtraService.MandatoryRates.MandatoryRate> getMandatoryRate() {
                            if (mandatoryRate == null) {
                                mandatoryRate = new ArrayList<AIDAAccSearchRS.AccUnits.AccUnit.ExtraServices.ExtraService.MandatoryRates.MandatoryRate>();
                            }
                            return this.mandatoryRate;
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
                         *       &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class MandatoryRate {

                            @XmlAttribute(name = "RateId", required = true)
                            @XmlSchemaType(name = "positiveInteger")
                            protected BigInteger rateId;

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
             *         &lt;element name="RoomStay" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Service" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Supplier" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
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
             *                                                 &lt;element name="RoomType" type="{http://aida.dcsplus.net/ws/2010}RoomElementType"/>
             *                                                 &lt;element name="RoomTypeCategory" type="{http://aida.dcsplus.net/ws/2010}RoomTypeCategoryType"/>
             *                                                 &lt;element name="Feature" type="{http://aida.dcsplus.net/ws/2010}FeatureElementType"/>
             *                                                 &lt;element name="Occupancy" type="{http://aida.dcsplus.net/ws/2010}OccupancyElementType"/>
             *                                                 &lt;element name="Availability">
             *                                                   &lt;complexType>
             *                                                     &lt;simpleContent>
             *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                         &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
             *                                                         &lt;attribute name="MinAvailable" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                                                       &lt;/extension>
             *                                                     &lt;/simpleContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
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
             *                                                                     &lt;element name="RateSpo" maxOccurs="unbounded" minOccurs="0">
             *                                                                       &lt;complexType>
             *                                                                         &lt;complexContent>
             *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                             &lt;sequence>
             *                                                                               &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                                             &lt;/sequence>
             *                                                                             &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                                                                             &lt;attribute name="SupplierPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                                                                             &lt;attribute name="Commission" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                                                                             &lt;attribute name="Tax" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                                                                             &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
             *                                                                             &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                                           &lt;/restriction>
             *                                                                         &lt;/complexContent>
             *                                                                       &lt;/complexType>
             *                                                                     &lt;/element>
             *                                                                     &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                                     &lt;element name="RateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                                   &lt;/sequence>
             *                                                                   &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                                                                   &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                                   &lt;attribute name="RateTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" />
             *                                                                   &lt;attribute name="RateTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                                 &lt;/restriction>
             *                                                               &lt;/complexContent>
             *                                                             &lt;/complexType>
             *                                                           &lt;/element>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="ExtraServicesRef" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="ExtraServiceRef" maxOccurs="unbounded">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
             *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "roomStay"
            })
            public static class RoomStays {

                @XmlElement(name = "RoomStay", required = true)
                protected List<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay> roomStay;

                /**
                 * Gets the value of the roomStay property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the roomStay property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRoomStay().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay }
                 * 
                 * 
                 */
                public List<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay> getRoomStay() {
                    if (roomStay == null) {
                        roomStay = new ArrayList<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay>();
                    }
                    return this.roomStay;
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
                 *         &lt;element name="Service" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Supplier" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
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
                 *                                       &lt;element name="RoomType" type="{http://aida.dcsplus.net/ws/2010}RoomElementType"/>
                 *                                       &lt;element name="RoomTypeCategory" type="{http://aida.dcsplus.net/ws/2010}RoomTypeCategoryType"/>
                 *                                       &lt;element name="Feature" type="{http://aida.dcsplus.net/ws/2010}FeatureElementType"/>
                 *                                       &lt;element name="Occupancy" type="{http://aida.dcsplus.net/ws/2010}OccupancyElementType"/>
                 *                                       &lt;element name="Availability">
                 *                                         &lt;complexType>
                 *                                           &lt;simpleContent>
                 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                               &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
                 *                                               &lt;attribute name="MinAvailable" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *                                             &lt;/extension>
                 *                                           &lt;/simpleContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
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
                 *                                                           &lt;element name="RateSpo" maxOccurs="unbounded" minOccurs="0">
                 *                                                             &lt;complexType>
                 *                                                               &lt;complexContent>
                 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                                   &lt;sequence>
                 *                                                                     &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                                                   &lt;/sequence>
                 *                                                                   &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *                                                                   &lt;attribute name="SupplierPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *                                                                   &lt;attribute name="Commission" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *                                                                   &lt;attribute name="Tax" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *                                                                   &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                 *                                                                   &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                                                 &lt;/restriction>
                 *                                                               &lt;/complexContent>
                 *                                                             &lt;/complexType>
                 *                                                           &lt;/element>
                 *                                                           &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                                           &lt;element name="RateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                                         &lt;/sequence>
                 *                                                         &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *                                                         &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                                         &lt;attribute name="RateTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" />
                 *                                                         &lt;attribute name="RateTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                                       &lt;/restriction>
                 *                                                     &lt;/complexContent>
                 *                                                   &lt;/complexType>
                 *                                                 &lt;/element>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="ExtraServicesRef" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="ExtraServiceRef" maxOccurs="unbounded">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "service"
                })
                public static class RoomStay {

                    @XmlElement(name = "Service", required = true)
                    protected List<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service> service;
                    @XmlAttribute(name = "IndexNumber", required = true)
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger indexNumber;

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
                     * {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service }
                     * 
                     * 
                     */
                    public List<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service> getService() {
                        if (service == null) {
                            service = new ArrayList<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service>();
                        }
                        return this.service;
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
                     *         &lt;element name="Supplier" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
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
                     *                                     &lt;attribute name="MinAvailable" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                     *                                   &lt;/extension>
                     *                                 &lt;/simpleContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                             &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
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
                     *                                                 &lt;element name="RateSpo" maxOccurs="unbounded" minOccurs="0">
                     *                                                   &lt;complexType>
                     *                                                     &lt;complexContent>
                     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                                         &lt;sequence>
                     *                                                           &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                                                         &lt;/sequence>
                     *                                                         &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                     *                                                         &lt;attribute name="SupplierPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                     *                                                         &lt;attribute name="Commission" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                     *                                                         &lt;attribute name="Tax" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                     *                                                         &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                     *                                                         &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                                       &lt;/restriction>
                     *                                                     &lt;/complexContent>
                     *                                                   &lt;/complexType>
                     *                                                 &lt;/element>
                     *                                                 &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                                                 &lt;element name="RateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                                               &lt;/sequence>
                     *                                               &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                     *                                               &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                               &lt;attribute name="RateTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" />
                     *                                               &lt;attribute name="RateTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                             &lt;/restriction>
                     *                                           &lt;/complexContent>
                     *                                         &lt;/complexType>
                     *                                       &lt;/element>
                     *                                     &lt;/sequence>
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                             &lt;element name="ExtraServicesRef" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="ExtraServiceRef" maxOccurs="unbounded">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                        "supplier",
                        "rooms"
                    })
                    public static class Service {

                        @XmlElement(name = "Supplier")
                        protected AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Supplier supplier;
                        @XmlElement(name = "Rooms", required = true)
                        protected AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms rooms;
                        @XmlAttribute(name = "ID", required = true)
                        @XmlSchemaType(name = "positiveInteger")
                        protected BigInteger id;
                        @XmlAttribute(name = "Name", required = true)
                        protected String name;

                        /**
                         * Gets the value of the supplier property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Supplier }
                         *     
                         */
                        public AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Supplier getSupplier() {
                            return supplier;
                        }

                        /**
                         * Sets the value of the supplier property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Supplier }
                         *     
                         */
                        public void setSupplier(AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Supplier value) {
                            this.supplier = value;
                        }

                        /**
                         * Gets the value of the rooms property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms }
                         *     
                         */
                        public AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms getRooms() {
                            return rooms;
                        }

                        /**
                         * Sets the value of the rooms property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms }
                         *     
                         */
                        public void setRooms(AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms value) {
                            this.rooms = value;
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
                         *                           &lt;attribute name="MinAvailable" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                         *                         &lt;/extension>
                         *                       &lt;/simpleContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                   &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
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
                         *                                       &lt;element name="RateSpo" maxOccurs="unbounded" minOccurs="0">
                         *                                         &lt;complexType>
                         *                                           &lt;complexContent>
                         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                               &lt;sequence>
                         *                                                 &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                                               &lt;/sequence>
                         *                                               &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                         *                                               &lt;attribute name="SupplierPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                         *                                               &lt;attribute name="Commission" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                         *                                               &lt;attribute name="Tax" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                         *                                               &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                         *                                               &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                                             &lt;/restriction>
                         *                                           &lt;/complexContent>
                         *                                         &lt;/complexType>
                         *                                       &lt;/element>
                         *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                                       &lt;element name="RateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                                     &lt;/sequence>
                         *                                     &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                         *                                     &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                                     &lt;attribute name="RateTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" />
                         *                                     &lt;attribute name="RateTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                                   &lt;/restriction>
                         *                                 &lt;/complexContent>
                         *                               &lt;/complexType>
                         *                             &lt;/element>
                         *                           &lt;/sequence>
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                   &lt;element name="ExtraServicesRef" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="ExtraServiceRef" maxOccurs="unbounded">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                            "room"
                        })
                        public static class Rooms {

                            @XmlElement(name = "Room", required = true)
                            protected List<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room> room;

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
                             * {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room }
                             * 
                             * 
                             */
                            public List<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room> getRoom() {
                                if (room == null) {
                                    room = new ArrayList<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room>();
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
                             *         &lt;element name="RoomType" type="{http://aida.dcsplus.net/ws/2010}RoomElementType"/>
                             *         &lt;element name="RoomTypeCategory" type="{http://aida.dcsplus.net/ws/2010}RoomTypeCategoryType"/>
                             *         &lt;element name="Feature" type="{http://aida.dcsplus.net/ws/2010}FeatureElementType"/>
                             *         &lt;element name="Occupancy" type="{http://aida.dcsplus.net/ws/2010}OccupancyElementType"/>
                             *         &lt;element name="Availability">
                             *           &lt;complexType>
                             *             &lt;simpleContent>
                             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                 &lt;attribute name="Status" use="required" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
                             *                 &lt;attribute name="MinAvailable" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                             *               &lt;/extension>
                             *             &lt;/simpleContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *         &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
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
                             *                             &lt;element name="RateSpo" maxOccurs="unbounded" minOccurs="0">
                             *                               &lt;complexType>
                             *                                 &lt;complexContent>
                             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                                     &lt;sequence>
                             *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *                                     &lt;/sequence>
                             *                                     &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                             *                                     &lt;attribute name="SupplierPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                             *                                     &lt;attribute name="Commission" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                             *                                     &lt;attribute name="Tax" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                             *                                     &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                             *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                                   &lt;/restriction>
                             *                                 &lt;/complexContent>
                             *                               &lt;/complexType>
                             *                             &lt;/element>
                             *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *                             &lt;element name="RateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *                           &lt;/sequence>
                             *                           &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                             *                           &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                           &lt;attribute name="RateTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" />
                             *                           &lt;attribute name="RateTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                         &lt;/restriction>
                             *                       &lt;/complexContent>
                             *                     &lt;/complexType>
                             *                   &lt;/element>
                             *                 &lt;/sequence>
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *         &lt;element name="ExtraServicesRef" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="ExtraServiceRef" maxOccurs="unbounded">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                                "price",
                                "rates",
                                "extraServicesRef"
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
                                protected AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Availability availability;
                                @XmlElement(name = "Price", required = true)
                                protected PriceType price;
                                @XmlElement(name = "Rates")
                                protected AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Rates rates;
                                @XmlElement(name = "ExtraServicesRef")
                                protected AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.ExtraServicesRef extraServicesRef;
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
                                 *     {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Availability }
                                 *     
                                 */
                                public AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Availability getAvailability() {
                                    return availability;
                                }

                                /**
                                 * Sets the value of the availability property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Availability }
                                 *     
                                 */
                                public void setAvailability(AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Availability value) {
                                    this.availability = value;
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
                                 *     {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Rates }
                                 *     
                                 */
                                public AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Rates getRates() {
                                    return rates;
                                }

                                /**
                                 * Sets the value of the rates property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Rates }
                                 *     
                                 */
                                public void setRates(AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Rates value) {
                                    this.rates = value;
                                }

                                /**
                                 * Gets the value of the extraServicesRef property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.ExtraServicesRef }
                                 *     
                                 */
                                public AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.ExtraServicesRef getExtraServicesRef() {
                                    return extraServicesRef;
                                }

                                /**
                                 * Sets the value of the extraServicesRef property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.ExtraServicesRef }
                                 *     
                                 */
                                public void setExtraServicesRef(AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.ExtraServicesRef value) {
                                    this.extraServicesRef = value;
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
                                 *       &lt;attribute name="MinAvailable" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                                    @XmlAttribute(name = "MinAvailable")
                                    @XmlSchemaType(name = "positiveInteger")
                                    protected BigInteger minAvailable;

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

                                    /**
                                     * Gets the value of the minAvailable property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link BigInteger }
                                     *     
                                     */
                                    public BigInteger getMinAvailable() {
                                        return minAvailable;
                                    }

                                    /**
                                     * Sets the value of the minAvailable property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link BigInteger }
                                     *     
                                     */
                                    public void setMinAvailable(BigInteger value) {
                                        this.minAvailable = value;
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
                                 *         &lt;element name="ExtraServiceRef" maxOccurs="unbounded">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
                                    "extraServiceRef"
                                })
                                public static class ExtraServicesRef {

                                    @XmlElement(name = "ExtraServiceRef", required = true)
                                    protected List<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.ExtraServicesRef.ExtraServiceRef> extraServiceRef;

                                    /**
                                     * Gets the value of the extraServiceRef property.
                                     * 
                                     * <p>
                                     * This accessor method returns a reference to the live list,
                                     * not a snapshot. Therefore any modification you make to the
                                     * returned list will be present inside the JAXB object.
                                     * This is why there is not a <CODE>set</CODE> method for the extraServiceRef property.
                                     * 
                                     * <p>
                                     * For example, to add a new item, do as follows:
                                     * <pre>
                                     *    getExtraServiceRef().add(newItem);
                                     * </pre>
                                     * 
                                     * 
                                     * <p>
                                     * Objects of the following type(s) are allowed in the list
                                     * {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.ExtraServicesRef.ExtraServiceRef }
                                     * 
                                     * 
                                     */
                                    public List<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.ExtraServicesRef.ExtraServiceRef> getExtraServiceRef() {
                                        if (extraServiceRef == null) {
                                            extraServiceRef = new ArrayList<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.ExtraServicesRef.ExtraServiceRef>();
                                        }
                                        return this.extraServiceRef;
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
                                    public static class ExtraServiceRef {

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
                                 *         &lt;element name="Rate" maxOccurs="unbounded">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
                                 *                   &lt;element name="RateSpo" maxOccurs="unbounded" minOccurs="0">
                                 *                     &lt;complexType>
                                 *                       &lt;complexContent>
                                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                           &lt;sequence>
                                 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                 *                           &lt;/sequence>
                                 *                           &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                                 *                           &lt;attribute name="SupplierPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                                 *                           &lt;attribute name="Commission" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                                 *                           &lt;attribute name="Tax" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                                 *                           &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                                 *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *                         &lt;/restriction>
                                 *                       &lt;/complexContent>
                                 *                     &lt;/complexType>
                                 *                   &lt;/element>
                                 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                 *                   &lt;element name="RateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                 *                 &lt;/sequence>
                                 *                 &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                                 *                 &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *                 &lt;attribute name="RateTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" />
                                 *                 &lt;attribute name="RateTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                                    protected List<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Rates.Rate> rate;

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
                                     * {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Rates.Rate }
                                     * 
                                     * 
                                     */
                                    public List<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Rates.Rate> getRate() {
                                        if (rate == null) {
                                            rate = new ArrayList<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Rates.Rate>();
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
                                     *         &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType" minOccurs="0"/>
                                     *         &lt;element name="RateSpo" maxOccurs="unbounded" minOccurs="0">
                                     *           &lt;complexType>
                                     *             &lt;complexContent>
                                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                     *                 &lt;sequence>
                                     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                     *                 &lt;/sequence>
                                     *                 &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                                     *                 &lt;attribute name="SupplierPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                                     *                 &lt;attribute name="Commission" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                                     *                 &lt;attribute name="Tax" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                                     *                 &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                                     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                                     *               &lt;/restriction>
                                     *             &lt;/complexContent>
                                     *           &lt;/complexType>
                                     *         &lt;/element>
                                     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                     *         &lt;element name="RateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                     *       &lt;/sequence>
                                     *       &lt;attribute name="RateId" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                                     *       &lt;attribute name="RateName" type="{http://www.w3.org/2001/XMLSchema}string" />
                                     *       &lt;attribute name="RateTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" />
                                     *       &lt;attribute name="RateTypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
                                     *     &lt;/restriction>
                                     *   &lt;/complexContent>
                                     * &lt;/complexType>
                                     * </pre>
                                     * 
                                     * 
                                     */
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "price",
                                        "rateSpo",
                                        "description",
                                        "rateDescription"
                                    })
                                    public static class Rate {

                                        @XmlElement(name = "Price")
                                        protected PriceType price;
                                        @XmlElement(name = "RateSpo")
                                        protected List<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Rates.Rate.RateSpo> rateSpo;
                                        @XmlElement(name = "Description")
                                        protected String description;
                                        @XmlElement(name = "RateDescription")
                                        protected String rateDescription;
                                        @XmlAttribute(name = "RateId", required = true)
                                        protected BigInteger rateId;
                                        @XmlAttribute(name = "RateName")
                                        protected String rateName;
                                        @XmlAttribute(name = "RateTypeId")
                                        protected BigInteger rateTypeId;
                                        @XmlAttribute(name = "RateTypeName")
                                        protected String rateTypeName;

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
                                         * Gets the value of the rateSpo property.
                                         * 
                                         * <p>
                                         * This accessor method returns a reference to the live list,
                                         * not a snapshot. Therefore any modification you make to the
                                         * returned list will be present inside the JAXB object.
                                         * This is why there is not a <CODE>set</CODE> method for the rateSpo property.
                                         * 
                                         * <p>
                                         * For example, to add a new item, do as follows:
                                         * <pre>
                                         *    getRateSpo().add(newItem);
                                         * </pre>
                                         * 
                                         * 
                                         * <p>
                                         * Objects of the following type(s) are allowed in the list
                                         * {@link AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Rates.Rate.RateSpo }
                                         * 
                                         * 
                                         */
                                        public List<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Rates.Rate.RateSpo> getRateSpo() {
                                            if (rateSpo == null) {
                                                rateSpo = new ArrayList<AIDAAccSearchRS.AccUnits.AccUnit.RoomStays.RoomStay.Service.Rooms.Room.Rates.Rate.RateSpo>();
                                            }
                                            return this.rateSpo;
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
                                         * Gets the value of the rateDescription property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getRateDescription() {
                                            return rateDescription;
                                        }

                                        /**
                                         * Sets the value of the rateDescription property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setRateDescription(String value) {
                                            this.rateDescription = value;
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

                                        /**
                                         * Gets the value of the rateTypeId property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link BigInteger }
                                         *     
                                         */
                                        public BigInteger getRateTypeId() {
                                            return rateTypeId;
                                        }

                                        /**
                                         * Sets the value of the rateTypeId property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link BigInteger }
                                         *     
                                         */
                                        public void setRateTypeId(BigInteger value) {
                                            this.rateTypeId = value;
                                        }

                                        /**
                                         * Gets the value of the rateTypeName property.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getRateTypeName() {
                                            return rateTypeName;
                                        }

                                        /**
                                         * Sets the value of the rateTypeName property.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setRateTypeName(String value) {
                                            this.rateTypeName = value;
                                        }


                                        /**
                                         * Includes price information about the rate special offer
                                         * 
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
                                         *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
                                         *       &lt;attribute name="SupplierPrice" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                                         *       &lt;attribute name="Commission" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                                         *       &lt;attribute name="Tax" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
                                         *       &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
                                        public static class RateSpo {

                                            @XmlElement(name = "Description")
                                            protected String description;
                                            @XmlAttribute(name = "Id", required = true)
                                            protected BigInteger id;
                                            @XmlAttribute(name = "SupplierPrice", required = true)
                                            protected BigDecimal supplierPrice;
                                            @XmlAttribute(name = "Commission", required = true)
                                            protected BigDecimal commission;
                                            @XmlAttribute(name = "Tax", required = true)
                                            protected BigDecimal tax;
                                            @XmlAttribute(name = "Total", required = true)
                                            protected BigDecimal total;
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
                                            public BigInteger getId() {
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
                                            public void setId(BigInteger value) {
                                                this.id = value;
                                            }

                                            /**
                                             * Gets the value of the supplierPrice property.
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link BigDecimal }
                                             *     
                                             */
                                            public BigDecimal getSupplierPrice() {
                                                return supplierPrice;
                                            }

                                            /**
                                             * Sets the value of the supplierPrice property.
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link BigDecimal }
                                             *     
                                             */
                                            public void setSupplierPrice(BigDecimal value) {
                                                this.supplierPrice = value;
                                            }

                                            /**
                                             * Gets the value of the commission property.
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link BigDecimal }
                                             *     
                                             */
                                            public BigDecimal getCommission() {
                                                return commission;
                                            }

                                            /**
                                             * Sets the value of the commission property.
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link BigDecimal }
                                             *     
                                             */
                                            public void setCommission(BigDecimal value) {
                                                this.commission = value;
                                            }

                                            /**
                                             * Gets the value of the tax property.
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link BigDecimal }
                                             *     
                                             */
                                            public BigDecimal getTax() {
                                                return tax;
                                            }

                                            /**
                                             * Sets the value of the tax property.
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link BigDecimal }
                                             *     
                                             */
                                            public void setTax(BigDecimal value) {
                                                this.tax = value;
                                            }

                                            /**
                                             * Gets the value of the total property.
                                             * 
                                             * @return
                                             *     possible object is
                                             *     {@link BigDecimal }
                                             *     
                                             */
                                            public BigDecimal getTotal() {
                                                return total;
                                            }

                                            /**
                                             * Sets the value of the total property.
                                             * 
                                             * @param value
                                             *     allowed object is
                                             *     {@link BigDecimal }
                                             *     
                                             */
                                            public void setTotal(BigDecimal value) {
                                                this.total = value;
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
                         *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Supplier {

                            @XmlAttribute(name = "ID", required = true)
                            @XmlSchemaType(name = "positiveInteger")
                            protected BigInteger id;
                            @XmlAttribute(name = "Name", required = true)
                            protected String name;

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
