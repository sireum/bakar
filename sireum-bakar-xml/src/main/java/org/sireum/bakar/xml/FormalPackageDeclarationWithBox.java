
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Formal_Package_Declaration_With_Box complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Formal_Package_Declaration_With_Box">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="generic_unit_name_q" type="{}Expression_Class"/>
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
@XmlType(name = "Formal_Package_Declaration_With_Box", propOrder = {
    "sloc",
    "namesQl",
    "genericUnitNameQ",
    "aspectSpecificationsQl"
})
public class FormalPackageDeclarationWithBox
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "names_ql", required = true)
    protected DefiningNameList namesQl;
    @XmlElement(name = "generic_unit_name_q", required = true)
    protected ExpressionClass genericUnitNameQ;
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
     * Gets the value of the genericUnitNameQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getGenericUnitNameQ() {
        return genericUnitNameQ;
    }

    /**
     * Sets the value of the genericUnitNameQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setGenericUnitNameQ(ExpressionClass value) {
        this.genericUnitNameQ = value;
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

}
