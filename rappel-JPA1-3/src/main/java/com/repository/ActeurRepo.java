package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Acteur;

public interface ActeurRepo extends JpaRepository<Acteur, Integer> {

	List<Acteur> findByNomAndPrenom(String nom,String prenom);
	
}