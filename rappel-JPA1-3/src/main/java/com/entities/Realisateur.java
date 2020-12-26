package com.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;


@Entity

public class Realisateur extends Intervenant{
	
	private double commition;
	@ManyToMany
	@JoinTable(name = "film_realisateur", joinColumns = @JoinColumn(name = "id_realisateur"), inverseJoinColumns = @JoinColumn(name = "id_film"))
	private List<Film> films = new ArrayList<Film>();
	
	// Constructeurs
	public Realisateur() {
		super();
		this.films = new ArrayList<>();
	}

	public double getCommition() {
		return commition;
	}

	public void setCommition(double commition) {
		this.commition = commition;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	
}
