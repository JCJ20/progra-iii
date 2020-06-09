package com.prograiii.swing.Services;

import com.prograiii.swing.Model.AlphabetModel;

import java.util.List;

public interface AlphabetServiceInterface {
    void saveDate();
    List<AlphabetModel> getFirstLetters();
    List<AlphabetModel> getSecondtLetters();
    List<AlphabetModel> getTherdtters();

    String getFila1();
    String getFila2();
    String getFila3();
}
