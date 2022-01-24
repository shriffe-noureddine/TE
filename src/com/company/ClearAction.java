package com.company;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextArea;

public class ClearAction extends AbstractAction {
    JTextArea T;

    public ClearAction(JTextArea A) {
        super("Clear");
        T = A;
    }

    public void actionPerformed(ActionEvent e) {
        T.setText("");
    }
}
