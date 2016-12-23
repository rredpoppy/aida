
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
 *       &lt;sequence>
 *         &lt;element name="AdditionalResellerInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="OutsiderUsername" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OutsiderCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SearchCriteria">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccUnit">
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
 *                                       &lt;element name="Customers" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Customer" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="CustomerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                                         &lt;attribute name="AgeSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="RoomIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *                                                           &lt;element name="GuestsCount">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="GuestCount" maxOccurs="unbounded">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
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
 *                                                           &lt;element name="Customers">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Customer" maxOccurs="unbounded">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="CustomerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
 *                                                         &lt;attribute name="DateStart" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                                         &lt;attribute name="DateEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                                         &lt;attribute name="RateId" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
 *                                     &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RateId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="SpoId" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Customers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Customer" type="{http://aida.dcsplus.net/ws/2010}CustomerElementType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BackOfficeRemarks" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BackOfficeRemark" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "additionalResellerInfo",
    "searchCriteria",
    "accUnit",
    "customers",
    "nationality",
    "globalInfo"
})
@XmlRootElement(name = "AIDA_AccBookRQ")
public class AIDAAccBookRQ {

    @XmlElement(name = "AdditionalResellerInfo")
    protected AIDAAccBookRQ.AdditionalResellerInfo additionalResellerInfo;
    @XmlElement(name = "SearchCriteria", required = true)
    protected AIDAAccBookRQ.SearchCriteria searchCriteria;
    @XmlElement(name = "AccUnit", required = true)
    protected AIDAAccBookRQ.AccUnit accUnit;
    @XmlElement(name = "Customers", required = true)
    protected AIDAAccBookRQ.Customers customers;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "GlobalInfo")
    protected AIDAAccBookRQ.GlobalInfo globalInfo;

    /**
     * Gets the value of the additionalResellerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAAccBookRQ.AdditionalResellerInfo }
     *     
     */
    public AIDAAccBookRQ.AdditionalResellerInfo getAdditionalResellerInfo() {
        return additionalResellerInfo;
    }

    /**
     * Sets the value of the additionalResellerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccBookRQ.AdditionalResellerInfo }
     *     
     */
    public void setAdditionalResellerInfo(AIDAAccBookRQ.AdditionalResellerInfo value) {
        this.additionalResellerInfo = value;
    }

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAAccBookRQ.SearchCriteria }
     *     
     */
    public AIDAAccBookRQ.SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccBookRQ.SearchCriteria }
     *     
     */
    public void setSearchCriteria(AIDAAccBookRQ.SearchCriteria value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the accUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAAccBookRQ.AccUnit }
     *     
     */
    public AIDAAccBookRQ.AccUnit getAccUnit() {
        return accUnit;
    }

    /**
     * Sets the value of the accUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccBookRQ.AccUnit }
     *     
     */
    public void setAccUnit(AIDAAccBookRQ.AccUnit value) {
        this.accUnit = value;
    }

    /**
     * Gets the value of the customers property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAAccBookRQ.Customers }
     *     
     */
    public AIDAAccBookRQ.Customers getCustomers() {
        return customers;
    }

    /**
     * Sets the value of the customers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccBookRQ.Customers }
     *     
     */
    public void setCustomers(AIDAAccBookRQ.Customers value) {
        this.customers = value;
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
     * Gets the value of the globalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAAccBookRQ.GlobalInfo }
     *     
     */
    public AIDAAccBookRQ.GlobalInfo getGlobalInfo() {
        return globalInfo;
    }

    /**
     * Sets the value of the globalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccBookRQ.GlobalInfo }
     *     
     */
    public void setGlobalInfo(AIDAAccBookRQ.GlobalInfo value) {
        this.globalInfo = value;
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
     *                             &lt;element name="Customers" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Customer" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="CustomerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                               &lt;attribute name="AgeSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="RoomIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
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
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Customers">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Customer" maxOccurs="unbounded">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="CustomerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
     *                                               &lt;attribute name="DateStart" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                                               &lt;attribute name="DateEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                                               &lt;attribute name="RateId" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
     *                           &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *       &lt;/sequence>
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
    public static class AccUnit {

        @XmlElement(name = "Rooms", required = true)
        protected AIDAAccBookRQ.AccUnit.Rooms rooms;
        @XmlAttribute(name = "ID")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;

        /**
         * Gets the value of the rooms property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccBookRQ.AccUnit.Rooms }
         *     
         */
        public AIDAAccBookRQ.AccUnit.Rooms getRooms() {
            return rooms;
        }

        /**
         * Sets the value of the rooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccBookRQ.AccUnit.Rooms }
         *     
         */
        public void setRooms(AIDAAccBookRQ.AccUnit.Rooms value) {
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
         *                   &lt;element name="Customers" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Customer" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="CustomerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                                     &lt;attribute name="AgeSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="RoomIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
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
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Customers">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Customer" maxOccurs="unbounded">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="CustomerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
         *                                     &lt;attribute name="DateStart" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                                     &lt;attribute name="DateEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                                     &lt;attribute name="RateId" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
         *                 &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            protected List<AIDAAccBookRQ.AccUnit.Rooms.Room> room;
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
             * {@link AIDAAccBookRQ.AccUnit.Rooms.Room }
             * 
             * 
             */
            public List<AIDAAccBookRQ.AccUnit.Rooms.Room> getRoom() {
                if (room == null) {
                    room = new ArrayList<AIDAAccBookRQ.AccUnit.Rooms.Room>();
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
             *         &lt;element name="Customers" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Customer" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="CustomerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                           &lt;attribute name="AgeSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="RoomIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
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
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Customers">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Customer" maxOccurs="unbounded">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="CustomerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
             *                           &lt;attribute name="DateStart" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
             *                           &lt;attribute name="DateEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
             *                           &lt;attribute name="RateId" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
             *       &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "customers",
                "extraServices"
            })
            public static class Room {

                @XmlElement(name = "Customers", required = true)
                protected List<AIDAAccBookRQ.AccUnit.Rooms.Room.Customers> customers;
                @XmlElement(name = "ExtraServices")
                protected AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices extraServices;
                @XmlAttribute(name = "ID", required = true)
                protected String id;
                @XmlAttribute(name = "Count", required = true)
                protected String count;

                /**
                 * Gets the value of the customers property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the customers property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCustomers().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AIDAAccBookRQ.AccUnit.Rooms.Room.Customers }
                 * 
                 * 
                 */
                public List<AIDAAccBookRQ.AccUnit.Rooms.Room.Customers> getCustomers() {
                    if (customers == null) {
                        customers = new ArrayList<AIDAAccBookRQ.AccUnit.Rooms.Room.Customers>();
                    }
                    return this.customers;
                }

                /**
                 * Gets the value of the extraServices property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices }
                 *     
                 */
                public AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices getExtraServices() {
                    return extraServices;
                }

                /**
                 * Sets the value of the extraServices property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices }
                 *     
                 */
                public void setExtraServices(AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices value) {
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
                 * Gets the value of the count property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCount() {
                    return count;
                }

                /**
                 * Sets the value of the count property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCount(String value) {
                    this.count = value;
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
                 *         &lt;element name="Customer" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="CustomerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *                 &lt;attribute name="AgeSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="RoomIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "customer"
                })
                public static class Customers {

                    @XmlElement(name = "Customer", required = true)
                    protected List<AIDAAccBookRQ.AccUnit.Rooms.Room.Customers.Customer> customer;
                    @XmlAttribute(name = "RoomIndex", required = true)
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger roomIndex;

                    /**
                     * Gets the value of the customer property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the customer property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCustomer().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link AIDAAccBookRQ.AccUnit.Rooms.Room.Customers.Customer }
                     * 
                     * 
                     */
                    public List<AIDAAccBookRQ.AccUnit.Rooms.Room.Customers.Customer> getCustomer() {
                        if (customer == null) {
                            customer = new ArrayList<AIDAAccBookRQ.AccUnit.Rooms.Room.Customers.Customer>();
                        }
                        return this.customer;
                    }

                    /**
                     * Gets the value of the roomIndex property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRoomIndex() {
                        return roomIndex;
                    }

                    /**
                     * Sets the value of the roomIndex property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRoomIndex(BigInteger value) {
                        this.roomIndex = value;
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
                     *       &lt;attribute name="CustomerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                     *       &lt;attribute name="AgeSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Customer {

                        @XmlAttribute(name = "CustomerIndex", required = true)
                        @XmlSchemaType(name = "positiveInteger")
                        protected BigInteger customerIndex;
                        @XmlAttribute(name = "AgeSegment")
                        protected String ageSegment;

                        /**
                         * Gets the value of the customerIndex property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getCustomerIndex() {
                            return customerIndex;
                        }

                        /**
                         * Sets the value of the customerIndex property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setCustomerIndex(BigInteger value) {
                            this.customerIndex = value;
                        }

                        /**
                         * Gets the value of the ageSegment property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAgeSegment() {
                            return ageSegment;
                        }

                        /**
                         * Sets the value of the ageSegment property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAgeSegment(String value) {
                            this.ageSegment = value;
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
                 *         &lt;element name="ExtraService" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
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
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Customers">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Customer" maxOccurs="unbounded">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="CustomerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                 *                 &lt;attribute name="DateStart" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
                 *                 &lt;attribute name="DateEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
                 *                 &lt;attribute name="RateId" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
                    protected List<AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService> extraService;

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
                     * {@link AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService }
                     * 
                     * 
                     */
                    public List<AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService> getExtraService() {
                        if (extraService == null) {
                            extraService = new ArrayList<AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService>();
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
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Customers">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Customer" maxOccurs="unbounded">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="CustomerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                     *       &lt;attribute name="DateStart" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
                     *       &lt;attribute name="DateEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
                     *       &lt;attribute name="RateId" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
                        "customers"
                    })
                    public static class ExtraService {

                        @XmlElement(name = "GuestsCount", required = true)
                        protected AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount guestsCount;
                        @XmlElement(name = "Customers", required = true)
                        protected AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.Customers customers;
                        @XmlAttribute(name = "ID", required = true)
                        protected String id;
                        @XmlAttribute(name = "DateStart", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar dateStart;
                        @XmlAttribute(name = "DateEnd", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar dateEnd;
                        @XmlAttribute(name = "RateId")
                        protected BigInteger rateId;

                        /**
                         * Gets the value of the guestsCount property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount }
                         *     
                         */
                        public AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount getGuestsCount() {
                            return guestsCount;
                        }

                        /**
                         * Sets the value of the guestsCount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount }
                         *     
                         */
                        public void setGuestsCount(AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount value) {
                            this.guestsCount = value;
                        }

                        /**
                         * Gets the value of the customers property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.Customers }
                         *     
                         */
                        public AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.Customers getCustomers() {
                            return customers;
                        }

                        /**
                         * Sets the value of the customers property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.Customers }
                         *     
                         */
                        public void setCustomers(AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.Customers value) {
                            this.customers = value;
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
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Customer" maxOccurs="unbounded">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="CustomerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                            "customer"
                        })
                        public static class Customers {

                            @XmlElement(name = "Customer", required = true)
                            protected List<AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.Customers.Customer> customer;

                            /**
                             * Gets the value of the customer property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the customer property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getCustomer().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.Customers.Customer }
                             * 
                             * 
                             */
                            public List<AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.Customers.Customer> getCustomer() {
                                if (customer == null) {
                                    customer = new ArrayList<AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.Customers.Customer>();
                                }
                                return this.customer;
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
                             *       &lt;attribute name="CustomerIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class Customer {

                                @XmlAttribute(name = "CustomerIndex", required = true)
                                @XmlSchemaType(name = "positiveInteger")
                                protected BigInteger customerIndex;

                                /**
                                 * Gets the value of the customerIndex property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public BigInteger getCustomerIndex() {
                                    return customerIndex;
                                }

                                /**
                                 * Sets the value of the customerIndex property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigInteger }
                                 *     
                                 */
                                public void setCustomerIndex(BigInteger value) {
                                    this.customerIndex = value;
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
                         *         &lt;element name="GuestCount" maxOccurs="unbounded">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
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
                            "guestCount"
                        })
                        public static class GuestsCount {

                            @XmlElement(name = "GuestCount", required = true)
                            protected List<AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount.GuestCount> guestCount;

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
                             * {@link AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount.GuestCount }
                             * 
                             * 
                             */
                            public List<AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount.GuestCount> getGuestCount() {
                                if (guestCount == null) {
                                    guestCount = new ArrayList<AIDAAccBookRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount.GuestCount>();
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
     *       &lt;attribute name="OutsiderUsername" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OutsiderCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdditionalResellerInfo {

        @XmlAttribute(name = "OutsiderUsername", required = true)
        protected String outsiderUsername;
        @XmlAttribute(name = "OutsiderCode", required = true)
        protected String outsiderCode;

        /**
         * Gets the value of the outsiderUsername property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutsiderUsername() {
            return outsiderUsername;
        }

        /**
         * Sets the value of the outsiderUsername property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutsiderUsername(String value) {
            this.outsiderUsername = value;
        }

        /**
         * Gets the value of the outsiderCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOutsiderCode() {
            return outsiderCode;
        }

        /**
         * Sets the value of the outsiderCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOutsiderCode(String value) {
            this.outsiderCode = value;
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
     *         &lt;element name="Customer" type="{http://aida.dcsplus.net/ws/2010}CustomerElementType" maxOccurs="unbounded"/>
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
        "customer"
    })
    public static class Customers {

        @XmlElement(name = "Customer", required = true)
        protected List<CustomerElementType> customer;

        /**
         * Gets the value of the customer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomerElementType }
         * 
         * 
         */
        public List<CustomerElementType> getCustomer() {
            if (customer == null) {
                customer = new ArrayList<CustomerElementType>();
            }
            return this.customer;
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
     *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BackOfficeRemarks" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BackOfficeRemark" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "comments",
        "remarks",
        "backOfficeRemarks"
    })
    public static class GlobalInfo {

        @XmlElement(name = "Comments")
        protected String comments;
        @XmlElement(name = "Remarks")
        protected String remarks;
        @XmlElement(name = "BackOfficeRemarks")
        protected AIDAAccBookRQ.GlobalInfo.BackOfficeRemarks backOfficeRemarks;

        /**
         * Gets the value of the comments property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComments() {
            return comments;
        }

        /**
         * Sets the value of the comments property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComments(String value) {
            this.comments = value;
        }

        /**
         * Gets the value of the remarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemarks() {
            return remarks;
        }

        /**
         * Sets the value of the remarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemarks(String value) {
            this.remarks = value;
        }

        /**
         * Gets the value of the backOfficeRemarks property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccBookRQ.GlobalInfo.BackOfficeRemarks }
         *     
         */
        public AIDAAccBookRQ.GlobalInfo.BackOfficeRemarks getBackOfficeRemarks() {
            return backOfficeRemarks;
        }

        /**
         * Sets the value of the backOfficeRemarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccBookRQ.GlobalInfo.BackOfficeRemarks }
         *     
         */
        public void setBackOfficeRemarks(AIDAAccBookRQ.GlobalInfo.BackOfficeRemarks value) {
            this.backOfficeRemarks = value;
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
         *         &lt;element name="BackOfficeRemark" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
            "backOfficeRemark"
        })
        public static class BackOfficeRemarks {

            @XmlElement(name = "BackOfficeRemark", required = true)
            protected List<String> backOfficeRemark;

            /**
             * Gets the value of the backOfficeRemark property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the backOfficeRemark property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBackOfficeRemark().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getBackOfficeRemark() {
                if (backOfficeRemark == null) {
                    backOfficeRemark = new ArrayList<String>();
                }
                return this.backOfficeRemark;
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
     *         &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType"/>
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
    public static class SearchCriteria {

        @XmlElement(name = "DateRange", required = true)
        protected DateTimeRangeType dateRange;

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

    }

}
