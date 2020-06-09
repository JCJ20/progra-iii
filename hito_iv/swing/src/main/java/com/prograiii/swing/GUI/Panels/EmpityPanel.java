package com.prograiii.swing.GUI.Panels;


import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class EmpityPanel extends JPanel {
    public EmpityPanel(){
        this.setPreferredSize(new Dimension(600,100));
        this.setBackground(Color.RED);
        this.setLayout(new GridLayout(1,0));
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        this.add(panel);
    }

}
