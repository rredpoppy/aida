
package com.whitecitycode.aida;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Describes the specific structure of a customer element
 * 
 * <p>Java class for CustomerElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonName" type="{http://aida.dcsplus.net/ws/2010}PersonNameType" minOccurs="0"/>
 *         &lt;element name="IdentificationCard" type="{http://aida.dcsplus.net/ws/2010}IDCardType" minOccurs="0"/>
 *         &lt;element name="Passport" type="{http://aida.dcsplus.net/ws/2010}PassportType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ResCustomerID" type="{http://aida.dcsplus.net/ws/2010}BigIntID" />
 *       &lt;attribute name="CustomerIndex" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="AgeQualifyingCode" type="{http://aida.dcsplus.net/ws/2010}AgeQualifyingCodeWithInfantType" />
 *       &lt;attribute name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PNC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Nationality" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Email" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerElementType", propOrder = {
    "personName",
    "identificationCard",
    "passport",
    "address",
    "country",
    "city"
})
public class CustomerElementType {

    @XmlElement(name = "PersonName")
    protected PersonNameType personName;
    @XmlElement(name = "IdentificationCard")
    protected IDCardType identificationCard;
    @XmlElement(name = "Passport")
    protected PassportType passport;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "City")
    protected String city;
    @XmlAttribute(name = "ResCustomerID")
    protected Long resCustomerID;
    @XmlAttribute(name = "CustomerIndex")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger customerIndex;
    @XmlAttribute(name = "CustomerType")
    protected String customerType;
    @XmlAttribute(name = "Owner")
    protected Boolean owner;
    @XmlAttribute(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlAttribute(name = "AgeQualifyingCode")
    protected AgeQualifyingCodeWithInfantType ageQualifyingCode;
    @XmlAttribute(name = "Gender")
    protected String gender;
    @XmlAttribute(name = "PNC")
    protected String pnc;
    @XmlAttribute(name = "Nationality")
    protected String nationality;
    @XmlAttribute(name = "Telephone")
    protected String telephone;
    @XmlAttribute(name = "Fax")
    protected String fax;
    @XmlAttribute(name = "Email")
    protected String email;

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setPersonName(PersonNameType value) {
        this.personName = value;
    }

    /**
     * Gets the value of the identificationCard property.
     * 
     * @return
     *     possible object is
     *     {@link IDCardType }
     *     
     */
    public IDCardType getIdentificationCard() {
        return identificationCard;
    }

    /**
     * Sets the value of the identificationCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDCardType }
     *     
     */
    public void setIdentificationCard(IDCardType value) {
        this.identificationCard = value;
    }

    /**
     * Gets the value of the passport property.
     * 
     * @return
     *     possible object is
     *     {@link PassportType }
     *     
     */
    public PassportType getPassport() {
        return passport;
    }

    /**
     * Sets the value of the passport property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassportType }
     *     
     */
    public void setPassport(PassportType value) {
        this.passport = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the resCustomerID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResCustomerID() {
        return resCustomerID;
    }

    /**
     * Sets the value of the resCustomerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResCustomerID(Long value) {
        this.resCustomerID = value;
    }

    /**
     * Gets the value of the customerIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerIndex() {
        return customerIndex;
    }

    /**
     * Sets the value of the customerIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerIndex(BigInteger value) {
        this.customerIndex = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwner(Boolean value) {
        this.owner = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the ageQualifyingCode property.
     * 
     * @return
     *     possible object is
     *     {@link AgeQualifyingCodeWithInfantType }
     *     
     */
    public AgeQualifyingCodeWithInfantType getAgeQualifyingCode() {
        return ageQualifyingCode;
    }

    /**
     * Sets the value of the ageQualifyingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgeQualifyingCodeWithInfantType }
     *     
     */
    public void setAgeQualifyingCode(AgeQualifyingCodeWithInfantType value) {
        this.ageQualifyingCode = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the pnc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNC() {
        return pnc;
    }

    /**
     * Sets the value of the pnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNC(String value) {
        this.pnc = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
