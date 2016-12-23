
package com.whitecitycode.aida;

import java.math.BigInteger;
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
 *         &lt;element name="Filters">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Departure">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PickUp" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="City">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Location">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Type" use="required" type="{http://aida.dcsplus.net/ws/2010}TransferLocationType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DropOff" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="City">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Location">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Type" use="required" type="{http://aida.dcsplus.net/ws/2010}TransferLocationType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PaxNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="LuggageNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
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
    "filters"
})
@XmlRootElement(name = "AIDA_TransferSearchRQ")
public class AIDATransferSearchRQ {

    @XmlElement(name = "Filters", required = true)
    protected AIDATransferSearchRQ.Filters filters;

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link AIDATransferSearchRQ.Filters }
     *     
     */
    public AIDATransferSearchRQ.Filters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDATransferSearchRQ.Filters }
     *     
     */
    public void setFilters(AIDATransferSearchRQ.Filters value) {
        this.filters = value;
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
     *         &lt;element name="Departure">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PickUp" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="City">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Location">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Type" use="required" type="{http://aida.dcsplus.net/ws/2010}TransferLocationType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DropOff" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="City">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Location">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Type" use="required" type="{http://aida.dcsplus.net/ws/2010}TransferLocationType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PaxNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="LuggageNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
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
        "departure",
        "pickUp",
        "dropOff",
        "paxNumber",
        "luggageNumber"
    })
    public static class Filters {

        @XmlElement(name = "Departure", required = true)
        protected AIDATransferSearchRQ.Filters.Departure departure;
        @XmlElement(name = "PickUp")
        protected AIDATransferSearchRQ.Filters.PickUp pickUp;
        @XmlElement(name = "DropOff")
        protected AIDATransferSearchRQ.Filters.DropOff dropOff;
        @XmlElement(name = "PaxNumber", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger paxNumber;
        @XmlElement(name = "LuggageNumber", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger luggageNumber;

        /**
         * Gets the value of the departure property.
         * 
         * @return
         *     possible object is
         *     {@link AIDATransferSearchRQ.Filters.Departure }
         *     
         */
        public AIDATransferSearchRQ.Filters.Departure getDeparture() {
            return departure;
        }

        /**
         * Sets the value of the departure property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDATransferSearchRQ.Filters.Departure }
         *     
         */
        public void setDeparture(AIDATransferSearchRQ.Filters.Departure value) {
            this.departure = value;
        }

        /**
         * Gets the value of the pickUp property.
         * 
         * @return
         *     possible object is
         *     {@link AIDATransferSearchRQ.Filters.PickUp }
         *     
         */
        public AIDATransferSearchRQ.Filters.PickUp getPickUp() {
            return pickUp;
        }

        /**
         * Sets the value of the pickUp property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDATransferSearchRQ.Filters.PickUp }
         *     
         */
        public void setPickUp(AIDATransferSearchRQ.Filters.PickUp value) {
            this.pickUp = value;
        }

        /**
         * Gets the value of the dropOff property.
         * 
         * @return
         *     possible object is
         *     {@link AIDATransferSearchRQ.Filters.DropOff }
         *     
         */
        public AIDATransferSearchRQ.Filters.DropOff getDropOff() {
            return dropOff;
        }

        /**
         * Sets the value of the dropOff property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDATransferSearchRQ.Filters.DropOff }
         *     
         */
        public void setDropOff(AIDATransferSearchRQ.Filters.DropOff value) {
            this.dropOff = value;
        }

        /**
         * Gets the value of the paxNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPaxNumber() {
            return paxNumber;
        }

        /**
         * Sets the value of the paxNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPaxNumber(BigInteger value) {
            this.paxNumber = value;
        }

        /**
         * Gets the value of the luggageNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLuggageNumber() {
            return luggageNumber;
        }

        /**
         * Sets the value of the luggageNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLuggageNumber(BigInteger value) {
            this.luggageNumber = value;
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
         *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Departure {

            @XmlAttribute(name = "Date", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar date;
            @XmlAttribute(name = "Time", required = true)
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar time;

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
            }

            /**
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTime() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTime(XMLGregorianCalendar value) {
                this.time = value;
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
         *         &lt;element name="City">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Location">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Type" use="required" type="{http://aida.dcsplus.net/ws/2010}TransferLocationType" />
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
            "city",
            "location"
        })
        public static class DropOff {

            @XmlElement(name = "City", required = true)
            protected AIDATransferSearchRQ.Filters.DropOff.City city;
            @XmlElement(name = "Location", required = true)
            protected AIDATransferSearchRQ.Filters.DropOff.Location location;

            /**
             * Gets the value of the city property.
             * 
             * @return
             *     possible object is
             *     {@link AIDATransferSearchRQ.Filters.DropOff.City }
             *     
             */
            public AIDATransferSearchRQ.Filters.DropOff.City getCity() {
                return city;
            }

            /**
             * Sets the value of the city property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDATransferSearchRQ.Filters.DropOff.City }
             *     
             */
            public void setCity(AIDATransferSearchRQ.Filters.DropOff.City value) {
                this.city = value;
            }

            /**
             * Gets the value of the location property.
             * 
             * @return
             *     possible object is
             *     {@link AIDATransferSearchRQ.Filters.DropOff.Location }
             *     
             */
            public AIDATransferSearchRQ.Filters.DropOff.Location getLocation() {
                return location;
            }

            /**
             * Sets the value of the location property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDATransferSearchRQ.Filters.DropOff.Location }
             *     
             */
            public void setLocation(AIDATransferSearchRQ.Filters.DropOff.Location value) {
                this.location = value;
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
            public static class City {

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


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Type" use="required" type="{http://aida.dcsplus.net/ws/2010}TransferLocationType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Location {

                @XmlAttribute(name = "Type", required = true)
                protected TransferLocationType type;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TransferLocationType }
                 *     
                 */
                public TransferLocationType getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TransferLocationType }
                 *     
                 */
                public void setType(TransferLocationType value) {
                    this.type = value;
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
         *         &lt;element name="City">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Location">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Type" use="required" type="{http://aida.dcsplus.net/ws/2010}TransferLocationType" />
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
            "city",
            "location"
        })
        public static class PickUp {

            @XmlElement(name = "City", required = true)
            protected AIDATransferSearchRQ.Filters.PickUp.City city;
            @XmlElement(name = "Location", required = true)
            protected AIDATransferSearchRQ.Filters.PickUp.Location location;

            /**
             * Gets the value of the city property.
             * 
             * @return
             *     possible object is
             *     {@link AIDATransferSearchRQ.Filters.PickUp.City }
             *     
             */
            public AIDATransferSearchRQ.Filters.PickUp.City getCity() {
                return city;
            }

            /**
             * Sets the value of the city property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDATransferSearchRQ.Filters.PickUp.City }
             *     
             */
            public void setCity(AIDATransferSearchRQ.Filters.PickUp.City value) {
                this.city = value;
            }

            /**
             * Gets the value of the location property.
             * 
             * @return
             *     possible object is
             *     {@link AIDATransferSearchRQ.Filters.PickUp.Location }
             *     
             */
            public AIDATransferSearchRQ.Filters.PickUp.Location getLocation() {
                return location;
            }

            /**
             * Sets the value of the location property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDATransferSearchRQ.Filters.PickUp.Location }
             *     
             */
            public void setLocation(AIDATransferSearchRQ.Filters.PickUp.Location value) {
                this.location = value;
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
            public static class City {

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


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="Type" use="required" type="{http://aida.dcsplus.net/ws/2010}TransferLocationType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Location {

                @XmlAttribute(name = "Type", required = true)
                protected TransferLocationType type;

                /**
                 * Gets the value of the type property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TransferLocationType }
                 *     
                 */
                public TransferLocationType getType() {
                    return type;
                }

                /**
                 * Sets the value of the type property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TransferLocationType }
                 *     
                 */
                public void setType(TransferLocationType value) {
                    this.type = value;
                }

            }

        }

    }

}
