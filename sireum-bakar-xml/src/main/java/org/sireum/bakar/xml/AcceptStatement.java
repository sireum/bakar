
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Accept_Statement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Accept_Statement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="label_names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="accept_entry_direct_name_q" type="{}Name_Class"/>
 *         &lt;element name="accept_entry_index_q" type="{}Expression_Class"/>
 *         &lt;element name="accept_parameters_ql" type="{}Parameter_Specification_List"/>
 *         &lt;element name="accept_body_statements_ql" type="{}Statement_List"/>
 *         &lt;element name="accept_body_exception_handlers_ql" type="{}Statement_List"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Accept_Statement", propOrder = {
    "sloc",
    "labelNamesQl",
    "acceptEntryDirectNameQ",
    "acceptEntryIndexQ",
    "acceptParametersQl",
    "acceptBodyStatementsQl",
    "acceptBodyExceptionHandlersQl"
})
public class AcceptStatement
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "label_names_ql", required = true)
    protected DefiningNameList labelNamesQl;
    @XmlElement(name = "accept_entry_direct_name_q", required = true)
    protected NameClass acceptEntryDirectNameQ;
    @XmlElement(name = "accept_entry_index_q", required = true)
    protected ExpressionClass acceptEntryIndexQ;
    @XmlElement(name = "accept_parameters_ql", required = true)
    protected ParameterSpecificationList acceptParametersQl;
    @XmlElement(name = "accept_body_statements_ql", required = true)
    protected StatementList acceptBodyStatementsQl;
    @XmlElement(name = "accept_body_exception_handlers_ql", required = true)
    protected StatementList acceptBodyExceptionHandlersQl;

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
     * Gets the value of the acceptEntryDirectNameQ property.
     * 
     * @return
     *     possible object is
     *     {@link NameClass }
     *     
     */
    public NameClass getAcceptEntryDirectNameQ() {
        return acceptEntryDirectNameQ;
    }

    /**
     * Sets the value of the acceptEntryDirectNameQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameClass }
     *     
     */
    public void setAcceptEntryDirectNameQ(NameClass value) {
        this.acceptEntryDirectNameQ = value;
    }

    /**
     * Gets the value of the acceptEntryIndexQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getAcceptEntryIndexQ() {
        return acceptEntryIndexQ;
    }

    /**
     * Sets the value of the acceptEntryIndexQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setAcceptEntryIndexQ(ExpressionClass value) {
        this.acceptEntryIndexQ = value;
    }

    /**
     * Gets the value of the acceptParametersQl property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterSpecificationList }
     *     
     */
    public ParameterSpecificationList getAcceptParametersQl() {
        return acceptParametersQl;
    }

    /**
     * Sets the value of the acceptParametersQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterSpecificationList }
     *     
     */
    public void setAcceptParametersQl(ParameterSpecificationList value) {
        this.acceptParametersQl = value;
    }

    /**
     * Gets the value of the acceptBodyStatementsQl property.
     * 
     * @return
     *     possible object is
     *     {@link StatementList }
     *     
     */
    public StatementList getAcceptBodyStatementsQl() {
        return acceptBodyStatementsQl;
    }

    /**
     * Sets the value of the acceptBodyStatementsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementList }
     *     
     */
    public void setAcceptBodyStatementsQl(StatementList value) {
        this.acceptBodyStatementsQl = value;
    }

    /**
     * Gets the value of the acceptBodyExceptionHandlersQl property.
     * 
     * @return
     *     possible object is
     *     {@link StatementList }
     *     
     */
    public StatementList getAcceptBodyExceptionHandlersQl() {
        return acceptBodyExceptionHandlersQl;
    }

    /**
     * Sets the value of the acceptBodyExceptionHandlersQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementList }
     *     
     */
    public void setAcceptBodyExceptionHandlersQl(StatementList value) {
        this.acceptBodyExceptionHandlersQl = value;
    }

}
