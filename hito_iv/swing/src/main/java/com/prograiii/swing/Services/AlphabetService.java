package com.prograiii.swing.Services;

import com.prograiii.swing.Model.AlphabetModel;
import com.prograiii.swing.Model.ButtonModel;
import com.prograiii.swing.Repository.AlphaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlphabetService implements AlphabetServiceInterface{

    private static final String Q_P = "Q,W,E,R,T,Y,U,I,O,P";
    private static final String A_L = "A,S,D,F,G,H,J,K,L";
    private static final String Z_M = "Z,X,C,V,B,N,M";

    @Autowired
    private AlphaRepo alphaRepo;

    @Override
    public void saveDate() {
        if(alphaRepo.count() == 0){
            alphaRepo.save(new AlphabetModel(Q_P,"uno"));
            alphaRepo.save(new AlphabetModel(A_L, "dos"));
            alphaRepo.save(new AlphabetModel(Z_M, "tres"));
        }

    }

    @Override
    public List<AlphabetModel> getFirstLetters() {
//        String fila1 = String.valueOf(alphaRepo.getFirstLetters());
//        String[] letra = fila1.split(",");
//        List<AlphabetModel> letras = new ArrayList<>();
//        for (String l : letra){
//        }
        //return alphaRepo.getFirstRow();
        return null ;
    }

    @Override
    public List<AlphabetModel> getSecondtLetters() {
        return null;
    }

    @Override
    public List<AlphabetModel> getTherdtters() {
        return null;
    }

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
