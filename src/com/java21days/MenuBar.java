package com.java21days;

import javax.swing.*;
import java.awt.*;

public class MenuBar extends JFrame {
    Dimension dim = new Dimension(600, 300);

    MenuBar(String title, String[] options){
        super(title);
        JPanel panel = new JPanel();
        setSize(dim);
        JButton[] buttons = createButtons(options);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        add(panel);
    }

    JButton[] createButtons(String[] options){
        JButton[] buttons = new JButton[options.length];
        for(int i=0; i<options.length; i++){
            ImageIcon icon = new ImageIcon(getClass().getResource("res/" + options[i].toLowerCase() + ".png"));
            String text = options[i];
            JButton btn = new JButton(text, icon);
            buttons[i] = btn;
        }

        return buttons;
    }


}
