
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
 * List of reservation remarks
 * 
 * <p>Java class for RemarksListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemarksListType">
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
 *         &lt;element name="Remarks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Remark" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Sender" type="{http://aida.dcsplus.net/ws/2010}SenderType"/>
 *                             &lt;element name="RemarkText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="AddTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="ReadByUser" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "RemarksListType", propOrder = {
    "reservation",
    "remarks"
})
public class RemarksListType {

    @XmlElement(name = "Reservation", required = true)
    protected RemarksListType.Reservation reservation;
    @XmlElement(name = "Remarks")
    protected RemarksListType.Remarks remarks;

    /**
     * Gets the value of the reservation property.
     * 
     * @return
     *     possible object is
     *     {@link RemarksListType.Reservation }
     *     
     */
    public RemarksListType.Reservation getReservation() {
        return reservation;
    }

    /**
     * Sets the value of the reservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarksListType.Reservation }
     *     
     */
    public void setReservation(RemarksListType.Reservation value) {
        this.reservation = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link RemarksListType.Remarks }
     *     
     */
    public RemarksListType.Remarks getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarksListType.Remarks }
     *     
     */
    public void setRemarks(RemarksListType.Remarks value) {
        this.remarks = value;
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
     *         &lt;element name="Remark" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Sender" type="{http://aida.dcsplus.net/ws/2010}SenderType"/>
     *                   &lt;element name="RemarkText" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="AddTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                 &lt;attribute name="ReadByUser" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "remark"
    })
    public static class Remarks {

        @XmlElement(name = "Remark", required = true)
        protected List<RemarksListType.Remarks.Remark> remark;

        /**
         * Gets the value of the remark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RemarksListType.Remarks.Remark }
         * 
         * 
         */
        public List<RemarksListType.Remarks.Remark> getRemark() {
            if (remark == null) {
                remark = new ArrayList<RemarksListType.Remarks.Remark>();
            }
            return this.remark;
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
         *         &lt;element name="Sender" type="{http://aida.dcsplus.net/ws/2010}SenderType"/>
         *         &lt;element name="RemarkText" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="AddTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *       &lt;attribute name="ReadByUser" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sender",
            "remarkText"
        })
        public static class Remark {

            @XmlElement(name = "Sender", required = true)
            protected SenderType sender;
            @XmlElement(name = "RemarkText", required = true)
            protected String remarkText;
            @XmlAttribute(name = "AddTime", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar addTime;
            @XmlAttribute(name = "ReadByUser", required = true)
            protected String readByUser;

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
             * Gets the value of the addTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getAddTime() {
                return addTime;
            }

            /**
             * Sets the value of the addTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setAddTime(XMLGregorianCalendar value) {
                this.addTime = value;
            }

            /**
             * Gets the value of the readByUser property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReadByUser() {
                return readByUser;
            }

            /**
             * Sets the value of the readByUser property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReadByUser(String value) {
                this.readByUser = value;
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
