package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.entities.Acteur;
import com.entities.Adresse;
import com.entities.Categorie;
import com.entities.Film;
import com.entities.Producteur;
import com.entities.Realisateur;
import com.entities.TacheDatee;
import com.managers.FilmManager;
import com.repository.ActeurRepo;
import com.repository.CategorieRepo;
import com.repository.FilmRepo;
import com.repository.ProducteurRepo;
import com.repository.RealisateurRepo;
import com.repository.TacheRepo;

@EnableTransactionManagement
@SpringBootApplication
public class RappelJpa3Application implements CommandLineRunner {
	
	FilmManager filmManager;
	
	public RappelJpa3Application(FilmManager filmManager) {
		super();
		this.filmManager = filmManager;
	}

	/*
	@PersistenceContext
	EntityManager em;

	CategorieRepo categorieRepo;

	ActeurRepo acteurRepo;

	FilmRepo filmRepo;
	
	TacheRepo tacheRepo;
	
	RealisateurRepo realRepo;
	
	ProducteurRepo prodRepo;
	
	public RappelJpa3Application(CategorieRepo categorieRepo, ActeurRepo acteurRepo, FilmRepo filmRepo,
			TacheRepo tacheRepo, RealisateurRepo realRepo, ProducteurRepo prodRepo) {
		super();
		this.categorieRepo = categorieRepo;
		this.acteurRepo = acteurRepo;
		this.filmRepo = filmRepo;
		this.tacheRepo = tacheRepo;
		this.realRepo = realRepo;
		this.prodRepo = prodRepo;
	}
*/
	public static void main(String[] args) {
		SpringApplication.run(RappelJpa3Application.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {	
		
//		Ajoutez en base de données :film, 3acteurs et réalisateur 
		Categorie categorie = new Categorie();
		categorie.setDate_maj(LocalDateTime.now());
		categorie.setNom("Action");
		//em.persist(categorie);
		
		Adresse adres = new Adresse();
		adres.setCodePostal("30000");
		adres.setLibelleRue("rue ecluse");
		adres.setNumeroRue(12);
		adres.setVille("Nimes");
		//em.persist(adres);
		
		TacheDatee tache = new TacheDatee();
		tache.setDate(LocalDate.now());
		tache.setDateEcheance(LocalDate.of(2020, 12, 18));
		tache.setDescription("oula1");
		//em.persist(tache);
		
		Acteur acteur1 = new Acteur();
		acteur1.setNom("washington");
		acteur1.setPrenom("denzel");
		acteur1.setAdresse(adres);
		acteur1.setAgence("www");
		acteur1.setSalaire(20000.00);
		acteur1.getTaches().add(tache);
	//	em.persist(acteur1);
		
		Acteur acteur2 = new Acteur();
		acteur2.setNom("wick");
		acteur2.setPrenom("john");
		acteur2.getAdresse().add(adres);
		acteur2.setAgence("www");
		acteur2.setSalaire(23000.00);
		acteur2.getTaches().add(tache);
		//em.persist(acteur2);
		
		Acteur acteur3 = new Acteur();
		acteur3.setNom("will");
		acteur3.setPrenom("smith");
		acteur3.getAdresse().add(adres);
		acteur3.setAgence("www");
		acteur3.setSalaire(24000.00);
		acteur3.getTaches().add(tache);
		//em.persist(acteur3);
		
		Realisateur real = new Realisateur();
		real.getAdresse().add(adres);
		real.setCommition(25000.00);
		real.setNom("Tarkovski");
		real.setPrenom("Andre");
		real.getTaches().add(tache);
		
		Producteur prod = new Producteur();
		prod.setBudget(50000.0);
		prod.getAdresse().add(adres);
		prod.setNom("marvel");
		prod.setPrenom("prod");
		
		/*
		Film film = new Film();
		film.setTitre("xmen");
		film.setAnnee_sortie("2020");
		film.setCategorie(categorie);
		em.persist(film);
		film.getIntervenants().add(acteur1);
		film.getIntervenants().add(acteur2);
		film.getIntervenants().add(acteur3);	
		*/
		
		Film newFilm = new Film();
		newFilm.setTitre("Equalizer2");
		newFilm.setAnnee_sortie("2019");
		newFilm.setCategorie(categorie);
		newFilm.getIntervenants().add(acteur1);
		newFilm.getIntervenants().add(acteur2);
		newFilm.getIntervenants().add(acteur3);
		newFilm.getIntervenants().add(real);
		newFilm.getIntervenants().add(prod);
		
		filmManager.insertFilm(newFilm);
		
		
		
}
}
