package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapes = new ArrayList<>();
    public List<Shape> getShapes() {
        return shapes;
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public void showFigures() {
        for(Shape s: shapes) {
            System.out.println(s);
        }
    }
}
