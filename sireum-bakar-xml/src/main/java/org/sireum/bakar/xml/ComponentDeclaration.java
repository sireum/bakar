
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Component_Declaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Component_Declaration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="names_ql" type="{}Defining_Name_List"/>
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
 *         &lt;element name="object_declaration_view_q" type="{}Definition_Class"/>
 *         &lt;element name="initialization_expression_q" type="{}Expression_Class"/>
 *         &lt;element name="aspect_specifications_ql" type="{}Element_List"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Component_Declaration", propOrder = {
    "sloc",
    "namesQl",
    "hasAliasedQ",
    "objectDeclarationViewQ",
    "initializationExpressionQ",
    "aspectSpecificationsQl"
})
public class ComponentDeclaration
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "names_ql", required = true)
    protected DefiningNameList namesQl;
    @XmlElement(name = "has_aliased_q", required = true)
    protected ComponentDeclaration.HasAliasedQ hasAliasedQ;
    @XmlElement(name = "object_declaration_view_q", required = true)
    protected DefinitionClass objectDeclarationViewQ;
    @XmlElement(name = "initialization_expression_q", required = true)
    protected ExpressionClass initializationExpressionQ;
    @XmlElement(name = "aspect_specifications_ql", required = true)
    protected ElementList aspectSpecificationsQl;

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
     * Gets the value of the namesQl property.
     * 
     * @return
     *     possible object is
     *     {@link DefiningNameList }
     *     
     */
    public DefiningNameList getNamesQl() {
        return namesQl;
    }

    /**
     * Sets the value of the namesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefiningNameList }
     *     
     */
    public void setNamesQl(DefiningNameList value) {
        this.namesQl = value;
    }

    /**
     * Gets the value of the hasAliasedQ property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentDeclaration.HasAliasedQ }
     *     
     */
    public ComponentDeclaration.HasAliasedQ getHasAliasedQ() {
        return hasAliasedQ;
    }

    /**
     * Sets the value of the hasAliasedQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentDeclaration.HasAliasedQ }
     *     
     */
    public void setHasAliasedQ(ComponentDeclaration.HasAliasedQ value) {
        this.hasAliasedQ = value;
    }

    /**
     * Gets the value of the objectDeclarationViewQ property.
     * 
     * @return
     *     possible object is
     *     {@link DefinitionClass }
     *     
     */
    public DefinitionClass getObjectDeclarationViewQ() {
        return objectDeclarationViewQ;
    }

    /**
     * Sets the value of the objectDeclarationViewQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionClass }
     *     
     */
    public void setObjectDeclarationViewQ(DefinitionClass value) {
        this.objectDeclarationViewQ = value;
    }

    /**
     * Gets the value of the initializationExpressionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getInitializationExpressionQ() {
        return initializationExpressionQ;
    }

    /**
     * Sets the value of the initializationExpressionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setInitializationExpressionQ(ExpressionClass value) {
        this.initializationExpressionQ = value;
    }

    /**
     * Gets the value of the aspectSpecificationsQl property.
     * 
     * @return
     *     possible object is
     *     {@link ElementList }
     *     
     */
    public ElementList getAspectSpecificationsQl() {
        return aspectSpecificationsQl;
    }

    /**
     * Sets the value of the aspectSpecificationsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementList }
     *     
     */
    public void setAspectSpecificationsQl(ElementList value) {
        this.aspectSpecificationsQl = value;
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

}
