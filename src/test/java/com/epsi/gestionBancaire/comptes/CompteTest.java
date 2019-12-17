package com.epsi.gestionBancaire.comptes;

import org.assertj.core.api.*;

import org.junit.Test;

public class CompteTest {

	@Test
	public void reduceSoldTest() {
		Compte c = new Compte(500);
		c.reduceSolde(50);
		org.assertj.core.api.Assertions.assertThat(c.getSolde()).isEqualTo(450);
		
	}
}
