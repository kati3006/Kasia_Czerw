package com.kodilla.patterns.strategy.social;

public class User {
    private String firstName;
    private String lastName;
    private SocialPublisher socialPublisher;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public SocialPublisher getSocialPublisher() {
        return socialPublisher;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String share() {
        return socialPublisher.share();
    }
}
