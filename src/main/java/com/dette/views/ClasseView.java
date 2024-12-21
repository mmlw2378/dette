package com.dette.views;

import com.dette.entity.Classe;
import com.dette.entity.Niveau;
import com.dette.services.ClasseService;

import java.util.List;
import java.util.Scanner;

public class ClasseView {
    private final ClasseService service;

    public ClasseView(ClasseService service) {
        this.service = service;
    }

    public void afficherMenu() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("1. Ajouter une classe");
            System.out.println("2. Lister les classes par niveau");
            System.out.println("0. Quitter");
            System.out.print("Choix: ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1 -> ajouterClasse();
                case 2 -> listerClassesParNiveau();
            }
        } while (choix != 0);
    }

    private void ajouterClasse() {
        Scanner scanner = new Scanner(System.in);
        Classe classe = new Classe();

        System.out.print("Nom de la classe: ");
        classe.setNom(scanner.nextLine());

        Niveau niveau = new Niveau(0, null);
        System.out.print("ID du niveau: ");
        niveau.setId(scanner.nextInt());
        classe.setNiveau(niveau);

        service.ajouterClasse(classe);
        System.out.println("Classe ajoutée avec succès.");
    }

    private void listerClassesParNiveau() {
        Scanner scanner = new Scanner(System.in);
        Niveau niveau = new Niveau(0, null);
        System.out.print("ID du niveau: ");
        niveau.setId(scanner.nextInt());

        List<Classe> classeList = service.listerClassesParNiveau(niveau);
        classeList.forEach(classe -> System.out.println("Classe: " + classe.getNom()));
    }
}
