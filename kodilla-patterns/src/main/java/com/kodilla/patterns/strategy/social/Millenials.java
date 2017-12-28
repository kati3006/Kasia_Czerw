package com.kodilla.patterns.strategy.social;

public class Millenials extends User {

    public Millenials(String firstName, String lastName) {
        super(firstName, lastName);

        setSocialPublisher(new FacebookPublisher());
    }
}
