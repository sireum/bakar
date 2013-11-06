
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Private_Type_Declaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Private_Type_Declaration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="discriminant_part_q" type="{}Definition_Class"/>
 *         &lt;element name="type_declaration_view_q" type="{}Definition_Class"/>
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
@XmlType(name = "Private_Type_Declaration", propOrder = {
    "sloc",
    "namesQl",
    "discriminantPartQ",
    "typeDeclarationViewQ",
    "aspectSpecificationsQl"
})
public class PrivateTypeDeclaration
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "names_ql", required = true)
    protected DefiningNameList namesQl;
    @XmlElement(name = "discriminant_part_q", required = true)
    protected DefinitionClass discriminantPartQ;
    @XmlElement(name = "type_declaration_view_q", required = true)
    protected DefinitionClass typeDeclarationViewQ;
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
     * Gets the value of the typeDeclarationViewQ property.
     * 
     * @return
     *     possible object is
     *     {@link DefinitionClass }
     *     
     */
    public DefinitionClass getTypeDeclarationViewQ() {
        return typeDeclarationViewQ;
    }

    /**
     * Sets the value of the typeDeclarationViewQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionClass }
     *     
     */
    public void setTypeDeclarationViewQ(DefinitionClass value) {
        this.typeDeclarationViewQ = value;
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

}
