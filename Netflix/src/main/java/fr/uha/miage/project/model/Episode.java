package fr.uha.miage.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Episode {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String Titre;
	
	@ManyToOne
	private Serie serie;
	private int Numero;
	private String Url;
	private int nbView;
	
	

	// Getters & Setters
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		Titre = titre;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public int getNbView() {
		return nbView;
	}
	public void setNbView(int nbView) {
		this.nbView = nbView;
	}

	
	
}
