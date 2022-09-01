package be.icc.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Festival extends Evenement implements Computable{

	private String nom;
	private int maxCapacity;
	private Set<LocalDate> dates;
	private boolean free;
	private ArrayList<Stand> stands;
	
	
	public Festival(String texte, int day, int month, int year,String nom,TreeSet<LocalDate> dates, ArrayList<Stand> stands,int maxCapacity) {
		super(texte, day, month, year);
		this.nom = nom;
		this.stands = stands;
		this.dates = dates;
		this.free = true;
		this.maxCapacity = maxCapacity;
	}

	public ArrayList<Stand> getStandsByCategory(String category){
		ArrayList<Stand> standByCategory = new ArrayList<Stand>();
		for (Stand stand : this.stands) {
			if (stand.getCategory().equals(category)) {
				standByCategory.add(stand);
			}
		}
		return standByCategory;
	}
	
	public int computeCapacity() {
		int MaxCap = 0;
		for (Stand stand : this.stands) {
			MaxCap += stand.getCapacity();
		}
		return MaxCap;
	}
	
	
	public Festival() {
		super();
	}
	
	public Festival(String nom,ArrayList<Stand> stands,int maxCapacity) {
		super();
		this.nom = nom;
		this.stands = stands;
		this.free = true;
		this.maxCapacity = maxCapacity;
		
	}
	
	public Festival(String nom,TreeSet<LocalDate> dates, ArrayList<Stand> stands,int maxCapacity) {
		super();
		this.nom = nom;
		this.stands = stands;
		this.dates = dates;
		this.free = true;
		this.maxCapacity = maxCapacity;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Stand> getStands() {
		return stands;
	}
	public void setStands(ArrayList<Stand> stands) {
		this.stands = stands;
	}
	public Set<LocalDate> getDates() {
		return dates;
	}
	public void setDates(TreeSet<LocalDate> dates) {
		this.dates = dates;
	}
	public boolean isFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	@Override
	public boolean isOverflow() {
		if (this.computeCapacity() > this.getMaxCapacity()) {
			return true;
		}
		return false;
	}

	@Override
	public int mediumCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		ArrayList<String> StandTitre = new ArrayList<String>(); 
		for (Stand stand : this.stands) {
			StandTitre.add(stand.getTitre());
		}
		return "Festival "
				+ "[nom=" + nom + ", "
				+ "dates=" + dates + ", "
				+ "maxCapacity=" + maxCapacity
				+ "stands=" + StandTitre + ", "
				+ "]";
	}
	
	
	
	
	
}
