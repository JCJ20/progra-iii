package com.example.examen_h4.services;

import com.example.examen_h4.model.AlphabetModel;
import com.example.examen_h4.repositories.RepositoryAlphabet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlphabetService implements AlpahabetServiceInterface {
    private static final String Q_P = "Q,W,E,R,T,Y,U,I,O,P";
    private static final String A_L = "A,S,D,F,G,H,J,K,L";
    private static final String Z_M = "Z,X,C,V,B,N,M";

    @Autowired
    private RepositoryAlphabet alphaRepo;

    @Override
    public String getFila1() {
        AlphabetModel alphabetModel = alphaRepo.getFirstLetters();
        String fila1 = alphabetModel.getLetter();

        return fila1;
    }

    @Override
    public String getFila2() {
        AlphabetModel alphabetModel = alphaRepo.getSecondLetters();
        String fila2 = alphabetModel.getLetter();
        return fila2;
    }

    @Override
    public String getFila3() {
        AlphabetModel alphabetModel = alphaRepo.getTherdLetters();
        String fila3 = alphabetModel.getLetter();
        return fila3;
    }
}
