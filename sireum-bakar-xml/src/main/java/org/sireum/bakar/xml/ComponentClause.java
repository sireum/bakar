
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Component_Clause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Component_Clause">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="representation_clause_name_q" type="{}Name_Class"/>
 *         &lt;element name="component_clause_position_q" type="{}Expression_Class"/>
 *         &lt;element name="component_clause_range_q" type="{}Discrete_Range_Class"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Component_Clause", propOrder = {
    "sloc",
    "representationClauseNameQ",
    "componentClausePositionQ",
    "componentClauseRangeQ"
})
public class ComponentClause
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "representation_clause_name_q", required = true)
    protected NameClass representationClauseNameQ;
    @XmlElement(name = "component_clause_position_q", required = true)
    protected ExpressionClass componentClausePositionQ;
    @XmlElement(name = "component_clause_range_q", required = true)
    protected DiscreteRangeClass componentClauseRangeQ;

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
     * Gets the value of the representationClauseNameQ property.
     * 
     * @return
     *     possible object is
     *     {@link NameClass }
     *     
     */
    public NameClass getRepresentationClauseNameQ() {
        return representationClauseNameQ;
    }

    /**
     * Sets the value of the representationClauseNameQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameClass }
     *     
     */
    public void setRepresentationClauseNameQ(NameClass value) {
        this.representationClauseNameQ = value;
    }

    /**
     * Gets the value of the componentClausePositionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getComponentClausePositionQ() {
        return componentClausePositionQ;
    }

    /**
     * Sets the value of the componentClausePositionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setComponentClausePositionQ(ExpressionClass value) {
        this.componentClausePositionQ = value;
    }

    /**
     * Gets the value of the componentClauseRangeQ property.
     * 
     * @return
     *     possible object is
     *     {@link DiscreteRangeClass }
     *     
     */
    public DiscreteRangeClass getComponentClauseRangeQ() {
        return componentClauseRangeQ;
    }

    /**
     * Sets the value of the componentClauseRangeQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscreteRangeClass }
     *     
     */
    public void setComponentClauseRangeQ(DiscreteRangeClass value) {
        this.componentClauseRangeQ = value;
    }

}
