package docxjavamapper.model;

import docxjavamapper.model.drawing.graphic.DJMDrawing;
import docxjavamapper.model.interfaces.ParagraphElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * r (Text Run)
 *
 * This element specifies a run of content in the parent field, hyperlink,
 * custom XML element, structured document tag, smart tag, or paragraph.
 *
 * The contents of a run in a WordprocessingML document shall consist of any
 * combination of run content.
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@XmlAccessorType(XmlAccessType.FIELD)
public class DJMRun implements ParagraphElement {

    @XmlElement(name = "rPr")
    DJMRunProperties runProperties;
    @XmlElement(name = "t")
    String text;
    @XmlElement(name = "drawing")
    DJMDrawing drawing;

}
