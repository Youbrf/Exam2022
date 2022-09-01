package be.icc.poo.myUtilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


import be.icc.poo.Evenement;
import be.icc.poo.Festival;
import be.icc.poo.Stand;

public class MyUtility {
	public static XStream xs = new XStream(new DomDriver());
	
	public static void toXMLfile(Festival concert,String fileName) {
		xs.alias("Festival", Festival.class);
		xs.useAttributeFor(Festival.class,"nom");
		xs.useAttributeFor(Festival.class,"free");
		xs.alias("texte", Evenement.class);
		xs.alias("stand",Stand.class);
		xs.useAttributeFor(Stand.class,"category");
		xs.useAttributeFor(Stand.class,"capacity");
		xs.addImplicitCollection(Festival.class, "stands");
		try {
			xs.toXML(concert,new FileWriter(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Festival fromXmlFile(String fileName) {
		xs.alias("Festival", Festival.class);
		xs.useAttributeFor(Festival.class,"nom");
		xs.useAttributeFor(Festival.class,"free");
		xs.alias("texte", Evenement.class);
		xs.alias("stand",Stand.class);
		xs.useAttributeFor(Stand.class,"category");
		xs.useAttributeFor(Stand.class,"capacity");
		xs.addImplicitCollection(Festival.class, "stands");
		
		return (Festival) xs.fromXML(new File(fileName));
	}
	

}
