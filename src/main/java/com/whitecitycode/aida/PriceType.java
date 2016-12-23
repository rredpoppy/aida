
package com.whitecitycode.aida;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Includes information about a specific price
 * 
 * <p>Java class for PriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplierPrice" type="{http://aida.dcsplus.net/ws/2010}PriceComponent" minOccurs="0"/>
 *         &lt;element name="Commission" type="{http://aida.dcsplus.net/ws/2010}PriceComponent" minOccurs="0"/>
 *         &lt;element name="Tax" type="{http://aida.dcsplus.net/ws/2010}PriceComponent" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Ammount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="CurrencyCode" use="required" type="{http://aida.dcsplus.net/ws/2010}CurrencyCodeType" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="PriceSetId" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceType", propOrder = {
    "supplierPrice",
    "commission",
    "tax"
})
public class PriceType {

    @XmlElement(name = "SupplierPrice")
    protected PriceComponent supplierPrice;
    @XmlElement(name = "Commission")
    protected PriceComponent commission;
    @XmlElement(name = "Tax")
    protected PriceComponent tax;
    @XmlAttribute(name = "Ammount", required = true)
    protected BigDecimal ammount;
    @XmlAttribute(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger quantity;
    @XmlAttribute(name = "PriceSetId")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger priceSetId;

    /**
     * Gets the value of the supplierPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceComponent }
     *     
     */
    public PriceComponent getSupplierPrice() {
        return supplierPrice;
    }

    /**
     * Sets the value of the supplierPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceComponent }
     *     
     */
    public void setSupplierPrice(PriceComponent value) {
        this.supplierPrice = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link PriceComponent }
     *     
     */
    public PriceComponent getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceComponent }
     *     
     */
    public void setCommission(PriceComponent value) {
        this.commission = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link PriceComponent }
     *     
     */
    public PriceComponent getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceComponent }
     *     
     */
    public void setTax(PriceComponent value) {
        this.tax = value;
    }

    /**
     * Gets the value of the ammount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmmount() {
        return ammount;
    }

    /**
     * Sets the value of the ammount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmmount(BigDecimal value) {
        this.ammount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the priceSetId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriceSetId() {
        return priceSetId;
    }

    /**
     * Sets the value of the priceSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriceSetId(BigInteger value) {
        this.priceSetId = value;
    }

}
