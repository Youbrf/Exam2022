package be.icc.poo.testUnitaire;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import be.icc.poo.Festival;
import be.icc.poo.Stand;

class FestivalTest {

	Stand stand = new Stand("ixelle","pop",50);
	Stand stand1 = new Stand("saintgilles","rap",50);
	ArrayList<Stand> ListStand = new ArrayList<Stand>();
	
	
	@Test
	void testTostring() {
		ListStand.add(stand);
		ListStand.add(stand1);
		
		Festival bxland =  new Festival("europe",ListStand,1000);
		assertEquals("Festival [nom=europe, stands=[ixelle, saintgilles], dates=2022-08-31, maxCapacity=1000]", bxland.toString());
	}
	
	@Test
	void testStandByCategory() {
		ListStand.add(stand);
		ListStand.add(stand1);
		Festival bxland =  new Festival("europe",ListStand,1000);
		ArrayList<Stand> ListStand2 = new ArrayList<Stand>();
		ListStand2.add(stand1);
		
		assertEquals(ListStand2, bxland.getStandsByCategory("rap"));
	
	}

	@Test
	void testMaxCapaciteStands() {
		ListStand.add(stand);
		ListStand.add(stand1);
		Festival bxland =  new Festival("europe",ListStand,1000);
		
		assertEquals(100, bxland.computeCapacity());
	}
	
	@Test
	void testisOverflow() {
		ListStand.add(stand);
		ListStand.add(stand1);
		Festival bxland =  new Festival("europe",ListStand,90);
		
		assertEquals(true, bxland.isOverflow());
	}
	
	
}
