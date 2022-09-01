package be.icc.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeSet;

import be.icc.poo.myUtilities.MyUtility;

public class Main {

	public static void main(String[] args) {
		ArrayList<Stand> list = new ArrayList<Stand>();

		Stand stand = new Stand("Poker","cartes",15);
		
		TreeSet<LocalDate> dates = new TreeSet<>();
		
		dates.add(LocalDate.now());
		dates.add(LocalDate.now().plusDays(2));
		dates.add(LocalDate.now().plusDays(5));
		
		list.add(stand);
		
		Festival bxland =  new Festival("Festival du jeu de Bruxelles",28,8,2022,"Brussels Game Festival",dates, list,1000);
		
		MyUtility.toXMLfile(bxland, "data//ConcertFile2.xml");
		
		
		/*
		 * Test de la méthode statique MediumCapacity de l'interface Computable 
		 */
		
		int medCap = Computable.mediumCapacity(bxland.getMaxCapacity());
		System.out.println("Moitié de la capacité du Festival = " + medCap);
	}

}
