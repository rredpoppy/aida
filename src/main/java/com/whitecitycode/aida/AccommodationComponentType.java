
package com.whitecitycode.aida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Specific structure of an accommodation component in a package.
 * 
 * <p>Java class for AccommodationComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccommodationComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Service" type="{http://aida.dcsplus.net/ws/2010}AccommodationServiceElementType"/>
 *         &lt;element name="ServiceEntries" type="{http://aida.dcsplus.net/ws/2010}ServiceEntriesType" minOccurs="0"/>
 *         &lt;element name="RoomStays" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RoomStay" type="{http://aida.dcsplus.net/ws/2010}RoomStayType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ConfigurationData" type="{http://aida.dcsplus.net/ws/2010}AccConfigurationDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationComponentType", propOrder = {
    "service",
    "serviceEntries",
    "roomStays",
    "configurationData"
})
@XmlSeeAlso({
    ResAccommodationComponentType.class
})
public class AccommodationComponentType {

    @XmlElement(name = "Service", required = true)
    protected AccommodationServiceElementType service;
    @XmlElement(name = "ServiceEntries")
    protected ServiceEntriesType serviceEntries;
    @XmlElement(name = "RoomStays")
    protected AccommodationComponentType.RoomStays roomStays;
    @XmlElement(name = "ConfigurationData")
    protected AccConfigurationDataType configurationData;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationServiceElementType }
     *     
     */
    public AccommodationServiceElementType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationServiceElementType }
     *     
     */
    public void setService(AccommodationServiceElementType value) {
        this.service = value;
    }

    /**
     * Gets the value of the serviceEntries property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEntriesType }
     *     
     */
    public ServiceEntriesType getServiceEntries() {
        return serviceEntries;
    }

    /**
     * Sets the value of the serviceEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEntriesType }
     *     
     */
    public void setServiceEntries(ServiceEntriesType value) {
        this.serviceEntries = value;
    }

    /**
     * Gets the value of the roomStays property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationComponentType.RoomStays }
     *     
     */
    public AccommodationComponentType.RoomStays getRoomStays() {
        return roomStays;
    }

    /**
     * Sets the value of the roomStays property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationComponentType.RoomStays }
     *     
     */
    public void setRoomStays(AccommodationComponentType.RoomStays value) {
        this.roomStays = value;
    }

    /**
     * Gets the value of the configurationData property.
     * 
     * @return
     *     possible object is
     *     {@link AccConfigurationDataType }
     *     
     */
    public AccConfigurationDataType getConfigurationData() {
        return configurationData;
    }

    /**
     * Sets the value of the configurationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccConfigurationDataType }
     *     
     */
    public void setConfigurationData(AccConfigurationDataType value) {
        this.configurationData = value;
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
     *         &lt;element name="RoomStay" type="{http://aida.dcsplus.net/ws/2010}RoomStayType" maxOccurs="unbounded"/>
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
        "roomStay"
    })
    public static class RoomStays {

        @XmlElement(name = "RoomStay", required = true)
        protected List<RoomStayType> roomStay;

        /**
         * Gets the value of the roomStay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomStay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomStay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RoomStayType }
         * 
         * 
         */
        public List<RoomStayType> getRoomStay() {
            if (roomStay == null) {
                roomStay = new ArrayList<RoomStayType>();
            }
            return this.roomStay;
        }

    }

}
