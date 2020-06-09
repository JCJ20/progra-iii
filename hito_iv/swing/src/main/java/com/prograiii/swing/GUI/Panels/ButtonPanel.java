package com.prograiii.swing.GUI.Panels;

import com.prograiii.swing.Model.ButtonModel;
import com.prograiii.swing.Services.ButtonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class ButtonPanel extends JPanel {
    @Autowired
    private ButtonService buttonService;

    public ButtonPanel(){
        this.setPreferredSize(new Dimension(600,100));
        this.setBackground(Color.BLUE);
        this.setLayout(new GridLayout(1,0));
    }

    @PostConstruct
    public void createButtons(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        List<ButtonModel> allTitles = buttonService.getAllTitleButtons();

        allTitles.forEach(buttonModel -> {
            JButton button = new JButton(buttonModel.getTitleButton());
            button.setPreferredSize(new Dimension(80,40));
            panel.add(button);
        });

//        JButton button = new JButton(title);
//        button.setPreferredSize(new Dimension(80,40));
//        panel.add(button);

        this.add(panel);
    }

}
