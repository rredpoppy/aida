
package com.whitecitycode.aida;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information regarding a supplement: name, unit price and details that help to determine the total price of the supplement. The currency of the supplement is the same with the service currency. 
 * 
 * <p>Java class for SupplementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplementType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://aida.dcsplus.net/ws/2010}SupplementIDType">
 *       &lt;sequence>
 *         &lt;element name="Price">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *                 &lt;attribute name="UnitAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="PaxMultiplier" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="person"/>
 *                       &lt;enumeration value="group"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="DateMultiplier" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="date"/>
 *                       &lt;enumeration value="period"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementType", propOrder = {
    "price"
})
public class SupplementType
    extends SupplementIDType
{

    @XmlElement(name = "Price", required = true)
    protected SupplementType.Price price;
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementType.Price }
     *     
     */
    public SupplementType.Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementType.Price }
     *     
     */
    public void setPrice(SupplementType.Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *       &lt;/sequence>
     *       &lt;attribute name="UnitAmount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="PaxMultiplier" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="person"/>
     *             &lt;enumeration value="group"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="DateMultiplier" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="date"/>
     *             &lt;enumeration value="period"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Price {

        @XmlAttribute(name = "UnitAmount", required = true)
        protected BigDecimal unitAmount;
        @XmlAttribute(name = "PaxMultiplier", required = true)
        protected String paxMultiplier;
        @XmlAttribute(name = "DateMultiplier", required = true)
        protected String dateMultiplier;

        /**
         * Gets the value of the unitAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitAmount() {
            return unitAmount;
        }

        /**
         * Sets the value of the unitAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitAmount(BigDecimal value) {
            this.unitAmount = value;
        }

        /**
         * Gets the value of the paxMultiplier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaxMultiplier() {
            return paxMultiplier;
        }

        /**
         * Sets the value of the paxMultiplier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaxMultiplier(String value) {
            this.paxMultiplier = value;
        }

        /**
         * Gets the value of the dateMultiplier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateMultiplier() {
            return dateMultiplier;
        }

        /**
         * Sets the value of the dateMultiplier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateMultiplier(String value) {
            this.dateMultiplier = value;
        }

    }

}
