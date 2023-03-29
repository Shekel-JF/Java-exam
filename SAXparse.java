import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SAXparse
{
    public static void main(String[] args) throws Exception
    {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        DefaultHandler handler = new DefaultHandler()
        {
            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
            {
                System.out.println("Start Element :" + qName);
                for (int i = 0; i < attributes.getLength(); i++)
                {
                    System.out.println("Attribute: " + attributes.getQName(i) + " = " + attributes.getValue(i));
                }
            }

            @Override
            public void endElement(String uri, String localName, String qName) throws SAXException
            {
                System.out.println("End Element :" + qName);
            }

            @Override
            public void characters(char[] ch, int start, int length) throws SAXException
            {
                System.out.println("Value: " + new String(ch, start, length));
            }
        };
        saxParser.parse(new File("file.xml"), handler);
    }
}
