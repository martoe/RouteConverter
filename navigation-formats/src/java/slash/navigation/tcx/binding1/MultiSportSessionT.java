//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.01.12 at 09:26:37 AM CET 
//


package slash.navigation.tcx.binding1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiSportSession_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiSportSession_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FirstSport" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v1}FirstSport_t"/>
 *         &lt;element name="NextSport" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v1}NextSport_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiSportSession_t", propOrder = {
    "firstSport",
    "nextSport",
    "notes"
})
public class MultiSportSessionT {

    @XmlElement(name = "FirstSport", required = true)
    protected FirstSportT firstSport;
    @XmlElement(name = "NextSport")
    protected List<NextSportT> nextSport;
    @XmlElement(name = "Notes")
    protected String notes;

    /**
     * Gets the value of the firstSport property.
     * 
     * @return
     *     possible object is
     *     {@link FirstSportT }
     *     
     */
    public FirstSportT getFirstSport() {
        return firstSport;
    }

    /**
     * Sets the value of the firstSport property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstSportT }
     *     
     */
    public void setFirstSport(FirstSportT value) {
        this.firstSport = value;
    }

    /**
     * Gets the value of the nextSport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextSport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextSport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NextSportT }
     * 
     * 
     */
    public List<NextSportT> getNextSport() {
        if (nextSport == null) {
            nextSport = new ArrayList<NextSportT>();
        }
        return this.nextSport;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}
