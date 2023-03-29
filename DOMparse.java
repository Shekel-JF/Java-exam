import org.w3c.dom.NodeList;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMparse
{
    public static void main(String[] args) throws Exception
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document doc = builder.parse(new File("file.xml"));
        doc.getDocumentElement().normalize();
        NodeList list = doc.getElementsByTagName("*");

        for(int i = 0; i < list.getLength(); i++)
            {
                System.out.println(list.item(i).getNodeName() + ":" + list.item(i).getTextContent());
            }
    }
}