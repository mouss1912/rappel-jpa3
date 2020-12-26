package com.managers;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import com.entities.Adresse;
import com.exception.AdresseException;

@Service
public class AdresseManager extends MasterManager{

	public AdresseManager(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	public void insertAdresse(Adresse adresse) throws AdresseException {
		if (adresse.getCodePostal() == null) {
			throw new AdresseException("Code postal de l'adresse ne peut pas être null");
		}
		
		if (adresse.getLibelleRue() == null) {
			throw new AdresseException("libelle de l'adresse ne peut pas être null");
		}
		
		if (adresse.getVille() == null) {
			throw new AdresseException("ville de l'adresse ne peut pas être null");
		}
		
		getEm().persist(adresse);
		
	}

	public void insertAdresses(List<Adresse> adresses) throws AdresseException {
		if (!adresses.isEmpty()) {
			for (Adresse adresse : adresses) {
				getEm().persist(adresse);
			}
		} else {
			throw new AdresseException("liste intervenant ne peut pas être vide");
		}
		
	}


}
