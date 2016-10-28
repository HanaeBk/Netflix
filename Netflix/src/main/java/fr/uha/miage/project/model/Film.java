package fr.uha.miage.project.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Film {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String titre;
	private Realisateur realisateur;
	private List<Acteur> acteurParticipants;
	private String UrlVideo;
	private String UrlImage;
	private int nbVue;
	
	

	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// Getters & Setters
		
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Realisateur getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(Realisateur realisateur) {
		this.realisateur = realisateur;
	}
	public List<Acteur> getActeurParticipants() {
		return acteurParticipants;
	}
	public void setActeurParticipants(List<Acteur> acteurParticipants) {
		this.acteurParticipants = acteurParticipants;
	}
	
	public String getUrlVideo() {
		return UrlVideo;
	}
	public void setUrlVideo(String urlVideo) {
		UrlVideo = urlVideo;
	}
	public String getUrlImage() {
		return UrlImage;
	}
	public void setUrlImage(String urlImage) {
		UrlImage = urlImage;
	}
	public int getNbVue() {
		return nbVue;
	}
	public void setNbVue(int nbVue) {
		this.nbVue = nbVue;
	}

	

	
	
	
	

}
