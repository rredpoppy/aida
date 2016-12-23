
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AvailableStsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AvailableStsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="RQ"/>
 *     &lt;enumeration value="NA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AvailableStsType")
@XmlEnum
public enum AvailableStsType {


    /**
     * Describes an available service.
     * 
     */
    OK,

    /**
     * Indicates that the service is only available on request. 
     * 
     */
    RQ,

    /**
     * Indicates that the service is not available for the selected configuration. 
     * 
     */
    NA;

    public String value() {
        return name();
    }

    public static AvailableStsType fromValue(String v) {
        return valueOf(v);
    }

}
