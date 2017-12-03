package com.kodilla.good.patterns.chellenges;

import java.time.LocalDate;

public class OrderRequest {
    public User user;
    public LocalDate when;
    public String to;

    public OrderRequest(final User user, final LocalDate when, final String to) {
        this.user = user;
        this.when = when;
        this.to = to;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getWhen() {
        return when;
    }

    public String getTo() {
        return to;
    }
}


