
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Discrete_Subtype_Indication_As_Subtype_Definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Discrete_Subtype_Indication_As_Subtype_Definition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="subtype_mark_q" type="{}Expression_Class"/>
 *         &lt;element name="subtype_constraint_q" type="{}Constraint_Class"/>
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
@XmlType(name = "Discrete_Subtype_Indication_As_Subtype_Definition", propOrder = {
    "sloc",
    "subtypeMarkQ",
    "subtypeConstraintQ"
})
public class DiscreteSubtypeIndicationAsSubtypeDefinition
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "subtype_mark_q", required = true)
    protected ExpressionClass subtypeMarkQ;
    @XmlElement(name = "subtype_constraint_q", required = true)
    protected ConstraintClass subtypeConstraintQ;
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
     * Gets the value of the subtypeMarkQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getSubtypeMarkQ() {
        return subtypeMarkQ;
    }

    /**
     * Sets the value of the subtypeMarkQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setSubtypeMarkQ(ExpressionClass value) {
        this.subtypeMarkQ = value;
    }

    /**
     * Gets the value of the subtypeConstraintQ property.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintClass }
     *     
     */
    public ConstraintClass getSubtypeConstraintQ() {
        return subtypeConstraintQ;
    }

    /**
     * Sets the value of the subtypeConstraintQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintClass }
     *     
     */
    public void setSubtypeConstraintQ(ConstraintClass value) {
        this.subtypeConstraintQ = value;
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
