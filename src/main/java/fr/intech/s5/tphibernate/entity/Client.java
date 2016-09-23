package fr.intech.s5.tphibernate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "client")

public class Client implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDFIC")
	public long idClient;
	
	@Column(name="NOM", nullable = false, length=255)
	private String nom;
	
	@Column(name="PRENOM", nullable = false, length=255)
	private String prenom;
	
	@Column(name="ADRE", nullable = false, length=255)
	private String adresse;
	
	@Column(name="CP", nullable = false, length=5)
	private String codePostal;
	
	@Column(name="VILLE", nullable = false, length=50)
	private String ville;
	
	@Column(name="EMAIL", nullable = false, length=255)
	private String email;
	
	@Column(name="PSW", nullable = false, length=255)
	private String password;

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
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
	
	
	
}
