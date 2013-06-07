
package org.sireum.bakar.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Protected_Definition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Protected_Definition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sloc" type="{}Source_Location"/>
 *         &lt;element name="visible_part_items_ql" type="{}Declarative_Item_List"/>
 *         &lt;element name="private_part_items_ql" type="{}Declarative_Item_List"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Protected_Definition", propOrder = {
    "sloc",
    "visiblePartItemsQl",
    "privatePartItemsQl"
})
public class ProtectedDefinition
    extends Base
{

    @XmlElement(required = true)
    protected SourceLocation sloc;
    @XmlElement(name = "visible_part_items_ql", required = true)
    protected DeclarativeItemList visiblePartItemsQl;
    @XmlElement(name = "private_part_items_ql", required = true)
    protected DeclarativeItemList privatePartItemsQl;

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
     * Gets the value of the visiblePartItemsQl property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarativeItemList }
     *     
     */
    public DeclarativeItemList getVisiblePartItemsQl() {
        return visiblePartItemsQl;
    }

    /**
     * Sets the value of the visiblePartItemsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarativeItemList }
     *     
     */
    public void setVisiblePartItemsQl(DeclarativeItemList value) {
        this.visiblePartItemsQl = value;
    }

    /**
     * Gets the value of the privatePartItemsQl property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarativeItemList }
     *     
     */
    public DeclarativeItemList getPrivatePartItemsQl() {
        return privatePartItemsQl;
    }

    /**
     * Sets the value of the privatePartItemsQl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarativeItemList }
     *     
     */
    public void setPrivatePartItemsQl(DeclarativeItemList value) {
        this.privatePartItemsQl = value;
    }

}
