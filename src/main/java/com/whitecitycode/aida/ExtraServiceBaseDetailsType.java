
package com.whitecitycode.aida;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Includes basic information about an extra service or activity. 
 * 
 * <p>Java class for ExtraServiceBaseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtraServiceBaseDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://aida.dcsplus.net/ws/2010}ServiceType"/>
 *         &lt;element name="Destination" type="{http://aida.dcsplus.net/ws/2010}LocalizationType"/>
 *         &lt;element name="Supplier" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DurationTimeUnit" use="required" type="{http://aida.dcsplus.net/ws/2010}DurationTimeUnitType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtraServiceBaseDetailsType", propOrder = {
    "type",
    "destination",
    "supplier",
    "description"
})
@XmlSeeAlso({
    com.whitecitycode.aida.AIDAExtraServicesSearchRS.Services.Service.class,
    com.whitecitycode.aida.AIDAExtraServicesAvailRS.Service.class
})
public class ExtraServiceBaseDetailsType {

    @XmlElement(name = "Type", required = true)
    protected ServiceType type;
    @XmlElement(name = "Destination", required = true)
    protected LocalizationType destination;
    @XmlElement(name = "Supplier")
    protected ExtraServiceBaseDetailsType.Supplier supplier;
    @XmlElement(name = "Description")
    protected String description;
    @XmlAttribute(name = "ID", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger id;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "DurationTimeUnit", required = true)
    protected DurationTimeUnitType durationTimeUnit;

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
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraServiceBaseDetailsType.Supplier }
     *     
     */
    public ExtraServiceBaseDetailsType.Supplier getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraServiceBaseDetailsType.Supplier }
     *     
     */
    public void setSupplier(ExtraServiceBaseDetailsType.Supplier value) {
        this.supplier = value;
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
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
    public static class Supplier {

        @XmlAttribute(name = "ID", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger id;
        @XmlAttribute(name = "Name", required = true)
        protected String name;

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

    }

}
