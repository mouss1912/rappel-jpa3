package com.entities;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Tache {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String destription;
	private LocalDate date;

	@OneToOne
	private TacheDatee tacheDatee;

	//@ManyToOne
	//@JoinColumn(name = "intervenantId")
	//private Intervenant intervenantId;
	
	@ManyToOne
	@JoinColumn(name = "id_intervenant")
	private Intervenant intervenant;
	
	
	// Constructeur 
	public Tache() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDestription() {
		return destription;
	}


	public void setDestription(String destription) {
		this.destription = destription;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public TacheDatee getTacheDatee() {
		return tacheDatee;
	}


	public void setTacheDatee(TacheDatee tacheDatee) {
		this.tacheDatee = tacheDatee;
	}


	public Intervenant getIntervenant() {
		return intervenant;
	}


	public void setIntervenant(Intervenant intervenant) {
		this.intervenant = intervenant;
	}
	

	

	
	
}
