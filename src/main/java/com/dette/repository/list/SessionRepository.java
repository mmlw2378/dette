package com.dette.repository.list;

import java.util.List;

import com.dette.entity.Session;

public interface SessionRepository {
    void ajouter(Session session);
    List<Session> trouverParCours(int idCours);
}
