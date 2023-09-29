package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Getter @Setter
@AllArgsConstructor
@DiscriminatorValue("etd")




public class Etudiant extends Membre implements Serializable{
    Date dateInscription;
	String diplome;
	String sujet;
	@ManyToOne
	private Enseignant encadrant;
	
	@Builder
	public Etudiant(String cin,String nom,String prenom,String cv,
			String email,String password, Date dateNaissance,
			Date dateInscription, String diplome, String sujet, Enseignant encadrant) {
		super(cin, nom, prenom, cv, email, password, dateNaissance);
		this.dateInscription = dateInscription;
		this.diplome = diplome;
		this.sujet = sujet;
		this.encadrant=encadrant;
	}
	
}