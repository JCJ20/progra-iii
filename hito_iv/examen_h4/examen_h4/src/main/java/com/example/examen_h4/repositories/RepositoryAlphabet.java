package com.example.examen_h4.repositories;

import com.example.examen_h4.model.AlphabetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RepositoryAlphabet extends JpaRepository<AlphabetModel,Integer> {
    @Query(value = "select * from alfabeto where fila = 'uno'", nativeQuery = true)
    public AlphabetModel getFirstLetters();

    //public List<AlphabetModel> getFirstRow(); by wll

    @Query(value = "select * from alfabeto where fila = 'dos'", nativeQuery = true)
    public AlphabetModel getSecondLetters();

    @Query(value = "select * from alfabeto where fila = 'tres'", nativeQuery = true)
    public AlphabetModel getTherdLetters();
}
