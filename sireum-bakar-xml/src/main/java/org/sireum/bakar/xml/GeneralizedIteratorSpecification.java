
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Generalized_Iterator_Specification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Generalized_Iterator_Specification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="names_ql" type="{}Defining_Name_List"/>
 *         &lt;element name="has_reverse_q">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="reverse" type="{}Reverse"/>
 *                   &lt;element name="not_an_element" type="{}Not_An_Element"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="iteration_scheme_name_q" type="{}Element_Class"/>
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
@XmlType(name = "Generalized_Iterator_Specification", propOrder = {
    "sloc",
    "namesQl",
    "hasReverseQ",
    "iterationSchemeNameQ"
})
public class GeneralizedIteratorSpecification
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "names_ql", required = true)
    protected DefiningNameList namesQl;
    @XmlElement(name = "has_reverse_q", required = true)
    protected GeneralizedIteratorSpecification.HasReverseQ hasReverseQ;
    @XmlElement(name = "iteration_scheme_name_q", required = true)
    protected ElementClass iterationSchemeNameQ;
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
     * Gets the value of the hasReverseQ property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralizedIteratorSpecification.HasReverseQ }
     *     
     */
    public GeneralizedIteratorSpecification.HasReverseQ getHasReverseQ() {
        return hasReverseQ;
    }

    /**
     * Sets the value of the hasReverseQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralizedIteratorSpecification.HasReverseQ }
     *     
     */
    public void setHasReverseQ(GeneralizedIteratorSpecification.HasReverseQ value) {
        this.hasReverseQ = value;
    }

    /**
     * Gets the value of the iterationSchemeNameQ property.
     * 
     * @return
     *     possible object is
     *     {@link ElementClass }
     *     
     */
    public ElementClass getIterationSchemeNameQ() {
        return iterationSchemeNameQ;
    }

    /**
     * Sets the value of the iterationSchemeNameQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementClass }
     *     
     */
    public void setIterationSchemeNameQ(ElementClass value) {
        this.iterationSchemeNameQ = value;
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
     *         &lt;element name="reverse" type="{}Reverse"/>
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
        "hasReverse"
    })
    public static class HasReverseQ
        extends Base
    {

        @XmlElements({
            @XmlElement(name = "reverse", type = Reverse.class),
            @XmlElement(name = "not_an_element", type = NotAnElement.class)
        })
        protected Base hasReverse;

        /**
         * Gets the value of the hasReverse property.
         * 
         * @return
         *     possible object is
         *     {@link Reverse }
         *     {@link NotAnElement }
         *     
         */
        public Base getHasReverse() {
            return hasReverse;
        }

        /**
         * Sets the value of the hasReverse property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reverse }
         *     {@link NotAnElement }
         *     
         */
        public void setHasReverse(Base value) {
            this.hasReverse = value;
        }

    }

}
