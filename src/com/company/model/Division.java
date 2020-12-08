package com.company.model;

public class Division implements Operational{
    @Override
    public double execute(double num1, double num2) {
        return num1 / num2;
    }
}
