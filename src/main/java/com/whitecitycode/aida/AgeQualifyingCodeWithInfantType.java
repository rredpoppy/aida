
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgeQualifyingCodeWithInfantType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgeQualifyingCodeWithInfantType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="a"/>
 *     &lt;enumeration value="c"/>
 *     &lt;enumeration value="i"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgeQualifyingCodeWithInfantType")
@XmlEnum
public enum AgeQualifyingCodeWithInfantType {


    /**
     * Describes an adult. 
     * 
     */
    @XmlEnumValue("a")
    A("a"),

    /**
     * Describes a child. 
     * 
     */
    @XmlEnumValue("c")
    C("c"),

    /**
     * Describes an infant. 
     * 
     */
    @XmlEnumValue("i")
    I("i");
    private final String value;

    AgeQualifyingCodeWithInfantType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgeQualifyingCodeWithInfantType fromValue(String v) {
        for (AgeQualifyingCodeWithInfantType c: AgeQualifyingCodeWithInfantType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
