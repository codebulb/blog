package ch.codebulb.top10groovyfeatures;

import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XmlJava {
    private static final String XML_INPUT = XmlGroovy.XML_INPUT;
    
    /*
     * For more details, visit:
     * - http://www.mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/
     * - http://javarevisited.blogspot.ch/2012/12/create-and-evaluate-xpath-java-example-tutorial-program.html
     * - http://stackoverflow.com/a/562207
     */
    public static String parseJunitScope() {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(new InputSource(new StringReader(XML_INPUT)));
            
            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();
            
            XPathFactory xPathFactory = XPathFactory.newInstance();
            XPath xPath = xPathFactory.newXPath();
            XPathExpression xPathExp = xPath.compile("/project/dependencies/dependency[groupId='junit']/scope");
            return (String) xPathExp.evaluate(doc, XPathConstants.STRING);
            
        } catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException ex) {
            throw new RuntimeException(ex);
        }
    }
}
