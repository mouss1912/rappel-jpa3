package com.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Film {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String titre;

	private String annee_sortie;

	@ManyToOne
	@JoinColumn(name = "id_categ")
	private Categorie categorie;

	@ManyToMany
	@JoinTable(name = "film_intervenant", joinColumns = @JoinColumn(name = "id_film", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_intervenant", referencedColumnName = "id"))
	private List<Intervenant> intervenants;

//	CONSTRUCTORS
	public Film() {
		this.intervenants = new ArrayList<>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAnnee_sortie() {
		return annee_sortie;
	}

	public void setAnnee_sortie(String annee_sortie) {
		this.annee_sortie = annee_sortie;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public List<Intervenant> getIntervenants() {
		return intervenants;
	}

	public void setIntervenants(List<Intervenant> intervenants) {
		this.intervenants = intervenants;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", annee_sortie=" + annee_sortie + ", categorie=" + categorie
				+ "]";
	}




}