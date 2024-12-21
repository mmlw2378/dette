package com.dette.views;


import com.dette.entity.Cours;
import com.dette.entity.Session;
import com.dette.services.SessionService;

import java.util.List;
import java.util.Scanner;

public class SessionView {
    private final SessionService service;

    public SessionView(SessionService service) {
        this.service = service;
    }

    public void afficherMenu() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("1. Ajouter une session");
            System.out.println("2. Lister les sessions par cours");
            System.out.println("0. Quitter");
            System.out.print("Choix: ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1 -> ajouterSession();
                case 2 -> listerSessionsParCours();
            }
        } while (choix != 0);
    }

    private void ajouterSession() {
        Scanner scanner = new Scanner(System.in);
        Session session = new Session();

        System.out.print("ID du cours: ");
        Cours cours = new Cours();
        cours.setId(scanner.nextInt());
        session.setCours(cours);

        System.out.print("Date (yyyy-MM-ddTHH:mm): ");
        session.setDate(LocalDateTime.parse(scanner.next()));

        System.out.print("Heure de début (yyyy-MM-ddTHH:mm): ");
        session.setHeureDebut(LocalDateTime.parse(scanner.next()));

        System.out.print("Heure de fin (yyyy-MM-ddTHH:mm): ");
        session.setHeureFin(LocalDateTime.parse(scanner.next()));

        System.out.print("Salle: ");
        scanner.nextLine(); // Clear buffer
        session.setSalle(scanner.nextLine());

        service.ajouterSession(session);
        System.out.println("Session ajoutée avec succès.");
    }

    private void listerSessionsParCours() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID du cours: ");
        Cours cours = new Cours();
        cours.setId(scanner.nextInt());

        List<Session> sessionList = service.listerSessionsParCours(cours);
        sessionList.forEach(session -> System.out.println("Session: " + session.getDate() + ", Salle: " + session.getSalle()));
    }
}
