package com.example.examen_h4.services;

import com.example.examen_h4.model.TraductorModel;
import com.example.examen_h4.repositories.RepositoryDic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiccionaryService implements DiccionaryServiceInterface {
    @Autowired
    private RepositoryDic repositoryDic;

    @Override
    public void saveDate() {

        if(repositoryDic.count()==0) {
            repositoryDic.save(new TraductorModel("MONDAY", "SEGUNDA-FEIRA", "LUNES"));
            repositoryDic.save(new TraductorModel("TUESDAY", "TERCA-FEIRA", "MARTES"));
            repositoryDic.save(new TraductorModel("WHENSDAY", "QUARTA-FEIRA", "MIERCOLES"));
            repositoryDic.save(new TraductorModel("THURSDAY", "QUINTA-FEIRA", "JUEVES"));
            repositoryDic.save(new TraductorModel("FRIDAY", "SEXTA-FEIRA", "VIERNES"));
            repositoryDic.save(new TraductorModel("SATURDAY", "SABADO", "SABADO"));
            repositoryDic.save(new TraductorModel("SUNDAY", "DOMINGO-FEIRA", "DOMINGO"));
        }

    }

    @Override
    public String traducir(String t, String l) {
        TraductorModel traductorModel = repositoryDic.getWordTranslate(t);
        String ingles =traductorModel.getEnglish();
        String ln_i = "ingles";
        String word =traductorModel.getWord();
        String ln_w = "español";
        String portugues =traductorModel.getPortugues();
        String ln_p = "portugues";
        String traduccion = "";

        if(l.equals(ln_i)){
            traduccion=ingles;
        }
        if(l.equals(ln_w)){
            traduccion=word;
        }
        if(l.equals(ln_p)){
            traduccion=portugues;
        }
        return traduccion;
    }
}
