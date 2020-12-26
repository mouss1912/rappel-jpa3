package com.managers;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import com.entities.Categorie;
import com.exception.CategorieException;

@Service
public class CategorieManager extends MasterManager {

	public CategorieManager(EntityManager em) {
		super(em);
	}

	public void insertCategorie(Categorie categorie) throws CategorieException {
		if (categorie.getNom() == null) {
			throw new CategorieException("nom catégorie ne peut pas être null ..");
		}
		
		if (categorie.getDate_maj() == null) {
			throw new CategorieException("date de mise a jour de categorie ne peut pas être null ..");
		}
		
		this.getEm().persist(categorie);
	}

}