package com.company.model;

public class Subtract implements Operational {
    @Override
    public double execute(double num1, double num2) {
        return num1 - num2;
    }
}
