package com.dette.services.Impl;

import com.dette.entity.Cours;
import com.dette.services.CoursService;
import com.dette.repository.bd.CoursRepositoryBd;
import java.util.List;

public class CoursServiceImpl implements CoursService {
    private CoursRepositoryBd CoursRepositoryBd = new CoursRepositoryBd();

    @Override
    public void save(Cours Cours) {
        CoursRepositoryBd.save(Cours);
    }

    @Override
    public Cours findById(int id) {
        return CoursRepositoryBd.findById(id);
    }

    @Override
    public List<Cours> findAll() {
        return CoursRepositoryBd.findAll();
    }
}
