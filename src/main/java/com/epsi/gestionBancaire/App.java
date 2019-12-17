package com.epsi.gestionBancaire;

import java.util.ArrayList;

import com.epsi.gestionBancaire.comptes.Compte;
import com.epsi.gestionBancaire.comptes.CompteCourant;
import com.epsi.gestionBancaire.comptes.CompteEpargne;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	ArrayList<Compte> listC1 = new ArrayList<Compte>();
    	listC1.add(new CompteCourant(2000));
    	listC1.add(new CompteEpargne(25000));
        Client c1 = new Client("GUERS", "Arthur", listC1);
        
    	ArrayList<Compte> listC2= new ArrayList<Compte>();
    	listC2.add(new CompteCourant(1000));
    	listC2.add(new CompteEpargne(100000));
        Client c2 = new Client("FRESIERS", "Lucas", listC2);
        
        System.out.println(c1.toString());
        
        c1.transferMoney(c1, 100, 0, 1);
        
        System.out.println(c1.toString());
        
        System.out.println("");
        
        System.out.println(c2.toString());
        
        c1.transferMoney(c2, 2500, 0, 0);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        
    }
}
