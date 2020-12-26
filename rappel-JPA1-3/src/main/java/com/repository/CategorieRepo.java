package com.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Categorie;

public interface CategorieRepo extends JpaRepository<Categorie, Integer>{

	List<Categorie> findByDateMaj(LocalDateTime date_maj);
	
}