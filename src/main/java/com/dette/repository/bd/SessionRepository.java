package com.dette.repository.bd;

import com.dette.entity.Cours;
import com.dette.entity.Niveau;
import com.dette.entity.Professeur;
import com.dette.entity.Classe;
import com.dette.entity.Session;
import com.dette.core.bd.DatabaseImpl;
import com.dette.repository.bd.ClasseRepositoryBd;
import com.dette.repository.bd.SessionRepositoryBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ClasseRepositoryBd {
    private final DatabaseImpl database;

    public ClasseRepositoryBd(DatabaseImpl database) {
        this.database = database;
    }

    public void ajouterClasse(Classe classe) {
        String query = "INSERT INTO classe (nom, niveau_id) VALUES (?, ?)";
        try (Connection connection = (Connection) database.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, classe.getNom());
            statement.setInt(2, classe.getNiveau().getId());
            statement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erreur lors de l'ajout de la classe", e);
        }
    }

    public List<Classe> listerClassesParNiveau(Niveau niveau) {
        List<Classe> classeList = new ArrayList<>();
        String query = "SELECT * FROM classe WHERE niveau_id = ?";

        try (Connection connection = (Connection) database.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, niveau.getId());
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Classe classe = new Classe(0, query, niveau);
                    classe.setId(resultSet.getInt("id"));
                    classe.setNom(resultSet.getString("nom"));
                    classe.setNiveau(niveau);
                    classeList.add(classe);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Erreur lors de la récupération des classes", e);
        }

        return classeList;
    }
}

public class SessionRepository {
    private final DatabaseImpl database;

    public SessionRepository(DatabaseImpl database) {
        this.database = database;
    }

    public void ajouterSession(Session session) {
        String query = "INSERT INTO session (cours_id, date, heure_debut, heure_fin, salle) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = (Connection) database.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, session.getCours().getId());
            statement.setObject(2, session.getDate());
            statement.setObject(3, session.getHeureDebut());
            statement.setObject(4, session.getHeureFin());
            statement.setString(5, session.getSalle());
            statement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erreur lors de l'ajout de la session", e);
        }
    }

    public List<Session> listerSessionsParCours(Cours cours) {
        List<Session> sessionList = new ArrayList<>();
        String query = "SELECT * FROM session WHERE cours_id = ?";

        try (Connection connection = (Connection) database.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, cours.getId());
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Session session = new Session(0, null, null, null, query, cours);
                    session.setId(resultSet.getInt("id"));
                    session.setCours(cours);
                    session.setDate(resultSet.getObject("date", LocalDateTime.class));
                    session.setHeureDebut(resultSet.getObject("heure_debut", LocalDateTime.class));
                    session.setHeureFin(resultSet.getObject("heure_fin", LocalDateTime.class));
                    session.setSalle(resultSet.getString("salle"));
                    sessionList.add(session);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Erreur lors de la récupération des sessions", e);
        }

        return sessionList;
    }
}
