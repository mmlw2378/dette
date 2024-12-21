package com.dette.entity;

public class Etudiant {
    private String matricule;
    private String nom;
    private String prenom;
    private Classe classe;

    public Etudiant(Classe classe, String matricule, String nom, String prenom) {
        this.classe = classe;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", classe=" + (classe != null ? classe.getNom() : "Aucune") +
                '}';
    }
}
