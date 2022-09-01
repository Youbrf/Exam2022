package be.icc.poo;

public class Stand {
	/*
	 * le titre du stand : « Stand de tir »),
	 */
	private String titre;
	/**
	 * la catégorie : « sport »
	 */
	private String category;
	/**
	 * le nombre maximum de personne dans le stand
	 */
	private int capacity;
	
	
	public Stand() {
		super();
	}
	
	public Stand(String titre, String category, int capacity) {
		super();
		this.titre = titre;
		this.category = category;
		this.capacity = capacity;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Stand [titre=" + titre + ", category=" + category + ", capacity=" + capacity + "]";
	}
	
	
}
