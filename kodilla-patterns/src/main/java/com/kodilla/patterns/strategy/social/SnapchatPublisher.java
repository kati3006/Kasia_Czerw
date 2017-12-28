package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher {

    @Override
    public String share() {
        String s = "Info on Snapchat!";
        System.out.println(s);
        return s;
    }
}
