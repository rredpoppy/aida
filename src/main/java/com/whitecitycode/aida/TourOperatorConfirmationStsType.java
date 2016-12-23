
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TourOperatorConfirmationStsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TourOperatorConfirmationStsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NC"/>
 *     &lt;enumeration value="CO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TourOperatorConfirmationStsType")
@XmlEnum
public enum TourOperatorConfirmationStsType {


    /**
     * The reservation is not confirmed. The reseller will not be able to generate travel documents. 
     * 
     */
    NC,

    /**
     * The reservation is confirmed. The reseller will be able to generate travel documents if the availability status also allows it. 
     * 
     */
    CO;

    public String value() {
        return name();
    }

    public static TourOperatorConfirmationStsType fromValue(String v) {
        return valueOf(v);
    }

}
