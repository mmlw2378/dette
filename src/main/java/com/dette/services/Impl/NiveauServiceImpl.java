package com.dette.services.Impl;

import com.dette.entity.Niveau;
import com.dette.repository.bd.NiveauRepositoryBd;
import java.util.List;

public class NiveauServiceImpl implements NiveauService {
    private NiveauRepositoryBd NiveauRepositoryBd = new NiveauRepositoryBd();

    @Override
    public void save(Niveau niveau) {
        NiveauRepositoryBd.save(niveau);
    }

    @Override
    public Niveau findById(int id) {
        return NiveauRepositoryBd.findById(id);
    }

    @Override
    public List<Niveau> findAll() {
        return NiveauRepositoryBd.findAll();
    }
}
