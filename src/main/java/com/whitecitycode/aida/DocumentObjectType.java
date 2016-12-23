
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentObjectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentObjectType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Project"/>
 *     &lt;enumeration value="Package"/>
 *     &lt;enumeration value="PackageEntry"/>
 *     &lt;enumeration value="Reservation"/>
 *     &lt;enumeration value="ReservationService"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentObjectType")
@XmlEnum
public enum DocumentObjectType {


    /**
     * Requests the list of documents for a project.
     * 
     */
    @XmlEnumValue("Project")
    PROJECT("Project"),

    /**
     * Requests the list of documents for a package.
     * 
     */
    @XmlEnumValue("Package")
    PACKAGE("Package"),

    /**
     * Requests the list of documents for a package entry.
     * 
     */
    @XmlEnumValue("PackageEntry")
    PACKAGE_ENTRY("PackageEntry"),

    /**
     * Requests the list of documents for a reservation.
     * 
     */
    @XmlEnumValue("Reservation")
    RESERVATION("Reservation"),

    /**
     * Requests the list of documents for a reservation service.
     * 
     */
    @XmlEnumValue("ReservationService")
    RESERVATION_SERVICE("ReservationService");
    private final String value;

    DocumentObjectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentObjectType fromValue(String v) {
        for (DocumentObjectType c: DocumentObjectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
