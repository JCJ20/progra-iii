package com.example.goowia.repo;

import com.example.goowia.model.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepo extends JpaRepository<PersonaModel,Integer> {

    }
