package com.dette.repository.bd;

import com.dette.entity.Cours;
import com.dette.repository.Repository;
import java.util.List;

public class CoursRepositoryBd implements Repository<Cours> {
    @Override
    public void save(Cours entity) {
        // Implémentation pour sauvegarder le cours en base de données
    }

    @Override
    public Cours findById(int id) {
        // Implémentation pour trouver un cours par ID
        return null;
    }

    @Override
    public List<Cours> findAll() {
        // Implémentation pour récupérer tous les cours
        return null;
    }
}
