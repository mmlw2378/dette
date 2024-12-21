package com.dette.entity;

import java.util.List;

public class Cours {
    private int id;
    private String module;
    private Professeur professeur;
    private List<Classe> classes;

    // Constructeurs, getters et setters
    public Cours(String module2, Professeur professeur2, List<Classe> classes2) {
        this.id = module2;
        this.module = professeur2;
        this.professeur = classes2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public List<Classe> getClasses() {
        return classes;
    }

    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Cours{id=" + id + ", module='" + module + "', professeur=" + professeur + "}";
    }
}
