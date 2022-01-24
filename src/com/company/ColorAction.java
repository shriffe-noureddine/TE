package com.company;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextArea;

public class ColorAction extends AbstractAction {
    JTextArea T;
    Color CC;

    public ColorAction(JTextArea A, Color C, String Name) {
        super(Name);

        // ADD CODE
        A.setBackground(C);
    }

    public void actionPerformed(ActionEvent e) {
        // ADD CODE

    }
}