
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferLocationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferLocationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accommodation"/>
 *     &lt;enumeration value="airport"/>
 *     &lt;enumeration value="station"/>
 *     &lt;enumeration value="port"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransferLocationType")
@XmlEnum
public enum TransferLocationType {


    /**
     * The location type represents an accommodation.
     * 
     */
    @XmlEnumValue("accommodation")
    ACCOMMODATION("accommodation"),

    /**
     * The location type represents an airport.
     * 
     */
    @XmlEnumValue("airport")
    AIRPORT("airport"),

    /**
     * The location type represents a station.
     * 
     */
    @XmlEnumValue("station")
    STATION("station"),

    /**
     * The location type represents a port.
     * 
     */
    @XmlEnumValue("port")
    PORT("port"),

    /**
     * The location type represents any other type of location.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    TransferLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferLocationType fromValue(String v) {
        for (TransferLocationType c: TransferLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
