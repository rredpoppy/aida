
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
 *                   &lt;element name="Destination">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Unit">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Stars" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Star" type="{http://aida.dcsplus.net/ws/2010}ServiceStarsType" maxOccurs="5" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="MaxStars" type="{http://aida.dcsplus.net/ws/2010}ServiceStarsType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceAccType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Rooms">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Room" maxOccurs="3">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="IndexNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
 *                 &lt;attribute name="ShowRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    "nationality"
})
@XmlRootElement(name = "AIDA_AccSearchRQ")
public class AIDAAccSearchRQ {

    @XmlElement(name = "SearchCriteria", required = true)
    protected AIDAAccSearchRQ.SearchCriteria searchCriteria;
    @XmlElement(name = "Nationality")
    protected String nationality;

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAAccSearchRQ.SearchCriteria }
     *     
     */
    public AIDAAccSearchRQ.SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccSearchRQ.SearchCriteria }
     *     
     */
    public void setSearchCriteria(AIDAAccSearchRQ.SearchCriteria value) {
        this.searchCriteria = value;
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
     *         &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType"/>
     *         &lt;element name="Destination">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Unit">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Stars" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Star" type="{http://aida.dcsplus.net/ws/2010}ServiceStarsType" maxOccurs="5" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="MaxStars" type="{http://aida.dcsplus.net/ws/2010}ServiceStarsType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceAccType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Rooms">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Room" maxOccurs="3">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="IndexNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
     *       &lt;attribute name="ShowRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dateRange",
        "destination",
        "unit",
        "rooms"
    })
    public static class SearchCriteria {

        @XmlElement(name = "DateRange", required = true)
        protected DateTimeRangeType dateRange;
        @XmlElement(name = "Destination", required = true)
        protected AIDAAccSearchRQ.SearchCriteria.Destination destination;
        @XmlElement(name = "Unit", required = true)
        protected AIDAAccSearchRQ.SearchCriteria.Unit unit;
        @XmlElement(name = "Rooms", required = true)
        protected AIDAAccSearchRQ.SearchCriteria.Rooms rooms;
        @XmlAttribute(name = "ShowRequest")
        protected Boolean showRequest;

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

        /**
         * Gets the value of the destination property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccSearchRQ.SearchCriteria.Destination }
         *     
         */
        public AIDAAccSearchRQ.SearchCriteria.Destination getDestination() {
            return destination;
        }

        /**
         * Sets the value of the destination property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccSearchRQ.SearchCriteria.Destination }
         *     
         */
        public void setDestination(AIDAAccSearchRQ.SearchCriteria.Destination value) {
            this.destination = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccSearchRQ.SearchCriteria.Unit }
         *     
         */
        public AIDAAccSearchRQ.SearchCriteria.Unit getUnit() {
            return unit;
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccSearchRQ.SearchCriteria.Unit }
         *     
         */
        public void setUnit(AIDAAccSearchRQ.SearchCriteria.Unit value) {
            this.unit = value;
        }

        /**
         * Gets the value of the rooms property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccSearchRQ.SearchCriteria.Rooms }
         *     
         */
        public AIDAAccSearchRQ.SearchCriteria.Rooms getRooms() {
            return rooms;
        }

        /**
         * Sets the value of the rooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccSearchRQ.SearchCriteria.Rooms }
         *     
         */
        public void setRooms(AIDAAccSearchRQ.SearchCriteria.Rooms value) {
            this.rooms = value;
        }

        /**
         * Gets the value of the showRequest property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShowRequest() {
            return showRequest;
        }

        /**
         * Sets the value of the showRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShowRequest(Boolean value) {
            this.showRequest = value;
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
         *         &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType"/>
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
        public static class Destination {

            @XmlElement(name = "City", required = true)
            protected CityType city;

            /**
             * Gets the value of the city property.
             * 
             * @return
             *     possible object is
             *     {@link CityType }
             *     
             */
            public CityType getCity() {
                return city;
            }

            /**
             * Sets the value of the city property.
             * 
             * @param value
             *     allowed object is
             *     {@link CityType }
             *     
             */
            public void setCity(CityType value) {
                this.city = value;
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
         *         &lt;element name="Room" maxOccurs="3">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="IndexNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
            protected List<AIDAAccSearchRQ.SearchCriteria.Rooms.Room> room;

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
             * {@link AIDAAccSearchRQ.SearchCriteria.Rooms.Room }
             * 
             * 
             */
            public List<AIDAAccSearchRQ.SearchCriteria.Rooms.Room> getRoom() {
                if (room == null) {
                    room = new ArrayList<AIDAAccSearchRQ.SearchCriteria.Rooms.Room>();
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
             *         &lt;element name="GuestsCount" type="{http://aida.dcsplus.net/ws/2010}GuestsCountType"/>
             *       &lt;/sequence>
             *       &lt;attribute name="IndexNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
                "guestsCount"
            })
            public static class Room {

                @XmlElement(name = "GuestsCount", required = true)
                protected GuestsCountType guestsCount;
                @XmlAttribute(name = "IndexNumber", required = true)
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger indexNumber;
                @XmlAttribute(name = "Count", required = true)
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger count;

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
         *         &lt;element name="Stars" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Star" type="{http://aida.dcsplus.net/ws/2010}ServiceStarsType" maxOccurs="5" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="MaxStars" type="{http://aida.dcsplus.net/ws/2010}ServiceStarsType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceAccType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "stars"
        })
        public static class Unit {

            @XmlElement(name = "Stars")
            protected AIDAAccSearchRQ.SearchCriteria.Unit.Stars stars;
            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "Type")
            protected ServiceAccType type;

            /**
             * Gets the value of the stars property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAAccSearchRQ.SearchCriteria.Unit.Stars }
             *     
             */
            public AIDAAccSearchRQ.SearchCriteria.Unit.Stars getStars() {
                return stars;
            }

            /**
             * Sets the value of the stars property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAAccSearchRQ.SearchCriteria.Unit.Stars }
             *     
             */
            public void setStars(AIDAAccSearchRQ.SearchCriteria.Unit.Stars value) {
                this.stars = value;
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
             *     {@link ServiceAccType }
             *     
             */
            public ServiceAccType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceAccType }
             *     
             */
            public void setType(ServiceAccType value) {
                this.type = value;
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
             *         &lt;element name="Star" type="{http://aida.dcsplus.net/ws/2010}ServiceStarsType" maxOccurs="5" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="MaxStars" type="{http://aida.dcsplus.net/ws/2010}ServiceStarsType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "star"
            })
            public static class Stars {

                @XmlElement(name = "Star", type = Integer.class)
                @XmlSchemaType(name = "positiveInteger")
                protected List<Integer> star;
                @XmlAttribute(name = "MaxStars")
                protected Integer maxStars;

                /**
                 * Gets the value of the star property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the star property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getStar().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Integer }
                 * 
                 * 
                 */
                public List<Integer> getStar() {
                    if (star == null) {
                        star = new ArrayList<Integer>();
                    }
                    return this.star;
                }

                /**
                 * Gets the value of the maxStars property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getMaxStars() {
                    return maxStars;
                }

                /**
                 * Sets the value of the maxStars property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setMaxStars(Integer value) {
                    this.maxStars = value;
                }

            }

        }

    }

}
