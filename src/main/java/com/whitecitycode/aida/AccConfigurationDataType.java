
package com.whitecitycode.aida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccConfigurationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccConfigurationDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}ConfigurationDataType">
 *       &lt;sequence>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccConfigurationDataType", propOrder = {
    "roomStays"
})
public class AccConfigurationDataType
    extends ConfigurationDataType
{

    @XmlElement(name = "RoomStays")
    protected AccConfigurationDataType.RoomStays roomStays;

    /**
     * Gets the value of the roomStays property.
     * 
     * @return
     *     possible object is
     *     {@link AccConfigurationDataType.RoomStays }
     *     
     */
    public AccConfigurationDataType.RoomStays getRoomStays() {
        return roomStays;
    }

    /**
     * Sets the value of the roomStays property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccConfigurationDataType.RoomStays }
     *     
     */
    public void setRoomStays(AccConfigurationDataType.RoomStays value) {
        this.roomStays = value;
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
