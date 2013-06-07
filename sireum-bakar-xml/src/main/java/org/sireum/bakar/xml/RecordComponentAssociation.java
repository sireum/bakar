
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Record_Component_Association complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Record_Component_Association">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="record_component_choices_ql" type="{}Expression_List"/>
 *         &lt;element name="component_expression_q" type="{}Expression_Class"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record_Component_Association", propOrder = {
    "sloc",
    "recordComponentChoicesQl",
    "componentExpressionQ"
})
public class RecordComponentAssociation
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "record_component_choices_ql", required = true)
    protected ExpressionList recordComponentChoicesQl;
    @XmlElement(name = "component_expression_q", required = true)
    protected ExpressionClass componentExpressionQ;

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
     * Gets the value of the recordComponentChoicesQl property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionList }
     *     
     */
    public ExpressionList getRecordComponentChoicesQl() {
        return recordComponentChoicesQl;
    }

    /**
     * Sets the value of the recordComponentChoicesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionList }
     *     
     */
    public void setRecordComponentChoicesQl(ExpressionList value) {
        this.recordComponentChoicesQl = value;
    }

    /**
     * Gets the value of the componentExpressionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getComponentExpressionQ() {
        return componentExpressionQ;
    }

    /**
     * Sets the value of the componentExpressionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setComponentExpressionQ(ExpressionClass value) {
        this.componentExpressionQ = value;
    }

}
