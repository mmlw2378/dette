package com.dette.entity;

import java.util.List;

public class Classe {
    private int id;
    private String nom;
    private Niveau niveau;
    private List<Etudiant> etudiants;

    // Constructeurs, getters et setters
    public Classe(int id, String nom, Niveau niveau) {
        this.id = id;
        this.nom = nom;
        this.niveau = niveau;
    }

    public Classe() {
        //TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    @Override
    public String toString() {
        return "Classe{id=" + id + ", nom='" + nom + "', niveau=" + niveau + "}";
    }
}
