//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.01.12 at 09:26:37 AM CET 
//


package slash.navigation.tcx.binding1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrainingType_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrainingType_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Workout"/>
 *     &lt;enumeration value="Course"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrainingType_t")
@XmlEnum
public enum TrainingTypeT {

    @XmlEnumValue("Workout")
    WORKOUT("Workout"),
    @XmlEnumValue("Course")
    COURSE("Course");
    private final String value;

    TrainingTypeT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrainingTypeT fromValue(String v) {
        for (TrainingTypeT c: TrainingTypeT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
