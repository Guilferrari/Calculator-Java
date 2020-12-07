package com.company.model;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc implements ActionListener {

    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton addButton,subButton,mulButton,divButton;
    JButton decButton,equButton,delButton,clrButton,negButton;

    double num1=0,num2=0,result=0;
    char operator;

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
            operator ='+';
            textfield.setText("");
        }
        if(e.getSource()== subButton) {
            num1 = Double.parseDouble((textfield.getText()));
            operator ='-';
            textfield.setText("");
        }
        if(e.getSource()== mulButton) {
            num1 = Double.parseDouble((textfield.getText()));
            operator ='x';
            textfield.setText("");
        }
        if(e.getSource()== divButton) {
            num1 = Double.parseDouble((textfield.getText()));
            operator ='/';
            textfield.setText("");
        }
        if(e.getSource() == equButton) {
            num2 = Double.parseDouble(textfield.getText());
            switch (operator) {
                case'+':
                    result = num1 + num2;
                    break;
                case'-':
                    result = num1 - num2;
                    break;
                case'x':
                    result = num1 * num2;
                    break;
                case'/':
                    result = num1 / num2;
                    break;
            }
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
