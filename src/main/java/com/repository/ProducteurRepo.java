package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Producteur;

public interface ProducteurRepo extends JpaRepository<Producteur, Integer>{

}
