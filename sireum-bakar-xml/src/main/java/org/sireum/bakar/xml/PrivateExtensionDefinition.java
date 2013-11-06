
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Private_Extension_Definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Private_Extension_Definition">
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
 *         &lt;element name="has_synchronized_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="synchronized" type="{}Synchronized"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ancestor_subtype_indication_q" type="{}Element_Class"/>
 *         &lt;element name="definition_interface_list_ql" type="{}Expression_List"/>
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
@XmlType(name = "Private_Extension_Definition", propOrder = {
    "sloc",
    "hasAbstractQ",
    "hasLimitedQ",
    "hasSynchronizedQ",
    "ancestorSubtypeIndicationQ",
    "definitionInterfaceListQl"
})
public class PrivateExtensionDefinition
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "has_abstract_q", required = true)
    protected PrivateExtensionDefinition.HasAbstractQ hasAbstractQ;
    @XmlElement(name = "has_limited_q", required = true)
    protected PrivateExtensionDefinition.HasLimitedQ hasLimitedQ;
    @XmlElement(name = "has_synchronized_q", required = true)
    protected PrivateExtensionDefinition.HasSynchronizedQ hasSynchronizedQ;
    @XmlElement(name = "ancestor_subtype_indication_q", required = true)
    protected ElementClass ancestorSubtypeIndicationQ;
    @XmlElement(name = "definition_interface_list_ql", required = true)
    protected ExpressionList definitionInterfaceListQl;
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
     *     {@link PrivateExtensionDefinition.HasAbstractQ }
     *     
     */
    public PrivateExtensionDefinition.HasAbstractQ getHasAbstractQ() {
        return hasAbstractQ;
    }

    /**
     * Sets the value of the hasAbstractQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateExtensionDefinition.HasAbstractQ }
     *     
     */
    public void setHasAbstractQ(PrivateExtensionDefinition.HasAbstractQ value) {
        this.hasAbstractQ = value;
    }

    /**
     * Gets the value of the hasLimitedQ property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateExtensionDefinition.HasLimitedQ }
     *     
     */
    public PrivateExtensionDefinition.HasLimitedQ getHasLimitedQ() {
        return hasLimitedQ;
    }

    /**
     * Sets the value of the hasLimitedQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateExtensionDefinition.HasLimitedQ }
     *     
     */
    public void setHasLimitedQ(PrivateExtensionDefinition.HasLimitedQ value) {
        this.hasLimitedQ = value;
    }

    /**
     * Gets the value of the hasSynchronizedQ property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateExtensionDefinition.HasSynchronizedQ }
     *     
     */
    public PrivateExtensionDefinition.HasSynchronizedQ getHasSynchronizedQ() {
        return hasSynchronizedQ;
    }

    /**
     * Sets the value of the hasSynchronizedQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateExtensionDefinition.HasSynchronizedQ }
     *     
     */
    public void setHasSynchronizedQ(PrivateExtensionDefinition.HasSynchronizedQ value) {
        this.hasSynchronizedQ = value;
    }

    /**
     * Gets the value of the ancestorSubtypeIndicationQ property.
     * 
     * @return
     *     possible object is
     *     {@link ElementClass }
     *     
     */
    public ElementClass getAncestorSubtypeIndicationQ() {
        return ancestorSubtypeIndicationQ;
    }

    /**
     * Sets the value of the ancestorSubtypeIndicationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementClass }
     *     
     */
    public void setAncestorSubtypeIndicationQ(ElementClass value) {
        this.ancestorSubtypeIndicationQ = value;
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
     *         &lt;element name="synchronized" type="{}Synchronized"/>
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
        "hasSynchronized"
    })
    public static class HasSynchronizedQ
        extends Base
    {

        @XmlElements({
            @XmlElement(name = "synchronized", type = Synchronized.class),
            @XmlElement(name = "not_an_element", type = NotAnElement.class)
        })
        protected Base hasSynchronized;

        /**
         * Gets the value of the hasSynchronized property.
         * 
         * @return
         *     possible object is
         *     {@link Synchronized }
         *     {@link NotAnElement }
         *     
         */
        public Base getHasSynchronized() {
            return hasSynchronized;
        }

        /**
         * Sets the value of the hasSynchronized property.
         * 
         * @param value
         *     allowed object is
         *     {@link Synchronized }
         *     {@link NotAnElement }
         *     
         */
        public void setHasSynchronized(Base value) {
            this.hasSynchronized = value;
        }

    }

}
