package com.kodilla.testing.shape;


public class Cricle implements Shape {
    private double radius;

    public Cricle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cricle)) return false;

        Cricle cricle = (Cricle) o;

        return Double.compare(cricle.radius, radius) == 0;
    }
}
