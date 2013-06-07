
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Variant_Part complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Variant_Part">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="discriminant_direct_name_q" type="{}Name_Class"/>
 *         &lt;element name="variants_ql" type="{}Variant_List"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Variant_Part", propOrder = {
    "sloc",
    "discriminantDirectNameQ",
    "variantsQl"
})
public class VariantPart
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "discriminant_direct_name_q", required = true)
    protected NameClass discriminantDirectNameQ;
    @XmlElement(name = "variants_ql", required = true)
    protected VariantList variantsQl;

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
     * Gets the value of the discriminantDirectNameQ property.
     * 
     * @return
     *     possible object is
     *     {@link NameClass }
     *     
     */
    public NameClass getDiscriminantDirectNameQ() {
        return discriminantDirectNameQ;
    }

    /**
     * Sets the value of the discriminantDirectNameQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameClass }
     *     
     */
    public void setDiscriminantDirectNameQ(NameClass value) {
        this.discriminantDirectNameQ = value;
    }

    /**
     * Gets the value of the variantsQl property.
     * 
     * @return
     *     possible object is
     *     {@link VariantList }
     *     
     */
    public VariantList getVariantsQl() {
        return variantsQl;
    }

    /**
     * Sets the value of the variantsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariantList }
     *     
     */
    public void setVariantsQl(VariantList value) {
        this.variantsQl = value;
    }

}
