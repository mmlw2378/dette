package com.dette.repository.bd;

import com.dette.entity.Niveau;
import com.dette.repository.Repository;
import java.util.List;

public class NiveauRepositoryBd implements Repository<Niveau> {
    @Override
    public void save(Niveau entity) {
        // Implémentation pour sauvegarder le niveau
    }

    @Override
    public Niveau findById(int id) {
        // Implémentation pour trouver un niveau par ID
        return null;
    }

    @Override
    public List<Niveau> findAll() {
        // Implémentation pour récupérer tous les niveaux
        return null;
    }
}
