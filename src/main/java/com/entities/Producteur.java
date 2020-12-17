package com.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.JoinTable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;


@Entity
@DiscriminatorValue("PR")
public class Producteur extends Intervenant{
	private double budget;
	@ManyToMany
	@JoinTable(name = "film_Producteur", joinColumns = @JoinColumn(name = "id_Producteur"), inverseJoinColumns = @JoinColumn(name = "id_film"))
	private List<Film> films = new ArrayList<Film>();
	
	// Constructeurs
	public Producteur(List<Film> films) {
		super();
		this.films = new ArrayList<>();
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}
	
	

}
