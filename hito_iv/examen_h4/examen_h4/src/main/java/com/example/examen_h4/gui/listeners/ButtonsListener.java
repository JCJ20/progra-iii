package com.example.examen_h4.gui.listeners;


import com.example.examen_h4.gui.panels.TraductorPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class ButtonsListener implements ActionListener {
@Autowired
private TraductorPanel traductorPanel;

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton currentButton = (JButton) actionEvent.getSource();
//        JOptionPane.showMessageDialog(null, "Boton precionado: "+currentButton.getText());

    }
}
