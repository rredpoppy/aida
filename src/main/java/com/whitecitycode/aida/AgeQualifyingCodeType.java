
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgeQualifyingCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgeQualifyingCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="a"/>
 *     &lt;enumeration value="c"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AgeQualifyingCodeType")
@XmlEnum
public enum AgeQualifyingCodeType {


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

    AgeQualifyingCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgeQualifyingCodeType fromValue(String v) {
        for (AgeQualifyingCodeType c: AgeQualifyingCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
