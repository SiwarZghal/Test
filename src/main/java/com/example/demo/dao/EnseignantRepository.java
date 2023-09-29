package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Enseignant;

public interface EnseignantRepository extends
JpaRepository<Enseignant, Long> {
List<Enseignant>findByGrade(String grade);
List<Enseignant>findByEtablissement(String etablissement);}