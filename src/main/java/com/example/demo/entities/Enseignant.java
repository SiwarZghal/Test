package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
@DiscriminatorValue("ens")



public class Enseignant extends Membre implements Serializable{
	
	String grade;
	String etablissement;
	
	@OneToMany(mappedBy="encadrant")
	Collection<Etudiant> ListEtudiants; 
	@Builder
	public Enseignant(String cin,String nom,String prenom,String cv,
			String email,String password, Date dateNaissance,
			Date dateInscription, String diplome, String sujet,String grade,String etablissement) {
		this.grade = grade;
		this.etablissement = etablissement;
	}
	
}