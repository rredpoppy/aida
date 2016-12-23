
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
 *         &lt;element name="Transfer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Vehicle">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PickUpLocationTypeDetails" type="{http://aida.dcsplus.net/ws/2010}BookTransferTypeDetailsType" minOccurs="0"/>
 *                   &lt;element name="PickUpLocationDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DropOffLocationTypeDetails" type="{http://aida.dcsplus.net/ws/2010}BookTransferTypeDetailsType" minOccurs="0"/>
 *                   &lt;element name="DropOffLocationDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TravelInfo">
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
 *                 &lt;/sequence>
 *                 &lt;attribute name="LuggageNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="PaxNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Customers">
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
 *         &lt;element name="GlobalInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BackOfficeRemarks" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BackOfficeRemark" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transfer",
    "travelInfo",
    "customers",
    "globalInfo"
})
@XmlRootElement(name = "AIDA_TransferBookRQ")
public class AIDATransferBookRQ {

    @XmlElement(name = "Transfer", required = true)
    protected AIDATransferBookRQ.Transfer transfer;
    @XmlElement(name = "TravelInfo", required = true)
    protected AIDATransferBookRQ.TravelInfo travelInfo;
    @XmlElement(name = "Customers", required = true)
    protected AIDATransferBookRQ.Customers customers;
    @XmlElement(name = "GlobalInfo")
    protected AIDATransferBookRQ.GlobalInfo globalInfo;

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link AIDATransferBookRQ.Transfer }
     *     
     */
    public AIDATransferBookRQ.Transfer getTransfer() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDATransferBookRQ.Transfer }
     *     
     */
    public void setTransfer(AIDATransferBookRQ.Transfer value) {
        this.transfer = value;
    }

    /**
     * Gets the value of the travelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AIDATransferBookRQ.TravelInfo }
     *     
     */
    public AIDATransferBookRQ.TravelInfo getTravelInfo() {
        return travelInfo;
    }

    /**
     * Sets the value of the travelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDATransferBookRQ.TravelInfo }
     *     
     */
    public void setTravelInfo(AIDATransferBookRQ.TravelInfo value) {
        this.travelInfo = value;
    }

    /**
     * Gets the value of the customers property.
     * 
     * @return
     *     possible object is
     *     {@link AIDATransferBookRQ.Customers }
     *     
     */
    public AIDATransferBookRQ.Customers getCustomers() {
        return customers;
    }

    /**
     * Sets the value of the customers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDATransferBookRQ.Customers }
     *     
     */
    public void setCustomers(AIDATransferBookRQ.Customers value) {
        this.customers = value;
    }

    /**
     * Gets the value of the globalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AIDATransferBookRQ.GlobalInfo }
     *     
     */
    public AIDATransferBookRQ.GlobalInfo getGlobalInfo() {
        return globalInfo;
    }

    /**
     * Sets the value of the globalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDATransferBookRQ.GlobalInfo }
     *     
     */
    public void setGlobalInfo(AIDATransferBookRQ.GlobalInfo value) {
        this.globalInfo = value;
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
     *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BackOfficeRemarks" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BackOfficeRemark" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "comments",
        "remarks",
        "backOfficeRemarks"
    })
    public static class GlobalInfo {

        @XmlElement(name = "Comments")
        protected String comments;
        @XmlElement(name = "Remarks")
        protected String remarks;
        @XmlElement(name = "BackOfficeRemarks")
        protected AIDATransferBookRQ.GlobalInfo.BackOfficeRemarks backOfficeRemarks;

        /**
         * Gets the value of the comments property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComments() {
            return comments;
        }

        /**
         * Sets the value of the comments property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComments(String value) {
            this.comments = value;
        }

        /**
         * Gets the value of the remarks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRemarks() {
            return remarks;
        }

        /**
         * Sets the value of the remarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRemarks(String value) {
            this.remarks = value;
        }

        /**
         * Gets the value of the backOfficeRemarks property.
         * 
         * @return
         *     possible object is
         *     {@link AIDATransferBookRQ.GlobalInfo.BackOfficeRemarks }
         *     
         */
        public AIDATransferBookRQ.GlobalInfo.BackOfficeRemarks getBackOfficeRemarks() {
            return backOfficeRemarks;
        }

        /**
         * Sets the value of the backOfficeRemarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDATransferBookRQ.GlobalInfo.BackOfficeRemarks }
         *     
         */
        public void setBackOfficeRemarks(AIDATransferBookRQ.GlobalInfo.BackOfficeRemarks value) {
            this.backOfficeRemarks = value;
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
         *         &lt;element name="BackOfficeRemark" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
            "backOfficeRemark"
        })
        public static class BackOfficeRemarks {

            @XmlElement(name = "BackOfficeRemark", required = true)
            protected List<String> backOfficeRemark;

            /**
             * Gets the value of the backOfficeRemark property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the backOfficeRemark property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBackOfficeRemark().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getBackOfficeRemark() {
                if (backOfficeRemark == null) {
                    backOfficeRemark = new ArrayList<String>();
                }
                return this.backOfficeRemark;
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
     *         &lt;element name="Vehicle">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PickUpLocationTypeDetails" type="{http://aida.dcsplus.net/ws/2010}BookTransferTypeDetailsType" minOccurs="0"/>
     *         &lt;element name="PickUpLocationDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DropOffLocationTypeDetails" type="{http://aida.dcsplus.net/ws/2010}BookTransferTypeDetailsType" minOccurs="0"/>
     *         &lt;element name="DropOffLocationDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vehicle",
        "pickUpLocationTypeDetails",
        "pickUpLocationDetails",
        "dropOffLocationTypeDetails",
        "dropOffLocationDetails"
    })
    public static class Transfer {

        @XmlElement(name = "Vehicle", required = true)
        protected AIDATransferBookRQ.Transfer.Vehicle vehicle;
        @XmlElement(name = "PickUpLocationTypeDetails")
        protected BookTransferTypeDetailsType pickUpLocationTypeDetails;
        @XmlElement(name = "PickUpLocationDetails")
        protected String pickUpLocationDetails;
        @XmlElement(name = "DropOffLocationTypeDetails")
        protected BookTransferTypeDetailsType dropOffLocationTypeDetails;
        @XmlElement(name = "DropOffLocationDetails")
        protected String dropOffLocationDetails;
        @XmlAttribute(name = "ID", required = true)
        protected String id;

        /**
         * Gets the value of the vehicle property.
         * 
         * @return
         *     possible object is
         *     {@link AIDATransferBookRQ.Transfer.Vehicle }
         *     
         */
        public AIDATransferBookRQ.Transfer.Vehicle getVehicle() {
            return vehicle;
        }

        /**
         * Sets the value of the vehicle property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDATransferBookRQ.Transfer.Vehicle }
         *     
         */
        public void setVehicle(AIDATransferBookRQ.Transfer.Vehicle value) {
            this.vehicle = value;
        }

        /**
         * Gets the value of the pickUpLocationTypeDetails property.
         * 
         * @return
         *     possible object is
         *     {@link BookTransferTypeDetailsType }
         *     
         */
        public BookTransferTypeDetailsType getPickUpLocationTypeDetails() {
            return pickUpLocationTypeDetails;
        }

        /**
         * Sets the value of the pickUpLocationTypeDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTransferTypeDetailsType }
         *     
         */
        public void setPickUpLocationTypeDetails(BookTransferTypeDetailsType value) {
            this.pickUpLocationTypeDetails = value;
        }

        /**
         * Gets the value of the pickUpLocationDetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPickUpLocationDetails() {
            return pickUpLocationDetails;
        }

        /**
         * Sets the value of the pickUpLocationDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPickUpLocationDetails(String value) {
            this.pickUpLocationDetails = value;
        }

        /**
         * Gets the value of the dropOffLocationTypeDetails property.
         * 
         * @return
         *     possible object is
         *     {@link BookTransferTypeDetailsType }
         *     
         */
        public BookTransferTypeDetailsType getDropOffLocationTypeDetails() {
            return dropOffLocationTypeDetails;
        }

        /**
         * Sets the value of the dropOffLocationTypeDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookTransferTypeDetailsType }
         *     
         */
        public void setDropOffLocationTypeDetails(BookTransferTypeDetailsType value) {
            this.dropOffLocationTypeDetails = value;
        }

        /**
         * Gets the value of the dropOffLocationDetails property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDropOffLocationDetails() {
            return dropOffLocationDetails;
        }

        /**
         * Sets the value of the dropOffLocationDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDropOffLocationDetails(String value) {
            this.dropOffLocationDetails = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Vehicle {

            @XmlAttribute(name = "Code", required = true)
            protected String code;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
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
     *       &lt;/sequence>
     *       &lt;attribute name="LuggageNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="PaxNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "departure"
    })
    public static class TravelInfo {

        @XmlElement(name = "Departure", required = true)
        protected AIDATransferBookRQ.TravelInfo.Departure departure;
        @XmlAttribute(name = "LuggageNumber", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger luggageNumber;
        @XmlAttribute(name = "PaxNumber", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger paxNumber;

        /**
         * Gets the value of the departure property.
         * 
         * @return
         *     possible object is
         *     {@link AIDATransferBookRQ.TravelInfo.Departure }
         *     
         */
        public AIDATransferBookRQ.TravelInfo.Departure getDeparture() {
            return departure;
        }

        /**
         * Sets the value of the departure property.
         * 
         * @param value
         *     allowed object is
         *     {@link AIDATransferBookRQ.TravelInfo.Departure }
         *     
         */
        public void setDeparture(AIDATransferBookRQ.TravelInfo.Departure value) {
            this.departure = value;
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

    }

}
