package com.kodilla.patterns.strategy.social;

public class YGeneration extends User {
    public YGeneration(String firstName, String lastName) {
        super(firstName, lastName);

        setSocialPublisher(new SnapchatPublisher());
    }
}
