package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger logger = Logger.getLoggerInstance();
        logger.log("Hi new user");
        //When
        String s = logger.getLastLog();
        //Then
        Assert.assertEquals("Hi new user", s);
    }
}