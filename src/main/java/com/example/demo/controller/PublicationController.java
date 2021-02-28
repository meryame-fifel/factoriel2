package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Publication;
import com.example.demo.repository.publicationRepository;

public class PublicationController {

	@Autowired
	private publicationRepository pubRepo;
	
	@GetMapping("/publications")  
	public String showpublicationrForm(Model model) {   
		model.addAttribute("publications", pubRepo.findAll());   
		return "publications";  
	}
	
	@GetMapping("/search")
	public String findOrganisationAutors(Model model, @RequestParam(name="nom",defaultValue="") String nom) {
		model.addAttribute("publications", pubRepo.findAll());
		model.addAttribute("nom", nom);
		return "auteursFound";
	}
	@GetMapping("/addP")  
	public String addForm(Publication publication) {   
		return "addPublication";  
	} 
	
	@PostMapping("/addPublication")  
	public String addPublication(Publication publication, Model model) {   
		pubRepo.save(publication);   
		model.addAttribute("publications", pubRepo.findAll());   
		return "publications";  
	}
	
	@GetMapping("/editP/{id}")  
	public String showUpdateForm(@PathVariable("id") String id, Model model) {   
		Publication publication = pubRepo.findById(id).get();     
		model.addAttribute("publication", publication);   
		return "updatePublication";  
	}
	
	@PostMapping("/updateP/{id}")  
	public String updatePublication(@PathVariable("id") String id, Publication publication, Model model) { 
		 
		pubRepo.save(publication);   
		model.addAttribute("publications", pubRepo.findAll());   
		return "publications";  
	}
	
	@GetMapping("/delete/{id}")  
	public String deleteAuteur(@PathVariable("id") String id, Model model) {   
		Publication publication = pubRepo.findById(id). get();   
		pubRepo.delete(publication);   
		model.addAttribute("publications", pubRepo.findAll());   
		return "publications";  
	}
	@GetMapping(value = "/hello")
	public String sayhello() {
		return "helooooo";
	}
}
