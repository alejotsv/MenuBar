package com.java21days;

import javax.swing.*;
import java.awt.*;

public class MenuBar extends JFrame {
    Dimension dim = new Dimension(600, 300);

    MenuBar(String title, String[] options){
        super(title);
        JPanel panel = new JPanel();
        setSize(dim);
        setLookAndFeel("Nimbus");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Feed");
        JMenuItem[] menuItems = createMenuItems(options);
        addMenuItems(menu, menuItems);
        menuBar.add(menu);
        panel.add(menuBar);

        JButton[] buttons = createButtons(options);
        JToolBar toolBar = new JToolBar();
        addButtons(toolBar, buttons);
        panel.add(toolBar);

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

    void addButtons(JToolBar toolBar, JButton[] buttons){
        for(int i=0; i<buttons.length; i++){
            toolBar.add(buttons[i]);
        }
    }

    JMenuItem[] createMenuItems(String[] options){
        JMenuItem[] menuItems = new JMenuItem[options.length];
        for(int i=0; i<options.length; i++){
            JMenuItem menuItem = new JMenuItem(options[i]);
            menuItems[i] = menuItem;
        }
        return menuItems;
    }

    void addMenuItems(JMenu menu, JMenuItem[] menuItems){
        for(int i=0; i<menuItems.length; i++){
            menu.add(menuItems[i]);
        }
    }

    void setLookAndFeel(String name){
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (name.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
    }
}
