package com.epsi.gestionBancaire.comptes;

public class CompteCourant extends Compte {

	public CompteCourant(double solde) {
		super(solde);
	}

	@Override
	public String toString() {
		return "Compte courant numéro: " + getId() + ", solde: " + getSolde() + " €";
	}
}
