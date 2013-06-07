
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Known_Discriminant_Part complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Known_Discriminant_Part">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="discriminants_ql" type="{}Discriminant_Specification_List"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Known_Discriminant_Part", propOrder = {
    "sloc",
    "discriminantsQl"
})
public class KnownDiscriminantPart
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "discriminants_ql", required = true)
    protected DiscriminantSpecificationList discriminantsQl;

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
     * Gets the value of the discriminantsQl property.
     * 
     * @return
     *     possible object is
     *     {@link DiscriminantSpecificationList }
     *     
     */
    public DiscriminantSpecificationList getDiscriminantsQl() {
        return discriminantsQl;
    }

    /**
     * Sets the value of the discriminantsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscriminantSpecificationList }
     *     
     */
    public void setDiscriminantsQl(DiscriminantSpecificationList value) {
        this.discriminantsQl = value;
    }

}
