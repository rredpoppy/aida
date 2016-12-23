
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationStsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservationStsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RQ"/>
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="XX"/>
 *     &lt;enumeration value="AM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReservationStsType")
@XmlEnum
public enum ReservationStsType {


    /**
     * Identifies a reservation in request.
     * 
     */
    RQ,

    /**
     * Identifies a confirmed reservation.
     * 
     */
    OK,

    /**
     * Identifies a cancelled reservation.
     * 
     */
    XX,

    /**
     * Identifies an ammended reservation.
     * 
     */
    AM;

    public String value() {
        return name();
    }

    public static ReservationStsType fromValue(String v) {
        return valueOf(v);
    }

}
