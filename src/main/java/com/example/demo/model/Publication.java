package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class Publication {

	@Id
	private String id;
	private String titre;
	private String type;
	private String dateP;
	private String version;
	
	
	public Publication(String id, String titre, String type, String dateP, String version) {
		super();
		this.id = id;
		this.titre = titre;
		this.type = type;
		this.dateP = dateP;
		this.version = version;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDateP() {
		return dateP;
	}
	public void setDateP(String dateP) {
		this.dateP = dateP;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	
}
