
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Derived_Record_Extension_Definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Derived_Record_Extension_Definition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="has_abstract_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="abstract" type="{}Abstract"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *         &lt;element name="parent_subtype_indication_q" type="{}Element_Class"/>
 *         &lt;element name="definition_interface_list_ql" type="{}Expression_List"/>
 *         &lt;element name="record_definition_q" type="{}Definition_Class"/>
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
@XmlType(name = "Derived_Record_Extension_Definition", propOrder = {
    "sloc",
    "hasAbstractQ",
    "hasLimitedQ",
    "parentSubtypeIndicationQ",
    "definitionInterfaceListQl",
    "recordDefinitionQ"
})
public class DerivedRecordExtensionDefinition
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "has_abstract_q", required = true)
    protected DerivedRecordExtensionDefinition.HasAbstractQ hasAbstractQ;
    @XmlElement(name = "has_limited_q", required = true)
    protected DerivedRecordExtensionDefinition.HasLimitedQ hasLimitedQ;
    @XmlElement(name = "parent_subtype_indication_q", required = true)
    protected ElementClass parentSubtypeIndicationQ;
    @XmlElement(name = "definition_interface_list_ql", required = true)
    protected ExpressionList definitionInterfaceListQl;
    @XmlElement(name = "record_definition_q", required = true)
    protected DefinitionClass recordDefinitionQ;
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
     * Gets the value of the hasAbstractQ property.
     * 
     * @return
     *     possible object is
     *     {@link DerivedRecordExtensionDefinition.HasAbstractQ }
     *     
     */
    public DerivedRecordExtensionDefinition.HasAbstractQ getHasAbstractQ() {
        return hasAbstractQ;
    }

    /**
     * Sets the value of the hasAbstractQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivedRecordExtensionDefinition.HasAbstractQ }
     *     
     */
    public void setHasAbstractQ(DerivedRecordExtensionDefinition.HasAbstractQ value) {
        this.hasAbstractQ = value;
    }

    /**
     * Gets the value of the hasLimitedQ property.
     * 
     * @return
     *     possible object is
     *     {@link DerivedRecordExtensionDefinition.HasLimitedQ }
     *     
     */
    public DerivedRecordExtensionDefinition.HasLimitedQ getHasLimitedQ() {
        return hasLimitedQ;
    }

    /**
     * Sets the value of the hasLimitedQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivedRecordExtensionDefinition.HasLimitedQ }
     *     
     */
    public void setHasLimitedQ(DerivedRecordExtensionDefinition.HasLimitedQ value) {
        this.hasLimitedQ = value;
    }

    /**
     * Gets the value of the parentSubtypeIndicationQ property.
     * 
     * @return
     *     possible object is
     *     {@link ElementClass }
     *     
     */
    public ElementClass getParentSubtypeIndicationQ() {
        return parentSubtypeIndicationQ;
    }

    /**
     * Sets the value of the parentSubtypeIndicationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementClass }
     *     
     */
    public void setParentSubtypeIndicationQ(ElementClass value) {
        this.parentSubtypeIndicationQ = value;
    }

    /**
     * Gets the value of the definitionInterfaceListQl property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionList }
     *     
     */
    public ExpressionList getDefinitionInterfaceListQl() {
        return definitionInterfaceListQl;
    }

    /**
     * Sets the value of the definitionInterfaceListQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionList }
     *     
     */
    public void setDefinitionInterfaceListQl(ExpressionList value) {
        this.definitionInterfaceListQl = value;
    }

    /**
     * Gets the value of the recordDefinitionQ property.
     * 
     * @return
     *     possible object is
     *     {@link DefinitionClass }
     *     
     */
    public DefinitionClass getRecordDefinitionQ() {
        return recordDefinitionQ;
    }

    /**
     * Sets the value of the recordDefinitionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionClass }
     *     
     */
    public void setRecordDefinitionQ(DefinitionClass value) {
        this.recordDefinitionQ = value;
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
     *         &lt;element name="abstract" type="{}Abstract"/>
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
        "hasAbstract"
    })
    public static class HasAbstractQ
        extends Base
    {

        @XmlElements({
            @XmlElement(name = "abstract", type = Abstract.class),
            @XmlElement(name = "not_an_element", type = NotAnElement.class)
        })
        protected Base hasAbstract;

        /**
         * Gets the value of the hasAbstract property.
         * 
         * @return
         *     possible object is
         *     {@link Abstract }
         *     {@link NotAnElement }
         *     
         */
        public Base getHasAbstract() {
            return hasAbstract;
        }

        /**
         * Sets the value of the hasAbstract property.
         * 
         * @param value
         *     allowed object is
         *     {@link Abstract }
         *     {@link NotAnElement }
         *     
         */
        public void setHasAbstract(Base value) {
            this.hasAbstract = value;
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

}
