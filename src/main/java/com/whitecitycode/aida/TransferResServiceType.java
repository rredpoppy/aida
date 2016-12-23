
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Identifies a tour service on a reservation. It includes the same information like the tour service component type, but also has information about the reservation service. 
 * 
 * <p>Java class for TransferResServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferResServiceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}ResServiceType">
 *       &lt;sequence>
 *         &lt;element name="VehicleDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PickUp" type="{http://aida.dcsplus.net/ws/2010}TransferSegmentPartExtendedType"/>
 *         &lt;element name="DropOff" type="{http://aida.dcsplus.net/ws/2010}TransferSegmentPartExtendedType"/>
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
 *         &lt;element name="Durations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TransferDuration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                   &lt;element name="WaitingDuration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Vehicle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VehicleName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferResServiceType", propOrder = {
    "vehicleDetails",
    "pickUp",
    "dropOff",
    "departure",
    "durations"
})
public class TransferResServiceType
    extends ResServiceType
{

    @XmlElement(name = "VehicleDetails")
    protected TransferResServiceType.VehicleDetails vehicleDetails;
    @XmlElement(name = "PickUp", required = true)
    protected TransferSegmentPartExtendedType pickUp;
    @XmlElement(name = "DropOff", required = true)
    protected TransferSegmentPartExtendedType dropOff;
    @XmlElement(name = "Departure", required = true)
    protected TransferResServiceType.Departure departure;
    @XmlElement(name = "Durations", required = true)
    protected TransferResServiceType.Durations durations;
    @XmlAttribute(name = "Vehicle", required = true)
    protected String vehicle;
    @XmlAttribute(name = "VehicleName", required = true)
    protected String vehicleName;

    /**
     * Gets the value of the vehicleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransferResServiceType.VehicleDetails }
     *     
     */
    public TransferResServiceType.VehicleDetails getVehicleDetails() {
        return vehicleDetails;
    }

    /**
     * Sets the value of the vehicleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferResServiceType.VehicleDetails }
     *     
     */
    public void setVehicleDetails(TransferResServiceType.VehicleDetails value) {
        this.vehicleDetails = value;
    }

    /**
     * Gets the value of the pickUp property.
     * 
     * @return
     *     possible object is
     *     {@link TransferSegmentPartExtendedType }
     *     
     */
    public TransferSegmentPartExtendedType getPickUp() {
        return pickUp;
    }

    /**
     * Sets the value of the pickUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferSegmentPartExtendedType }
     *     
     */
    public void setPickUp(TransferSegmentPartExtendedType value) {
        this.pickUp = value;
    }

    /**
     * Gets the value of the dropOff property.
     * 
     * @return
     *     possible object is
     *     {@link TransferSegmentPartExtendedType }
     *     
     */
    public TransferSegmentPartExtendedType getDropOff() {
        return dropOff;
    }

    /**
     * Sets the value of the dropOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferSegmentPartExtendedType }
     *     
     */
    public void setDropOff(TransferSegmentPartExtendedType value) {
        this.dropOff = value;
    }

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link TransferResServiceType.Departure }
     *     
     */
    public TransferResServiceType.Departure getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferResServiceType.Departure }
     *     
     */
    public void setDeparture(TransferResServiceType.Departure value) {
        this.departure = value;
    }

    /**
     * Gets the value of the durations property.
     * 
     * @return
     *     possible object is
     *     {@link TransferResServiceType.Durations }
     *     
     */
    public TransferResServiceType.Durations getDurations() {
        return durations;
    }

    /**
     * Sets the value of the durations property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferResServiceType.Durations }
     *     
     */
    public void setDurations(TransferResServiceType.Durations value) {
        this.durations = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicle(String value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the vehicleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleName() {
        return vehicleName;
    }

    /**
     * Sets the value of the vehicleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleName(String value) {
        this.vehicleName = value;
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
     *         &lt;element name="TransferDuration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
     *         &lt;element name="WaitingDuration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
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
        "transferDuration",
        "waitingDuration"
    })
    public static class Durations {

        @XmlElement(name = "TransferDuration", required = true)
        protected Duration transferDuration;
        @XmlElement(name = "WaitingDuration", required = true)
        protected Duration waitingDuration;

        /**
         * Gets the value of the transferDuration property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getTransferDuration() {
            return transferDuration;
        }

        /**
         * Sets the value of the transferDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setTransferDuration(Duration value) {
            this.transferDuration = value;
        }

        /**
         * Gets the value of the waitingDuration property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getWaitingDuration() {
            return waitingDuration;
        }

        /**
         * Sets the value of the waitingDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setWaitingDuration(Duration value) {
            this.waitingDuration = value;
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
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
        "description"
    })
    public static class VehicleDetails {

        @XmlElement(name = "Description")
        protected Object description;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDescription(Object value) {
            this.description = value;
        }

    }

}
