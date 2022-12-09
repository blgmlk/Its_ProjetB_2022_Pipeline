package com.compagny.myapp;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "personne")
@Getter @Setter
public class Personne{
    @Id
    @GeneratedValue
    private Long id;
    
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresse;

    public Personne() {}

    public Personne(String nom, String prenom, LocalDate dateNaissance, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
    }

    // getters et setters
}