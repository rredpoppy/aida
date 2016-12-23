
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DurationTimeUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DurationTimeUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="day"/>
 *     &lt;enumeration value="night"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DurationTimeUnitType")
@XmlEnum
public enum DurationTimeUnitType {

    @XmlEnumValue("day")
    DAY("day"),
    @XmlEnumValue("night")
    NIGHT("night");
    private final String value;

    DurationTimeUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DurationTimeUnitType fromValue(String v) {
        for (DurationTimeUnitType c: DurationTimeUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
