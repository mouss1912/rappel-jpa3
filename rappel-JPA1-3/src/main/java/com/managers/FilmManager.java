package com.managers;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import com.entities.Film;
import com.exception.AdresseException;
import com.exception.CategorieException;
import com.exception.FilmException;
import com.exception.IntervenantException;
import com.exception.TacheException;

@Service
public class FilmManager extends MasterManager {
	
	private CategorieManager categorieManager;
	private IntervenantManager intervenantManager;
	
	public FilmManager(EntityManager em, CategorieManager categorieManager, IntervenantManager intervenantManager) {
		super(em);
		this.categorieManager = categorieManager;
		this.intervenantManager = intervenantManager;
	}

	public void insertFilm(Film film) throws FilmException, CategorieException, IntervenantException, AdresseException, TacheException {
		if (film.getAnnee_sortie() == null) {
			throw new FilmException("date de sortie de film ne peut pas être null ");
		}
		
		if (film.getTitre() == null) {
			throw new FilmException("titre de film ne peut pas être null ");
		}
		
		categorieManager.insertCategorie(film.getCategorie());
		//intervenantManager.insertIntervenant(film.getIntervenants());
		intervenantManager.insertIntervenants(film.getIntervenants());
		
		
		getEm().persist(film);
	}
}