
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Extended_Return_Statement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Extended_Return_Statement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="return_object_declaration_q" type="{}Declaration_Class"/>
 *         &lt;element name="extended_return_statements_ql" type="{}Statement_List"/>
 *         &lt;element name="extended_return_exception_handlers_ql" type="{}Exception_Handler_List"/>
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
@XmlType(name = "Extended_Return_Statement", propOrder = {
    "sloc",
    "returnObjectDeclarationQ",
    "extendedReturnStatementsQl",
    "extendedReturnExceptionHandlersQl"
})
public class ExtendedReturnStatement
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "return_object_declaration_q", required = true)
    protected DeclarationClass returnObjectDeclarationQ;
    @XmlElement(name = "extended_return_statements_ql", required = true)
    protected StatementList extendedReturnStatementsQl;
    @XmlElement(name = "extended_return_exception_handlers_ql", required = true)
    protected ExceptionHandlerList extendedReturnExceptionHandlersQl;
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
     * Gets the value of the returnObjectDeclarationQ property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationClass }
     *     
     */
    public DeclarationClass getReturnObjectDeclarationQ() {
        return returnObjectDeclarationQ;
    }

    /**
     * Sets the value of the returnObjectDeclarationQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationClass }
     *     
     */
    public void setReturnObjectDeclarationQ(DeclarationClass value) {
        this.returnObjectDeclarationQ = value;
    }

    /**
     * Gets the value of the extendedReturnStatementsQl property.
     * 
     * @return
     *     possible object is
     *     {@link StatementList }
     *     
     */
    public StatementList getExtendedReturnStatementsQl() {
        return extendedReturnStatementsQl;
    }

    /**
     * Sets the value of the extendedReturnStatementsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementList }
     *     
     */
    public void setExtendedReturnStatementsQl(StatementList value) {
        this.extendedReturnStatementsQl = value;
    }

    /**
     * Gets the value of the extendedReturnExceptionHandlersQl property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionHandlerList }
     *     
     */
    public ExceptionHandlerList getExtendedReturnExceptionHandlersQl() {
        return extendedReturnExceptionHandlersQl;
    }

    /**
     * Sets the value of the extendedReturnExceptionHandlersQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionHandlerList }
     *     
     */
    public void setExtendedReturnExceptionHandlersQl(ExceptionHandlerList value) {
        this.extendedReturnExceptionHandlersQl = value;
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
