
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Procedure_Call_Statement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Procedure_Call_Statement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="label_names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="called_name_q" type="{}Expression_Class"/>
 *         &lt;element name="call_statement_parameters_ql" type="{}Association_List"/>
 *         &lt;element name="is_prefix_notation_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="is_prefix_notation" type="{}Is_Prefix_Notation"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Procedure_Call_Statement", propOrder = {
    "sloc",
    "labelNamesQl",
    "calledNameQ",
    "callStatementParametersQl",
    "isPrefixNotationQ"
})
public class ProcedureCallStatement
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "label_names_ql", required = true)
    protected DefiningNameList labelNamesQl;
    @XmlElement(name = "called_name_q", required = true)
    protected ExpressionClass calledNameQ;
    @XmlElement(name = "call_statement_parameters_ql", required = true)
    protected AssociationList callStatementParametersQl;
    @XmlElement(name = "is_prefix_notation_q", required = true)
    protected ProcedureCallStatement.IsPrefixNotationQ isPrefixNotationQ;

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
     * Gets the value of the calledNameQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getCalledNameQ() {
        return calledNameQ;
    }

    /**
     * Sets the value of the calledNameQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setCalledNameQ(ExpressionClass value) {
        this.calledNameQ = value;
    }

    /**
     * Gets the value of the callStatementParametersQl property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationList }
     *     
     */
    public AssociationList getCallStatementParametersQl() {
        return callStatementParametersQl;
    }

    /**
     * Sets the value of the callStatementParametersQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationList }
     *     
     */
    public void setCallStatementParametersQl(AssociationList value) {
        this.callStatementParametersQl = value;
    }

    /**
     * Gets the value of the isPrefixNotationQ property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureCallStatement.IsPrefixNotationQ }
     *     
     */
    public ProcedureCallStatement.IsPrefixNotationQ getIsPrefixNotationQ() {
        return isPrefixNotationQ;
    }

    /**
     * Sets the value of the isPrefixNotationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureCallStatement.IsPrefixNotationQ }
     *     
     */
    public void setIsPrefixNotationQ(ProcedureCallStatement.IsPrefixNotationQ value) {
        this.isPrefixNotationQ = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="is_prefix_notation" type="{}Is_Prefix_Notation"/>
     *         &lt;element name="not_an_element" type="{}Not_An_Element"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "isPrefixNotation"
    })
    public static class IsPrefixNotationQ
        extends Base
    {

        @XmlElements({
            @XmlElement(name = "is_prefix_notation", type = IsPrefixNotation.class),
            @XmlElement(name = "not_an_element", type = NotAnElement.class)
        })
        protected Base isPrefixNotation;

        /**
         * Gets the value of the isPrefixNotation property.
         * 
         * @return
         *     possible object is
         *     {@link IsPrefixNotation }
         *     {@link NotAnElement }
         *     
         */
        public Base getIsPrefixNotation() {
            return isPrefixNotation;
        }

        /**
         * Sets the value of the isPrefixNotation property.
         * 
         * @param value
         *     allowed object is
         *     {@link IsPrefixNotation }
         *     {@link NotAnElement }
         *     
         */
        public void setIsPrefixNotation(Base value) {
            this.isPrefixNotation = value;
        }

    }

}
