package com.kodilla.testing;

import com.kodilla.testing.calc.Calc;

public class TestingMain {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.add(12, 3));
        System.out.println(calc.sub(12, 5));
    }
}