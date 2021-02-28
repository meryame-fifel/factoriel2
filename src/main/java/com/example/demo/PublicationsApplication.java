package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Auteur;
import com.example.demo.repository.auteurRepository;

@SpringBootApplication
public class PublicationsApplication{

	//implements CommandLineRunner
	//@Autowired
	//private auteurRepository auteurRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PublicationsApplication.class, args);
	}

	
	//@Override
	//public void run(String... args) throws Exception {
	//	Auteur a1=new Auteur(null,"foulan","prenom","12/12/1965","LA USA","doctorant","chimie");
	//	this.auteurRepo.save(a1);
		//this.pubRepo.save(new publication(null,"titre1","date","resume1","versionnum1","categorie1","discipline"));	
	//}
}
