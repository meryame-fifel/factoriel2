package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Auteur;
import com.example.demo.repository.auteurRepository;

@Controller
public class AuteurController {
	
	@Autowired
	private auteurRepository auteurRepo;
	
	@GetMapping("/")  
	public String showAuteurForm(Model model) {   
		model.addAttribute("auteurs", auteurRepo.findAll());   
		return "auteurs";  
	}
	
	@GetMapping("/search")
	public String findOrganisationAutors(Model model, @RequestParam(name="nom",defaultValue="") String nom) {
		model.addAttribute("auteurs", auteurRepo.findByOrganisme(nom));
		model.addAttribute("nom", nom);
		return "auteursFound";
	}
	@GetMapping("/add")  
	public String addForm(Auteur auteur) {   
		return "addAuteur";  
	} 
	
	@PostMapping("/addAuteur")  
	public String addAuteur(Auteur auteur, Model model) {   
		auteurRepo.save(auteur);   
		model.addAttribute("auteurs", auteurRepo.findAll());   
		return "auteurs";  
	}
	
	@GetMapping("/edit/{id}")  
	public String showUpdateForm(@PathVariable("id") String id, Model model) {   
		Auteur auteur = auteurRepo.findById(id).get();     
		model.addAttribute("auteur", auteur);   
		return "updateAuteur";  
	}
	
	@PostMapping("/update/{id}")  
	public String updateAuteur(@PathVariable("id") String id, Auteur auteur, Model model) { 
		 
		auteurRepo.save(auteur);   
		model.addAttribute("auteurs", auteurRepo.findAll());   
		return "auteurs";  
	}
	
	@GetMapping("/delete/{id}")  
	public String deleteAuteur(@PathVariable("id") String id, Model model) {   
		Auteur auteur = auteurRepo.findById(id). get();   
		auteurRepo.delete(auteur);   
		model.addAttribute("auteurs", auteurRepo.findAll());   
		return "auteurs";  
	}
	
	
	 
	
}
