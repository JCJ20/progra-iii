package com.prograiii.swing.GUI.Panels;

import com.prograiii.swing.GUI.Listener.ButtonListener;
import com.prograiii.swing.Model.ButtonModel;
import com.prograiii.swing.Services.AlphabetService;
import com.prograiii.swing.Services.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

@Component
public class AlphaPanel extends JPanel {
    @Autowired
    private AlphabetService alphabetService;

    public AlphaPanel(){
        System.setProperty("btn_bg","#C1ECF1");
        this.setPreferredSize(new Dimension(600,190));
        this.setBackground(Color.BLUE);
        this.setLayout(new GridLayout(3,0));

    }

    @PostConstruct
    public void createButtons(){
//        JPanel panel = new JPanel();
//        panel.setLayout(new FlowLayout());

//        String allLetters = alphabetService.getFila1();
//        String[] letraxletra = allLetters.split(",");
//         for(String l : letraxletra){
//             JButton button = new JButton(l);
//             button.setPreferredSize(new Dimension(50,50));
//             panel.add(button);
//         }
        this.add(this.createPanelButton(alphabetService.getFila1()));
        this.add(this.createPanelButton(alphabetService.getFila2()));
        this.add(this.createPanelButton(alphabetService.getFila3()));
    }

    public JPanel createPanelButton( String allLetters){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        ButtonListener listener = new ButtonListener();

        Font fuente = new Font("Arial",Font.BOLD,22);


//        String allLetters = alphabetService.getFila1();
        String[] letraxletra = allLetters.split(",");
        for(String l : letraxletra){
            JButton button = new JButton(l);
            button.setPreferredSize(new Dimension(50,50));
            button.setBackground(Color.getColor("btn_bg"));
            button.setForeground(Color.BLUE);
            button.setBorder(BorderFactory.createEmptyBorder());
            button.setFont(fuente);



//            ButtonListener listener = new ButtonListener();

            button.addActionListener(listener);

//            button.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent actionEvent) {
//                    JButton button1 = (JButton) actionEvent.getSource();
//                    JOptionPane.showMessageDialog(null, "Button " + button1.getText() + " presionado");
//
//                }
//            });
            panel.add(button);
        }
        return panel;
    }

}
