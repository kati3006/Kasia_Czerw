package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        String s = "Info on Facebook!";
        System.out.println(s);
        return s;
    }
}
