package com.epsi.gestionBancaire.comptes;

import org.junit.Test;

public class CompteEpargneTest extends CompteTest {
	
	@Test
	public void generateInterestsTest() {
		CompteEpargne cEpargne = new CompteEpargne(1000);
		cEpargne.generateInterests();
		org.assertj.core.api.Assertions.assertThat(cEpargne.getSolde()).isEqualTo(1010);
	}

}
