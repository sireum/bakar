
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for With_Clause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="With_Clause">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="has_limited_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="limited" type="{}Limited"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="has_private_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="private" type="{}Private"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="clause_names_ql" type="{}Name_List"/>
 *       &lt;/sequence>
 *       &lt;attribute name="checks" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "With_Clause", propOrder = {
    "sloc",
    "hasLimitedQ",
    "hasPrivateQ",
    "clauseNamesQl"
})
public class WithClause
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "has_limited_q", required = true)
    protected WithClause.HasLimitedQ hasLimitedQ;
    @XmlElement(name = "has_private_q", required = true)
    protected WithClause.HasPrivateQ hasPrivateQ;
    @XmlElement(name = "clause_names_ql", required = true)
    protected NameList clauseNamesQl;
    @XmlAttribute(name = "checks")
    protected String checks;

    /**
     * Gets the value of the sloc property.
     * 
     * @return
     *     possible object is
     *     {@link SourceLocation }
     *     
     */
    public SourceLocation getSloc() {
        return sloc;
    }

    /**
     * Sets the value of the sloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceLocation }
     *     
     */
    public void setSloc(SourceLocation value) {
        this.sloc = value;
    }

    /**
     * Gets the value of the hasLimitedQ property.
     * 
     * @return
     *     possible object is
     *     {@link WithClause.HasLimitedQ }
     *     
     */
    public WithClause.HasLimitedQ getHasLimitedQ() {
        return hasLimitedQ;
    }

    /**
     * Sets the value of the hasLimitedQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithClause.HasLimitedQ }
     *     
     */
    public void setHasLimitedQ(WithClause.HasLimitedQ value) {
        this.hasLimitedQ = value;
    }

    /**
     * Gets the value of the hasPrivateQ property.
     * 
     * @return
     *     possible object is
     *     {@link WithClause.HasPrivateQ }
     *     
     */
    public WithClause.HasPrivateQ getHasPrivateQ() {
        return hasPrivateQ;
    }

    /**
     * Sets the value of the hasPrivateQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithClause.HasPrivateQ }
     *     
     */
    public void setHasPrivateQ(WithClause.HasPrivateQ value) {
        this.hasPrivateQ = value;
    }

    /**
     * Gets the value of the clauseNamesQl property.
     * 
     * @return
     *     possible object is
     *     {@link NameList }
     *     
     */
    public NameList getClauseNamesQl() {
        return clauseNamesQl;
    }

    /**
     * Sets the value of the clauseNamesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameList }
     *     
     */
    public void setClauseNamesQl(NameList value) {
        this.clauseNamesQl = value;
    }

    /**
     * Gets the value of the checks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecks() {
        return checks;
    }

    /**
     * Sets the value of the checks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecks(String value) {
        this.checks = value;
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
     *       &lt;choice>
     *         &lt;element name="limited" type="{}Limited"/>
     *         &lt;element name="not_an_element" type="{}Not_An_Element"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hasLimited"
    })
    public static class HasLimitedQ
        extends Base
    {

        @XmlElements({
            @XmlElement(name = "limited", type = Limited.class),
            @XmlElement(name = "not_an_element", type = NotAnElement.class)
        })
        protected Base hasLimited;

        /**
         * Gets the value of the hasLimited property.
         * 
         * @return
         *     possible object is
         *     {@link Limited }
         *     {@link NotAnElement }
         *     
         */
        public Base getHasLimited() {
            return hasLimited;
        }

        /**
         * Sets the value of the hasLimited property.
         * 
         * @param value
         *     allowed object is
         *     {@link Limited }
         *     {@link NotAnElement }
         *     
         */
        public void setHasLimited(Base value) {
            this.hasLimited = value;
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
     *       &lt;choice>
     *         &lt;element name="private" type="{}Private"/>
     *         &lt;element name="not_an_element" type="{}Not_An_Element"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hasPrivate"
    })
    public static class HasPrivateQ
        extends Base
    {

        @XmlElements({
            @XmlElement(name = "private", type = Private.class),
            @XmlElement(name = "not_an_element", type = NotAnElement.class)
        })
        protected Base hasPrivate;

        /**
         * Gets the value of the hasPrivate property.
         * 
         * @return
         *     possible object is
         *     {@link Private }
         *     {@link NotAnElement }
         *     
         */
        public Base getHasPrivate() {
            return hasPrivate;
        }

        /**
         * Sets the value of the hasPrivate property.
         * 
         * @param value
         *     allowed object is
         *     {@link Private }
         *     {@link NotAnElement }
         *     
         */
        public void setHasPrivate(Base value) {
            this.hasPrivate = value;
        }

    }

}
