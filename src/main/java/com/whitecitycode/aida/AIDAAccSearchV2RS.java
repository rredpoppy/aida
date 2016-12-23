
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
 *         &lt;group ref="{http://aida.dcsplus.net/ws/2010}AccSearchResultsGroupV2"/>
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
@XmlRootElement(name = "AIDA_AccSearchV2RS")
public class AIDAAccSearchV2RS {

    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "Success")
    protected AIDAAccSearchV2RS.Success success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "AccUnits")
    protected AIDAAccSearchV2RS.AccUnits accUnits;
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
     *     {@link AIDAAccSearchV2RS.Success }
     *     
     */
    public AIDAAccSearchV2RS.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccSearchV2RS.Success }
     *     
     */
    public void setSuccess(AIDAAccSearchV2RS.Success value) {
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
     *     {@link AIDAAccSearchV2RS.AccUnits }
     *     
     */
    public AIDAAccSearchV2RS.AccUnits getAccUnits() {
        return accUnits;
    }

    /**
     * Sets the value of the accUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccSearchV2RS.AccUnits }
     *     
     */
    public void setAccUnits(AIDAAccSearchV2RS.AccUnits value) {
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
     *                   &lt;element name="AccServices">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AccService" maxOccurs="unbounded">
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
     *                                       &lt;element name="Rates">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Rate" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="Type" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                   &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="AccRateType" type="{http://aida.dcsplus.net/ws/2010}AccRateTypeType" minOccurs="0"/>
     *                                                           &lt;element name="SpecialOffers" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="SpecialOffer" type="{http://aida.dcsplus.net/ws/2010}ServiceSpecialOfferType" maxOccurs="unbounded"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="RoomRequests">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="RoomRequest" maxOccurs="unbounded">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="Rooms">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="Room" type="{http://aida.dcsplus.net/ws/2010}RoomResultType" maxOccurs="unbounded"/>
     *                                                                                       &lt;/sequence>
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                             &lt;/sequence>
     *                                                                             &lt;attribute name="IndexNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
     *                                                         &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                                                         &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="RoomsInfo">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Room" type="{http://aida.dcsplus.net/ws/2010}RoomInfoWithIdType" maxOccurs="unbounded"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="ExtraServices" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ExtraService" type="{http://aida.dcsplus.net/ws/2010}ExtraServiceSearchResultType" maxOccurs="unbounded"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="SeniorMinAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
        protected List<AIDAAccSearchV2RS.AccUnits.AccUnit> accUnit;

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
         * {@link AIDAAccSearchV2RS.AccUnits.AccUnit }
         * 
         * 
         */
        public List<AIDAAccSearchV2RS.AccUnits.AccUnit> getAccUnit() {
            if (accUnit == null) {
                accUnit = new ArrayList<AIDAAccSearchV2RS.AccUnits.AccUnit>();
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
         *         &lt;element name="AccServices">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AccService" maxOccurs="unbounded">
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
         *                             &lt;element name="Rates">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Rate" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="Type" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                         &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="AccRateType" type="{http://aida.dcsplus.net/ws/2010}AccRateTypeType" minOccurs="0"/>
         *                                                 &lt;element name="SpecialOffers" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="SpecialOffer" type="{http://aida.dcsplus.net/ws/2010}ServiceSpecialOfferType" maxOccurs="unbounded"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="RoomRequests">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="RoomRequest" maxOccurs="unbounded">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="Rooms">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="Room" type="{http://aida.dcsplus.net/ws/2010}RoomResultType" maxOccurs="unbounded"/>
         *                                                                             &lt;/sequence>
         *                                                                           &lt;/restriction>
         *                                                                         &lt;/complexContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                   &lt;/sequence>
         *                                                                   &lt;attribute name="IndexNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
         *                                               &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                                               &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="RoomsInfo">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Room" type="{http://aida.dcsplus.net/ws/2010}RoomInfoWithIdType" maxOccurs="unbounded"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="ExtraServices" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ExtraService" type="{http://aida.dcsplus.net/ws/2010}ExtraServiceSearchResultType" maxOccurs="unbounded"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="SeniorMinAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
            "accServices"
        })
        public static class AccUnit {

            @XmlElement(name = "Type", required = true)
            protected ServiceType type;
            @XmlElement(name = "Descriptions")
            protected AIDAAccSearchV2RS.AccUnits.AccUnit.Descriptions descriptions;
            @XmlElement(name = "Destination", required = true)
            protected LocalizationType destination;
            @XmlElement(name = "AccServices", required = true)
            protected AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices accServices;
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
             *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.Descriptions }
             *     
             */
            public AIDAAccSearchV2RS.AccUnits.AccUnit.Descriptions getDescriptions() {
                return descriptions;
            }

            /**
             * Sets the value of the descriptions property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.Descriptions }
             *     
             */
            public void setDescriptions(AIDAAccSearchV2RS.AccUnits.AccUnit.Descriptions value) {
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
             * Gets the value of the accServices property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices }
             *     
             */
            public AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices getAccServices() {
                return accServices;
            }

            /**
             * Sets the value of the accServices property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices }
             *     
             */
            public void setAccServices(AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices value) {
                this.accServices = value;
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
             *         &lt;element name="AccService" maxOccurs="unbounded">
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
             *                                       &lt;element name="Type" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                               &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="AccRateType" type="{http://aida.dcsplus.net/ws/2010}AccRateTypeType" minOccurs="0"/>
             *                                       &lt;element name="SpecialOffers" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="SpecialOffer" type="{http://aida.dcsplus.net/ws/2010}ServiceSpecialOfferType" maxOccurs="unbounded"/>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="RoomRequests">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="RoomRequest" maxOccurs="unbounded">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="Rooms">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="Room" type="{http://aida.dcsplus.net/ws/2010}RoomResultType" maxOccurs="unbounded"/>
             *                                                                   &lt;/sequence>
             *                                                                 &lt;/restriction>
             *                                                               &lt;/complexContent>
             *                                                             &lt;/complexType>
             *                                                           &lt;/element>
             *                                                         &lt;/sequence>
             *                                                         &lt;attribute name="IndexNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
             *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="RoomsInfo">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Room" type="{http://aida.dcsplus.net/ws/2010}RoomInfoWithIdType" maxOccurs="unbounded"/>
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
             *                             &lt;element name="ExtraService" type="{http://aida.dcsplus.net/ws/2010}ExtraServiceSearchResultType" maxOccurs="unbounded"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="SeniorMinAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                "accService"
            })
            public static class AccServices {

                @XmlElement(name = "AccService", required = true)
                protected List<AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService> accService;

                /**
                 * Gets the value of the accService property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the accService property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAccService().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService }
                 * 
                 * 
                 */
                public List<AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService> getAccService() {
                    if (accService == null) {
                        accService = new ArrayList<AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService>();
                    }
                    return this.accService;
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
                 *                             &lt;element name="Type" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="AccRateType" type="{http://aida.dcsplus.net/ws/2010}AccRateTypeType" minOccurs="0"/>
                 *                             &lt;element name="SpecialOffers" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="SpecialOffer" type="{http://aida.dcsplus.net/ws/2010}ServiceSpecialOfferType" maxOccurs="unbounded"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="RoomRequests">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="RoomRequest" maxOccurs="unbounded">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="Rooms">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="Room" type="{http://aida.dcsplus.net/ws/2010}RoomResultType" maxOccurs="unbounded"/>
                 *                                                         &lt;/sequence>
                 *                                                       &lt;/restriction>
                 *                                                     &lt;/complexContent>
                 *                                                   &lt;/complexType>
                 *                                                 &lt;/element>
                 *                                               &lt;/sequence>
                 *                                               &lt;attribute name="IndexNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                 *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="RoomsInfo">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Room" type="{http://aida.dcsplus.net/ws/2010}RoomInfoWithIdType" maxOccurs="unbounded"/>
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
                 *                   &lt;element name="ExtraService" type="{http://aida.dcsplus.net/ws/2010}ExtraServiceSearchResultType" maxOccurs="unbounded"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "supplier",
                    "rates",
                    "roomsInfo",
                    "extraServices"
                })
                public static class AccService {

                    @XmlElement(name = "Supplier")
                    protected AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Supplier supplier;
                    @XmlElement(name = "Rates", required = true)
                    protected AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates rates;
                    @XmlElement(name = "RoomsInfo", required = true)
                    protected AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.RoomsInfo roomsInfo;
                    @XmlElement(name = "ExtraServices")
                    protected AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.ExtraServices extraServices;
                    @XmlAttribute(name = "ID", required = true)
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger id;
                    @XmlAttribute(name = "Name", required = true)
                    protected String name;
                    @XmlAttribute(name = "SeniorMinAge")
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger seniorMinAge;

                    /**
                     * Gets the value of the supplier property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Supplier }
                     *     
                     */
                    public AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Supplier getSupplier() {
                        return supplier;
                    }

                    /**
                     * Sets the value of the supplier property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Supplier }
                     *     
                     */
                    public void setSupplier(AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Supplier value) {
                        this.supplier = value;
                    }

                    /**
                     * Gets the value of the rates property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates }
                     *     
                     */
                    public AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates getRates() {
                        return rates;
                    }

                    /**
                     * Sets the value of the rates property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates }
                     *     
                     */
                    public void setRates(AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates value) {
                        this.rates = value;
                    }

                    /**
                     * Gets the value of the roomsInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.RoomsInfo }
                     *     
                     */
                    public AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.RoomsInfo getRoomsInfo() {
                        return roomsInfo;
                    }

                    /**
                     * Sets the value of the roomsInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.RoomsInfo }
                     *     
                     */
                    public void setRoomsInfo(AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.RoomsInfo value) {
                        this.roomsInfo = value;
                    }

                    /**
                     * Gets the value of the extraServices property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.ExtraServices }
                     *     
                     */
                    public AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.ExtraServices getExtraServices() {
                        return extraServices;
                    }

                    /**
                     * Sets the value of the extraServices property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.ExtraServices }
                     *     
                     */
                    public void setExtraServices(AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.ExtraServices value) {
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
                     *         &lt;element name="ExtraService" type="{http://aida.dcsplus.net/ws/2010}ExtraServiceSearchResultType" maxOccurs="unbounded"/>
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
                        protected List<ExtraServiceSearchResultType> extraService;

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
                         * {@link ExtraServiceSearchResultType }
                         * 
                         * 
                         */
                        public List<ExtraServiceSearchResultType> getExtraService() {
                            if (extraService == null) {
                                extraService = new ArrayList<ExtraServiceSearchResultType>();
                            }
                            return this.extraService;
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
                     *                   &lt;element name="Type" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="AccRateType" type="{http://aida.dcsplus.net/ws/2010}AccRateTypeType" minOccurs="0"/>
                     *                   &lt;element name="SpecialOffers" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="SpecialOffer" type="{http://aida.dcsplus.net/ws/2010}ServiceSpecialOfferType" maxOccurs="unbounded"/>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
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
                     *                                                 &lt;element name="Room" type="{http://aida.dcsplus.net/ws/2010}RoomResultType" maxOccurs="unbounded"/>
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
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        protected List<AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate> rate;

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
                         * {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate }
                         * 
                         * 
                         */
                        public List<AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate> getRate() {
                            if (rate == null) {
                                rate = new ArrayList<AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate>();
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
                         *         &lt;element name="Type" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="AccRateType" type="{http://aida.dcsplus.net/ws/2010}AccRateTypeType" minOccurs="0"/>
                         *         &lt;element name="SpecialOffers" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="SpecialOffer" type="{http://aida.dcsplus.net/ws/2010}ServiceSpecialOfferType" maxOccurs="unbounded"/>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
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
                         *                                       &lt;element name="Room" type="{http://aida.dcsplus.net/ws/2010}RoomResultType" maxOccurs="unbounded"/>
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
                         *       &lt;/sequence>
                         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
                         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                            "type",
                            "accRateType",
                            "specialOffers",
                            "roomRequests"
                        })
                        public static class Rate {

                            @XmlElement(name = "Description")
                            protected String description;
                            @XmlElement(name = "Type")
                            protected AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.Type type;
                            @XmlElement(name = "AccRateType")
                            protected AccRateTypeType accRateType;
                            @XmlElement(name = "SpecialOffers")
                            protected AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.SpecialOffers specialOffers;
                            @XmlElement(name = "RoomRequests", required = true)
                            protected AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.RoomRequests roomRequests;
                            @XmlAttribute(name = "ID", required = true)
                            @XmlSchemaType(name = "nonNegativeInteger")
                            protected BigInteger id;
                            @XmlAttribute(name = "Name")
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
                             * Gets the value of the type property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.Type }
                             *     
                             */
                            public AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.Type getType() {
                                return type;
                            }

                            /**
                             * Sets the value of the type property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.Type }
                             *     
                             */
                            public void setType(AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.Type value) {
                                this.type = value;
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
                             * Gets the value of the specialOffers property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.SpecialOffers }
                             *     
                             */
                            public AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.SpecialOffers getSpecialOffers() {
                                return specialOffers;
                            }

                            /**
                             * Sets the value of the specialOffers property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.SpecialOffers }
                             *     
                             */
                            public void setSpecialOffers(AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.SpecialOffers value) {
                                this.specialOffers = value;
                            }

                            /**
                             * Gets the value of the roomRequests property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.RoomRequests }
                             *     
                             */
                            public AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.RoomRequests getRoomRequests() {
                                return roomRequests;
                            }

                            /**
                             * Sets the value of the roomRequests property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.RoomRequests }
                             *     
                             */
                            public void setRoomRequests(AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.RoomRequests value) {
                                this.roomRequests = value;
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
                             *                             &lt;element name="Room" type="{http://aida.dcsplus.net/ws/2010}RoomResultType" maxOccurs="unbounded"/>
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
                                protected List<AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.RoomRequests.RoomRequest> roomRequest;

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
                                 * {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.RoomRequests.RoomRequest }
                                 * 
                                 * 
                                 */
                                public List<AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.RoomRequests.RoomRequest> getRoomRequest() {
                                    if (roomRequest == null) {
                                        roomRequest = new ArrayList<AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.RoomRequests.RoomRequest>();
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
                                 *                   &lt;element name="Room" type="{http://aida.dcsplus.net/ws/2010}RoomResultType" maxOccurs="unbounded"/>
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
                                    protected AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.RoomRequests.RoomRequest.Rooms rooms;
                                    @XmlAttribute(name = "IndexNumber", required = true)
                                    @XmlSchemaType(name = "positiveInteger")
                                    protected BigInteger indexNumber;

                                    /**
                                     * Gets the value of the rooms property.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.RoomRequests.RoomRequest.Rooms }
                                     *     
                                     */
                                    public AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.RoomRequests.RoomRequest.Rooms getRooms() {
                                        return rooms;
                                    }

                                    /**
                                     * Sets the value of the rooms property.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.RoomRequests.RoomRequest.Rooms }
                                     *     
                                     */
                                    public void setRooms(AIDAAccSearchV2RS.AccUnits.AccUnit.AccServices.AccService.Rates.Rate.RoomRequests.RoomRequest.Rooms value) {
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
                                     *         &lt;element name="Room" type="{http://aida.dcsplus.net/ws/2010}RoomResultType" maxOccurs="unbounded"/>
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
                                        protected List<RoomResultType> room;

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
                                         * {@link RoomResultType }
                                         * 
                                         * 
                                         */
                                        public List<RoomResultType> getRoom() {
                                            if (room == null) {
                                                room = new ArrayList<RoomResultType>();
                                            }
                                            return this.room;
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
                             *         &lt;element name="SpecialOffer" type="{http://aida.dcsplus.net/ws/2010}ServiceSpecialOfferType" maxOccurs="unbounded"/>
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
                                "specialOffer"
                            })
                            public static class SpecialOffers {

                                @XmlElement(name = "SpecialOffer", required = true)
                                protected List<ServiceSpecialOfferType> specialOffer;

                                /**
                                 * Gets the value of the specialOffer property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the specialOffer property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getSpecialOffer().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link ServiceSpecialOfferType }
                                 * 
                                 * 
                                 */
                                public List<ServiceSpecialOfferType> getSpecialOffer() {
                                    if (specialOffer == null) {
                                        specialOffer = new ArrayList<ServiceSpecialOfferType>();
                                    }
                                    return this.specialOffer;
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
                             *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *       &lt;/sequence>
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
                            public static class Type {

                                @XmlElement(name = "Description")
                                protected String description;
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
                     *         &lt;element name="Room" type="{http://aida.dcsplus.net/ws/2010}RoomInfoWithIdType" maxOccurs="unbounded"/>
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
                    public static class RoomsInfo {

                        @XmlElement(name = "Room", required = true)
                        protected List<RoomInfoWithIdType> room;

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
                         * {@link RoomInfoWithIdType }
                         * 
                         * 
                         */
                        public List<RoomInfoWithIdType> getRoom() {
                            if (room == null) {
                                room = new ArrayList<RoomInfoWithIdType>();
                            }
                            return this.room;
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
