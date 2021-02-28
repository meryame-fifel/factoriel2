package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Auteur")
public class Auteur {

	@Id
	private String id;
	private String nom;
	private String prenom;
	private String dateN;
	private String adresse;
	private String grade;
	private String organisme;
	
	
	public Auteur(String id, String nom, String prenom, String dateN, String adresse, String grade, String organisme) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateN = dateN;
		this.adresse = adresse;
		this.grade = grade;
		this.organisme = organisme;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getDateN() {
		return dateN;
	}
	public void setDateN(String dateN) {
		this.dateN = dateN;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getOrganisme() {
		return organisme;
	}
	public void setOrganisme(String organisme) {
		this.organisme = organisme;
	}
	
	
}
