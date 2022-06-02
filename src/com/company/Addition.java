package com.company;

public class Addition implements Operation{

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

}
