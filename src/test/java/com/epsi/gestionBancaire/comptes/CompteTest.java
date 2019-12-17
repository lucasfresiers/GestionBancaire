package com.epsi.gestionBancaire.comptes;

import org.junit.Before;
import org.junit.Test;

public class CompteTest {
	
	Compte c;
	
	@Before
	public void init() {
		c = new Compte(500);
	}
	
	@Test
	public void reduceSoldeTest() {
		c.reduceSolde(50);
		org.assertj.core.api.Assertions.assertThat(c.getSolde()).isEqualTo(450);
	}
	
	@Test 
	public void increaseSoldeTest() {
		c.increaseSolde(50);
		org.assertj.core.api.Assertions.assertThat(c.getSolde()).isEqualTo(550);
	}
}
