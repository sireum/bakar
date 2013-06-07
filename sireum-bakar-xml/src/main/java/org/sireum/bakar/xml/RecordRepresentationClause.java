
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Record_Representation_Clause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Record_Representation_Clause">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="representation_clause_name_q" type="{}Name_Class"/>
 *         &lt;element name="mod_clause_expression_q" type="{}Expression_Class"/>
 *         &lt;element name="component_clauses_ql" type="{}Component_Clause_List"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record_Representation_Clause", propOrder = {
    "sloc",
    "representationClauseNameQ",
    "modClauseExpressionQ",
    "componentClausesQl"
})
public class RecordRepresentationClause
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "representation_clause_name_q", required = true)
    protected NameClass representationClauseNameQ;
    @XmlElement(name = "mod_clause_expression_q", required = true)
    protected ExpressionClass modClauseExpressionQ;
    @XmlElement(name = "component_clauses_ql", required = true)
    protected ComponentClauseList componentClausesQl;

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
     * Gets the value of the modClauseExpressionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getModClauseExpressionQ() {
        return modClauseExpressionQ;
    }

    /**
     * Sets the value of the modClauseExpressionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setModClauseExpressionQ(ExpressionClass value) {
        this.modClauseExpressionQ = value;
    }

    /**
     * Gets the value of the componentClausesQl property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentClauseList }
     *     
     */
    public ComponentClauseList getComponentClausesQl() {
        return componentClausesQl;
    }

    /**
     * Sets the value of the componentClausesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentClauseList }
     *     
     */
    public void setComponentClausesQl(ComponentClauseList value) {
        this.componentClausesQl = value;
    }

}
