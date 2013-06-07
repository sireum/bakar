
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for First_Attribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="First_Attribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="prefix_q" type="{}Expression_Class"/>
 *         &lt;element name="attribute_designator_identifier_q" type="{}Expression_Class"/>
 *         &lt;element name="attribute_designator_expressions_ql" type="{}Expression_List"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "First_Attribute", propOrder = {
    "sloc",
    "prefixQ",
    "attributeDesignatorIdentifierQ",
    "attributeDesignatorExpressionsQl"
})
public class FirstAttribute
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "prefix_q", required = true)
    protected ExpressionClass prefixQ;
    @XmlElement(name = "attribute_designator_identifier_q", required = true)
    protected ExpressionClass attributeDesignatorIdentifierQ;
    @XmlElement(name = "attribute_designator_expressions_ql", required = true)
    protected ExpressionList attributeDesignatorExpressionsQl;
    @XmlAttribute(name = "type", required = true)
    protected String type;

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
     * Gets the value of the prefixQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getPrefixQ() {
        return prefixQ;
    }

    /**
     * Sets the value of the prefixQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setPrefixQ(ExpressionClass value) {
        this.prefixQ = value;
    }

    /**
     * Gets the value of the attributeDesignatorIdentifierQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getAttributeDesignatorIdentifierQ() {
        return attributeDesignatorIdentifierQ;
    }

    /**
     * Sets the value of the attributeDesignatorIdentifierQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setAttributeDesignatorIdentifierQ(ExpressionClass value) {
        this.attributeDesignatorIdentifierQ = value;
    }

    /**
     * Gets the value of the attributeDesignatorExpressionsQl property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionList }
     *     
     */
    public ExpressionList getAttributeDesignatorExpressionsQl() {
        return attributeDesignatorExpressionsQl;
    }

    /**
     * Sets the value of the attributeDesignatorExpressionsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionList }
     *     
     */
    public void setAttributeDesignatorExpressionsQl(ExpressionList value) {
        this.attributeDesignatorExpressionsQl = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
