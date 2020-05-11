package com.example.goowia.services;

import com.example.goowia.model.PersonaModel;
import com.example.goowia.repo.PersonaRepo;

public interface PersonaServiceInterface {
    public PersonaModel save(PersonaModel pModel);
    public PersonaModel update(PersonaModel pModel, Integer idPer);
    public Integer delete(Integer idPer);
}
