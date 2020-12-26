package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Intervenant;

public interface IntervenantRepo extends JpaRepository<Intervenant, Integer> {
	List<Intervenant> findByNomAndPrenom(String nom,String prenom);
}
