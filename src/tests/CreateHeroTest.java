package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.CreateHero;

/**
 * @author Carson Allbee callbee
 *CIS175 - Fall 2021
 * Jan 23, 2022
 */
public class CreateHeroTest {

	CreateHero hero = new CreateHero();
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void CreateHero() {
		hero.setName("Arthur");
		hero.setCharacterClass("Paladin");
		hero.setWeapon("Excalibur");
		assertEquals(hero.toString(), hero.toString());
	}

}
