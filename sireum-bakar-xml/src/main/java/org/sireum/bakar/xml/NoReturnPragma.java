
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for No_Return_Pragma complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="No_Return_Pragma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="pragma_argument_associations_ql" type="{}Association_List"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pragma_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "No_Return_Pragma", propOrder = {
    "sloc",
    "pragmaArgumentAssociationsQl"
})
public class NoReturnPragma
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "pragma_argument_associations_ql", required = true)
    protected AssociationList pragmaArgumentAssociationsQl;
    @XmlAttribute(name = "pragma_name", required = true)
    protected String pragmaName;

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
     * Gets the value of the pragmaArgumentAssociationsQl property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationList }
     *     
     */
    public AssociationList getPragmaArgumentAssociationsQl() {
        return pragmaArgumentAssociationsQl;
    }

    /**
     * Sets the value of the pragmaArgumentAssociationsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationList }
     *     
     */
    public void setPragmaArgumentAssociationsQl(AssociationList value) {
        this.pragmaArgumentAssociationsQl = value;
    }

    /**
     * Gets the value of the pragmaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPragmaName() {
        return pragmaName;
    }

    /**
     * Sets the value of the pragmaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPragmaName(String value) {
        this.pragmaName = value;
    }

}
