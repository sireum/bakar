
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Extension_Aggregate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Extension_Aggregate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="extension_aggregate_expression_q" type="{}Expression_Class"/>
 *         &lt;element name="record_component_associations_ql" type="{}Association_List"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="checks" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Extension_Aggregate", propOrder = {
    "sloc",
    "extensionAggregateExpressionQ",
    "recordComponentAssociationsQl"
})
public class ExtensionAggregate
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "extension_aggregate_expression_q", required = true)
    protected ExpressionClass extensionAggregateExpressionQ;
    @XmlElement(name = "record_component_associations_ql", required = true)
    protected AssociationList recordComponentAssociationsQl;
    @XmlAttribute(name = "type", required = true)
    protected String type;
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
     * Gets the value of the extensionAggregateExpressionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getExtensionAggregateExpressionQ() {
        return extensionAggregateExpressionQ;
    }

    /**
     * Sets the value of the extensionAggregateExpressionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setExtensionAggregateExpressionQ(ExpressionClass value) {
        this.extensionAggregateExpressionQ = value;
    }

    /**
     * Gets the value of the recordComponentAssociationsQl property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationList }
     *     
     */
    public AssociationList getRecordComponentAssociationsQl() {
        return recordComponentAssociationsQl;
    }

    /**
     * Sets the value of the recordComponentAssociationsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationList }
     *     
     */
    public void setRecordComponentAssociationsQl(AssociationList value) {
        this.recordComponentAssociationsQl = value;
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
