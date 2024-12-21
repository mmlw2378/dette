package com.dette.repository.list;

import com.dette.entity.Cours;

import java.util.List;

public interface CoursRepository {
    void ajouter(Cours cours);
    List<Cours> trouverParClasse(int idClasse) {
    return cours.stream()
                .filter(c -> c.getIdClasses().contains(idClasse))
                .collect(Collectors.toList());
     }  
}