package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        //When
        double result = ArrayOperations.getAverage(array);

        //Then
        System.out.println(result);
        Assert.assertEquals(10.5, result, 0.1);
    }
}
