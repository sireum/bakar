
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Exception_Handler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Exception_Handler">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="choice_parameter_specification_q" type="{}Declaration_Class"/>
 *         &lt;element name="exception_choices_ql" type="{}Element_List"/>
 *         &lt;element name="handler_statements_ql" type="{}Statement_List"/>
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
@XmlType(name = "Exception_Handler", propOrder = {
    "sloc",
    "choiceParameterSpecificationQ",
    "exceptionChoicesQl",
    "handlerStatementsQl"
})
public class ExceptionHandler
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "choice_parameter_specification_q", required = true)
    protected DeclarationClass choiceParameterSpecificationQ;
    @XmlElement(name = "exception_choices_ql", required = true)
    protected ElementList exceptionChoicesQl;
    @XmlElement(name = "handler_statements_ql", required = true)
    protected StatementList handlerStatementsQl;
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
     * Gets the value of the choiceParameterSpecificationQ property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationClass }
     *     
     */
    public DeclarationClass getChoiceParameterSpecificationQ() {
        return choiceParameterSpecificationQ;
    }

    /**
     * Sets the value of the choiceParameterSpecificationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationClass }
     *     
     */
    public void setChoiceParameterSpecificationQ(DeclarationClass value) {
        this.choiceParameterSpecificationQ = value;
    }

    /**
     * Gets the value of the exceptionChoicesQl property.
     * 
     * @return
     *     possible object is
     *     {@link ElementList }
     *     
     */
    public ElementList getExceptionChoicesQl() {
        return exceptionChoicesQl;
    }

    /**
     * Sets the value of the exceptionChoicesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementList }
     *     
     */
    public void setExceptionChoicesQl(ElementList value) {
        this.exceptionChoicesQl = value;
    }

    /**
     * Gets the value of the handlerStatementsQl property.
     * 
     * @return
     *     possible object is
     *     {@link StatementList }
     *     
     */
    public StatementList getHandlerStatementsQl() {
        return handlerStatementsQl;
    }

    /**
     * Sets the value of the handlerStatementsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementList }
     *     
     */
    public void setHandlerStatementsQl(StatementList value) {
        this.handlerStatementsQl = value;
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
