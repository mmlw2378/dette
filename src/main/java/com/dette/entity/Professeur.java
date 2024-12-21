package com.dette.entity;

public class Professeur {
    private int id;
    private String nom;
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
    public Professeur(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // Constructors, getters, setters
}