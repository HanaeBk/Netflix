package fr.uha.miage.project.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(unique=true)
	private String pseudo;
	private String name;
	private String prenom;
	@Column(unique=true)
	private String mail;
	private String password;
	private boolean uploads; // True = Admin ; False = Utilisateur normal

//	private Date valid;
//	private int montantMensuel;
//	private Long NmCarteBancaire;
	
	
	// Getters & Setters
	
	
	
	public boolean isUploads() {
		return uploads;
	}
	public void setUploads(boolean uploads) {
		this.uploads = uploads;
	}
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

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
/*	public Date getValid() {
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
*/

	
	
	
	


}
