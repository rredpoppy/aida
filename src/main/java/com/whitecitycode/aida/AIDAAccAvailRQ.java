
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
 *                                                                             &lt;attribute name="Age" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
    "searchCriteria",
    "accUnit",
    "nationality"
})
@XmlRootElement(name = "AIDA_AccAvailRQ")
public class AIDAAccAvailRQ {

    @XmlElement(name = "SearchCriteria", required = true)
    protected AIDAAccAvailRQ.SearchCriteria searchCriteria;
    @XmlElement(name = "AccUnit", required = true)
    protected AIDAAccAvailRQ.AccUnit accUnit;
    @XmlElement(name = "Nationality")
    protected String nationality;

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAAccAvailRQ.SearchCriteria }
     *     
     */
    public AIDAAccAvailRQ.SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccAvailRQ.SearchCriteria }
     *     
     */
    public void setSearchCriteria(AIDAAccAvailRQ.SearchCriteria value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the accUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAAccAvailRQ.AccUnit }
     *     
     */
    public AIDAAccAvailRQ.AccUnit getAccUnit() {
        return accUnit;
    }

    /**
     * Sets the value of the accUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccAvailRQ.AccUnit }
     *     
     */
    public void setAccUnit(AIDAAccAvailRQ.AccUnit value) {
        this.accUnit = value;
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
     *                                                                   &lt;attribute name="Age" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
        "rooms"
    })
    public static class AccUnit {

        @XmlElement(name = "Rooms", required = true)
        protected AIDAAccAvailRQ.AccUnit.Rooms rooms;
        @XmlAttribute(name = "ID", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;

        /**
         * Gets the value of the rooms property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccAvailRQ.AccUnit.Rooms }
         *     
         */
        public AIDAAccAvailRQ.AccUnit.Rooms getRooms() {
            return rooms;
        }

        /**
         * Sets the value of the rooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccAvailRQ.AccUnit.Rooms }
         *     
         */
        public void setRooms(AIDAAccAvailRQ.AccUnit.Rooms value) {
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
         *                                                         &lt;attribute name="Age" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
            protected List<AIDAAccAvailRQ.AccUnit.Rooms.Room> room;
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
             * {@link AIDAAccAvailRQ.AccUnit.Rooms.Room }
             * 
             * 
             */
            public List<AIDAAccAvailRQ.AccUnit.Rooms.Room> getRoom() {
                if (room == null) {
                    room = new ArrayList<AIDAAccAvailRQ.AccUnit.Rooms.Room>();
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
             *                                               &lt;attribute name="Age" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                "extraServices"
            })
            public static class Room {

                @XmlElement(name = "ExtraServices")
                protected AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices extraServices;
                @XmlAttribute(name = "ID", required = true)
                protected String id;
                @XmlAttribute(name = "Count", required = true)
                protected String count;

                /**
                 * Gets the value of the extraServices property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices }
                 *     
                 */
                public AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices getExtraServices() {
                    return extraServices;
                }

                /**
                 * Sets the value of the extraServices property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices }
                 *     
                 */
                public void setExtraServices(AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices value) {
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
                 *                                     &lt;attribute name="Age" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                    protected List<AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService> extraService;

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
                     * {@link AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService }
                     * 
                     * 
                     */
                    public List<AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService> getExtraService() {
                        if (extraService == null) {
                            extraService = new ArrayList<AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService>();
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
                     *                           &lt;attribute name="Age" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                        "guestsCount"
                    })
                    public static class ExtraService {

                        @XmlElement(name = "GuestsCount", required = true)
                        protected AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount guestsCount;
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
                         *     {@link AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount }
                         *     
                         */
                        public AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount getGuestsCount() {
                            return guestsCount;
                        }

                        /**
                         * Sets the value of the guestsCount property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount }
                         *     
                         */
                        public void setGuestsCount(AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount value) {
                            this.guestsCount = value;
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
                         *         &lt;element name="GuestCount" maxOccurs="unbounded">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="AgeQualifyingCode" use="required" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
                         *                 &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                         *                 &lt;attribute name="Age" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                            protected List<AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount.GuestCount> guestCount;

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
                             * {@link AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount.GuestCount }
                             * 
                             * 
                             */
                            public List<AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount.GuestCount> getGuestCount() {
                                if (guestCount == null) {
                                    guestCount = new ArrayList<AIDAAccAvailRQ.AccUnit.Rooms.Room.ExtraServices.ExtraService.GuestsCount.GuestCount>();
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
                             *       &lt;attribute name="Age" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                                @XmlAttribute(name = "Age", required = true)
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
