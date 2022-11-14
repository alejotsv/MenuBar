package com.java21days;

import javax.swing.*;
import java.awt.*;

public class MenuBar extends JFrame {
    Dimension dim = new Dimension(600, 300);

    MenuBar(String title){
        super(title);
        JPanel panel = new JPanel();
        setSize(dim);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        add(panel);
    }



}
