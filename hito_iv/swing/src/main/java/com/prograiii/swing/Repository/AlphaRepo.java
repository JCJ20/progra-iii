package com.prograiii.swing.Repository;

import com.prograiii.swing.Model.AlphabetModel;
import com.prograiii.swing.Model.ButtonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AlphaRepo extends JpaRepository<AlphabetModel,Integer> {
//    @Query(value = "select * from alfabeto where id = 132", nativeQuery = true)
//    public AlphabetModel getFirstLetters();

    @Query(value = "select * from alfabeto where fila = 'uno'", nativeQuery = true)
    public AlphabetModel getFirstLetters();

    //public List<AlphabetModel> getFirstRow(); by wll

    @Query(value = "select * from alfabeto where fila = 'dos'", nativeQuery = true)
    public AlphabetModel getSecondLetters();

    @Query(value = "select * from alfabeto where fila = 'tres'", nativeQuery = true)
    public AlphabetModel getTherdLetters();
}
