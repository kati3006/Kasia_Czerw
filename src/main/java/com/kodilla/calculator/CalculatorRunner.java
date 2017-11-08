package com.kodilla.calculator;

class CalculatorRunner {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double resultAdd = calculator.add(1.0 , 3.0);
        System.out.println(resultAdd);

        double resultSub = calculator.sub(15.0 , 10.0);
        System.out.println(resultSub);
    }
}
