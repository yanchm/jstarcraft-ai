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
 * Java class for PolynomialKernelType element declaration.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;element name="PolynomialKernelType">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_1}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;attribute name="coef0" type="{http://www.dmg.org/PMML-4_1}REAL-NUMBER" default="1" />
 *         &lt;attribute name="degree" type="{http://www.dmg.org/PMML-4_1}REAL-NUMBER" default="1" />
 *         &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *         &lt;attribute name="gamma" type="{http://www.dmg.org/PMML-4_1}REAL-NUMBER" default="1" />
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "extension" })
@XmlRootElement(name = "PolynomialKernelType")
public class PolynomialKernelType {

    @XmlElement(name = "Extension", namespace = "http://www.dmg.org/PMML-4_1", required = true)
    protected List<Extension> extension;
    @XmlAttribute
    protected Double coef0;
    @XmlAttribute
    protected Double degree;
    @XmlAttribute
    protected String description;
    @XmlAttribute
    protected Double gamma;

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
     * Gets the value of the coef0 property.
     * 
     * @return possible object is {@link Double }
     * 
     */
    public double getCoef0() {
        if (coef0 == null) {
            return 1.0D;
        } else {
            return coef0;
        }
    }

    /**
     * Sets the value of the coef0 property.
     * 
     * @param value allowed object is {@link Double }
     * 
     */
    public void setCoef0(Double value) {
        this.coef0 = value;
    }

    /**
     * Gets the value of the degree property.
     * 
     * @return possible object is {@link Double }
     * 
     */
    public double getDegree() {
        if (degree == null) {
            return 1.0D;
        } else {
            return degree;
        }
    }

    /**
     * Sets the value of the degree property.
     * 
     * @param value allowed object is {@link Double }
     * 
     */
    public void setDegree(Double value) {
        this.degree = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the gamma property.
     * 
     * @return possible object is {@link Double }
     * 
     */
    public double getGamma() {
        if (gamma == null) {
            return 1.0D;
        } else {
            return gamma;
        }
    }

    /**
     * Sets the value of the gamma property.
     * 
     * @param value allowed object is {@link Double }
     * 
     */
    public void setGamma(Double value) {
        this.gamma = value;
    }

}
