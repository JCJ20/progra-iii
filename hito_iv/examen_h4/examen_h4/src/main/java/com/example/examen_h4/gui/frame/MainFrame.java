package com.example.examen_h4.gui.frame;

import com.example.examen_h4.gui.panels.InteracctionPanel;
import com.example.examen_h4.gui.panels.TraductorPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class MainFrame extends JFrame {
    @Autowired
    private TraductorPanel traductorPanel;
    @Autowired
    private InteracctionPanel interacctionPanel;

    public MainFrame(){
        this.setTitle("Hito 4 Traductor Progra III");
        this.setBounds(300, 200, 800, 600);
        this.setBackground(Color.ORANGE);
        this.setLayout(new GridLayout(1,0));
    }
    @PostConstruct
    public void createMainFrame(){
        this.add(traductorPanel);

        this.setVisible(true);
    }

}
