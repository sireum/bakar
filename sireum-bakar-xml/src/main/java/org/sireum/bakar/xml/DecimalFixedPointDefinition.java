
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Decimal_Fixed_Point_Definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Decimal_Fixed_Point_Definition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="delta_expression_q" type="{}Expression_Class"/>
 *         &lt;element name="digits_expression_q" type="{}Expression_Class"/>
 *         &lt;element name="real_range_constraint_q" type="{}Range_Constraint_Class"/>
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
@XmlType(name = "Decimal_Fixed_Point_Definition", propOrder = {
    "sloc",
    "deltaExpressionQ",
    "digitsExpressionQ",
    "realRangeConstraintQ"
})
public class DecimalFixedPointDefinition
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "delta_expression_q", required = true)
    protected ExpressionClass deltaExpressionQ;
    @XmlElement(name = "digits_expression_q", required = true)
    protected ExpressionClass digitsExpressionQ;
    @XmlElement(name = "real_range_constraint_q", required = true)
    protected RangeConstraintClass realRangeConstraintQ;
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
     * Gets the value of the deltaExpressionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getDeltaExpressionQ() {
        return deltaExpressionQ;
    }

    /**
     * Sets the value of the deltaExpressionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setDeltaExpressionQ(ExpressionClass value) {
        this.deltaExpressionQ = value;
    }

    /**
     * Gets the value of the digitsExpressionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getDigitsExpressionQ() {
        return digitsExpressionQ;
    }

    /**
     * Sets the value of the digitsExpressionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setDigitsExpressionQ(ExpressionClass value) {
        this.digitsExpressionQ = value;
    }

    /**
     * Gets the value of the realRangeConstraintQ property.
     * 
     * @return
     *     possible object is
     *     {@link RangeConstraintClass }
     *     
     */
    public RangeConstraintClass getRealRangeConstraintQ() {
        return realRangeConstraintQ;
    }

    /**
     * Sets the value of the realRangeConstraintQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeConstraintClass }
     *     
     */
    public void setRealRangeConstraintQ(RangeConstraintClass value) {
        this.realRangeConstraintQ = value;
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
