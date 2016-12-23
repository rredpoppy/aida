
package com.whitecitycode.aida;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Details on the Room Stay including guest counts and finacial information.
 * 			
 * 
 * <p>Java class for RoomStayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomStayType">
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
 *                             &lt;element name="RoomType" type="{http://aida.dcsplus.net/ws/2010}RoomElementType" minOccurs="0"/>
 *                             &lt;element name="RoomTypeCategory" type="{http://aida.dcsplus.net/ws/2010}RoomTypeCategoryType" minOccurs="0"/>
 *                             &lt;element name="Feature" type="{http://aida.dcsplus.net/ws/2010}FeatureElementType" minOccurs="0"/>
 *                             &lt;element name="Occupancy" type="{http://aida.dcsplus.net/ws/2010}OccupancyElementType" minOccurs="0"/>
 *                             &lt;element name="Customers" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Customer" type="{http://aida.dcsplus.net/ws/2010}CustomerElementType" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
@XmlType(name = "RoomStayType", propOrder = {
    "rooms"
})
public class RoomStayType {

    @XmlElement(name = "Rooms", required = true)
    protected RoomStayType.Rooms rooms;
    @XmlAttribute(name = "IndexNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger indexNumber;

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link RoomStayType.Rooms }
     *     
     */
    public RoomStayType.Rooms getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStayType.Rooms }
     *     
     */
    public void setRooms(RoomStayType.Rooms value) {
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
     *                   &lt;element name="RoomType" type="{http://aida.dcsplus.net/ws/2010}RoomElementType" minOccurs="0"/>
     *                   &lt;element name="RoomTypeCategory" type="{http://aida.dcsplus.net/ws/2010}RoomTypeCategoryType" minOccurs="0"/>
     *                   &lt;element name="Feature" type="{http://aida.dcsplus.net/ws/2010}FeatureElementType" minOccurs="0"/>
     *                   &lt;element name="Occupancy" type="{http://aida.dcsplus.net/ws/2010}OccupancyElementType" minOccurs="0"/>
     *                   &lt;element name="Customers" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Customer" type="{http://aida.dcsplus.net/ws/2010}CustomerElementType" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
        protected List<RoomStayType.Rooms.Room> room;

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
         * {@link RoomStayType.Rooms.Room }
         * 
         * 
         */
        public List<RoomStayType.Rooms.Room> getRoom() {
            if (room == null) {
                room = new ArrayList<RoomStayType.Rooms.Room>();
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
         *         &lt;element name="RoomType" type="{http://aida.dcsplus.net/ws/2010}RoomElementType" minOccurs="0"/>
         *         &lt;element name="RoomTypeCategory" type="{http://aida.dcsplus.net/ws/2010}RoomTypeCategoryType" minOccurs="0"/>
         *         &lt;element name="Feature" type="{http://aida.dcsplus.net/ws/2010}FeatureElementType" minOccurs="0"/>
         *         &lt;element name="Occupancy" type="{http://aida.dcsplus.net/ws/2010}OccupancyElementType" minOccurs="0"/>
         *         &lt;element name="Customers" minOccurs="0">
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
         *       &lt;/sequence>
         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
            "customers"
        })
        public static class Room {

            @XmlElement(name = "RoomType")
            protected RoomElementType roomType;
            @XmlElement(name = "RoomTypeCategory")
            protected RoomTypeCategoryType roomTypeCategory;
            @XmlElement(name = "Feature")
            protected FeatureElementType feature;
            @XmlElement(name = "Occupancy")
            protected OccupancyElementType occupancy;
            @XmlElement(name = "Customers")
            protected RoomStayType.Rooms.Room.Customers customers;
            @XmlAttribute(name = "ID", required = true)
            protected String id;
            @XmlAttribute(name = "Count")
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
             * Gets the value of the customers property.
             * 
             * @return
             *     possible object is
             *     {@link RoomStayType.Rooms.Room.Customers }
             *     
             */
            public RoomStayType.Rooms.Room.Customers getCustomers() {
                return customers;
            }

            /**
             * Sets the value of the customers property.
             * 
             * @param value
             *     allowed object is
             *     {@link RoomStayType.Rooms.Room.Customers }
             *     
             */
            public void setCustomers(RoomStayType.Rooms.Room.Customers value) {
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
             * List of customer indexes associated with this room
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

        }

    }

}
