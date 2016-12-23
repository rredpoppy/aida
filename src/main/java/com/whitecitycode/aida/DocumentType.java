
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Voucher"/>
 *     &lt;enumeration value="ReservationDetails"/>
 *     &lt;enumeration value="PackageDocument"/>
 *     &lt;enumeration value="PackageEntryDocument"/>
 *     &lt;enumeration value="ProjectDocument"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentType")
@XmlEnum
public enum DocumentType {


    /**
     * Identifies an operational document specific of the reservation service, asserting the fact that the customers actually purchased the service. 
     * 
     */
    @XmlEnumValue("Voucher")
    VOUCHER("Voucher"),

    /**
     * Identifies a descriptive document including all information there is about a reservation.
     * 
     */
    @XmlEnumValue("ReservationDetails")
    RESERVATION_DETAILS("ReservationDetails"),

    /**
     * Identifies a descriptive document including various information about a package.
     * 
     */
    @XmlEnumValue("PackageDocument")
    PACKAGE_DOCUMENT("PackageDocument"),

    /**
     * Identifies a descriptive document including various information about a package entry.
     * 
     */
    @XmlEnumValue("PackageEntryDocument")
    PACKAGE_ENTRY_DOCUMENT("PackageEntryDocument"),

    /**
     * Identifies a descriptive document including various information about a project.
     * 
     */
    @XmlEnumValue("ProjectDocument")
    PROJECT_DOCUMENT("ProjectDocument");
    private final String value;

    DocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentType fromValue(String v) {
        for (DocumentType c: DocumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
