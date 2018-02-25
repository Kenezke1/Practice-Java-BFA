package com.codecool.api;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ClothesMenager {


    public List<Clothes> loadClothes(){
        List<Clothes> clothesList = new ArrayList<Clothes>();
        try{
            File fXmlFile = new File("clothes.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            Clothes clothes;
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("Clothe");
            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    Node nameNode = eElement.getElementsByTagName("Name").item(0);
                    String name = nameNode.getTextContent();
                    Node sizeNode = eElement.getElementsByTagName("Size").item(0);
                    String size = sizeNode.getTextContent();
                    Node typeNode = eElement.getElementsByTagName("Type").item(0);
                    String type = typeNode.getTextContent();
                    if(type.equals("Shirt")){
                        clothes = new Shirts(name,size,type);
                        clothesList.add(clothes);
                    }
                    else if(type.equals("Skirt")){
                        clothes = new Skirt(name,size,type);
                        clothesList.add(clothes);
                    }
                    else if(type.equals("Pants")){
                        clothes = new Pants(name,size,type);
                        clothesList.add(clothes);
                    }
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return clothesList;
    }
}
