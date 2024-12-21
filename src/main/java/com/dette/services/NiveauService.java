package com.dette.services;

import java.util.List;


public interface NiveauService {
    void save(NiveauService niveau);
    NiveauService findById(int id);
    List<NiveauService> findAll();
}
