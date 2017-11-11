package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calc.Calc;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calc calc = new Calc();

        if(calc.add(12,3)==15){
            System.out.println("Test OK");
        } else {
            System.out.println("Wystapil blad");
        }

        if(calc.sub(12,3)==9){
            System.out.println("Test OK");
        } else {
            System.out.println("Wystapil blad");
        }
    }
}