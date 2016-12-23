
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodesListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CodesListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AccTypes"/>
 *     &lt;enumeration value="AccRoomTypes"/>
 *     &lt;enumeration value="ServiceRoomTypes"/>
 *     &lt;enumeration value="AccCategories"/>
 *     &lt;enumeration value="AccFacilities"/>
 *     &lt;enumeration value="TranspTypes"/>
 *     &lt;enumeration value="SecondServTypes"/>
 *     &lt;enumeration value="TourServTypes"/>
 *     &lt;enumeration value="PackageCategories"/>
 *     &lt;enumeration value="Nationalities"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodesListType")
@XmlEnum
public enum CodesListType {


    /**
     * Requests the list of accommodation types.
     * 
     */
    @XmlEnumValue("AccTypes")
    ACC_TYPES("AccTypes"),

    /**
     * Requests the list of room type categories.
     * 
     */
    @XmlEnumValue("AccRoomTypes")
    ACC_ROOM_TYPES("AccRoomTypes"),

    /**
     * Requests the list of room types for a specific service.
     * 
     */
    @XmlEnumValue("ServiceRoomTypes")
    SERVICE_ROOM_TYPES("ServiceRoomTypes"),

    /**
     * Requests the list of accommodation categories.
     * 
     */
    @XmlEnumValue("AccCategories")
    ACC_CATEGORIES("AccCategories"),

    /**
     * Requests the list of accommodation facilities.
     * 
     */
    @XmlEnumValue("AccFacilities")
    ACC_FACILITIES("AccFacilities"),

    /**
     * Requests the list of transportation types.
     * 
     */
    @XmlEnumValue("TranspTypes")
    TRANSP_TYPES("TranspTypes"),

    /**
     * Requests the list of secondary service types.
     * 
     */
    @XmlEnumValue("SecondServTypes")
    SECOND_SERV_TYPES("SecondServTypes"),

    /**
     * Requests the list of tour service types.
     * 
     */
    @XmlEnumValue("TourServTypes")
    TOUR_SERV_TYPES("TourServTypes"),

    /**
     * Requests the list of package categories.
     * 
     */
    @XmlEnumValue("PackageCategories")
    PACKAGE_CATEGORIES("PackageCategories"),

    /**
     * Requests the list of system nationalities.
     * 
     */
    @XmlEnumValue("Nationalities")
    NATIONALITIES("Nationalities");
    private final String value;

    CodesListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodesListType fromValue(String v) {
        for (CodesListType c: CodesListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
