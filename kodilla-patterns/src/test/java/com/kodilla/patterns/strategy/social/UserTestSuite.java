package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultPublisher() {
        //Given
        User john = new Millenials("John", "Smith");
        User sarah = new YGeneration("Sarah", "Smith");
        User basia = new ZGeneration("Basia", "Czerw");
        //When
        String s1 = john.share();
        String s2 = sarah.share();
        String s3 = basia.share();
        //Then
        Assert.assertEquals("Info on Facebook!", s1);
        Assert.assertEquals("Info on Snapchat!", s2);
        Assert.assertEquals("Info on Twitter!", s3);
    }

    @Test
    public void testAnotherPublisher() {
        //Given
        User john = new Millenials("John", "Smith");
        User sarah = new YGeneration("Sarah", "Smith");
        User basia = new ZGeneration("Basia", "Czerw");

        basia.setSocialPublisher(new FacebookPublisher());
        //When
        String s1 = john.share();
        String s2 = sarah.share();
        String s3 = basia.share();
        //Then
        Assert.assertEquals("Info on Facebook!", s1);
        Assert.assertEquals("Info on Snapchat!", s2);
        Assert.assertEquals("Info on Facebook!", s3);
    }
}
