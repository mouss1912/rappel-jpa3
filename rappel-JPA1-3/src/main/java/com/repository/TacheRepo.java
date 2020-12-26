package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Tache;

public interface TacheRepo extends JpaRepository<Tache,Integer>{

}
