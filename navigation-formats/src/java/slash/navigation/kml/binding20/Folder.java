//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.02.17 at 01:40:15 PM MEZ 
//


package slash.navigation.kml.binding20;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://earth.google.com/kml/2.0}Document" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}Folder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}GroundOverlay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}LookAt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}NetworkLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}Placemark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}ScreenOverlay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}Style" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}description" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}name" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}Snippet" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}open" minOccurs="0"/>
 *         &lt;element ref="{http://earth.google.com/kml/2.0}visibility" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentOrFolderOrGroundOverlay"
})
@XmlRootElement(name = "Folder")
public class Folder {

    @XmlElementRefs({
        @XmlElementRef(name = "Style", namespace = "http://earth.google.com/kml/2.0", type = Style.class),
        @XmlElementRef(name = "Document", namespace = "http://earth.google.com/kml/2.0", type = Document.class),
        @XmlElementRef(name = "GroundOverlay", namespace = "http://earth.google.com/kml/2.0", type = GroundOverlay.class),
        @XmlElementRef(name = "name", namespace = "http://earth.google.com/kml/2.0", type = JAXBElement.class),
        @XmlElementRef(name = "Placemark", namespace = "http://earth.google.com/kml/2.0", type = Placemark.class),
        @XmlElementRef(name = "Folder", namespace = "http://earth.google.com/kml/2.0", type = Folder.class),
        @XmlElementRef(name = "Snippet", namespace = "http://earth.google.com/kml/2.0", type = Snippet.class),
        @XmlElementRef(name = "NetworkLink", namespace = "http://earth.google.com/kml/2.0", type = NetworkLink.class),
        @XmlElementRef(name = "visibility", namespace = "http://earth.google.com/kml/2.0", type = JAXBElement.class),
        @XmlElementRef(name = "open", namespace = "http://earth.google.com/kml/2.0", type = JAXBElement.class),
        @XmlElementRef(name = "description", namespace = "http://earth.google.com/kml/2.0", type = JAXBElement.class),
        @XmlElementRef(name = "ScreenOverlay", namespace = "http://earth.google.com/kml/2.0", type = ScreenOverlay.class),
        @XmlElementRef(name = "LookAt", namespace = "http://earth.google.com/kml/2.0", type = LookAt.class)
    })
    protected List<Object> documentOrFolderOrGroundOverlay;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the documentOrFolderOrGroundOverlay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentOrFolderOrGroundOverlay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentOrFolderOrGroundOverlay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Style }
     * {@link Document }
     * {@link GroundOverlay }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Placemark }
     * {@link Folder }
     * {@link Snippet }
     * {@link NetworkLink }
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link ScreenOverlay }
     * {@link LookAt }
     * 
     * 
     */
    public List<Object> getDocumentOrFolderOrGroundOverlay() {
        if (documentOrFolderOrGroundOverlay == null) {
            documentOrFolderOrGroundOverlay = new ArrayList<Object>();
        }
        return this.documentOrFolderOrGroundOverlay;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
