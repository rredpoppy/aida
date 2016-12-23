
package com.whitecitycode.aida;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
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
 *         &lt;group ref="{http://aida.dcsplus.net/ws/2010}TransferSearchResultsGroup"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://aida.dcsplus.net/ws/2010}PayloadAttributesGroup"/>
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
    "transfers"
})
@XmlRootElement(name = "AIDA_TransferSearchRS")
public class AIDATransferSearchRS {

    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "Success")
    protected AIDATransferSearchRS.Success success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "Transfers")
    protected AIDATransferSearchRS.Transfers transfers;
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "Version", required = true)
    protected BigDecimal version;
    @XmlAttribute(name = "RequestHost")
    protected String requestHost;

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
     *     {@link AIDATransferSearchRS.Success }
     *     
     */
    public AIDATransferSearchRS.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDATransferSearchRS.Success }
     *     
     */
    public void setSuccess(AIDATransferSearchRS.Success value) {
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
     * Gets the value of the transfers property.
     * 
     * @return
     *     possible object is
     *     {@link AIDATransferSearchRS.Transfers }
     *     
     */
    public AIDATransferSearchRS.Transfers getTransfers() {
        return transfers;
    }

    /**
     * Sets the value of the transfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDATransferSearchRS.Transfers }
     *     
     */
    public void setTransfers(AIDATransferSearchRS.Transfers value) {
        this.transfers = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Gets the value of the requestHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestHost() {
        return requestHost;
    }

    /**
     * Sets the value of the requestHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestHost(String value) {
        this.requestHost = value;
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


    /**
     * Collection of transfers.
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
     *         &lt;element name="Transfer" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PickUp" type="{http://aida.dcsplus.net/ws/2010}TransferSegmentPartType"/>
     *                   &lt;element name="DropOff" type="{http://aida.dcsplus.net/ws/2010}TransferSegmentPartType"/>
     *                   &lt;element name="Durations">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TransferDuration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
     *                             &lt;element name="WaitingDuration" type="{http://www.w3.org/2001/XMLSchema}duration"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Vehicles">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Vehicle" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://aida.dcsplus.net/ws/2010}TransferVehicleType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Availability">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Status" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
     *                                       &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "transfer"
    })
    public static class Transfers {

        @XmlElement(name = "Transfer")
        protected List<AIDATransferSearchRS.Transfers.Transfer> transfer;

        /**
         * Gets the value of the transfer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transfer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransfer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AIDATransferSearchRS.Transfers.Transfer }
         * 
         * 
         */
        public List<AIDATransferSearchRS.Transfers.Transfer> getTransfer() {
            if (transfer == null) {
                transfer = new ArrayList<AIDATransferSearchRS.Transfers.Transfer>();
            }
            return this.transfer;
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
         *         &lt;element name="PickUp" type="{http://aida.dcsplus.net/ws/2010}TransferSegmentPartType"/>
         *         &lt;element name="DropOff" type="{http://aida.dcsplus.net/ws/2010}TransferSegmentPartType"/>
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
         *         &lt;element name="Vehicles">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Vehicle" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://aida.dcsplus.net/ws/2010}TransferVehicleType">
         *                           &lt;sequence>
         *                             &lt;element name="Availability">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Status" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
         *                             &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CancelPenaltiesInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "pickUp",
            "dropOff",
            "durations",
            "vehicles",
            "cancelPenaltiesInfo",
            "description"
        })
        public static class Transfer {

            @XmlElement(name = "PickUp", required = true)
            protected TransferSegmentPartType pickUp;
            @XmlElement(name = "DropOff", required = true)
            protected TransferSegmentPartType dropOff;
            @XmlElement(name = "Durations", required = true)
            protected AIDATransferSearchRS.Transfers.Transfer.Durations durations;
            @XmlElement(name = "Vehicles", required = true)
            protected AIDATransferSearchRS.Transfers.Transfer.Vehicles vehicles;
            @XmlElement(name = "CancelPenaltiesInfo")
            protected String cancelPenaltiesInfo;
            @XmlElement(name = "Description")
            protected String description;
            @XmlAttribute(name = "ID", required = true)
            protected String id;
            @XmlAttribute(name = "Name", required = true)
            protected String name;
            @XmlAttribute(name = "Type", required = true)
            protected String type;

            /**
             * Gets the value of the pickUp property.
             * 
             * @return
             *     possible object is
             *     {@link TransferSegmentPartType }
             *     
             */
            public TransferSegmentPartType getPickUp() {
                return pickUp;
            }

            /**
             * Sets the value of the pickUp property.
             * 
             * @param value
             *     allowed object is
             *     {@link TransferSegmentPartType }
             *     
             */
            public void setPickUp(TransferSegmentPartType value) {
                this.pickUp = value;
            }

            /**
             * Gets the value of the dropOff property.
             * 
             * @return
             *     possible object is
             *     {@link TransferSegmentPartType }
             *     
             */
            public TransferSegmentPartType getDropOff() {
                return dropOff;
            }

            /**
             * Sets the value of the dropOff property.
             * 
             * @param value
             *     allowed object is
             *     {@link TransferSegmentPartType }
             *     
             */
            public void setDropOff(TransferSegmentPartType value) {
                this.dropOff = value;
            }

            /**
             * Gets the value of the durations property.
             * 
             * @return
             *     possible object is
             *     {@link AIDATransferSearchRS.Transfers.Transfer.Durations }
             *     
             */
            public AIDATransferSearchRS.Transfers.Transfer.Durations getDurations() {
                return durations;
            }

            /**
             * Sets the value of the durations property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDATransferSearchRS.Transfers.Transfer.Durations }
             *     
             */
            public void setDurations(AIDATransferSearchRS.Transfers.Transfer.Durations value) {
                this.durations = value;
            }

            /**
             * Gets the value of the vehicles property.
             * 
             * @return
             *     possible object is
             *     {@link AIDATransferSearchRS.Transfers.Transfer.Vehicles }
             *     
             */
            public AIDATransferSearchRS.Transfers.Transfer.Vehicles getVehicles() {
                return vehicles;
            }

            /**
             * Sets the value of the vehicles property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDATransferSearchRS.Transfers.Transfer.Vehicles }
             *     
             */
            public void setVehicles(AIDATransferSearchRS.Transfers.Transfer.Vehicles value) {
                this.vehicles = value;
            }

            /**
             * Gets the value of the cancelPenaltiesInfo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCancelPenaltiesInfo() {
                return cancelPenaltiesInfo;
            }

            /**
             * Sets the value of the cancelPenaltiesInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCancelPenaltiesInfo(String value) {
                this.cancelPenaltiesInfo = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
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
             *         &lt;element name="Vehicle" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://aida.dcsplus.net/ws/2010}TransferVehicleType">
             *                 &lt;sequence>
             *                   &lt;element name="Availability">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Status" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
             *                   &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
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
            @XmlType(name = "", propOrder = {
                "vehicle"
            })
            public static class Vehicles {

                @XmlElement(name = "Vehicle", required = true)
                protected List<AIDATransferSearchRS.Transfers.Transfer.Vehicles.Vehicle> vehicle;

                /**
                 * Gets the value of the vehicle property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the vehicle property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVehicle().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AIDATransferSearchRS.Transfers.Transfer.Vehicles.Vehicle }
                 * 
                 * 
                 */
                public List<AIDATransferSearchRS.Transfers.Transfer.Vehicles.Vehicle> getVehicle() {
                    if (vehicle == null) {
                        vehicle = new ArrayList<AIDATransferSearchRS.Transfers.Transfer.Vehicles.Vehicle>();
                    }
                    return this.vehicle;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}TransferVehicleType">
                 *       &lt;sequence>
                 *         &lt;element name="Availability">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Status" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Price" type="{http://aida.dcsplus.net/ws/2010}PriceType"/>
                 *         &lt;element name="CancelPenalties" type="{http://aida.dcsplus.net/ws/2010}CancelPenaltiesType" minOccurs="0"/>
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
                    "availability",
                    "price",
                    "cancelPenalties"
                })
                public static class Vehicle
                    extends TransferVehicleType
                {

                    @XmlElement(name = "Availability", required = true)
                    protected AIDATransferSearchRS.Transfers.Transfer.Vehicles.Vehicle.Availability availability;
                    @XmlElement(name = "Price", required = true)
                    protected PriceType price;
                    @XmlElement(name = "CancelPenalties")
                    protected CancelPenaltiesType cancelPenalties;

                    /**
                     * Gets the value of the availability property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AIDATransferSearchRS.Transfers.Transfer.Vehicles.Vehicle.Availability }
                     *     
                     */
                    public AIDATransferSearchRS.Transfers.Transfer.Vehicles.Vehicle.Availability getAvailability() {
                        return availability;
                    }

                    /**
                     * Sets the value of the availability property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AIDATransferSearchRS.Transfers.Transfer.Vehicles.Vehicle.Availability }
                     *     
                     */
                    public void setAvailability(AIDATransferSearchRS.Transfers.Transfer.Vehicles.Vehicle.Availability value) {
                        this.availability = value;
                    }

                    /**
                     * Gets the value of the price property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PriceType }
                     *     
                     */
                    public PriceType getPrice() {
                        return price;
                    }

                    /**
                     * Sets the value of the price property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PriceType }
                     *     
                     */
                    public void setPrice(PriceType value) {
                        this.price = value;
                    }

                    /**
                     * Gets the value of the cancelPenalties property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CancelPenaltiesType }
                     *     
                     */
                    public CancelPenaltiesType getCancelPenalties() {
                        return cancelPenalties;
                    }

                    /**
                     * Sets the value of the cancelPenalties property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CancelPenaltiesType }
                     *     
                     */
                    public void setCancelPenalties(CancelPenaltiesType value) {
                        this.cancelPenalties = value;
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
                     *       &lt;attribute name="Status" type="{http://aida.dcsplus.net/ws/2010}AvailableStsType" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Availability {

                        @XmlAttribute(name = "Status")
                        protected AvailableStsType status;

                        /**
                         * Gets the value of the status property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AvailableStsType }
                         *     
                         */
                        public AvailableStsType getStatus() {
                            return status;
                        }

                        /**
                         * Sets the value of the status property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AvailableStsType }
                         *     
                         */
                        public void setStatus(AvailableStsType value) {
                            this.status = value;
                        }

                    }

                }

            }

        }

    }

}
