
package com.whitecitycode.aida;

import java.math.BigInteger;
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
 * Desribes the structure and contents of an accommodation service and room within a package entry
 * 
 * <p>Java class for PackEntryAcc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackEntryAcc">
 *   &lt;complexContent>
 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}PackEntryAccServiceType">
 *       &lt;sequence>
 *         &lt;element name="RoomType" type="{http://aida.dcsplus.net/ws/2010}RoomElementType"/>
 *         &lt;element name="RoomTypeCategory" type="{http://aida.dcsplus.net/ws/2010}RoomTypeCategoryType"/>
 *         &lt;element name="RoomFeature" type="{http://aida.dcsplus.net/ws/2010}FeatureElementType"/>
 *         &lt;element name="RoomOccupancy">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GuestCount" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="AgeQualifyingCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                           &lt;attribute name="MinAge" type="{http://aida.dcsplus.net/ws/2010}PersonAgeType" />
 *                           &lt;attribute name="MaxAge" type="{http://aida.dcsplus.net/ws/2010}PersonAgeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccommodationDates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriceSet" type="{http://aida.dcsplus.net/ws/2010}PriceSetType" minOccurs="0"/>
 *         &lt;element name="AccRateType" type="{http://aida.dcsplus.net/ws/2010}AccRateTypeType" minOccurs="0"/>
 *         &lt;element name="BundledAccommodation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BundledAcc" type="{http://aida.dcsplus.net/ws/2010}PackEntryAccServiceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="RoomID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RoomName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SeniorMinAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackEntryAcc", propOrder = {
    "roomType",
    "roomTypeCategory",
    "roomFeature",
    "roomOccupancy",
    "accommodationDates",
    "priceSet",
    "accRateType",
    "bundledAccommodation"
})
public class PackEntryAcc
    extends PackEntryAccServiceType
{

    @XmlElement(name = "RoomType", required = true)
    protected RoomElementType roomType;
    @XmlElement(name = "RoomTypeCategory", required = true)
    protected RoomTypeCategoryType roomTypeCategory;
    @XmlElement(name = "RoomFeature", required = true)
    protected FeatureElementType roomFeature;
    @XmlElement(name = "RoomOccupancy", required = true)
    protected PackEntryAcc.RoomOccupancy roomOccupancy;
    @XmlElement(name = "AccommodationDates")
    protected PackEntryAcc.AccommodationDates accommodationDates;
    @XmlElement(name = "PriceSet")
    protected PriceSetType priceSet;
    @XmlElement(name = "AccRateType")
    protected AccRateTypeType accRateType;
    @XmlElement(name = "BundledAccommodation")
    protected PackEntryAcc.BundledAccommodation bundledAccommodation;
    @XmlAttribute(name = "RoomID", required = true)
    protected String roomID;
    @XmlAttribute(name = "RoomName", required = true)
    protected String roomName;
    @XmlAttribute(name = "SeniorMinAge")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger seniorMinAge;

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link RoomElementType }
     *     
     */
    public RoomElementType getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomElementType }
     *     
     */
    public void setRoomType(RoomElementType value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the roomTypeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link RoomTypeCategoryType }
     *     
     */
    public RoomTypeCategoryType getRoomTypeCategory() {
        return roomTypeCategory;
    }

    /**
     * Sets the value of the roomTypeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomTypeCategoryType }
     *     
     */
    public void setRoomTypeCategory(RoomTypeCategoryType value) {
        this.roomTypeCategory = value;
    }

    /**
     * Gets the value of the roomFeature property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureElementType }
     *     
     */
    public FeatureElementType getRoomFeature() {
        return roomFeature;
    }

    /**
     * Sets the value of the roomFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureElementType }
     *     
     */
    public void setRoomFeature(FeatureElementType value) {
        this.roomFeature = value;
    }

    /**
     * Gets the value of the roomOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link PackEntryAcc.RoomOccupancy }
     *     
     */
    public PackEntryAcc.RoomOccupancy getRoomOccupancy() {
        return roomOccupancy;
    }

    /**
     * Sets the value of the roomOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackEntryAcc.RoomOccupancy }
     *     
     */
    public void setRoomOccupancy(PackEntryAcc.RoomOccupancy value) {
        this.roomOccupancy = value;
    }

    /**
     * Gets the value of the accommodationDates property.
     * 
     * @return
     *     possible object is
     *     {@link PackEntryAcc.AccommodationDates }
     *     
     */
    public PackEntryAcc.AccommodationDates getAccommodationDates() {
        return accommodationDates;
    }

    /**
     * Sets the value of the accommodationDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackEntryAcc.AccommodationDates }
     *     
     */
    public void setAccommodationDates(PackEntryAcc.AccommodationDates value) {
        this.accommodationDates = value;
    }

    /**
     * Gets the value of the priceSet property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSetType }
     *     
     */
    public PriceSetType getPriceSet() {
        return priceSet;
    }

    /**
     * Sets the value of the priceSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSetType }
     *     
     */
    public void setPriceSet(PriceSetType value) {
        this.priceSet = value;
    }

    /**
     * Gets the value of the accRateType property.
     * 
     * @return
     *     possible object is
     *     {@link AccRateTypeType }
     *     
     */
    public AccRateTypeType getAccRateType() {
        return accRateType;
    }

    /**
     * Sets the value of the accRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccRateTypeType }
     *     
     */
    public void setAccRateType(AccRateTypeType value) {
        this.accRateType = value;
    }

    /**
     * Gets the value of the bundledAccommodation property.
     * 
     * @return
     *     possible object is
     *     {@link PackEntryAcc.BundledAccommodation }
     *     
     */
    public PackEntryAcc.BundledAccommodation getBundledAccommodation() {
        return bundledAccommodation;
    }

    /**
     * Sets the value of the bundledAccommodation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackEntryAcc.BundledAccommodation }
     *     
     */
    public void setBundledAccommodation(PackEntryAcc.BundledAccommodation value) {
        this.bundledAccommodation = value;
    }

    /**
     * Gets the value of the roomID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomID() {
        return roomID;
    }

    /**
     * Sets the value of the roomID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomID(String value) {
        this.roomID = value;
    }

    /**
     * Gets the value of the roomName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * Sets the value of the roomName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomName(String value) {
        this.roomName = value;
    }

    /**
     * Gets the value of the seniorMinAge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeniorMinAge() {
        return seniorMinAge;
    }

    /**
     * Sets the value of the seniorMinAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeniorMinAge(BigInteger value) {
        this.seniorMinAge = value;
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
     *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded"/>
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
        "date"
    })
    public static class AccommodationDates {

        @XmlElement(name = "Date", required = true)
        @XmlSchemaType(name = "date")
        protected List<XMLGregorianCalendar> date;

        /**
         * Gets the value of the date property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the date property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XMLGregorianCalendar }
         * 
         * 
         */
        public List<XMLGregorianCalendar> getDate() {
            if (date == null) {
                date = new ArrayList<XMLGregorianCalendar>();
            }
            return this.date;
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
     *         &lt;element name="BundledAcc" type="{http://aida.dcsplus.net/ws/2010}PackEntryAccServiceType" maxOccurs="unbounded"/>
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
        "bundledAcc"
    })
    public static class BundledAccommodation {

        @XmlElement(name = "BundledAcc", required = true)
        protected List<PackEntryAccServiceType> bundledAcc;

        /**
         * Gets the value of the bundledAcc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bundledAcc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBundledAcc().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PackEntryAccServiceType }
         * 
         * 
         */
        public List<PackEntryAccServiceType> getBundledAcc() {
            if (bundledAcc == null) {
                bundledAcc = new ArrayList<PackEntryAccServiceType>();
            }
            return this.bundledAcc;
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
     *         &lt;element name="GuestCount" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="AgeQualifyingCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                 &lt;attribute name="MinAge" type="{http://aida.dcsplus.net/ws/2010}PersonAgeType" />
     *                 &lt;attribute name="MaxAge" type="{http://aida.dcsplus.net/ws/2010}PersonAgeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "guestCount"
    })
    public static class RoomOccupancy {

        @XmlElement(name = "GuestCount", required = true)
        protected List<PackEntryAcc.RoomOccupancy.GuestCount> guestCount;
        @XmlAttribute(name = "Name")
        protected String name;

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
         * {@link PackEntryAcc.RoomOccupancy.GuestCount }
         * 
         * 
         */
        public List<PackEntryAcc.RoomOccupancy.GuestCount> getGuestCount() {
            if (guestCount == null) {
                guestCount = new ArrayList<PackEntryAcc.RoomOccupancy.GuestCount>();
            }
            return this.guestCount;
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
         *       &lt;attribute name="AgeQualifyingCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *       &lt;attribute name="MinAge" type="{http://aida.dcsplus.net/ws/2010}PersonAgeType" />
         *       &lt;attribute name="MaxAge" type="{http://aida.dcsplus.net/ws/2010}PersonAgeType" />
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

            @XmlAttribute(name = "AgeQualifyingCode", required = true)
            protected String ageQualifyingCode;
            @XmlAttribute(name = "Count", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger count;
            @XmlAttribute(name = "MinAge")
            protected Integer minAge;
            @XmlAttribute(name = "MaxAge")
            protected Integer maxAge;

            /**
             * Gets the value of the ageQualifyingCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgeQualifyingCode() {
                return ageQualifyingCode;
            }

            /**
             * Sets the value of the ageQualifyingCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgeQualifyingCode(String value) {
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

        }

    }

}
