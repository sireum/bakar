
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subtype_Indication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subtype_Indication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="has_aliased_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="aliased" type="{}Aliased"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="has_null_exclusion_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="null_exclusion" type="{}Null_Exclusion"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="subtype_mark_q" type="{}Expression_Class"/>
 *         &lt;element name="subtype_constraint_q" type="{}Constraint_Class"/>
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
@XmlType(name = "Subtype_Indication", propOrder = {
    "sloc",
    "hasAliasedQ",
    "hasNullExclusionQ",
    "subtypeMarkQ",
    "subtypeConstraintQ"
})
public class SubtypeIndication
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "has_aliased_q", required = true)
    protected SubtypeIndication.HasAliasedQ hasAliasedQ;
    @XmlElement(name = "has_null_exclusion_q", required = true)
    protected SubtypeIndication.HasNullExclusionQ hasNullExclusionQ;
    @XmlElement(name = "subtype_mark_q", required = true)
    protected ExpressionClass subtypeMarkQ;
    @XmlElement(name = "subtype_constraint_q", required = true)
    protected ConstraintClass subtypeConstraintQ;
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
     * Gets the value of the hasAliasedQ property.
     * 
     * @return
     *     possible object is
     *     {@link SubtypeIndication.HasAliasedQ }
     *     
     */
    public SubtypeIndication.HasAliasedQ getHasAliasedQ() {
        return hasAliasedQ;
    }

    /**
     * Sets the value of the hasAliasedQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubtypeIndication.HasAliasedQ }
     *     
     */
    public void setHasAliasedQ(SubtypeIndication.HasAliasedQ value) {
        this.hasAliasedQ = value;
    }

    /**
     * Gets the value of the hasNullExclusionQ property.
     * 
     * @return
     *     possible object is
     *     {@link SubtypeIndication.HasNullExclusionQ }
     *     
     */
    public SubtypeIndication.HasNullExclusionQ getHasNullExclusionQ() {
        return hasNullExclusionQ;
    }

    /**
     * Sets the value of the hasNullExclusionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubtypeIndication.HasNullExclusionQ }
     *     
     */
    public void setHasNullExclusionQ(SubtypeIndication.HasNullExclusionQ value) {
        this.hasNullExclusionQ = value;
    }

    /**
     * Gets the value of the subtypeMarkQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getSubtypeMarkQ() {
        return subtypeMarkQ;
    }

    /**
     * Sets the value of the subtypeMarkQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setSubtypeMarkQ(ExpressionClass value) {
        this.subtypeMarkQ = value;
    }

    /**
     * Gets the value of the subtypeConstraintQ property.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintClass }
     *     
     */
    public ConstraintClass getSubtypeConstraintQ() {
        return subtypeConstraintQ;
    }

    /**
     * Sets the value of the subtypeConstraintQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintClass }
     *     
     */
    public void setSubtypeConstraintQ(ConstraintClass value) {
        this.subtypeConstraintQ = value;
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
     *         &lt;element name="aliased" type="{}Aliased"/>
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
        "hasAliased"
    })
    public static class HasAliasedQ
        extends Base
    {

        @XmlElements({
            @XmlElement(name = "aliased", type = Aliased.class),
            @XmlElement(name = "not_an_element", type = NotAnElement.class)
        })
        protected Base hasAliased;

        /**
         * Gets the value of the hasAliased property.
         * 
         * @return
         *     possible object is
         *     {@link Aliased }
         *     {@link NotAnElement }
         *     
         */
        public Base getHasAliased() {
            return hasAliased;
        }

        /**
         * Sets the value of the hasAliased property.
         * 
         * @param value
         *     allowed object is
         *     {@link Aliased }
         *     {@link NotAnElement }
         *     
         */
        public void setHasAliased(Base value) {
            this.hasAliased = value;
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
     *         &lt;element name="null_exclusion" type="{}Null_Exclusion"/>
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
        "hasNullExclusion"
    })
    public static class HasNullExclusionQ
        extends Base
    {

        @XmlElements({
            @XmlElement(name = "null_exclusion", type = NullExclusion.class),
            @XmlElement(name = "not_an_element", type = NotAnElement.class)
        })
        protected Base hasNullExclusion;

        /**
         * Gets the value of the hasNullExclusion property.
         * 
         * @return
         *     possible object is
         *     {@link NullExclusion }
         *     {@link NotAnElement }
         *     
         */
        public Base getHasNullExclusion() {
            return hasNullExclusion;
        }

        /**
         * Sets the value of the hasNullExclusion property.
         * 
         * @param value
         *     allowed object is
         *     {@link NullExclusion }
         *     {@link NotAnElement }
         *     
         */
        public void setHasNullExclusion(Base value) {
            this.hasNullExclusion = value;
        }

    }

}
