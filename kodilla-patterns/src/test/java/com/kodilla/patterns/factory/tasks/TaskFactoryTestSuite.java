package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testCreateTask() {
        //given

        //when
        Task result = TaskFactory.createTask(TaskFactory.DRIVING);
        Task result2 = TaskFactory.createTask(TaskFactory.PAINTING);
        Task result3 = TaskFactory.createTask(TaskFactory.SHOPPING);

        //Then
        Assert.assertEquals("driving home",result.getTaskName());
        Assert.assertEquals("paint a room",result2.getTaskName());
        Assert.assertEquals("shopping",result3.getTaskName());
    }
}
