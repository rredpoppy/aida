
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
 *       &lt;choice>
 *         &lt;element name="Errors" type="{http://aida.dcsplus.net/ws/2010}ErrorsType"/>
 *         &lt;group ref="{http://aida.dcsplus.net/ws/2010}GetItineraryFullResultGroup"/>
 *       &lt;/choice>
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
    "packEntry"
})
@XmlRootElement(name = "AIDA_GetItineraryFullRS")
public class AIDAGetItineraryFullRS {

    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "Success")
    protected AIDAGetItineraryFullRS.Success success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "PackEntry")
    protected AIDAGetItineraryFullRS.PackEntry packEntry;

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
     *     {@link AIDAGetItineraryFullRS.Success }
     *     
     */
    public AIDAGetItineraryFullRS.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAGetItineraryFullRS.Success }
     *     
     */
    public void setSuccess(AIDAGetItineraryFullRS.Success value) {
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
     * Gets the value of the packEntry property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAGetItineraryFullRS.PackEntry }
     *     
     */
    public AIDAGetItineraryFullRS.PackEntry getPackEntry() {
        return packEntry;
    }

    /**
     * Sets the value of the packEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAGetItineraryFullRS.PackEntry }
     *     
     */
    public void setPackEntry(AIDAGetItineraryFullRS.PackEntry value) {
        this.packEntry = value;
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
     *         &lt;element name="Transportation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Segment" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Departure" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentLocationType"/>
     *                             &lt;element name="Arrival" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentLocationType"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="FlightNo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="FlightClass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Carrier" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="MaxKilos" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="DateStart" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="DateEnd" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transportation"
    })
    public static class PackEntry {

        @XmlElement(name = "Transportation", required = true)
        protected AIDAGetItineraryFullRS.PackEntry.Transportation transportation;
        @XmlAttribute(name = "ID", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;
        @XmlAttribute(name = "DateStart", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateStart;
        @XmlAttribute(name = "DateEnd", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateEnd;

        /**
         * Gets the value of the transportation property.
         * 
         * @return
         *     possible object is
         *     {@link AIDAGetItineraryFullRS.PackEntry.Transportation }
         *     
         */
        public AIDAGetItineraryFullRS.PackEntry.Transportation getTransportation() {
            return transportation;
        }

        /**
         * Sets the value of the transportation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDAGetItineraryFullRS.PackEntry.Transportation }
         *     
         */
        public void setTransportation(AIDAGetItineraryFullRS.PackEntry.Transportation value) {
            this.transportation = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Segment" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Departure" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentLocationType"/>
         *                   &lt;element name="Arrival" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentLocationType"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="FlightNo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="FlightClass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Carrier" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="MaxKilos" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
            "segment"
        })
        public static class Transportation {

            @XmlElement(name = "Segment", required = true)
            protected List<AIDAGetItineraryFullRS.PackEntry.Transportation.Segment> segment;
            @XmlAttribute(name = "ServiceID", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger serviceID;
            @XmlAttribute(name = "Name", required = true)
            protected String name;

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
             * {@link AIDAGetItineraryFullRS.PackEntry.Transportation.Segment }
             * 
             * 
             */
            public List<AIDAGetItineraryFullRS.PackEntry.Transportation.Segment> getSegment() {
                if (segment == null) {
                    segment = new ArrayList<AIDAGetItineraryFullRS.PackEntry.Transportation.Segment>();
                }
                return this.segment;
            }

            /**
             * Gets the value of the serviceID property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getServiceID() {
                return serviceID;
            }

            /**
             * Sets the value of the serviceID property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setServiceID(BigInteger value) {
                this.serviceID = value;
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
             *         &lt;element name="Departure" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentLocationType"/>
             *         &lt;element name="Arrival" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentLocationType"/>
             *       &lt;/sequence>
             *       &lt;attribute name="FlightNo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="FlightClass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Carrier" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="MaxKilos" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
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
                protected ItinerarySegmentLocationType departure;
                @XmlElement(name = "Arrival", required = true)
                protected ItinerarySegmentLocationType arrival;
                @XmlAttribute(name = "FlightNo", required = true)
                protected String flightNo;
                @XmlAttribute(name = "FlightClass", required = true)
                protected String flightClass;
                @XmlAttribute(name = "Carrier", required = true)
                protected String carrier;
                @XmlAttribute(name = "MaxKilos", required = true)
                protected float maxKilos;

                /**
                 * Gets the value of the departure property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinerarySegmentLocationType }
                 *     
                 */
                public ItinerarySegmentLocationType getDeparture() {
                    return departure;
                }

                /**
                 * Sets the value of the departure property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinerarySegmentLocationType }
                 *     
                 */
                public void setDeparture(ItinerarySegmentLocationType value) {
                    this.departure = value;
                }

                /**
                 * Gets the value of the arrival property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItinerarySegmentLocationType }
                 *     
                 */
                public ItinerarySegmentLocationType getArrival() {
                    return arrival;
                }

                /**
                 * Sets the value of the arrival property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItinerarySegmentLocationType }
                 *     
                 */
                public void setArrival(ItinerarySegmentLocationType value) {
                    this.arrival = value;
                }

                /**
                 * Gets the value of the flightNo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFlightNo() {
                    return flightNo;
                }

                /**
                 * Sets the value of the flightNo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFlightNo(String value) {
                    this.flightNo = value;
                }

                /**
                 * Gets the value of the flightClass property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFlightClass() {
                    return flightClass;
                }

                /**
                 * Sets the value of the flightClass property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFlightClass(String value) {
                    this.flightClass = value;
                }

                /**
                 * Gets the value of the carrier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCarrier() {
                    return carrier;
                }

                /**
                 * Sets the value of the carrier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCarrier(String value) {
                    this.carrier = value;
                }

                /**
                 * Gets the value of the maxKilos property.
                 * 
                 */
                public float getMaxKilos() {
                    return maxKilos;
                }

                /**
                 * Sets the value of the maxKilos property.
                 * 
                 */
                public void setMaxKilos(float value) {
                    this.maxKilos = value;
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
