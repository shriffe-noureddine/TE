package com.company;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Main {
    static JTextArea T = new JTextArea();

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame F = new JFrame();
                F.setTitle("Quiz 4 Exercise");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                F.getContentPane().add(T);
                F.setJMenuBar(createJMenuBar());
                F.getContentPane().add(createJToolBar(), BorderLayout.SOUTH);

                F.setSize(400, 400); // set Window size
                F.setVisible(true);
            }
        });
    }

    static JMenuBar createJMenuBar() {

        JMenuBar M = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu color = new JMenu("Color");

        JMenuItem clear = new JMenuItem("Clear");
        JMenuItem exit = new JMenuItem("Exit");

        JMenuItem red = new JMenuItem("Red");
        JMenuItem green = new JMenuItem("Green");
        JMenuItem blue = new JMenuItem("Blue");

        red.addActionListener(new ColorAction(T, Color.RED, "Red"));
        blue.addActionListener(new ColorAction(T, Color.BLUE, "Blue"));
        green.addActionListener(new ColorAction(T, Color.GREEN, "Green"));

        exit.addActionListener(new ExitAction());
        clear.addActionListener(new ClearAction(T));

        color.add(red);
        color.add(green);
        color.add(blue);

        file.add(clear);
        file.add(exit);

        M.add(file);
        M.add(color);

        return M;
    }

    static JToolBar createJToolBar() {
        JToolBar TB = new JToolBar();

        JButton red = new JButton("Red");
        JButton green = new JButton("Green");
        JButton blue = new JButton("Blue");

        red.addActionListener(new ColorAction(T, Color.RED, "Red"));
        green.addActionListener(new ColorAction(T, Color.GREEN, "green"));
        blue.addActionListener(new ColorAction(T, Color.BLUE, "Blue"));

        TB.add(red);
        TB.add(blue);
        TB.add(green);

        return TB;

    }

}
