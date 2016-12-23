
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportationDirectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransportationDirectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="inbound"/>
 *     &lt;enumeration value="outbound"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransportationDirectionType")
@XmlEnum
public enum TransportationDirectionType {

    @XmlEnumValue("inbound")
    INBOUND("inbound"),
    @XmlEnumValue("outbound")
    OUTBOUND("outbound");
    private final String value;

    TransportationDirectionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransportationDirectionType fromValue(String v) {
        for (TransportationDirectionType c: TransportationDirectionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
