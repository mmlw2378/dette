package com.dette.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.dette.entity.Classe;
import com.dette.entity.Cours;
import com.dette.entity.Etudiant;
import com.dette.entity.Session;
public class AttacheDeClasseService {
    private List<Etudiant> etudiants = new ArrayList<>();
    private List<Session> sessions = new ArrayList<>();

    public void inscrireEtudiant(Etudiant etudiant, Classe classe) {
        if (etudiants.contains(etudiant)) {
            System.out.println("Erreur : Cet étudiant est déjà inscrit.");
            return;
        }
        etudiant.setClasse(classe);
        etudiants.add(etudiant);
        System.out.println("Étudiant inscrit : " + etudiant);
    }

    public void reinscrireEtudiant(Etudiant etudiant, Classe nouvelleClasse) {
        if (!etudiants.contains(etudiant)) {
            System.out.println("Erreur : Cet étudiant n'est pas encore inscrit.");
            return;
        }
        etudiant.setClasse(nouvelleClasse);
        System.out.println("Étudiant réinscrit : " + etudiant);
    }

    public void planifierSession(Cours cours, LocalDate date, LocalTime heureDebut, LocalTime heureFin, String salle) {
        if (heureDebut.isAfter(heureFin)) {
            System.out.println("Erreur : L'heure de début doit être avant l'heure de fin.");
            return;
        }
        Session session = new Session(date, heureDebut, heureFin, salle);
        sessions.add(session);
        System.out.println("Session planifiée pour le cours : " + cours.getModule() + " - " + session);
    }
}
