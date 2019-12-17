package com.epsi.gestionBancaire.comptes;

public class CompteEpargne extends Compte{

	public CompteEpargne(double solde) {
		super(solde);
	}
	
	public double generateInterests() {
		double newSolde = 0.0;
		
		newSolde = this.getSolde() * 1.01;
		
		this.setSolde(newSolde);
		
		return newSolde;
	}

	@Override
	public String toString() {
		return "Compte épargne numéro: " + getId() + ", solde: " + getSolde() + " €";
	}
}
