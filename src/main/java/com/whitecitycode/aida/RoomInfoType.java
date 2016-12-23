
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies basic details regarding a room: type, feature, category and occupancy.
 * 
 * <p>Java class for RoomInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomType" type="{http://aida.dcsplus.net/ws/2010}RoomElementType"/>
 *         &lt;element name="RoomTypeCategory" type="{http://aida.dcsplus.net/ws/2010}RoomTypeCategoryType"/>
 *         &lt;element name="Feature" type="{http://aida.dcsplus.net/ws/2010}FeatureElementType"/>
 *         &lt;element name="Occupancy" type="{http://aida.dcsplus.net/ws/2010}OccupancyElementType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomInfoType", propOrder = {
    "roomType",
    "roomTypeCategory",
    "feature",
    "occupancy"
})
@XmlSeeAlso({
    RoomInfoWithIdType.class
})
public class RoomInfoType {

    @XmlElement(name = "RoomType", required = true)
    protected RoomElementType roomType;
    @XmlElement(name = "RoomTypeCategory", required = true)
    protected RoomTypeCategoryType roomTypeCategory;
    @XmlElement(name = "Feature", required = true)
    protected FeatureElementType feature;
    @XmlElement(name = "Occupancy", required = true)
    protected OccupancyElementType occupancy;

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
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureElementType }
     *     
     */
    public FeatureElementType getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureElementType }
     *     
     */
    public void setFeature(FeatureElementType value) {
        this.feature = value;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyElementType }
     *     
     */
    public OccupancyElementType getOccupancy() {
        return occupancy;
    }

    /**
     * Sets the value of the occupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyElementType }
     *     
     */
    public void setOccupancy(OccupancyElementType value) {
        this.occupancy = value;
    }

}
