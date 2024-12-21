package com.dette.services;

import java.util.List;

import com.dette.entity.Cours;

public interface CoursService {
    void save(Cours cours);
    Cours findById(int id);
    List<Cours> findAll();
}
