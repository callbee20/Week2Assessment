package model;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Jan 21, 2022
 */
public class CreateHero {

	private String name;
	private String characterClass;
	private String weapon;
	
	/**
	 * 
	 */
	public CreateHero() {
		super();
		// TODO Auto-generated constructor stub	
	}
	
	/**
	 * @param name
	 * @param characterClass
	 * @param weapon
	 */
	public CreateHero(String name, String characterClass, String weapon) {
		super();
		this.name = name;
		this.characterClass = characterClass;
		this.weapon = weapon;	
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
	 * @return the characterClass
	 */
	public String getCharacterClass() {
		return characterClass;
	}
	/**
	 * @param characterClass the characterClass to set
	 */
	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}
	/**
	 * @return the weapon
	 */
	public String getWeapon() {
		return weapon;
	}
	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "CreateHero [name=" + name + ", characterClass=" + characterClass + ", weapon=" + weapon + "]";
	}
	
	
	
	
	
}
