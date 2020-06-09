package com.prograiii.swing.GUI.Frame;

import com.prograiii.swing.GUI.Panels.AlphaPanel;
import com.prograiii.swing.GUI.Panels.ButtonPanel;
import com.prograiii.swing.GUI.Panels.EmpityPanel;
import com.prograiii.swing.GUI.Panels.PanelImages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class  MainFrame extends JFrame {
    @Autowired
    private EmpityPanel empityPanel;
    @Autowired
    private ButtonPanel buttonPanel;
    @Autowired
    private AlphaPanel alphaPanel;
    @Autowired
    private PanelImages panelImages;

    public MainFrame(){
        this.setTitle("Progra III");
        this.setBounds(300, 200, 800, 600);
        this.setBackground(Color.ORANGE);
        this.setLayout(new GridLayout(4,0));
    }

    @PostConstruct//para ejecutar automatico despues de ejecutar el constructor
    public void createMainFrame(){
//        this.add(buttonPanel);
        this.add(alphaPanel);
        this.add(panelImages);
        this.add(empityPanel);

        this.setVisible(true);
    }
}
