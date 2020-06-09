package com.prograiii.swing.Services;

import com.prograiii.swing.Model.ButtonModel;

import javax.swing.*;
import java.util.List;

public interface ButtonServiceInterface {

    public void saveDate();
    public String getRow();
    public List<ButtonModel> getAllTitleButtons();
}
