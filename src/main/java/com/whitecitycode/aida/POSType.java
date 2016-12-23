
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Point of Sale (POS) identifies the party or connection channel making the request
 * 
 * <p>Java class for POS_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POS_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Requestor" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Agency" type="{http://aida.dcsplus.net/ws/2010}AgencyType" minOccurs="0"/>
 *                   &lt;element name="User" type="{http://aida.dcsplus.net/ws/2010}UserType" minOccurs="0"/>
 *                   &lt;element name="Distributor" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="AgencyCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="AgentUsername" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="System" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BookingChannel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Reseller"/>
 *                       &lt;enumeration value="WS"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "POS_Type", propOrder = {
    "requestor",
    "bookingChannel"
})
public class POSType {

    @XmlElement(name = "Requestor")
    protected POSType.Requestor requestor;
    @XmlElement(name = "BookingChannel")
    protected POSType.BookingChannel bookingChannel;

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link POSType.Requestor }
     *     
     */
    public POSType.Requestor getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSType.Requestor }
     *     
     */
    public void setRequestor(POSType.Requestor value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the bookingChannel property.
     * 
     * @return
     *     possible object is
     *     {@link POSType.BookingChannel }
     *     
     */
    public POSType.BookingChannel getBookingChannel() {
        return bookingChannel;
    }

    /**
     * Sets the value of the bookingChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSType.BookingChannel }
     *     
     */
    public void setBookingChannel(POSType.BookingChannel value) {
        this.bookingChannel = value;
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
     *       &lt;attribute name="Type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Reseller"/>
     *             &lt;enumeration value="WS"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BookingChannel {

        @XmlAttribute(name = "Type")
        protected String type;

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
     *         &lt;element name="Agency" type="{http://aida.dcsplus.net/ws/2010}AgencyType" minOccurs="0"/>
     *         &lt;element name="User" type="{http://aida.dcsplus.net/ws/2010}UserType" minOccurs="0"/>
     *         &lt;element name="Distributor" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="AgencyCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AgentUsername" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="System" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "agency",
        "user",
        "distributor",
        "system"
    })
    public static class Requestor {

        @XmlElement(name = "Agency")
        protected AgencyType agency;
        @XmlElement(name = "User")
        protected UserType user;
        @XmlElement(name = "Distributor")
        protected POSType.Requestor.Distributor distributor;
        @XmlElement(name = "System")
        protected POSType.Requestor.System system;

        /**
         * Gets the value of the agency property.
         * 
         * @return
         *     possible object is
         *     {@link AgencyType }
         *     
         */
        public AgencyType getAgency() {
            return agency;
        }

        /**
         * Sets the value of the agency property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgencyType }
         *     
         */
        public void setAgency(AgencyType value) {
            this.agency = value;
        }

        /**
         * Gets the value of the user property.
         * 
         * @return
         *     possible object is
         *     {@link UserType }
         *     
         */
        public UserType getUser() {
            return user;
        }

        /**
         * Sets the value of the user property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserType }
         *     
         */
        public void setUser(UserType value) {
            this.user = value;
        }

        /**
         * Gets the value of the distributor property.
         * 
         * @return
         *     possible object is
         *     {@link POSType.Requestor.Distributor }
         *     
         */
        public POSType.Requestor.Distributor getDistributor() {
            return distributor;
        }

        /**
         * Sets the value of the distributor property.
         * 
         * @param value
         *     allowed object is
         *     {@link POSType.Requestor.Distributor }
         *     
         */
        public void setDistributor(POSType.Requestor.Distributor value) {
            this.distributor = value;
        }

        /**
         * Gets the value of the system property.
         * 
         * @return
         *     possible object is
         *     {@link POSType.Requestor.System }
         *     
         */
        public POSType.Requestor.System getSystem() {
            return system;
        }

        /**
         * Sets the value of the system property.
         * 
         * @param value
         *     allowed object is
         *     {@link POSType.Requestor.System }
         *     
         */
        public void setSystem(POSType.Requestor.System value) {
            this.system = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="AgencyCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AgentUsername" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Distributor {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "AgencyCode", required = true)
            protected String agencyCode;
            @XmlAttribute(name = "AgentUsername")
            protected String agentUsername;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the agencyCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgencyCode() {
                return agencyCode;
            }

            /**
             * Sets the value of the agencyCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgencyCode(String value) {
                this.agencyCode = value;
            }

            /**
             * Gets the value of the agentUsername property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgentUsername() {
                return agentUsername;
            }

            /**
             * Sets the value of the agentUsername property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgentUsername(String value) {
                this.agentUsername = value;
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
         *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class System {

            @XmlAttribute(name = "Name", required = true)
            protected String name;

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

        }

    }

}
