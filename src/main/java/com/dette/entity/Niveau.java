package com.dette.entity;

import java.util.List;

public class Niveau {
    private int id;
    private String nom;
    private List<Classe> classes;

    // Constructeurs, getters et setters
    public Niveau(int id, String nom) {
        this.id = id;
        this.nom = nom;
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

    public List<Classe> getClasses() {
        return classes;
    }

    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Niveau{id=" + id + ", nom='" + nom + "'}";
    }
}
