package com.company.model;

public class Sum implements Operational{
    @Override
    public double execute(double num1, double num2) {
        return num1 + num2;
    }
}
