
package com.whitecitycode.aida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Collection of service entries
 * 
 * <p>Java class for ServiceEntriesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceEntriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceEntry" type="{http://aida.dcsplus.net/ws/2010}ServiceEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MultipleEntries" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FlexibleEntryPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceEntriesType", propOrder = {
    "serviceEntry"
})
public class ServiceEntriesType {

    @XmlElement(name = "ServiceEntry")
    protected List<ServiceEntryType> serviceEntry;
    @XmlAttribute(name = "MultipleEntries")
    protected Boolean multipleEntries;
    @XmlAttribute(name = "FlexibleEntryPeriod")
    protected Boolean flexibleEntryPeriod;

    /**
     * Gets the value of the serviceEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceEntryType }
     * 
     * 
     */
    public List<ServiceEntryType> getServiceEntry() {
        if (serviceEntry == null) {
            serviceEntry = new ArrayList<ServiceEntryType>();
        }
        return this.serviceEntry;
    }

    /**
     * Gets the value of the multipleEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleEntries() {
        return multipleEntries;
    }

    /**
     * Sets the value of the multipleEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleEntries(Boolean value) {
        this.multipleEntries = value;
    }

    /**
     * Gets the value of the flexibleEntryPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlexibleEntryPeriod() {
        return flexibleEntryPeriod;
    }

    /**
     * Sets the value of the flexibleEntryPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlexibleEntryPeriod(Boolean value) {
        this.flexibleEntryPeriod = value;
    }

}
