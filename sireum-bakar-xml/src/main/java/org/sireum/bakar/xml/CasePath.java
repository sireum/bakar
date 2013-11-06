
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Case_Path complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Case_Path">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="case_path_alternative_choices_ql" type="{}Element_List"/>
 *         &lt;element name="sequence_of_statements_ql" type="{}Statement_List"/>
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
@XmlType(name = "Case_Path", propOrder = {
    "sloc",
    "casePathAlternativeChoicesQl",
    "sequenceOfStatementsQl"
})
public class CasePath
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "case_path_alternative_choices_ql", required = true)
    protected ElementList casePathAlternativeChoicesQl;
    @XmlElement(name = "sequence_of_statements_ql", required = true)
    protected StatementList sequenceOfStatementsQl;
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
     * Gets the value of the casePathAlternativeChoicesQl property.
     * 
     * @return
     *     possible object is
     *     {@link ElementList }
     *     
     */
    public ElementList getCasePathAlternativeChoicesQl() {
        return casePathAlternativeChoicesQl;
    }

    /**
     * Sets the value of the casePathAlternativeChoicesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementList }
     *     
     */
    public void setCasePathAlternativeChoicesQl(ElementList value) {
        this.casePathAlternativeChoicesQl = value;
    }

    /**
     * Gets the value of the sequenceOfStatementsQl property.
     * 
     * @return
     *     possible object is
     *     {@link StatementList }
     *     
     */
    public StatementList getSequenceOfStatementsQl() {
        return sequenceOfStatementsQl;
    }

    /**
     * Sets the value of the sequenceOfStatementsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementList }
     *     
     */
    public void setSequenceOfStatementsQl(StatementList value) {
        this.sequenceOfStatementsQl = value;
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
