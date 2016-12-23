
package com.whitecitycode.aida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes a bundle service on a reservation
 * 
 * <p>Java class for ResBundleComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResBundleComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service" type="{http://aida.dcsplus.net/ws/2010}ServiceElementType"/>
 *         &lt;element name="ResService">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://aida.dcsplus.net/ws/2010}ResServiceType">
 *                 &lt;sequence>
 *                   &lt;element name="Itinerary" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Segment" maxOccurs="2">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Departure" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentLocationType"/>
 *                                       &lt;element name="Arrival" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentLocationType"/>
 *                                     &lt;/sequence>
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
@XmlType(name = "ResBundleComponentType", propOrder = {
    "service",
    "resService"
})
public class ResBundleComponentType {

    @XmlElement(name = "Service", required = true)
    protected ServiceElementType service;
    @XmlElement(name = "ResService", required = true)
    protected ResBundleComponentType.ResService resService;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceElementType }
     *     
     */
    public ServiceElementType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceElementType }
     *     
     */
    public void setService(ServiceElementType value) {
        this.service = value;
    }

    /**
     * Gets the value of the resService property.
     * 
     * @return
     *     possible object is
     *     {@link ResBundleComponentType.ResService }
     *     
     */
    public ResBundleComponentType.ResService getResService() {
        return resService;
    }

    /**
     * Sets the value of the resService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResBundleComponentType.ResService }
     *     
     */
    public void setResService(ResBundleComponentType.ResService value) {
        this.resService = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}ResServiceType">
     *       &lt;sequence>
     *         &lt;element name="Itinerary" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Segment" maxOccurs="2">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Departure" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentLocationType"/>
     *                             &lt;element name="Arrival" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentLocationType"/>
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
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itinerary"
    })
    public static class ResService
        extends ResServiceType
    {

        @XmlElement(name = "Itinerary")
        protected ResBundleComponentType.ResService.Itinerary itinerary;

        /**
         * Gets the value of the itinerary property.
         * 
         * @return
         *     possible object is
         *     {@link ResBundleComponentType.ResService.Itinerary }
         *     
         */
        public ResBundleComponentType.ResService.Itinerary getItinerary() {
            return itinerary;
        }

        /**
         * Sets the value of the itinerary property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResBundleComponentType.ResService.Itinerary }
         *     
         */
        public void setItinerary(ResBundleComponentType.ResService.Itinerary value) {
            this.itinerary = value;
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
         *         &lt;element name="Segment" maxOccurs="2">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Departure" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentLocationType"/>
         *                   &lt;element name="Arrival" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentLocationType"/>
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
            "segment"
        })
        public static class Itinerary {

            @XmlElement(name = "Segment", required = true)
            protected List<ResBundleComponentType.ResService.Itinerary.Segment> segment;

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
             * {@link ResBundleComponentType.ResService.Itinerary.Segment }
             * 
             * 
             */
            public List<ResBundleComponentType.ResService.Itinerary.Segment> getSegment() {
                if (segment == null) {
                    segment = new ArrayList<ResBundleComponentType.ResService.Itinerary.Segment>();
                }
                return this.segment;
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

            }

        }

    }

}
