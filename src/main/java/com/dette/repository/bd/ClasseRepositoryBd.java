package com.dette.repository.bd;

import com.dette.entity.Classe;
import com.dette.repository.Repository;
import java.util.List;

public class ClasseRepositoryBd implements Repository<Classe> {
    @Override
    public void save(Classe entity) {
        // Implémentation pour sauvegarder la classe
    }

    @Override
    public Classe findById(int id) {
        // Implémentation pour trouver une classe par ID
        return null;
    }

    @Override
    public List<Classe> findAll() {
        // Implémentation pour récupérer toutes les classes
        return null;
    }
}
