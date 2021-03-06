
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Loop_Statement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Loop_Statement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="label_names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="statement_identifier_q" type="{}Defining_Name_Class"/>
 *         &lt;element name="loop_statements_ql" type="{}Statement_List"/>
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
@XmlType(name = "Loop_Statement", propOrder = {
    "sloc",
    "labelNamesQl",
    "statementIdentifierQ",
    "loopStatementsQl"
})
public class LoopStatement
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "label_names_ql", required = true)
    protected DefiningNameList labelNamesQl;
    @XmlElement(name = "statement_identifier_q", required = true)
    protected DefiningNameClass statementIdentifierQ;
    @XmlElement(name = "loop_statements_ql", required = true)
    protected StatementList loopStatementsQl;
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
     * Gets the value of the labelNamesQl property.
     * 
     * @return
     *     possible object is
     *     {@link DefiningNameList }
     *     
     */
    public DefiningNameList getLabelNamesQl() {
        return labelNamesQl;
    }

    /**
     * Sets the value of the labelNamesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefiningNameList }
     *     
     */
    public void setLabelNamesQl(DefiningNameList value) {
        this.labelNamesQl = value;
    }

    /**
     * Gets the value of the statementIdentifierQ property.
     * 
     * @return
     *     possible object is
     *     {@link DefiningNameClass }
     *     
     */
    public DefiningNameClass getStatementIdentifierQ() {
        return statementIdentifierQ;
    }

    /**
     * Sets the value of the statementIdentifierQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefiningNameClass }
     *     
     */
    public void setStatementIdentifierQ(DefiningNameClass value) {
        this.statementIdentifierQ = value;
    }

    /**
     * Gets the value of the loopStatementsQl property.
     * 
     * @return
     *     possible object is
     *     {@link StatementList }
     *     
     */
    public StatementList getLoopStatementsQl() {
        return loopStatementsQl;
    }

    /**
     * Sets the value of the loopStatementsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementList }
     *     
     */
    public void setLoopStatementsQl(StatementList value) {
        this.loopStatementsQl = value;
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
