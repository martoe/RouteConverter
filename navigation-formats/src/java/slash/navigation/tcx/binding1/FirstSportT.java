//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.01.12 at 09:26:37 AM CET 
//


package slash.navigation.tcx.binding1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FirstSport_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirstSport_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Run" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v1}Run_t"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Sport" use="required" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v1}Sport_t" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirstSport_t", propOrder = {
    "run"
})
public class FirstSportT {

    @XmlElement(name = "Run", required = true)
    protected RunT run;
    @XmlAttribute(name = "Sport", required = true)
    protected SportT sport;

    /**
     * Gets the value of the run property.
     * 
     * @return
     *     possible object is
     *     {@link RunT }
     *     
     */
    public RunT getRun() {
        return run;
    }

    /**
     * Sets the value of the run property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunT }
     *     
     */
    public void setRun(RunT value) {
        this.run = value;
    }

    /**
     * Gets the value of the sport property.
     * 
     * @return
     *     possible object is
     *     {@link SportT }
     *     
     */
    public SportT getSport() {
        return sport;
    }

    /**
     * Sets the value of the sport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SportT }
     *     
     */
    public void setSport(SportT value) {
        this.sport = value;
    }

}
