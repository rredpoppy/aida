
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PackageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="holiday"/>
 *     &lt;enumeration value="tour"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackageType")
@XmlEnum
public enum PackageType {

    @XmlEnumValue("holiday")
    HOLIDAY("holiday"),
    @XmlEnumValue("tour")
    TOUR("tour");
    private final String value;

    PackageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PackageType fromValue(String v) {
        for (PackageType c: PackageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
