package be.icc.poo;

import java.util.ArrayList;

public class Journal {
	private ArrayList<Evenement> events;

	public ArrayList<Evenement> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<Evenement> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Journal [events=" + events + "]";
	}
	
}
