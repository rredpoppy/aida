
package com.whitecitycode.aida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Describes the structure and contents of a tour service within a package entry
 * 
 * <p>Java class for PackEntryTour complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackEntryTour">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Segment" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Departure">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                           &lt;attribute name="Place" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Arrival">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                           &lt;attribute name="Place" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackEntryTour", propOrder = {
    "segment"
})
public class PackEntryTour {

    @XmlElement(name = "Segment", required = true)
    protected List<PackEntryTour.Segment> segment;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the segment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackEntryTour.Segment }
     * 
     * 
     */
    public List<PackEntryTour.Segment> getSegment() {
        if (segment == null) {
            segment = new ArrayList<PackEntryTour.Segment>();
        }
        return this.segment;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
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
     *         &lt;element name="Departure">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
     *                 &lt;attribute name="Place" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Arrival">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
     *                 &lt;attribute name="Place" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "departure",
        "arrival"
    })
    public static class Segment {

        @XmlElement(name = "Departure", required = true)
        protected PackEntryTour.Segment.Departure departure;
        @XmlElement(name = "Arrival", required = true)
        protected PackEntryTour.Segment.Arrival arrival;

        /**
         * Gets the value of the departure property.
         * 
         * @return
         *     possible object is
         *     {@link PackEntryTour.Segment.Departure }
         *     
         */
        public PackEntryTour.Segment.Departure getDeparture() {
            return departure;
        }

        /**
         * Sets the value of the departure property.
         * 
         * @param value
         *     allowed object is
         *     {@link PackEntryTour.Segment.Departure }
         *     
         */
        public void setDeparture(PackEntryTour.Segment.Departure value) {
            this.departure = value;
        }

        /**
         * Gets the value of the arrival property.
         * 
         * @return
         *     possible object is
         *     {@link PackEntryTour.Segment.Arrival }
         *     
         */
        public PackEntryTour.Segment.Arrival getArrival() {
            return arrival;
        }

        /**
         * Sets the value of the arrival property.
         * 
         * @param value
         *     allowed object is
         *     {@link PackEntryTour.Segment.Arrival }
         *     
         */
        public void setArrival(PackEntryTour.Segment.Arrival value) {
            this.arrival = value;
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
         *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
         *       &lt;attribute name="Place" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class Arrival {

            @XmlElement(name = "City", required = true)
            protected CityType city;
            @XmlAttribute(name = "Date", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar date;
            @XmlAttribute(name = "Time", required = true)
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar time;
            @XmlAttribute(name = "Place")
            protected String place;

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

            /**
             * Gets the value of the place property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlace() {
                return place;
            }

            /**
             * Sets the value of the place property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlace(String value) {
                this.place = value;
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
         *         &lt;element name="City" type="{http://aida.dcsplus.net/ws/2010}CityType"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="Time" use="required" type="{http://www.w3.org/2001/XMLSchema}time" />
         *       &lt;attribute name="Place" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class Departure {

            @XmlElement(name = "City", required = true)
            protected CityType city;
            @XmlAttribute(name = "Date", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar date;
            @XmlAttribute(name = "Time", required = true)
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar time;
            @XmlAttribute(name = "Place")
            protected String place;

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

            /**
             * Gets the value of the place property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlace() {
                return place;
            }

            /**
             * Sets the value of the place property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlace(String value) {
                this.place = value;
            }

        }

    }

}
