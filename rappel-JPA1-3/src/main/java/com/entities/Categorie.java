package com.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nom;

	@Column(name = "date_maj")
	private LocalDateTime dateMaj;

	@OneToMany(mappedBy = "categorie")
	private List<Film> films;

//	CONSTRUCTORS
	public Categorie() {
		this.films = new ArrayList<>();
	}

//	METHODS
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", nom=" + nom + ", date_maj=" + dateMaj + "]";
	}

	// GETTERS & SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public LocalDateTime getDate_maj() {
		return dateMaj;
	}

	public void setDate_maj(LocalDateTime date_maj) {
		this.dateMaj = date_maj;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}
}