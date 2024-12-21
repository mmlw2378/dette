package com.dette.services.Impl;

import java.util.List;

import com.dette.entity.Session;
import com.dette.repository.list.SessionRepository;
import com.dette.services.SessionService;

public class SessionServiceImpl implements SessionService {
    private SessionRepository sessionRepository;

    public SessionServiceImpl(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    public void ajouterSession(Session session) {
        sessionRepository.ajouter(session);
    }

    public List<Session> listerSessionsParCours(int idCours) {
        return sessionRepository.trouverParCours(idCours);
    }
}
