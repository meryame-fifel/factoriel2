package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Publication;

public interface publicationRepository extends MongoRepository<Publication, String> {

}
