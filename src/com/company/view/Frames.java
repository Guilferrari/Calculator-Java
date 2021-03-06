package com.company.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.company.model.CalcFactory;
import com.company.model.Operational;

public class Frames implements ActionListener {

    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[10];
    JButton addButton,subButton,mulButton,divButton,perButton;
    JButton decButton,equButton,delButton,clrButton,negButton;
    JPanel panel;

    double num1=0,num2=0,result=0;
    String operator;

    public void init() {


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
            perButton = new JButton("%");

            functionButtons[0] = addButton;
            functionButtons[1] = subButton;
            functionButtons[2] = mulButton;
            functionButtons[3] = divButton;
            functionButtons[4] = decButton;
            functionButtons[5] = equButton;
            functionButtons[6] = delButton;
            functionButtons[7] = clrButton;
            functionButtons[8] = negButton;
            functionButtons[9] = perButton;

            for (int i = 0; i < 10; i++) {
                functionButtons[i].addActionListener(this);
                functionButtons[i].setFont(myFont);
                functionButtons[i].setFocusable(false);
            }

            for (int i = 0; i < 10; i++) {
                numberButtons[i] = new JButton(String.valueOf(i));
                numberButtons[i].addActionListener(this);
                numberButtons[i].setFont(myFont);
                numberButtons[i].setFocusable(false);
            }

            equButton.setBounds(282, 348, 65, 52);
            panel = new JPanel();
            panel.setBounds(50, 100, 300, 300);
            panel.setLayout(new GridLayout(5, 5, 10, 10));

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
            panel.add(perButton);
            panel.add(numberButtons[0]);


            frame.add(equButton);
            frame.add(panel);
            frame.add(textfield);
            frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        for(int i=0; i<10; i++) {
            if(e.getSource() == numberButtons[i]) {
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource()== decButton) {
            textfield.setText(textfield.getText().concat("."));
        }
        if(e.getSource()== addButton) {
            num1 = Double.parseDouble((textfield.getText()));
            operator = "+";
            textfield.setText("");
        }
        if(e.getSource()== subButton) {
            num1 = Double.parseDouble((textfield.getText()));
            operator = "-";
            textfield.setText("");
        }
        if(e.getSource()== mulButton) {
            num1 = Double.parseDouble((textfield.getText()));
            operator = "x";
            textfield.setText("");
        }
        if(e.getSource()== divButton) {
            num1 = Double.parseDouble((textfield.getText()));
            operator = "/";
            textfield.setText("");
        }
        if(e.getSource()== perButton) {
            num1 = Double.parseDouble((textfield.getText()));
            operator = "%";
            textfield.setText("");
        }
        if(e.getSource() == equButton) {

            num2 = Double.parseDouble(textfield.getText());
            Operational operational = CalcFactory.getInstance(operator);
            result = operational.execute(num1,num2);
            textfield.setText(String.valueOf(result));
            num1 = result;

        }
        if(e.getSource()== clrButton) {
            textfield.setText("");
        }
        if(e.getSource()== delButton) {
            String string = textfield.getText();
            textfield.setText("");
            for(int i = 0; i < string.length()-1; i++) {
                textfield.setText(textfield.getText()+string.charAt(i));
            }
        }
        if(e.getSource()== negButton) {
            double temp = Double.parseDouble(textfield.getText());
            temp *= -1;
            textfield.setText(String.valueOf(temp));

        }

    }

}
