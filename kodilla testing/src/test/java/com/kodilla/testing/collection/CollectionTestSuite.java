package com.kodilla.testing.collection;

import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterCl-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCaseOddNumbersExterminatorEmpty() {
        //Given - przygotowanie danych testowych
        OddNumbersExterminator ext = new OddNumbersExterminator();
        List<Integer> inputList = new ArrayList<>();

        //When - testowana metoda
        List<Integer> outputList = ext.exterminate(inputList);

        //Then - sprawdzenie wyników
        Assert.assertEquals(0, outputList.size());
    }

    @Test
    public void testCaseOddNumbersExterminatorEven() {
        //Given - przygotowanie danych testowych
        OddNumbersExterminator ext = new OddNumbersExterminator();
        List<Integer> inputList = new ArrayList<>();
        inputList.add(2);
        inputList.add(5);
        inputList.add(45);
        inputList.add(12);
        inputList.add(3);
        inputList.add(7);
        inputList.add(6);

        //When - testowana metoda
        List<Integer> outputList = ext.exterminate(inputList);

        //Then - sprawdzenie wyników
        Assert.assertEquals(3, outputList.size());
    }
}

