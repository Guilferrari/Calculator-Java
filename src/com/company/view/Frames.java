package com.company.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Frames {
    public void init() {

        JFrame frame;
        JTextField textfield;
        JButton[] numberButtons = new JButton[10];
        JButton[] functionButtons = new JButton[9];
        JButton addButton,subButton,mulButton,divButton;
        JButton decButton,equButton,delButton,clrButton,negButton;
        JPanel panel;

        Font myFont = new Font("Roboto",Font.BOLD,30);

            frame = new JFrame("Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420, 550);
            frame.setLayout(null);

            textfield = new JTextField();
            textfield.setBounds(50, 25, 300, 50);
            textfield.setFont(myFont);
            textfield.setEditable(false);

            addButton = new JButton("+");
            subButton = new JButton("-");
            mulButton = new JButton("x");
            divButton = new JButton("/");
            decButton = new JButton(".");
            equButton = new JButton("=");
            delButton = new JButton("<-");
            clrButton = new JButton("C");
            negButton = new JButton("(-)");

            functionButtons[0] = addButton;
            functionButtons[1] = subButton;
            functionButtons[2] = mulButton;
            functionButtons[3] = divButton;
            functionButtons[4] = decButton;
            functionButtons[5] = equButton;
            functionButtons[6] = delButton;
            functionButtons[7] = clrButton;
            functionButtons[8] = negButton;

            for (int i = 0; i < 9; i++) {
                functionButtons[i].addActionListener((ActionListener) this);
                functionButtons[i].setFont(myFont);
                functionButtons[i].setFocusable(false);
            }

            for (int i = 0; i < 10; i++) {
                numberButtons[i] = new JButton(String.valueOf(i));
                numberButtons[i].addActionListener((ActionListener) this);
                numberButtons[i].setFont(myFont);
                numberButtons[i].setFocusable(false);
            }

            equButton.setBounds(205, 348, 145, 52);
            panel = new JPanel();
            panel.setBounds(50, 100, 300, 300);
            panel.setLayout(new GridLayout(5, 4, 10, 10));

            panel.add(clrButton);
            panel.add(divButton);
            panel.add(mulButton);
            panel.add(delButton);
            panel.add(numberButtons[7]);
            panel.add(numberButtons[8]);
            panel.add(numberButtons[9]);
            panel.add(subButton);
            panel.add(numberButtons[4]);
            panel.add(numberButtons[5]);
            panel.add(numberButtons[6]);
            panel.add(addButton);
            panel.add(numberButtons[1]);
            panel.add(numberButtons[2]);
            panel.add(numberButtons[3]);
            panel.add(equButton);
            panel.add(decButton);
            panel.add(negButton);
            panel.add(numberButtons[0]);

            frame.add(equButton);
            frame.add(panel);
            frame.add(textfield);
            frame.setVisible(true);

    }
}
