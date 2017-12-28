package com.kodilla.patterns.strategy.social;

public class ZGeneration extends User {
    public ZGeneration(String firstName, String lastName) {
        super(firstName, lastName);

        setSocialPublisher(new TwitterPublisher());
    }
}
