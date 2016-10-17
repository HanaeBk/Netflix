package Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	private Date valid;
	private int montantMensuel;
	private Long NmCarteBancaire;
	
	
	// Getters & Setters
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getValid() {
		return valid;
	}
	public void setValid(Date valid) {
		this.valid = valid;
	}
	public int getMontantMensuel() {
		return montantMensuel;
	}
	public void setMontantMensuel(int montantMensuel) {
		this.montantMensuel = montantMensuel;
	}
	public Long getNmCarteBancaire() {
		return NmCarteBancaire;
	}
	public void setNmCarteBancaire(Long nmCarteBancaire) {
		NmCarteBancaire = nmCarteBancaire;
	}


	
	
	
	


}
