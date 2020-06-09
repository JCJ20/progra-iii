package com.prograiii.swing.Services;

import com.prograiii.swing.Model.ButtonModel;
import com.prograiii.swing.Repository.ButtonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ButtonService implements ButtonServiceInterface{
    @Autowired
    private ButtonRepository buttonRepository;

    @Override
    public void saveDate() {

//        buttonRepository.save(new ButtonModel("Ingresar"));
//        buttonRepository.save(new ButtonModel("Log In"));
//        buttonRepository.save(new ButtonModel("Registrar"));
    }

    @Override
    public String getRow() {
        ButtonModel buttonModel = buttonRepository.getTitleButton();
        String title = buttonModel.getTitleButton();
        return title;
    }

    @Override
    public List<ButtonModel> getAllTitleButtons() {
        List<ButtonModel> allTitles = new ArrayList<>();
        buttonRepository.findAll().forEach(allTitles::add);
        return allTitles;
    }


}
