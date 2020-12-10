package com.company.model;

public class CalcFactory {
    public static Operational getInstance(String operator) {

        switch (operator) {
            case "+":
                return new Sum();

            case "-":
                return new Subtract();

            case "x":
                return new Multiply();

            case "/":
                return new Division();

            case "%":
                return new Percentage();

                default:
                    return null;

        }
    }
}
