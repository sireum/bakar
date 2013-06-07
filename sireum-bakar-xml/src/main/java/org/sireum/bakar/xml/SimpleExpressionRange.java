
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Simple_Expression_Range complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Simple_Expression_Range">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="lower_bound_q" type="{}Expression_Class"/>
 *         &lt;element name="upper_bound_q" type="{}Expression_Class"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Simple_Expression_Range", propOrder = {
    "sloc",
    "lowerBoundQ",
    "upperBoundQ"
})
public class SimpleExpressionRange
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "lower_bound_q", required = true)
    protected ExpressionClass lowerBoundQ;
    @XmlElement(name = "upper_bound_q", required = true)
    protected ExpressionClass upperBoundQ;

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
     * Gets the value of the lowerBoundQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getLowerBoundQ() {
        return lowerBoundQ;
    }

    /**
     * Sets the value of the lowerBoundQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setLowerBoundQ(ExpressionClass value) {
        this.lowerBoundQ = value;
    }

    /**
     * Gets the value of the upperBoundQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getUpperBoundQ() {
        return upperBoundQ;
    }

    /**
     * Sets the value of the upperBoundQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setUpperBoundQ(ExpressionClass value) {
        this.upperBoundQ = value;
    }

}
