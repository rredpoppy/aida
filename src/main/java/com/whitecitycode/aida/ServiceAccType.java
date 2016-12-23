
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceAccType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceAccType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="h"/>
 *     &lt;enumeration value="v"/>
 *     &lt;enumeration value="e"/>
 *     &lt;enumeration value="n"/>
 *     &lt;enumeration value="s"/>
 *     &lt;enumeration value="z"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceAccType")
@XmlEnum
public enum ServiceAccType {


    /**
     * Hotel
     * 
     */
    @XmlEnumValue("h")
    H("h"),

    /**
     * Villa
     * 
     */
    @XmlEnumValue("v")
    V("v"),

    /**
     * Pension
     * 
     */
    @XmlEnumValue("e")
    E("e"),

    /**
     * Apartment
     * 
     */
    @XmlEnumValue("n")
    N("n"),

    /**
     * Family suite
     * 
     */
    @XmlEnumValue("s")
    S("s"),

    /**
     * Others
     * 
     */
    @XmlEnumValue("z")
    Z("z");
    private final String value;

    ServiceAccType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceAccType fromValue(String v) {
        for (ServiceAccType c: ServiceAccType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
