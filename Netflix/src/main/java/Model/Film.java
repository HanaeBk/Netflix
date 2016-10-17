package Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String titre;
	private Realisateur realisateur;
	private List<Acteur> acteurParticipants;
	private String Url;
	private int nbVue;
	
	
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
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public int getNbVue() {
		return nbVue;
	}
	public void setNbVue(int nbVue) {
		this.nbVue = nbVue;
	}

	

	
	
	
	

}
