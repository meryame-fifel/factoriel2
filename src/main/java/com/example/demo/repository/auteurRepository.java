package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Auteur;

public interface auteurRepository extends MongoRepository<Auteur, String> {
	
	 List<Auteur> findByNom(String nom);
	 List<Auteur> findByOrganisme(String organisme);
}
