package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public static Task createTask(String kindOfTask) {
        switch (kindOfTask) {
            case SHOPPING: return new ShoppingTask("shopping", "bananas", 5);
            case PAINTING: return new PaintingTask("paint a room", "blue","living room");
            case DRIVING: return new DrivingTask("driving home", "home", "car");
            default: return null;
        }
    }
}
