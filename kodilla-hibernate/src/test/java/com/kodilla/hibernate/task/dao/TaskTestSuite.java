//package com.kodilla.hibernate.task.dao;
//
//import com.kodilla.hibernate.task.Task;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class TaskTestSuite {
//    @Autowired
//    private TaskDao taskDao;
//    @Test
//    public void testTaskDaoSave() {
//        Task task = new Task("Do homework", 7);
//        taskDao.save(task);
//        int id = task.getId();
//        List<Task> result = taskDao.findByDuration(7);
//        Assert.assertEquals(id, result.get(0).getId());
//    }
//}
