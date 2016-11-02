package fr.uha.miage.project.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull
	@Column(unique=true)
	private String pseudo;
	private String name;
	private String prenom;
	@NotNull
	@Size(min=2, max=30)
	@Column(unique=true)
	private String mail;
	@NotNull
	@Size(min=4, max=30)
	private String password;
	private boolean uploads; 
	private boolean admin=false;// True = Admin ; False = Utilisateur normal

//	private Date valid;
//	private int montantMensuel;
//	private Long NmCarteBancaire;
	
	
	// Getters & Setters
	
	
	
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
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
