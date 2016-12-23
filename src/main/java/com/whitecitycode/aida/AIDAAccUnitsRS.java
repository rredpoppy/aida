
package com.whitecitycode.aida;

import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;group ref="{http://aida.dcsplus.net/ws/2010}AccUnitsResultsGroup"/>
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
    "accUnits"
})
@XmlRootElement(name = "AIDA_AccUnitsRS")
public class AIDAAccUnitsRS {

    @XmlElement(name = "Errors")
    protected ErrorsType errors;
    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "Success")
    protected AIDAAccUnitsRS.Success success;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "AccUnits")
    protected AIDAAccUnitsRS.AccUnits accUnits;
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
     *     {@link AIDAAccUnitsRS.Success }
     *     
     */
    public AIDAAccUnitsRS.Success getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccUnitsRS.Success }
     *     
     */
    public void setSuccess(AIDAAccUnitsRS.Success value) {
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
     * Gets the value of the accUnits property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAAccUnitsRS.AccUnits }
     *     
     */
    public AIDAAccUnitsRS.AccUnits getAccUnits() {
        return accUnits;
    }

    /**
     * Sets the value of the accUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAAccUnitsRS.AccUnits }
     *     
     */
    public void setAccUnits(AIDAAccUnitsRS.AccUnits value) {
        this.accUnits = value;
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
     *       &lt;sequence>
     *         &lt;element name="AccUnit" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType"/>
     *                   &lt;element name="Category" type="{http://aida.dcsplus.net/ws/2010}AccCategoryType" minOccurs="0"/>
     *                   &lt;element name="Destination" type="{http://aida.dcsplus.net/ws/2010}LocalizationType"/>
     *                   &lt;element name="Contact" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="E-mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="WebAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Facilities" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Facility" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Descriptions" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FullDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="RoomsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FacilitiesDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="DrivingDirections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="TouristicAttractions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Policies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MealServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ChildrenFacilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="EventFacilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Gallery" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="GalleryImage" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="URL" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                                     &lt;attribute name="MainPicture" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Stars" use="required" type="{http://aida.dcsplus.net/ws/2010}ServiceStarsType" />
     *                 &lt;attribute name="Latitude" type="{http://aida.dcsplus.net/ws/2010}StringLength1to16" />
     *                 &lt;attribute name="Longitude" type="{http://aida.dcsplus.net/ws/2010}StringLength1to16" />
     *                 &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ThemesIDS" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "accUnit"
    })
    public static class AccUnits {

        @XmlElement(name = "AccUnit")
        protected List<AIDAAccUnitsRS.AccUnits.AccUnit> accUnit;

        /**
         * Gets the value of the accUnit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accUnit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccUnit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AIDAAccUnitsRS.AccUnits.AccUnit }
         * 
         * 
         */
        public List<AIDAAccUnitsRS.AccUnits.AccUnit> getAccUnit() {
            if (accUnit == null) {
                accUnit = new ArrayList<AIDAAccUnitsRS.AccUnits.AccUnit>();
            }
            return this.accUnit;
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
         *         &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType"/>
         *         &lt;element name="Category" type="{http://aida.dcsplus.net/ws/2010}AccCategoryType" minOccurs="0"/>
         *         &lt;element name="Destination" type="{http://aida.dcsplus.net/ws/2010}LocalizationType"/>
         *         &lt;element name="Contact" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="E-mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="WebAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Facilities" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Facility" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Descriptions" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FullDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="RoomsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FacilitiesDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="DrivingDirections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="TouristicAttractions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Policies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MealServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ChildrenFacilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="EventFacilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Gallery" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="GalleryImage" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="URL" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *                           &lt;attribute name="MainPicture" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Stars" use="required" type="{http://aida.dcsplus.net/ws/2010}ServiceStarsType" />
         *       &lt;attribute name="Latitude" type="{http://aida.dcsplus.net/ws/2010}StringLength1to16" />
         *       &lt;attribute name="Longitude" type="{http://aida.dcsplus.net/ws/2010}StringLength1to16" />
         *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ThemesIDS" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "type",
            "category",
            "destination",
            "contact",
            "facilities",
            "descriptions",
            "gallery"
        })
        public static class AccUnit {

            @XmlElement(name = "Type", required = true)
            protected ServiceType type;
            @XmlElement(name = "Category")
            protected AccCategoryType category;
            @XmlElement(name = "Destination", required = true)
            protected LocalizationType destination;
            @XmlElement(name = "Contact")
            protected AIDAAccUnitsRS.AccUnits.AccUnit.Contact contact;
            @XmlElement(name = "Facilities")
            protected AIDAAccUnitsRS.AccUnits.AccUnit.Facilities facilities;
            @XmlElement(name = "Descriptions")
            protected AIDAAccUnitsRS.AccUnits.AccUnit.Descriptions descriptions;
            @XmlElement(name = "Gallery")
            protected AIDAAccUnitsRS.AccUnits.AccUnit.Gallery gallery;
            @XmlAttribute(name = "ID", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger id;
            @XmlAttribute(name = "Name", required = true)
            protected String name;
            @XmlAttribute(name = "Stars", required = true)
            protected int stars;
            @XmlAttribute(name = "Latitude")
            protected String latitude;
            @XmlAttribute(name = "Longitude")
            protected String longitude;
            @XmlAttribute(name = "LastUpdated")
            protected String lastUpdated;
            @XmlAttribute(name = "ThemesIDS")
            protected String themesIDS;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link ServiceType }
             *     
             */
            public ServiceType getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceType }
             *     
             */
            public void setType(ServiceType value) {
                this.type = value;
            }

            /**
             * Gets the value of the category property.
             * 
             * @return
             *     possible object is
             *     {@link AccCategoryType }
             *     
             */
            public AccCategoryType getCategory() {
                return category;
            }

            /**
             * Sets the value of the category property.
             * 
             * @param value
             *     allowed object is
             *     {@link AccCategoryType }
             *     
             */
            public void setCategory(AccCategoryType value) {
                this.category = value;
            }

            /**
             * Gets the value of the destination property.
             * 
             * @return
             *     possible object is
             *     {@link LocalizationType }
             *     
             */
            public LocalizationType getDestination() {
                return destination;
            }

            /**
             * Sets the value of the destination property.
             * 
             * @param value
             *     allowed object is
             *     {@link LocalizationType }
             *     
             */
            public void setDestination(LocalizationType value) {
                this.destination = value;
            }

            /**
             * Gets the value of the contact property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAAccUnitsRS.AccUnits.AccUnit.Contact }
             *     
             */
            public AIDAAccUnitsRS.AccUnits.AccUnit.Contact getContact() {
                return contact;
            }

            /**
             * Sets the value of the contact property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAAccUnitsRS.AccUnits.AccUnit.Contact }
             *     
             */
            public void setContact(AIDAAccUnitsRS.AccUnits.AccUnit.Contact value) {
                this.contact = value;
            }

            /**
             * Gets the value of the facilities property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAAccUnitsRS.AccUnits.AccUnit.Facilities }
             *     
             */
            public AIDAAccUnitsRS.AccUnits.AccUnit.Facilities getFacilities() {
                return facilities;
            }

            /**
             * Sets the value of the facilities property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAAccUnitsRS.AccUnits.AccUnit.Facilities }
             *     
             */
            public void setFacilities(AIDAAccUnitsRS.AccUnits.AccUnit.Facilities value) {
                this.facilities = value;
            }

            /**
             * Gets the value of the descriptions property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAAccUnitsRS.AccUnits.AccUnit.Descriptions }
             *     
             */
            public AIDAAccUnitsRS.AccUnits.AccUnit.Descriptions getDescriptions() {
                return descriptions;
            }

            /**
             * Sets the value of the descriptions property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAAccUnitsRS.AccUnits.AccUnit.Descriptions }
             *     
             */
            public void setDescriptions(AIDAAccUnitsRS.AccUnits.AccUnit.Descriptions value) {
                this.descriptions = value;
            }

            /**
             * Gets the value of the gallery property.
             * 
             * @return
             *     possible object is
             *     {@link AIDAAccUnitsRS.AccUnits.AccUnit.Gallery }
             *     
             */
            public AIDAAccUnitsRS.AccUnits.AccUnit.Gallery getGallery() {
                return gallery;
            }

            /**
             * Sets the value of the gallery property.
             * 
             * @param value
             *     allowed object is
             *     {@link AIDAAccUnitsRS.AccUnits.AccUnit.Gallery }
             *     
             */
            public void setGallery(AIDAAccUnitsRS.AccUnits.AccUnit.Gallery value) {
                this.gallery = value;
            }

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
             * Gets the value of the stars property.
             * 
             */
            public int getStars() {
                return stars;
            }

            /**
             * Sets the value of the stars property.
             * 
             */
            public void setStars(int value) {
                this.stars = value;
            }

            /**
             * Gets the value of the latitude property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLatitude() {
                return latitude;
            }

            /**
             * Sets the value of the latitude property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLatitude(String value) {
                this.latitude = value;
            }

            /**
             * Gets the value of the longitude property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLongitude() {
                return longitude;
            }

            /**
             * Sets the value of the longitude property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLongitude(String value) {
                this.longitude = value;
            }

            /**
             * Gets the value of the lastUpdated property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastUpdated() {
                return lastUpdated;
            }

            /**
             * Sets the value of the lastUpdated property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastUpdated(String value) {
                this.lastUpdated = value;
            }

            /**
             * Gets the value of the themesIDS property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getThemesIDS() {
                return themesIDS;
            }

            /**
             * Sets the value of the themesIDS property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setThemesIDS(String value) {
                this.themesIDS = value;
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
             *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="E-mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="WebAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
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
                "telephone",
                "fax",
                "eMail",
                "webAddress"
            })
            public static class Contact {

                @XmlElement(name = "Telephone")
                protected String telephone;
                @XmlElement(name = "Fax")
                protected String fax;
                @XmlElement(name = "E-mail")
                protected String eMail;
                @XmlElement(name = "WebAddress")
                @XmlSchemaType(name = "anyURI")
                protected String webAddress;

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
                 * Gets the value of the fax property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFax() {
                    return fax;
                }

                /**
                 * Sets the value of the fax property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFax(String value) {
                    this.fax = value;
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
                 * Gets the value of the webAddress property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWebAddress() {
                    return webAddress;
                }

                /**
                 * Sets the value of the webAddress property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWebAddress(String value) {
                    this.webAddress = value;
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
             *         &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="FullDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="RoomsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="FacilitiesDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="DrivingDirections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="TouristicAttractions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Policies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MealServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ChildrenFacilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="EventFacilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "shortDescription",
                "fullDescription",
                "roomsDescription",
                "facilitiesDescription",
                "locationDescription",
                "drivingDirections",
                "touristicAttractions",
                "policies",
                "mealServices",
                "childrenFacilities",
                "eventFacilities"
            })
            public static class Descriptions {

                @XmlElement(name = "ShortDescription")
                protected String shortDescription;
                @XmlElement(name = "FullDescription")
                protected String fullDescription;
                @XmlElement(name = "RoomsDescription")
                protected String roomsDescription;
                @XmlElement(name = "FacilitiesDescription")
                protected String facilitiesDescription;
                @XmlElement(name = "LocationDescription")
                protected String locationDescription;
                @XmlElement(name = "DrivingDirections")
                protected String drivingDirections;
                @XmlElement(name = "TouristicAttractions")
                protected String touristicAttractions;
                @XmlElement(name = "Policies")
                protected String policies;
                @XmlElement(name = "MealServices")
                protected String mealServices;
                @XmlElement(name = "ChildrenFacilities")
                protected String childrenFacilities;
                @XmlElement(name = "EventFacilities")
                protected String eventFacilities;

                /**
                 * Gets the value of the shortDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShortDescription() {
                    return shortDescription;
                }

                /**
                 * Sets the value of the shortDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShortDescription(String value) {
                    this.shortDescription = value;
                }

                /**
                 * Gets the value of the fullDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFullDescription() {
                    return fullDescription;
                }

                /**
                 * Sets the value of the fullDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFullDescription(String value) {
                    this.fullDescription = value;
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
                 * Gets the value of the facilitiesDescription property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFacilitiesDescription() {
                    return facilitiesDescription;
                }

                /**
                 * Sets the value of the facilitiesDescription property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFacilitiesDescription(String value) {
                    this.facilitiesDescription = value;
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
                 * Gets the value of the touristicAttractions property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTouristicAttractions() {
                    return touristicAttractions;
                }

                /**
                 * Sets the value of the touristicAttractions property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTouristicAttractions(String value) {
                    this.touristicAttractions = value;
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

                /**
                 * Gets the value of the mealServices property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMealServices() {
                    return mealServices;
                }

                /**
                 * Sets the value of the mealServices property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMealServices(String value) {
                    this.mealServices = value;
                }

                /**
                 * Gets the value of the childrenFacilities property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChildrenFacilities() {
                    return childrenFacilities;
                }

                /**
                 * Sets the value of the childrenFacilities property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChildrenFacilities(String value) {
                    this.childrenFacilities = value;
                }

                /**
                 * Gets the value of the eventFacilities property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEventFacilities() {
                    return eventFacilities;
                }

                /**
                 * Sets the value of the eventFacilities property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEventFacilities(String value) {
                    this.eventFacilities = value;
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
             *         &lt;element name="Facility" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "facility"
            })
            public static class Facilities {

                @XmlElement(name = "Facility", required = true)
                protected List<AIDAAccUnitsRS.AccUnits.AccUnit.Facilities.Facility> facility;

                /**
                 * Gets the value of the facility property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the facility property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFacility().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AIDAAccUnitsRS.AccUnits.AccUnit.Facilities.Facility }
                 * 
                 * 
                 */
                public List<AIDAAccUnitsRS.AccUnits.AccUnit.Facilities.Facility> getFacility() {
                    if (facility == null) {
                        facility = new ArrayList<AIDAAccUnitsRS.AccUnits.AccUnit.Facilities.Facility>();
                    }
                    return this.facility;
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
                 *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class Facility {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Code", required = true)
                    protected String code;
                    @XmlAttribute(name = "Category")
                    protected String category;

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

                    /**
                     * Gets the value of the category property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCategory() {
                        return category;
                    }

                    /**
                     * Sets the value of the category property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCategory(String value) {
                        this.category = value;
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
             *         &lt;element name="GalleryImage" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="URL" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
             *                 &lt;attribute name="MainPicture" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                "galleryImage"
            })
            public static class Gallery {

                @XmlElement(name = "GalleryImage", required = true)
                protected List<AIDAAccUnitsRS.AccUnits.AccUnit.Gallery.GalleryImage> galleryImage;

                /**
                 * Gets the value of the galleryImage property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the galleryImage property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getGalleryImage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AIDAAccUnitsRS.AccUnits.AccUnit.Gallery.GalleryImage }
                 * 
                 * 
                 */
                public List<AIDAAccUnitsRS.AccUnits.AccUnit.Gallery.GalleryImage> getGalleryImage() {
                    if (galleryImage == null) {
                        galleryImage = new ArrayList<AIDAAccUnitsRS.AccUnits.AccUnit.Gallery.GalleryImage>();
                    }
                    return this.galleryImage;
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
                 *       &lt;attribute name="URL" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
                 *       &lt;attribute name="MainPicture" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                public static class GalleryImage {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "URL", required = true)
                    @XmlSchemaType(name = "anyURI")
                    protected String url;
                    @XmlAttribute(name = "MainPicture")
                    protected Boolean mainPicture;

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
                     * Gets the value of the url property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getURL() {
                        return url;
                    }

                    /**
                     * Sets the value of the url property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setURL(String value) {
                        this.url = value;
                    }

                    /**
                     * Gets the value of the mainPicture property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isMainPicture() {
                        return mainPicture;
                    }

                    /**
                     * Sets the value of the mainPicture property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setMainPicture(Boolean value) {
                        this.mainPicture = value;
                    }

                }

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

}
