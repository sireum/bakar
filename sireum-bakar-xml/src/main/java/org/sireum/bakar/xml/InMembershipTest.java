
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for In_Membership_Test complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="In_Membership_Test">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="membership_test_expression_q" type="{}Expression_Class"/>
 *         &lt;element name="membership_test_choices_ql" type="{}Element_List"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "In_Membership_Test", propOrder = {
    "sloc",
    "membershipTestExpressionQ",
    "membershipTestChoicesQl"
})
public class InMembershipTest
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "membership_test_expression_q", required = true)
    protected ExpressionClass membershipTestExpressionQ;
    @XmlElement(name = "membership_test_choices_ql", required = true)
    protected ElementList membershipTestChoicesQl;
    @XmlAttribute(name = "type", required = true)
    protected String type;

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
     * Gets the value of the membershipTestExpressionQ property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionClass }
     *     
     */
    public ExpressionClass getMembershipTestExpressionQ() {
        return membershipTestExpressionQ;
    }

    /**
     * Sets the value of the membershipTestExpressionQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionClass }
     *     
     */
    public void setMembershipTestExpressionQ(ExpressionClass value) {
        this.membershipTestExpressionQ = value;
    }

    /**
     * Gets the value of the membershipTestChoicesQl property.
     * 
     * @return
     *     possible object is
     *     {@link ElementList }
     *     
     */
    public ElementList getMembershipTestChoicesQl() {
        return membershipTestChoicesQl;
    }

    /**
     * Sets the value of the membershipTestChoicesQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementList }
     *     
     */
    public void setMembershipTestChoicesQl(ElementList value) {
        this.membershipTestChoicesQl = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
