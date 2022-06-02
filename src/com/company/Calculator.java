package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {

    private Map<Character, Operation> operationMap = new HashMap<>();

    public Calculator() {

        operationMap.put('+', new Addition());
        operationMap.put('-', new Substruction());
        operationMap.put('*', new Multiplying());
        operationMap.put('/', new Dividing());
    }

    public double makeCalculation(double firstNumber, double secondNumber, char operation){

        Operation operationMapValue = null;

        if (operationMap.containsKey(operation)) {
            operationMapValue = operationMap.get(operation);
        } else {
            System.out.println("Invalid operation. " +
                    "Available operations : +, -, *, /");
        }

        return operationMapValue.calculate(firstNumber, secondNumber);

    }


}
