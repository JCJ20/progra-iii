package com.prograiii.swing.GUI.Listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton currentButton = (JButton) actionEvent.getSource();
        JOptionPane.showMessageDialog(null, "Boton precionado: "+currentButton.getText());
    }
}
