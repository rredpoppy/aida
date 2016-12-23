
package com.whitecitycode.aida;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="DocumentObject">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Type" use="required" type="{http://aida.dcsplus.net/ws/2010}DocumentObjectType" />
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "documentObject"
})
@XmlRootElement(name = "AIDA_DocumentsListRQ")
public class AIDADocumentsListRQ {

    @XmlElement(name = "DocumentObject", required = true)
    protected AIDADocumentsListRQ.DocumentObject documentObject;

    /**
     * Gets the value of the documentObject property.
     * 
     * @return
     *     possible object is
     *     {@link AIDADocumentsListRQ.DocumentObject }
     *     
     */
    public AIDADocumentsListRQ.DocumentObject getDocumentObject() {
        return documentObject;
    }

    /**
     * Sets the value of the documentObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link AIDADocumentsListRQ.DocumentObject }
     *     
     */
    public void setDocumentObject(AIDADocumentsListRQ.DocumentObject value) {
        this.documentObject = value;
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
     *       &lt;attribute name="Type" use="required" type="{http://aida.dcsplus.net/ws/2010}DocumentObjectType" />
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DocumentObject {

        @XmlAttribute(name = "Type", required = true)
        protected DocumentObjectType type;
        @XmlAttribute(name = "ID", required = true)
        protected String id;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link DocumentObjectType }
         *     
         */
        public DocumentObjectType getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link DocumentObjectType }
         *     
         */
        public void setType(DocumentObjectType value) {
            this.type = value;
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

    }

}
