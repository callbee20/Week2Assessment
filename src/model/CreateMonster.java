package model;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Jan 21, 2022
 */
public class CreateMonster {
	
	private String name;
	private String species;
	private int level;
	
	/**
	 * 
	 */
	public CreateMonster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param name
	 * @param species
	 * @param level
	 */
	public CreateMonster(String name, String species, int level) {
		super();
		this.name = name;
		this.species = species;
		this.level = level;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}
	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
	}
	/**
	 * @return the level
	 */
	

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	
	public String printMonster() {
		return "Meet " + name + " this monster is a " + species + " it is level " + level;
	}

}
