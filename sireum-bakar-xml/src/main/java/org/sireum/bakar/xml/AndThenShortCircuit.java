
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for And_Then_Short_Circuit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="And_Then_Short_Circuit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="short_circuit_operation_left_expression_q" type="{}Expression_Class"/>
 *         &lt;element name="short_circuit_operation_right_expression_q" type="{}Expression_Class"/>
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
@XmlType(name = "And_Then_Short_Circuit", propOrder = {
    "sloc",
    "shortCircuitOperationLeftExpressionQ",
    "shortCircuitOperationRightExpressionQ"
})
public class AndThenShortCircuit
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "short_circuit_operation_left_expression_q", required = true)
    protected ExpressionClass shortCircuitOperationLeftExpressionQ;
    @XmlElement(name = "short_circuit_operation_right_expression_q", required = true)
    protected ExpressionClass shortCircuitOperationRightExpressionQ;
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
     * Gets the value of the shortCircuitOperationLeftExpressionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getShortCircuitOperationLeftExpressionQ() {
        return shortCircuitOperationLeftExpressionQ;
    }

    /**
     * Sets the value of the shortCircuitOperationLeftExpressionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setShortCircuitOperationLeftExpressionQ(ExpressionClass value) {
        this.shortCircuitOperationLeftExpressionQ = value;
    }

    /**
     * Gets the value of the shortCircuitOperationRightExpressionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getShortCircuitOperationRightExpressionQ() {
        return shortCircuitOperationRightExpressionQ;
    }

    /**
     * Sets the value of the shortCircuitOperationRightExpressionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setShortCircuitOperationRightExpressionQ(ExpressionClass value) {
        this.shortCircuitOperationRightExpressionQ = value;
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
