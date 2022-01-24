package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.CreateMonster;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Jan 21, 2022
 */
public class CreateMonsterTest {

	
	CreateMonster monster = new CreateMonster();
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPrintMonster() {
		monster.setName("Gary");
		monster.setSpecies("Manticore");
		monster.setLevel(8); 
		String monsterMessage = "Meet " + monster.getName() + " this monster is a " + monster.getSpecies() + " it is level " + monster.getLevel();
		assertEquals(monsterMessage, monster.printMonster());
	}
	
	@Test
	public void testMonsterNotNull() {
		assertNotNull(monster.printMonster());
	}

}
