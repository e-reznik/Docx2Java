package docxjavamapper.model.relationships;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * The container for the block level structures such as paragraphs, tables,
 * annotations, and others specified in the ISO/IEC 29500 specification.
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMRelationship {

    @XmlAttribute(name = "Id")
    String id;
    @XmlAttribute(name = "Target")
    String target;

}
