package com.managers;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import com.entities.Tache;
import com.exception.TacheException;

@Service
public class TacheManager extends MasterManager {

	public TacheManager(EntityManager em) {
		super(em);
	}

	public void insertTache(Tache tache) throws TacheException {
		if (tache.getDate() == null) {
			throw new TacheException("date de début de la tache ,ne peut pas etre null ..");
		}

		if (tache.getDescription() == null) {
			throw new TacheException("description de la tache ,ne peut pas etre null ..");
		}

		getEm().persist(tache);
	}

	public void insertTaches(List<Tache> taches) throws TacheException {
		if (!taches.isEmpty()) {
			for (Tache tache : taches) {
				insertTache(tache);
			}
		}

	}

}
