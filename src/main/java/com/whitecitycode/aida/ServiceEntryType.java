
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Collection of minimum information required to get access to the service availability details and price rates. The service entry structure depends on the service group.
 * 				Ex: for accommodation, the travel period represents an entry; for transportation group, the departure details represent an entry.
 * 			
 * 
 * <p>Java class for ServiceEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DateRange" type="{http://aida.dcsplus.net/ws/2010}DateTimeRangeType"/>
 *         &lt;element name="Departure" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentLocationType"/>
 *         &lt;element name="ItinerarySegment" type="{http://aida.dcsplus.net/ws/2010}ItinerarySegmentType"/>
 *       &lt;/choice>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DepartureCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceEntryType", propOrder = {
    "date",
    "dateRange",
    "departure",
    "itinerarySegment"
})
public class ServiceEntryType {

    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "DateRange")
    protected DateTimeRangeType dateRange;
    @XmlElement(name = "Departure")
    protected ItinerarySegmentLocationType departure;
    @XmlElement(name = "ItinerarySegment")
    protected ItinerarySegmentType itinerarySegment;
    @XmlAttribute(name = "ID", required = true)
    protected String id;
    @XmlAttribute(name = "DepartureCode")
    protected String departureCode;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRangeType }
     *     
     */
    public DateTimeRangeType getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRangeType }
     *     
     */
    public void setDateRange(DateTimeRangeType value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link ItinerarySegmentLocationType }
     *     
     */
    public ItinerarySegmentLocationType getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinerarySegmentLocationType }
     *     
     */
    public void setDeparture(ItinerarySegmentLocationType value) {
        this.departure = value;
    }

    /**
     * Gets the value of the itinerarySegment property.
     * 
     * @return
     *     possible object is
     *     {@link ItinerarySegmentType }
     *     
     */
    public ItinerarySegmentType getItinerarySegment() {
        return itinerarySegment;
    }

    /**
     * Sets the value of the itinerarySegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinerarySegmentType }
     *     
     */
    public void setItinerarySegment(ItinerarySegmentType value) {
        this.itinerarySegment = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the departureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCode() {
        return departureCode;
    }

    /**
     * Sets the value of the departureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCode(String value) {
        this.departureCode = value;
    }

}
