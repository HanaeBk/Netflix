package fr.uha.miage.project.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Serie {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nom;
	private Realisateur realisateur;
	private String producteur;
	private String description;
//	private List<Long> idacteurParticipant;
	
	//private Category category;
	private int nbEpisode;
	private String UrlImage;
	
	
	// Getters & Setters
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@OneToMany(cascade=CascadeType.PERSIST)
	public Realisateur getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(Realisateur realisateur) {
		this.realisateur = realisateur;
	}
	public String getProducteur() {
		return producteur;
	}
	public void setProducteur(String producteur) {
		this.producteur = producteur;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
/*
	@ManyToOne
    @JoinColumn(name = "Serie_category_id")
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}*/
	public int getNbEpisode() {
		return nbEpisode;
	}
	public void setNbEpisode(int nbEpisode) {
		this.nbEpisode = nbEpisode;
	}
	public String getUrlImage() {
		return UrlImage;
	}
	public void setUrlImage(String urlImage) {
		UrlImage = urlImage;
	}
	
	
	
	
}
