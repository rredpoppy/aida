
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
import javax.xml.bind.annotation.XmlValue;


/**
 * Specific structure describing an accommodation service. It includes details about the localization of service, extensive descriptions etc. All this data is immuable (does not change with booking environment)
 * 
 * <p>Java class for AccommodationServiceElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccommodationServiceElementType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}ServiceElementType">
 *       &lt;sequence>
 *         &lt;element name="Unit" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Category" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="E-mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Localization" type="{http://aida.dcsplus.net/ws/2010}LocalizationType" minOccurs="0"/>
 *         &lt;element name="Descriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ServiceShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ServiceLongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RoomsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DrivingDirections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Attractions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Policies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ammenities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Ammenity" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Gallery" type="{http://aida.dcsplus.net/ws/2010}GalleryType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DurationTimeUnit" type="{http://aida.dcsplus.net/ws/2010}DurationTimeUnitType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationServiceElementType", propOrder = {
    "unit",
    "category",
    "telephone",
    "eMail",
    "localization",
    "descriptions",
    "ammenities",
    "gallery"
})
public class AccommodationServiceElementType
    extends ServiceElementType
{

    @XmlElement(name = "Unit")
    protected AccommodationServiceElementType.Unit unit;
    @XmlElement(name = "Category")
    protected AccommodationServiceElementType.Category category;
    @XmlElement(name = "Telephone")
    protected String telephone;
    @XmlElement(name = "E-mail")
    protected String eMail;
    @XmlElement(name = "Localization")
    protected LocalizationType localization;
    @XmlElement(name = "Descriptions")
    protected AccommodationServiceElementType.Descriptions descriptions;
    @XmlElement(name = "Ammenities")
    protected AccommodationServiceElementType.Ammenities ammenities;
    @XmlElement(name = "Gallery")
    protected GalleryType gallery;
    @XmlAttribute(name = "DurationTimeUnit")
    protected DurationTimeUnitType durationTimeUnit;

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationServiceElementType.Unit }
     *     
     */
    public AccommodationServiceElementType.Unit getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationServiceElementType.Unit }
     *     
     */
    public void setUnit(AccommodationServiceElementType.Unit value) {
        this.unit = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationServiceElementType.Category }
     *     
     */
    public AccommodationServiceElementType.Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationServiceElementType.Category }
     *     
     */
    public void setCategory(AccommodationServiceElementType.Category value) {
        this.category = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the eMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Sets the value of the eMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizationType }
     *     
     */
    public LocalizationType getLocalization() {
        return localization;
    }

    /**
     * Sets the value of the localization property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizationType }
     *     
     */
    public void setLocalization(LocalizationType value) {
        this.localization = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationServiceElementType.Descriptions }
     *     
     */
    public AccommodationServiceElementType.Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationServiceElementType.Descriptions }
     *     
     */
    public void setDescriptions(AccommodationServiceElementType.Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the ammenities property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationServiceElementType.Ammenities }
     *     
     */
    public AccommodationServiceElementType.Ammenities getAmmenities() {
        return ammenities;
    }

    /**
     * Sets the value of the ammenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationServiceElementType.Ammenities }
     *     
     */
    public void setAmmenities(AccommodationServiceElementType.Ammenities value) {
        this.ammenities = value;
    }

    /**
     * Gets the value of the gallery property.
     * 
     * @return
     *     possible object is
     *     {@link GalleryType }
     *     
     */
    public GalleryType getGallery() {
        return gallery;
    }

    /**
     * Sets the value of the gallery property.
     * 
     * @param value
     *     allowed object is
     *     {@link GalleryType }
     *     
     */
    public void setGallery(GalleryType value) {
        this.gallery = value;
    }

    /**
     * Gets the value of the durationTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link DurationTimeUnitType }
     *     
     */
    public DurationTimeUnitType getDurationTimeUnit() {
        return durationTimeUnit;
    }

    /**
     * Sets the value of the durationTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationTimeUnitType }
     *     
     */
    public void setDurationTimeUnit(DurationTimeUnitType value) {
        this.durationTimeUnit = value;
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
     *         &lt;element name="Ammenity" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "ammenity"
    })
    public static class Ammenities {

        @XmlElement(name = "Ammenity", required = true)
        protected List<AccommodationServiceElementType.Ammenities.Ammenity> ammenity;

        /**
         * Gets the value of the ammenity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ammenity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmmenity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccommodationServiceElementType.Ammenities.Ammenity }
         * 
         * 
         */
        public List<AccommodationServiceElementType.Ammenities.Ammenity> getAmmenity() {
            if (ammenity == null) {
                ammenity = new ArrayList<AccommodationServiceElementType.Ammenities.Ammenity>();
            }
            return this.ammenity;
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
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class Ammenity {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Code")
            protected String code;

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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class Category {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Code")
        protected String code;

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
     *         &lt;element name="ServiceShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ServiceLongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="RoomsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DrivingDirections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Attractions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Policies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "serviceShortDescription",
        "serviceLongDescription",
        "roomsDescription",
        "locationDescription",
        "drivingDirections",
        "attractions",
        "policies"
    })
    public static class Descriptions {

        @XmlElement(name = "ServiceShortDescription")
        protected String serviceShortDescription;
        @XmlElement(name = "ServiceLongDescription")
        protected String serviceLongDescription;
        @XmlElement(name = "RoomsDescription")
        protected String roomsDescription;
        @XmlElement(name = "LocationDescription")
        protected String locationDescription;
        @XmlElement(name = "DrivingDirections")
        protected String drivingDirections;
        @XmlElement(name = "Attractions")
        protected String attractions;
        @XmlElement(name = "Policies")
        protected String policies;

        /**
         * Gets the value of the serviceShortDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceShortDescription() {
            return serviceShortDescription;
        }

        /**
         * Sets the value of the serviceShortDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceShortDescription(String value) {
            this.serviceShortDescription = value;
        }

        /**
         * Gets the value of the serviceLongDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceLongDescription() {
            return serviceLongDescription;
        }

        /**
         * Sets the value of the serviceLongDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceLongDescription(String value) {
            this.serviceLongDescription = value;
        }

        /**
         * Gets the value of the roomsDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomsDescription() {
            return roomsDescription;
        }

        /**
         * Sets the value of the roomsDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomsDescription(String value) {
            this.roomsDescription = value;
        }

        /**
         * Gets the value of the locationDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationDescription() {
            return locationDescription;
        }

        /**
         * Sets the value of the locationDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationDescription(String value) {
            this.locationDescription = value;
        }

        /**
         * Gets the value of the drivingDirections property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDrivingDirections() {
            return drivingDirections;
        }

        /**
         * Sets the value of the drivingDirections property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDrivingDirections(String value) {
            this.drivingDirections = value;
        }

        /**
         * Gets the value of the attractions property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttractions() {
            return attractions;
        }

        /**
         * Sets the value of the attractions property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttractions(String value) {
            this.attractions = value;
        }

        /**
         * Gets the value of the policies property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicies() {
            return policies;
        }

        /**
         * Sets the value of the policies property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicies(String value) {
            this.policies = value;
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
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Unit {

        @XmlAttribute(name = "ID", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;

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

    }

}
