package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Mentor mrAndrzej = new Mentor("Mr. Andrzej");
        Mentor mrTomasz = new Mentor("Mr. Michal");
        User johnSmith = new JohnSmith();
        User ivoneEscobar = new IvoneEscobar();
        johnSmith.registerObserver(mrAndrzej);
        ivoneEscobar.registerObserver(mrTomasz);

        //When
        johnSmith.sendTask("20.1");
        johnSmith.sendTask("20.2");
        ivoneEscobar.sendTask("20.3");

        int countTasksAndrzej = mrAndrzej.getCountTasks();
        int countTasksTomasz = mrTomasz.getCountTasks();

        //Then
        Assert.assertEquals(2, countTasksAndrzej);
        Assert.assertEquals(1, countTasksTomasz);
    }
}
