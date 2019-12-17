package com.epsi.gestionBancaire.comptes;

import java.util.Random;

public class Compte {
	private long id;
	private double solde;
	
	public Compte(double solde) {
		super();
		Random r = new Random();
		this.id = r.nextInt(9999999);
		this.solde = solde;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public void reduceSolde(double amount) {
		solde = solde - amount;
	}
	
	public void increaseSolde(double amount) {
		solde = solde + amount;
	}
	
}
