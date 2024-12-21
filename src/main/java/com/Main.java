package com;

import com.dette.entity.Cours;
import com.dette.entity.Classe;
import com.dette.entity.Professeur;
import com.dette.repository.list.CoursRepository;
import com.dette.services.impl.CoursService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Dépôts
        CoursRepository coursRepo = new CoursRepository();
        CoursServiceImpl coursService = new CoursServiceImpl(CoursRepo);

        // Création des données
        Classe classe1 = new Class(1, "Terminale");
        Professeur prof1 = new Professeur(1, "Mr. Dupont");

        Cours coursMath = new Cours(1, "Mathématiques", prof1.getId(), List.of(classe1.getId()));
        coursService.creerCours(coursMath);

        // Affichage
        System.out.println("Cours de la classe Terminale :");
        coursService.listerCoursParClasse(classe1.getId()).forEach(System.out::println);
    }
}
