
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
 *         &lt;element name="Username" type="{http://aida.dcsplus.net/ws/2010}StringLength1to64"/>
 *         &lt;element name="Password" type="{http://aida.dcsplus.net/ws/2010}StringLength1to64"/>
 *         &lt;choice>
 *           &lt;element name="ResellerCode" type="{http://aida.dcsplus.net/ws/2010}StringLength1to64"/>
 *           &lt;element name="Distributor">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;attribute name="AgencyCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="AgentUsername" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="System" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Lang" type="{http://aida.dcsplus.net/ws/2010}LanguageType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "username",
    "password",
    "resellerCode",
    "distributor",
    "system"
})
@XmlRootElement(name = "AuthHeader")
public class AuthHeader {

    @XmlElement(name = "Username", required = true)
    protected String username;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "ResellerCode")
    protected String resellerCode;
    @XmlElement(name = "Distributor")
    protected AuthHeader.Distributor distributor;
    @XmlElement(name = "System")
    protected AuthHeader.System system;
    @XmlAttribute(name = "Lang")
    protected LanguageType lang;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the resellerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResellerCode() {
        return resellerCode;
    }

    /**
     * Sets the value of the resellerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResellerCode(String value) {
        this.resellerCode = value;
    }

    /**
     * Gets the value of the distributor property.
     * 
     * @return
     *     possible object is
     *     {@link AuthHeader.Distributor }
     *     
     */
    public AuthHeader.Distributor getDistributor() {
        return distributor;
    }

    /**
     * Sets the value of the distributor property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthHeader.Distributor }
     *     
     */
    public void setDistributor(AuthHeader.Distributor value) {
        this.distributor = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link AuthHeader.System }
     *     
     */
    public AuthHeader.System getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthHeader.System }
     *     
     */
    public void setSystem(AuthHeader.System value) {
        this.system = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setLang(LanguageType value) {
        this.lang = value;
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
     *       &lt;attribute name="AgencyCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AgentUsername" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Distributor {

        @XmlAttribute(name = "AgencyCode", required = true)
        protected String agencyCode;
        @XmlAttribute(name = "AgentUsername")
        protected String agentUsername;

        /**
         * Gets the value of the agencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgencyCode() {
            return agencyCode;
        }

        /**
         * Sets the value of the agencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgencyCode(String value) {
            this.agencyCode = value;
        }

        /**
         * Gets the value of the agentUsername property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentUsername() {
            return agentUsername;
        }

        /**
         * Sets the value of the agentUsername property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentUsername(String value) {
            this.agentUsername = value;
        }

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
     *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class System {

        @XmlAttribute(name = "Name", required = true)
        protected String name;

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

    }

}
