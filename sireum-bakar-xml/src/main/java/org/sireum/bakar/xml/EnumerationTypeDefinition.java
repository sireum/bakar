
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Enumeration_Type_Definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Enumeration_Type_Definition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="enumeration_literal_declarations_ql" type="{}Declaration_List"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Enumeration_Type_Definition", propOrder = {
    "sloc",
    "enumerationLiteralDeclarationsQl"
})
public class EnumerationTypeDefinition
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "enumeration_literal_declarations_ql", required = true)
    protected DeclarationList enumerationLiteralDeclarationsQl;

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
     * Gets the value of the enumerationLiteralDeclarationsQl property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationList }
     *     
     */
    public DeclarationList getEnumerationLiteralDeclarationsQl() {
        return enumerationLiteralDeclarationsQl;
    }

    /**
     * Sets the value of the enumerationLiteralDeclarationsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationList }
     *     
     */
    public void setEnumerationLiteralDeclarationsQl(DeclarationList value) {
        this.enumerationLiteralDeclarationsQl = value;
    }

}
