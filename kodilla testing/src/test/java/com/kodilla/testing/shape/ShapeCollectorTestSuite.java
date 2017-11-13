package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;


public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //given
        ShapeCollector sc = new ShapeCollector();
        Shape s = new Cricle(15);
        Shape t = new Triangle(5,6);
        // when
        sc.addFigure(s);
        sc.addFigure(t);
        // than
        Assert.assertEquals(2, sc.getShapes().size());
        sc.showFigures();
    }

    @Test
    public void testRemoveFigure() {
        //given
        ShapeCollector sc = new ShapeCollector();
        Shape s = new Cricle(15);
        Shape t = new Triangle(5,6);
        sc.addFigure(s);
        sc.addFigure(t);
        // when
        sc.removeFigure(s);
        sc.removeFigure(t);
        // than
        Assert.assertEquals(0, sc.getShapes().size());
        sc.showFigures();
    }

    @Test
    public void testGetFigure() {
        //given
        ShapeCollector sc = new ShapeCollector();
        Shape s1 = new Cricle(15);
        sc.addFigure(s1);
        // when
        Shape s2 = sc.getFigure(0);
        // than
        Assert.assertEquals(s1, s2);
        sc.showFigures();
    }
}
