package com.epsi.gestionBancaire;

import java.util.List;
import java.util.Random;

import com.epsi.gestionBancaire.comptes.Compte;

public class Client {

	private int id;
	private String nom;
	private String prenom;
	private List<Compte> comptes;
	
	public Client(String nom, String prenom, List<Compte> comptes) {
		super();
		Random r = new Random();
		this.id = r.nextInt(9999);
		this.nom = nom;
		this.prenom = prenom;
		this.comptes = comptes;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Client numéro: " + id + ", nom: " + nom + ", prenom: " + prenom + ", comptes: " + comptes + "";
	}
	
	public double transferMoney(Client receiver, double amount, int compte1, int compte2) {
		// Si compte = 0 : compte courant
		// Si compte = 1 : compte epargne
		
		//compte1 transfert vers compte2
		
		this.getComptes().get(compte1).reduceSolde(amount);
		
		receiver.getComptes().get(compte2).increaseSolde(amount);
		
		return amount;
	}
}
