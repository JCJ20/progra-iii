package com.example.examen_h4.gui.panels;


import com.example.examen_h4.gui.listeners.ButtonsListener;
import org.springframework.data.jpa.repository.query.Jpa21Utils;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class InteracctionPanel extends JPanel {


    public InteracctionPanel(){
        System.setProperty("btn_bg","#C1ECF1");
        this.setPreferredSize(new Dimension(600,400));
        this.setBackground(Color.white);
        this.setLayout(new GridLayout(2,0));

    }
    @PostConstruct
    public void createButtons(){

        this.add(this.inputPanel());
        this.add(this.createPanelTRaductor());
    }


    public JPanel createPanelTRaductor(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        ButtonsListener listener = new ButtonsListener();

        JButton btn_transalate = new JButton("TRANSLATE");
        JButton btn_clear = new JButton("CLEAR");
        btn_clear.setPreferredSize(new Dimension(100,50));
        btn_transalate.setPreferredSize(new Dimension(150,50));
        btn_clear.setBackground(Color.gray);
        btn_transalate.setForeground(Color.BLUE);
        btn_transalate.setBackground(Color.getColor("btn_bg"));

        panel.add(btn_clear);
        panel.add(btn_transalate);
        return panel;
    }

    public JPanel inputPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel word = new JLabel("WORD");
        JTextField txt_word = new JTextField(12);
        JLabel lenguaje = new JLabel("LENGUAJE");
        JTextField txt_lenguaje = new JTextField(12);
        JLabel result = new JLabel("RESULT");
        JTextField txt_result = new JTextField(12);
        panel.add(word);
        panel.add(txt_word);
        panel.add(lenguaje);
        panel.add(txt_lenguaje);
        panel.add(result);
        panel.add(txt_result);


        return panel;
    }
}
