
package com.whitecitycode.aida;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the GuestCount element structure
 * 
 * <p>Java class for GuestsCountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestsCountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestCount" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AgeQualifyingCode" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
 *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="MinAge" type="{http://aida.dcsplus.net/ws/2010}PersonAgeType" />
 *                 &lt;attribute name="MaxAge" type="{http://aida.dcsplus.net/ws/2010}PersonAgeType" />
 *                 &lt;attribute name="Age" type="{http://aida.dcsplus.net/ws/2010}PersonAgeType" />
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
@XmlType(name = "GuestsCountType", propOrder = {
    "guestCount"
})
@XmlSeeAlso({
    OccupancyElementType.class
})
public class GuestsCountType {

    @XmlElement(name = "GuestCount", required = true)
    protected List<GuestsCountType.GuestCount> guestCount;

    /**
     * Gets the value of the guestCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestsCountType.GuestCount }
     * 
     * 
     */
    public List<GuestsCountType.GuestCount> getGuestCount() {
        if (guestCount == null) {
            guestCount = new ArrayList<GuestsCountType.GuestCount>();
        }
        return this.guestCount;
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
     *       &lt;attribute name="AgeQualifyingCode" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeType" />
     *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="MinAge" type="{http://aida.dcsplus.net/ws/2010}PersonAgeType" />
     *       &lt;attribute name="MaxAge" type="{http://aida.dcsplus.net/ws/2010}PersonAgeType" />
     *       &lt;attribute name="Age" type="{http://aida.dcsplus.net/ws/2010}PersonAgeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GuestCount {

        @XmlAttribute(name = "AgeQualifyingCode")
        protected AgeQualifyingCodeType ageQualifyingCode;
        @XmlAttribute(name = "Count")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger count;
        @XmlAttribute(name = "MinAge")
        protected Integer minAge;
        @XmlAttribute(name = "MaxAge")
        protected Integer maxAge;
        @XmlAttribute(name = "Age")
        protected Integer age;

        /**
         * Gets the value of the ageQualifyingCode property.
         * 
         * @return
         *     possible object is
         *     {@link AgeQualifyingCodeType }
         *     
         */
        public AgeQualifyingCodeType getAgeQualifyingCode() {
            return ageQualifyingCode;
        }

        /**
         * Sets the value of the ageQualifyingCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgeQualifyingCodeType }
         *     
         */
        public void setAgeQualifyingCode(AgeQualifyingCodeType value) {
            this.ageQualifyingCode = value;
        }

        /**
         * Gets the value of the count property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCount() {
            return count;
        }

        /**
         * Sets the value of the count property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCount(BigInteger value) {
            this.count = value;
        }

        /**
         * Gets the value of the minAge property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMinAge() {
            return minAge;
        }

        /**
         * Sets the value of the minAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMinAge(Integer value) {
            this.minAge = value;
        }

        /**
         * Gets the value of the maxAge property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMaxAge() {
            return maxAge;
        }

        /**
         * Sets the value of the maxAge property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMaxAge(Integer value) {
            this.maxAge = value;
        }

        /**
         * Gets the value of the age property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAge() {
            return age;
        }

        /**
         * Sets the value of the age property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAge(Integer value) {
            this.age = value;
        }

    }

}
