
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Block_Statement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Block_Statement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="label_names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="statement_identifier_q" type="{}Defining_Name_Class"/>
 *         &lt;element name="block_declarative_items_ql" type="{}Declarative_Item_List"/>
 *         &lt;element name="block_statements_ql" type="{}Statement_List"/>
 *         &lt;element name="block_exception_handlers_ql" type="{}Exception_Handler_List"/>
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
@XmlType(name = "Block_Statement", propOrder = {
    "sloc",
    "labelNamesQl",
    "statementIdentifierQ",
    "blockDeclarativeItemsQl",
    "blockStatementsQl",
    "blockExceptionHandlersQl"
})
public class BlockStatement
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "label_names_ql", required = true)
    protected DefiningNameList labelNamesQl;
    @XmlElement(name = "statement_identifier_q", required = true)
    protected DefiningNameClass statementIdentifierQ;
    @XmlElement(name = "block_declarative_items_ql", required = true)
    protected DeclarativeItemList blockDeclarativeItemsQl;
    @XmlElement(name = "block_statements_ql", required = true)
    protected StatementList blockStatementsQl;
    @XmlElement(name = "block_exception_handlers_ql", required = true)
    protected ExceptionHandlerList blockExceptionHandlersQl;
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
     * Gets the value of the blockDeclarativeItemsQl property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarativeItemList }
     *     
     */
    public DeclarativeItemList getBlockDeclarativeItemsQl() {
        return blockDeclarativeItemsQl;
    }

    /**
     * Sets the value of the blockDeclarativeItemsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarativeItemList }
     *     
     */
    public void setBlockDeclarativeItemsQl(DeclarativeItemList value) {
        this.blockDeclarativeItemsQl = value;
    }

    /**
     * Gets the value of the blockStatementsQl property.
     * 
     * @return
     *     possible object is
     *     {@link StatementList }
     *     
     */
    public StatementList getBlockStatementsQl() {
        return blockStatementsQl;
    }

    /**
     * Sets the value of the blockStatementsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementList }
     *     
     */
    public void setBlockStatementsQl(StatementList value) {
        this.blockStatementsQl = value;
    }

    /**
     * Gets the value of the blockExceptionHandlersQl property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionHandlerList }
     *     
     */
    public ExceptionHandlerList getBlockExceptionHandlersQl() {
        return blockExceptionHandlersQl;
    }

    /**
     * Sets the value of the blockExceptionHandlersQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionHandlerList }
     *     
     */
    public void setBlockExceptionHandlersQl(ExceptionHandlerList value) {
        this.blockExceptionHandlersQl = value;
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
