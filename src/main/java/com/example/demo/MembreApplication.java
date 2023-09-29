package com.example.demo;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.AllArgsConstructor;

import com.example.demo.dao.MembreRepository;
import com.example.demo.entities.Enseignant;
import com.example.demo.entities.Etudiant;


@AllArgsConstructor
@SpringBootApplication
public class MembreApplication implements CommandLineRunner {
	MembreRepository membreRepository;

	public static void main(String[] args) {
		SpringApplication.run(MembreApplication.class, args);{
	

		}
		
	}

	@Override
	public void run(String... args) throws Exception {
		Etudiant etd1=Etudiant.builder()
				.cin("123456")
				.dateInscription(new Date()).dateNaissance(new Date())
				.diplome("mastère")
				.email("etd1@gmail.com")
				.password("pass1")
				.encadrant(null)
				.cv("cv1")
				.nom("abid")
				.prenom("youssef)")
				.sujet("blockhain")
				.build();
		Etudiant etd2=Etudiant.builder()
				.cin("125789")
				.dateInscription(new Date()).dateNaissance(new Date())
				.diplome("mastère")
				.email("etd2@gmail.com")
				.password("pass2")
				.encadrant(null)
				.cv("cv2")
				.nom("zghal")
				.prenom("samar)")
				.sujet("IA")
				.build();
	Enseignant ens1=Enseignant.builder()
			.cin("145936")
			.nom("ali")
			.prenom("Bradai")
			.dateInscription(new Date()).dateNaissance(new Date())
			.cv("cvEns1")
			.password("pssd")
			.email("b@gmail")
			.diplome("High")
			.sujet("sujet1")
			.grade("1")
			.etablissement("Info")
			.build();
	Enseignant ens2=Enseignant.builder()
			.cin("145008")
			.nom("alya")
			.prenom("Bradai")
			.dateInscription(new Date()).dateNaissance(new Date())
			.cv("cvEns2")
			.password("psswd")
			.email("Alya@gmail")
			.diplome("High")
			.sujet("sujet9")
			.grade("1")
			.etablissement("Info")
			.build();
	membreRepository.save(etd1);
	membreRepository.save(etd2);
	membreRepository.save(ens1);
	membreRepository.save(ens2);
	
		
	}


}
