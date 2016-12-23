
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgeQualifyingCodeTypeRQ.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgeQualifyingCodeTypeRQ">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="a"/>
 *     &lt;enumeration value="c"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgeQualifyingCodeTypeRQ")
@XmlEnum
public enum AgeQualifyingCodeTypeRQ {


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
    C("c");
    private final String value;

    AgeQualifyingCodeTypeRQ(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgeQualifyingCodeTypeRQ fromValue(String v) {
        for (AgeQualifyingCodeTypeRQ c: AgeQualifyingCodeTypeRQ.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
