
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Package_Body_Declaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Package_Body_Declaration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="aspect_specifications_ql" type="{}Element_List"/>
 *         &lt;element name="body_declarative_items_ql" type="{}Element_List"/>
 *         &lt;element name="body_statements_ql" type="{}Statement_List"/>
 *         &lt;element name="body_exception_handlers_ql" type="{}Exception_Handler_List"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Package_Body_Declaration", propOrder = {
    "sloc",
    "namesQl",
    "aspectSpecificationsQl",
    "bodyDeclarativeItemsQl",
    "bodyStatementsQl",
    "bodyExceptionHandlersQl"
})
public class PackageBodyDeclaration
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "names_ql", required = true)
    protected DefiningNameList namesQl;
    @XmlElement(name = "aspect_specifications_ql", required = true)
    protected ElementList aspectSpecificationsQl;
    @XmlElement(name = "body_declarative_items_ql", required = true)
    protected ElementList bodyDeclarativeItemsQl;
    @XmlElement(name = "body_statements_ql", required = true)
    protected StatementList bodyStatementsQl;
    @XmlElement(name = "body_exception_handlers_ql", required = true)
    protected ExceptionHandlerList bodyExceptionHandlersQl;

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
     * Gets the value of the namesQl property.
     * 
     * @return
     *     possible object is
     *     {@link DefiningNameList }
     *     
     */
    public DefiningNameList getNamesQl() {
        return namesQl;
    }

    /**
     * Sets the value of the namesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefiningNameList }
     *     
     */
    public void setNamesQl(DefiningNameList value) {
        this.namesQl = value;
    }

    /**
     * Gets the value of the aspectSpecificationsQl property.
     * 
     * @return
     *     possible object is
     *     {@link ElementList }
     *     
     */
    public ElementList getAspectSpecificationsQl() {
        return aspectSpecificationsQl;
    }

    /**
     * Sets the value of the aspectSpecificationsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementList }
     *     
     */
    public void setAspectSpecificationsQl(ElementList value) {
        this.aspectSpecificationsQl = value;
    }

    /**
     * Gets the value of the bodyDeclarativeItemsQl property.
     * 
     * @return
     *     possible object is
     *     {@link ElementList }
     *     
     */
    public ElementList getBodyDeclarativeItemsQl() {
        return bodyDeclarativeItemsQl;
    }

    /**
     * Sets the value of the bodyDeclarativeItemsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementList }
     *     
     */
    public void setBodyDeclarativeItemsQl(ElementList value) {
        this.bodyDeclarativeItemsQl = value;
    }

    /**
     * Gets the value of the bodyStatementsQl property.
     * 
     * @return
     *     possible object is
     *     {@link StatementList }
     *     
     */
    public StatementList getBodyStatementsQl() {
        return bodyStatementsQl;
    }

    /**
     * Sets the value of the bodyStatementsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementList }
     *     
     */
    public void setBodyStatementsQl(StatementList value) {
        this.bodyStatementsQl = value;
    }

    /**
     * Gets the value of the bodyExceptionHandlersQl property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionHandlerList }
     *     
     */
    public ExceptionHandlerList getBodyExceptionHandlersQl() {
        return bodyExceptionHandlersQl;
    }

    /**
     * Sets the value of the bodyExceptionHandlersQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionHandlerList }
     *     
     */
    public void setBodyExceptionHandlersQl(ExceptionHandlerList value) {
        this.bodyExceptionHandlersQl = value;
    }

}
