package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BoardTestSuite {
    @Autowired
    private Board board;
    @Test
    public void testTaskAdd(){
        board.getToDoList().getTasks().add("Zadanie nr 1");
        board.getDoneList().getTasks().add("Zadanie nr 2");
        board.getInProgressList().getTasks().add("Zadanie nr 3");

        String s = board.getToDoList().getTasks().get(0);
        System.out.println(s);
        Assert.assertEquals("Zadanie nr 1", s);

        String b = board.getDoneList().getTasks().get(0);
        System.out.println(b);
        Assert.assertEquals("Zadanie nr 2", b);

        String p = board.getInProgressList().getTasks().get(0);
        System.out.println(p);
        Assert.assertEquals("Zadanie nr 3", p);

    }
}

