package com.example.examen_h4.gui.panels;

import com.example.examen_h4.gui.listeners.ButtonsListener;
import com.example.examen_h4.services.AlphabetService;
import com.example.examen_h4.services.DiccionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.List;

@Component
public class TraductorPanel extends JPanel {
    @Autowired
    private AlphabetService alphabetService;
    @Autowired
    private DiccionaryService diccionaryService;

    JTextField txt_word, txt_lenguaje, txt_result;
    JLabel word, lenguaje, result;
    JButton btn_transalate, btn_clear;
//    List<String> lista =  new ArrayList<String>();
    String cadenaA = "";
    String cadenaB = "";
    String cadenaFinal = "";


    public TraductorPanel(){
        System.setProperty("btn_bg","#C1ECF1");
        this.setBounds(305,205,600,600);
//        this.setPreferredSize(new Dimension(600,150));
        this.setBackground(Color.BLUE);
        this.setLayout(new GridLayout(5,0));

    }

    @PostConstruct
    public void createButtons(){

        this.add(this.createPanelButton(alphabetService.getFila1()));
        this.add(this.createPanelButton(alphabetService.getFila2()));
        this.add(this.createPanelButton(alphabetService.getFila3()));
        this.add(this.inputPanel());
        this.add(this.createPanelTRaductor());

    }


    public JPanel createPanelButton(String allLetters){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,3,3));

        ButtonsListener listener = new ButtonsListener();
        FocusListener listener1 = new FocusListener() {
            @Override
            public void focusGained(FocusEvent focusEvent) {

            }

            @Override
            public void focusLost(FocusEvent focusEvent) {

            }
        };

        Font fuente = new Font("Arial",Font.BOLD,22);

        String[] letraxletra = allLetters.split(",");
        for(String l : letraxletra){
            JButton button = new JButton(l);
            button.setPreferredSize(new Dimension(50,50));
            button.setBackground(Color.getColor("btn_bg"));
            button.setForeground(Color.BLUE);
            button.setBorder(BorderFactory.createEmptyBorder());
            button.setFont(fuente);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    JButton button1 = (JButton) actionEvent.getSource();

                    cadenaA = button1.getText();
//                    txt_word.setText(cadenaA);
                    cadenaB = txt_word.getText();
                    txt_word.setText(cadenaB+cadenaA);
//                    cadenaFinal = (cadenaB+cadenaA);


                }
            });

            panel.add(button);
        }
        return panel;
    }

    public JPanel createPanelTRaductor(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        ButtonsListener listener = new ButtonsListener();

        btn_transalate = new JButton("TRANSLATE");
        btn_clear = new JButton("CLEAR");
        btn_clear.setPreferredSize(new Dimension(100,50));
        btn_transalate.setPreferredSize(new Dimension(150,50));
        btn_clear.setBackground(Color.gray);
        btn_transalate.setForeground(Color.BLUE);
        btn_transalate.setBackground(Color.getColor("btn_bg"));

        btn_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton button1 = (JButton) actionEvent.getSource();
                String clear = "";
                txt_word.setText(clear);
                txt_lenguaje.setText(clear);
                txt_result.setText(clear);
            }
        });

        btn_transalate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JButton button2 = (JButton) actionEvent.getSource();
                String w = txt_word.getText();
                String l = txt_lenguaje.getText();

                String t = diccionaryService.traducir(w,l);

                txt_result.setText(t);

            }
        });

        panel.add(btn_clear);
        panel.add(btn_transalate);
        return panel;
    }

    public JPanel inputPanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        word = new JLabel("WORD");
        txt_word = new JTextField("",12);

        lenguaje = new JLabel("LENGUAJE");
        txt_lenguaje = new JTextField("",12);

        result = new JLabel("RESULT");
        txt_result = new JTextField("",12);
        panel.add(word);
        panel.add(txt_word);
        panel.add(lenguaje);
        panel.add(txt_lenguaje);
        panel.add(result);
        panel.add(txt_result);


        return panel;
    }

}
