package com.dette.services;

import java.util.List;

import com.dette.entity.Classe;
import com.dette.entity.Niveau;
import com.dette.repository.bd.ClasseRepositoryBd;

public class ClasseService {
    private final ClasseRepositoryBd repository;

    public ClasseService(ClasseRepositoryBd repository) {
        this.repository = repository;
    }

    public void ajouterClasse(Classe classe) {
        repository.ajouterClasse(classe);
    }

    public List<Classe> listerClassesParNiveau(Niveau niveau) {
        return repository.listerClassesParNiveau(niveau);
    }
}