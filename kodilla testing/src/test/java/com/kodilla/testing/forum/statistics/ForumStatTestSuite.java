package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatTestSuite {
    Statistics statisticsMock = mock(Statistics.class);
    ForumStatistics fs = new ForumStatistics(statisticsMock);

    @Test
    public void testCalculateStatisticsPosts0 () {
        //Given
        int testPosts0 = 0;
        when(statisticsMock.postsCount()).thenReturn(testPosts0);

        //When
        fs.calculateAdvStatistics();

        //Then
        Assert.assertEquals(0, fs.getPostsCount());
        fs.showStatistics();
    }

    @Test
    public void testCalculateStatisticsPosts1000 () {
        //Given
        int testPosts1000 = 1000;
        when(statisticsMock.postsCount()).thenReturn(testPosts1000);

        //When
        fs.calculateAdvStatistics();

        //Then
        Assert.assertEquals(1000, fs.getPostsCount());
        fs.showStatistics();
    }

    @Test
    public void testCalculateStatisticsComments0 () {
        //Given
        int testComments0 = 0;
        when(statisticsMock.commentsCount()).thenReturn(testComments0);

        //When
        fs.calculateAdvStatistics();

        //Then
        Assert.assertEquals(0, fs.getCommentsCount());
        fs.showStatistics();
    }

    @Test
    public void testCalculateStatisticsPostsGraterThanComments() {
        //Given
        int testPosts10 = 10;
        int testComments5= 5;
        when(statisticsMock.postsCount()).thenReturn(testPosts10);
        when(statisticsMock.commentsCount()).thenReturn(testComments5);

        //When
        fs.calculateAdvStatistics();

        //Tthen
        Assert.assertTrue(testComments5 < testPosts10);
        fs.showStatistics();
    }

    @Test
    public void testCalculateStatisticsCommentsGraterThanPosts() {
        //given
        int testPosts5 = 5;
        int testComments10 = 10;
        when(statisticsMock.postsCount()).thenReturn(testPosts5);
        when(statisticsMock.commentsCount()).thenReturn(testComments10);


        //when
        fs.calculateAdvStatistics();

        //then6
        Assert.assertTrue(testComments10 > testPosts5);
        fs.showStatistics();
    }

    @Test
    public void testCalculateStatisticsUsers0 () {
        //Given
        List<String> testUsers = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(testUsers);

        //When
        fs.calculateAdvStatistics();

        //Then
        Assert.assertEquals(0, fs.getUsersCount());
        fs.showStatistics();
    }

    @Test
    public void testCalculateStatisticsUsers100 () {
        //Given
        List<String> testUsers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            testUsers.add("user" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(testUsers);

        //When
        fs.calculateAdvStatistics();

        //Then
        Assert.assertEquals(100, fs.getUsersCount());
        fs.showStatistics();
    }
}
