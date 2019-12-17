package com.epsi.gestionBancaire;

import java.util.ArrayList;

import org.junit.Test;

import com.epsi.gestionBancaire.comptes.Compte;
import com.epsi.gestionBancaire.comptes.CompteCourant;
import com.epsi.gestionBancaire.comptes.CompteEpargne;

public class ClientTest {
	
	@Test
	public void transferMoneyTest() {
		ArrayList<Compte> listC1 = new ArrayList<Compte>();
    	listC1.add(new CompteCourant(2000));
    	listC1.add(new CompteEpargne(25000));
        Client c1 = new Client("GUERS", "Arthur", listC1);
        
    	ArrayList<Compte> listC2= new ArrayList<Compte>();
    	listC2.add(new CompteCourant(1000));
    	listC2.add(new CompteEpargne(100000));
        Client c2 = new Client("FRESIERS", "Lucas", listC2);
        
        
		c1.transferMoney(c2, 500, 0, 1);
		org.assertj.core.api.Assertions.assertThat(c1.getComptes().get(0).getSolde()).isEqualTo(1500);
		org.assertj.core.api.Assertions.assertThat(c2.getComptes().get(1).getSolde()).isEqualTo(100500);
	}
}
