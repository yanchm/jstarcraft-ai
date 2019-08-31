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
 * Java class for NeuralOutput element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;element name="NeuralOutput">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_1}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_1}DerivedField"/>
 *         &lt;/sequence>
 *         &lt;attribute name="outputNeuron" use="required" type="{http://www.dmg.org/PMML-4_1}NN-NEURON-IDREF" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "extension", "derivedField" })
@XmlRootElement(name = "NeuralOutput")
public class NeuralOutput {

    @XmlElement(name = "Extension", namespace = "http://www.dmg.org/PMML-4_1", required = true)
    protected List<Extension> extension;
    @XmlElement(name = "DerivedField", namespace = "http://www.dmg.org/PMML-4_1", required = true)
    protected DerivedField derivedField;
    @XmlAttribute(required = true)
    protected String outputNeuron;

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
     * Gets the value of the derivedField property.
     * 
     * @return possible object is {@link DerivedField }
     * 
     */
    public DerivedField getDerivedField() {
        return derivedField;
    }

    /**
     * Sets the value of the derivedField property.
     * 
     * @param value allowed object is {@link DerivedField }
     * 
     */
    public void setDerivedField(DerivedField value) {
        this.derivedField = value;
    }

    /**
     * Gets the value of the outputNeuron property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOutputNeuron() {
        return outputNeuron;
    }

    /**
     * Sets the value of the outputNeuron property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setOutputNeuron(String value) {
        this.outputNeuron = value;
    }

}
