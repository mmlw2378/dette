package com.dette.services;

import com.dette.entity.Session;

import java.util.List;

public interface SessionService {
    void ajouterSession(Session session);
    List<Session> listerSessionsParCours(int idCours);
}
