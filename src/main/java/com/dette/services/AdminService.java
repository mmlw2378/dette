package com.dette.services;

import java.util.ArrayList;
import java.util.List;
import com.dette.entity.Niveau;
import com.dette.entity.Cours;
import com.dette.entity.Professeur;
import com.dette.entity.Classe;



public class AdminService {
    private List<Niveau> niveaux = new ArrayList<>();
    private List<Cours> coursList = new ArrayList<>();

    public void creerNiveau(String nom) {
        for (Niveau niveau : niveaux) {
            if (niveau.getNom().equalsIgnoreCase(nom)) {
                System.out.println("Erreur : Le niveau existe déjà.");
                return;
            }
        }
        Niveau niveau = new Niveau(0, nom);
        niveaux.add(niveau);
        System.out.println("Niveau créé : " + niveau);
    }

    public void creerCours(String module, Professeur professeur, List<Classe> classes) {
        for (Cours cours : coursList) {
            if (cours.getModule().equalsIgnoreCase(module) && cours.getProfesseur().equals(professeur)) {
                System.out.println("Erreur : Ce cours existe déjà pour ce professeur.");
                return;
            }
        }
        Cours cours = new Cours(module, professeur, classes);
        coursList.add(cours);
        classes.forEach(classe -> classe.ajouterCours(cours));
        System.out.println("Cours créé : " + cours);
    }

    public List<Cours> afficherCoursParNiveau(Niveau niveau) {
        List<Cours> coursNiveau = new ArrayList<>();
        for (Cours cours : coursList) {
            for (Classe classe : cours.getClasses()) {
                if (classe.getNiveau().equals(niveau)) {
                    coursNiveau.add(cours);
                    break;
                }
            }
        }
        if (coursNiveau.isEmpty()) {
            System.out.println("Aucun cours trouvé pour ce niveau.");
        }
        return coursNiveau;
    }
}
