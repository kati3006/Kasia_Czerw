package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        String s = "Info on Twitter!";
        System.out.println(s);
        return s;
    }
}
