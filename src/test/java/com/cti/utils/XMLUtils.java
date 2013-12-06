package test.java.com.cti.utils;

import java.io.File;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtils {

	//Get the XML file and find the root element
	public static Element getroot(String siteName) {
		Element root = null;
		try {
			File fXmlFile = new File(siteName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document document = dBuilder.parse(fXmlFile);
			root = document.getDocumentElement();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return root;

	}

	//Getting values for hashmap
	public static HashMap<String, String> getValues(Element root,
			String tagName, HashMap<String, String> variableMap) {
		NodeList commonElements = root.getElementsByTagName(tagName);

		for (int i = 0; i < CommonConstants.elementArray.length; i++) {
			variableMap = getElementsByTag(commonElements,
					CommonConstants.elementArray[i], variableMap);
		}
		return variableMap;
	}

	//Parsing the XML file
	private static HashMap<String, String> getElementsByTag(
			NodeList commonElements, String tag, HashMap<String, String> map) {
		
		for (int i = 0; i < commonElements.getLength(); i++) {
			Element commonElement = (Element) commonElements.item(i);
			NodeList nodeList = commonElement.getElementsByTagName(tag);
			if (nodeList != null) {
				for (int temp = 0; temp < nodeList.getLength(); temp++) {
					Node nNode = nodeList.item(temp);
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						Element eElement = (Element) nNode;
						String name = eElement
								.getElementsByTagName(CommonConstants.NAME)
								.item(0).getTextContent();
						String value = eElement
								.getElementsByTagName(CommonConstants.VALUE)
								.item(0).getTextContent();
						map.put(name, value);
					}
				}
			}

		}
		return map;
	}
}
