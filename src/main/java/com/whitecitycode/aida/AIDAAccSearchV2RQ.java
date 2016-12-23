
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
 *         &lt;element name="Unit" minOccurs="0">
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
 *                   &lt;element name="RestrictByID" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" maxOccurs="20"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoomRequests">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomRequest" type="{http://aida.dcsplus.net/ws/2010}RoomRequestType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "roomRequests",
    "nationality"
})
@XmlRootElement(name = "AIDA_AccSearchV2RQ")
public class AIDAAccSearchV2RQ {

    @XmlElement(name = "DateRange", required = true)
    protected DateTimeRangeType dateRange;
    @XmlElement(name = "Destination", required = true)
    protected AIDAAccSearchV2RQ.Destination destination;
    @XmlElement(name = "Unit")
    protected AIDAAccSearchV2RQ.Unit unit;
    @XmlElement(name = "RoomRequests", required = true)
    protected AIDAAccSearchV2RQ.RoomRequests roomRequests;
    @XmlElement(name = "Nationality")
    protected String nationality;
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
     *     {@link AIDAAccSearchV2RQ.Destination }
     *     
     */
    public AIDAAccSearchV2RQ.Destination getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccSearchV2RQ.Destination }
     *     
     */
    public void setDestination(AIDAAccSearchV2RQ.Destination value) {
        this.destination = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAAccSearchV2RQ.Unit }
     *     
     */
    public AIDAAccSearchV2RQ.Unit getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccSearchV2RQ.Unit }
     *     
     */
    public void setUnit(AIDAAccSearchV2RQ.Unit value) {
        this.unit = value;
    }

    /**
     * Gets the value of the roomRequests property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAAccSearchV2RQ.RoomRequests }
     *     
     */
    public AIDAAccSearchV2RQ.RoomRequests getRoomRequests() {
        return roomRequests;
    }

    /**
     * Sets the value of the roomRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccSearchV2RQ.RoomRequests }
     *     
     */
    public void setRoomRequests(AIDAAccSearchV2RQ.RoomRequests value) {
        this.roomRequests = value;
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
     *         &lt;element name="RoomRequest" type="{http://aida.dcsplus.net/ws/2010}RoomRequestType" maxOccurs="unbounded"/>
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
        protected List<RoomRequestType> roomRequest;

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
         * {@link RoomRequestType }
         * 
         * 
         */
        public List<RoomRequestType> getRoomRequest() {
            if (roomRequest == null) {
                roomRequest = new ArrayList<RoomRequestType>();
            }
            return this.roomRequest;
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
     *         &lt;element name="RestrictByID" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" maxOccurs="20"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
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
        "stars",
        "restrictByID"
    })
    public static class Unit {

        @XmlElement(name = "Stars")
        protected AIDAAccSearchV2RQ.Unit.Stars stars;
        @XmlElement(name = "RestrictByID")
        protected AIDAAccSearchV2RQ.Unit.RestrictByID restrictByID;
        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * Gets the value of the stars property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccSearchV2RQ.Unit.Stars }
         *     
         */
        public AIDAAccSearchV2RQ.Unit.Stars getStars() {
            return stars;
        }

        /**
         * Sets the value of the stars property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccSearchV2RQ.Unit.Stars }
         *     
         */
        public void setStars(AIDAAccSearchV2RQ.Unit.Stars value) {
            this.stars = value;
        }

        /**
         * Gets the value of the restrictByID property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAAccSearchV2RQ.Unit.RestrictByID }
         *     
         */
        public AIDAAccSearchV2RQ.Unit.RestrictByID getRestrictByID() {
            return restrictByID;
        }

        /**
         * Sets the value of the restrictByID property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAAccSearchV2RQ.Unit.RestrictByID }
         *     
         */
        public void setRestrictByID(AIDAAccSearchV2RQ.Unit.RestrictByID value) {
            this.restrictByID = value;
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
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" maxOccurs="20"/>
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
            "id"
        })
        public static class RestrictByID {

            @XmlElement(name = "ID", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected List<BigInteger> id;

            /**
             * Gets the value of the id property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the id property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getID() {
                if (id == null) {
                    id = new ArrayList<BigInteger>();
                }
                return this.id;
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
