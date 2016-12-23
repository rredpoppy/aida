
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="Reservation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ID" use="required" type="{http://aida.dcsplus.net/ws/2010}BigIntID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Sender" type="{http://aida.dcsplus.net/ws/2010}SenderType" minOccurs="0"/>
 *         &lt;element name="RemarkText" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "reservation",
    "sender",
    "remarkText"
})
@XmlRootElement(name = "AIDA_ReservationRemarkAddRQ")
public class AIDAReservationRemarkAddRQ {

    @XmlElement(name = "Reservation", required = true)
    protected AIDAReservationRemarkAddRQ.Reservation reservation;
    @XmlElement(name = "Sender")
    protected SenderType sender;
    @XmlElement(name = "RemarkText", required = true)
    protected String remarkText;

    /**
     * Gets the value of the reservation property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAReservationRemarkAddRQ.Reservation }
     *     
     */
    public AIDAReservationRemarkAddRQ.Reservation getReservation() {
        return reservation;
    }

    /**
     * Sets the value of the reservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAReservationRemarkAddRQ.Reservation }
     *     
     */
    public void setReservation(AIDAReservationRemarkAddRQ.Reservation value) {
        this.reservation = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link SenderType }
     *     
     */
    public SenderType getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderType }
     *     
     */
    public void setSender(SenderType value) {
        this.sender = value;
    }

    /**
     * Gets the value of the remarkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkText() {
        return remarkText;
    }

    /**
     * Sets the value of the remarkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkText(String value) {
        this.remarkText = value;
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
     *       &lt;attribute name="ID" use="required" type="{http://aida.dcsplus.net/ws/2010}BigIntID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Reservation {

        @XmlAttribute(name = "ID", required = true)
        protected long id;

        /**
         * Gets the value of the id property.
         * 
         */
        public long getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setID(long value) {
            this.id = value;
        }

    }

}
