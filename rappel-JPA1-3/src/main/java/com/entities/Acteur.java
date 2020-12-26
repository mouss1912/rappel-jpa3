package com.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity

public class Acteur extends Intervenant{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String agence;
	
	private Double salaire;


	public Acteur() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getAgence() {
		return agence;
	}


	public void setAgence(String agence) {
		this.agence = agence;
	}


	public Double getSalaire() {
		return salaire;
	}


	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}


	public Adresse getTache() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
