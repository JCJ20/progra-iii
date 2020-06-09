package com.example.examen_h4.repositories;

import com.example.examen_h4.gui.panels.TraductorPanel;
import com.example.examen_h4.model.TraductorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RepositoryDic extends JpaRepository<TraductorModel, Integer> {
    @Query(value = "SELECT * FROM diccionary d WHERE d.word = :wordSelected", nativeQuery = true)
    public TraductorModel getWordTranslate(@Param("wordSelected") String wordSelected);

    //    SELECT * FROM diccionary WHERE word = 'LUNES' OR portugues = 'LUNES' or english = 'LUNES'
    @Query(value = "SELECT * FROM diccionary WHERE word = 'LUNES'",
            nativeQuery = true)
    public TraductorModel getAllTranslate(@Param("wordSelected") String wordSelected);
}
