
package com.whitecitycode.aida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Element which gives information about the rate used for each extra service within a rate or a special offer
 * 
 * <p>Java class for RoomExtraServiceRatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomExtraServiceRatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtraService" type="{http://aida.dcsplus.net/ws/2010}ExtraServiceRateReferenceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomExtraServiceRatesType", propOrder = {
    "extraService"
})
public class RoomExtraServiceRatesType {

    @XmlElement(name = "ExtraService", required = true)
    protected List<ExtraServiceRateReferenceType> extraService;

    /**
     * Gets the value of the extraService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraServiceRateReferenceType }
     * 
     * 
     */
    public List<ExtraServiceRateReferenceType> getExtraService() {
        if (extraService == null) {
            extraService = new ArrayList<ExtraServiceRateReferenceType>();
        }
        return this.extraService;
    }

}
