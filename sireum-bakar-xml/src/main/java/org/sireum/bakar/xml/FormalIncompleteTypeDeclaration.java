
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Formal_Incomplete_Type_Declaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Formal_Incomplete_Type_Declaration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="discriminant_part_q" type="{}Definition_Class"/>
 *         &lt;element name="has_tagged_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="tagged" type="{}Tagged"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="aspect_specifications_ql" type="{}Element_List"/>
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
@XmlType(name = "Formal_Incomplete_Type_Declaration", propOrder = {
    "sloc",
    "namesQl",
    "discriminantPartQ",
    "hasTaggedQ",
    "aspectSpecificationsQl"
})
public class FormalIncompleteTypeDeclaration
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "names_ql", required = true)
    protected DefiningNameList namesQl;
    @XmlElement(name = "discriminant_part_q", required = true)
    protected DefinitionClass discriminantPartQ;
    @XmlElement(name = "has_tagged_q", required = true)
    protected FormalIncompleteTypeDeclaration.HasTaggedQ hasTaggedQ;
    @XmlElement(name = "aspect_specifications_ql", required = true)
    protected ElementList aspectSpecificationsQl;
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
     * Gets the value of the discriminantPartQ property.
     * 
     * @return
     *     possible object is
     *     {@link DefinitionClass }
     *     
     */
    public DefinitionClass getDiscriminantPartQ() {
        return discriminantPartQ;
    }

    /**
     * Sets the value of the discriminantPartQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionClass }
     *     
     */
    public void setDiscriminantPartQ(DefinitionClass value) {
        this.discriminantPartQ = value;
    }

    /**
     * Gets the value of the hasTaggedQ property.
     * 
     * @return
     *     possible object is
     *     {@link FormalIncompleteTypeDeclaration.HasTaggedQ }
     *     
     */
    public FormalIncompleteTypeDeclaration.HasTaggedQ getHasTaggedQ() {
        return hasTaggedQ;
    }

    /**
     * Sets the value of the hasTaggedQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormalIncompleteTypeDeclaration.HasTaggedQ }
     *     
     */
    public void setHasTaggedQ(FormalIncompleteTypeDeclaration.HasTaggedQ value) {
        this.hasTaggedQ = value;
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
     *         &lt;element name="tagged" type="{}Tagged"/>
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
        "hasTagged"
    })
    public static class HasTaggedQ
        extends Base
    {

        @XmlElements({
            @XmlElement(name = "tagged", type = Tagged.class),
            @XmlElement(name = "not_an_element", type = NotAnElement.class)
        })
        protected Base hasTagged;

        /**
         * Gets the value of the hasTagged property.
         * 
         * @return
         *     possible object is
         *     {@link Tagged }
         *     {@link NotAnElement }
         *     
         */
        public Base getHasTagged() {
            return hasTagged;
        }

        /**
         * Sets the value of the hasTagged property.
         * 
         * @param value
         *     allowed object is
         *     {@link Tagged }
         *     {@link NotAnElement }
         *     
         */
        public void setHasTagged(Base value) {
            this.hasTagged = value;
        }

    }

}
