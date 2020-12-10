package com.company.model;

public class Percentage implements Operational {

    @Override
    public double execute(double num1, double num2) {
        return (num1 / 100) * num2;
    }
}
