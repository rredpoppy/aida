
package com.whitecitycode.aida;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ReturnURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="CatalogTransferType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="download"/>
 *               &lt;enumeration value="filepush"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GenerationAlertEmails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="10"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "returnURL",
    "catalogTransferType",
    "generationAlertEmails"
})
@XmlRootElement(name = "AIDA_PackCatalogFileRQ")
public class AIDAPackCatalogFileRQ {

    @XmlElement(name = "ReturnURL")
    @XmlSchemaType(name = "anyURI")
    protected String returnURL;
    @XmlElement(name = "CatalogTransferType")
    protected String catalogTransferType;
    @XmlElement(name = "GenerationAlertEmails")
    protected AIDAPackCatalogFileRQ.GenerationAlertEmails generationAlertEmails;

    /**
     * Gets the value of the returnURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnURL() {
        return returnURL;
    }

    /**
     * Sets the value of the returnURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnURL(String value) {
        this.returnURL = value;
    }

    /**
     * Gets the value of the catalogTransferType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogTransferType() {
        return catalogTransferType;
    }

    /**
     * Sets the value of the catalogTransferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogTransferType(String value) {
        this.catalogTransferType = value;
    }

    /**
     * Gets the value of the generationAlertEmails property.
     * 
     * @return
     *     possible object is
     *     {@link AIDAPackCatalogFileRQ.GenerationAlertEmails }
     *     
     */
    public AIDAPackCatalogFileRQ.GenerationAlertEmails getGenerationAlertEmails() {
        return generationAlertEmails;
    }

    /**
     * Sets the value of the generationAlertEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDAPackCatalogFileRQ.GenerationAlertEmails }
     *     
     */
    public void setGenerationAlertEmails(AIDAPackCatalogFileRQ.GenerationAlertEmails value) {
        this.generationAlertEmails = value;
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
     *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="10"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "email"
    })
    public static class GenerationAlertEmails {

        @XmlElement(name = "Email", required = true)
        protected List<String> email;

        /**
         * Gets the value of the email property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the email property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEmail() {
            if (email == null) {
                email = new ArrayList<String>();
            }
            return this.email;
        }

    }

}
