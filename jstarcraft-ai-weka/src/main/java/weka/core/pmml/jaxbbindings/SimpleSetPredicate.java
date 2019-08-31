//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.20 at 12:48:21 PM GMT 
//

package weka.core.pmml.jaxbbindings;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SimpleSetPredicate element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;element name="SimpleSetPredicate">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_1}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_1}Array"/>
 *         &lt;/sequence>
 *         &lt;attribute name="booleanOperator" use="required">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="isIn"/>
 *               &lt;enumeration value="isNotIn"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/attribute>
 *         &lt;attribute name="field" use="required" type="{http://www.dmg.org/PMML-4_1}FIELD-NAME" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "extension", "array" })
@XmlRootElement(name = "SimpleSetPredicate")
public class SimpleSetPredicate {

    @XmlElement(name = "Extension", namespace = "http://www.dmg.org/PMML-4_1", required = true)
    protected List<Extension> extension;
    @XmlElement(name = "Array", namespace = "http://www.dmg.org/PMML-4_1", required = true)
    protected ArrayType array;
    @XmlAttribute(required = true)
    protected String booleanOperator;
    @XmlAttribute(required = true)
    protected String field;

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot.
     * Therefore any modification you make to the returned list will be present
     * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
     * for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }

    /**
     * Gets the value of the array property.
     * 
     * @return possible object is {@link ArrayType }
     * 
     */
    public ArrayType getArray() {
        return array;
    }

    /**
     * Sets the value of the array property.
     * 
     * @param value allowed object is {@link ArrayType }
     * 
     */
    public void setArray(ArrayType value) {
        this.array = value;
    }

    /**
     * Gets the value of the booleanOperator property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBooleanOperator() {
        return booleanOperator;
    }

    /**
     * Sets the value of the booleanOperator property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setBooleanOperator(String value) {
        this.booleanOperator = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setField(String value) {
        this.field = value;
    }

}
