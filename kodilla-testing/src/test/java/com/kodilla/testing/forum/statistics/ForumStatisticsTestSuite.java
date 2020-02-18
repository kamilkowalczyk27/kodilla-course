package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;
import java.util.*;

public class ForumStatisticsTestSuite {

    @Test
    public void testCalculateAverageStatisticsWithZeroPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listMock = new ArrayList<>();
        for(int i = 0; i < 2; i++) {
            listMock.add("user");
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.usersNames()).thenReturn(listMock);

        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);

        //Then
        Assert.assertEquals(2, forumStatistics.getUsersQuantity());
        Assert.assertEquals(0, forumStatistics.getPostsQuantity ());
        Assert.assertEquals(2, forumStatistics.getCommentsQuantity ());
        Assert.assertEquals(0, forumStatistics.getPostsAveragePerUser());
        Assert.assertEquals(1, forumStatistics.getCommentsAveragePerUser ());
        Assert.assertEquals(0, forumStatistics.getCommentsAveragePerPost());
    }

    @Test
    public void testCalculateAverageStatisticsWithThousandPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listMock = new ArrayList<>();
        for(int i = 0; i < 2; i++) {
            listMock.add("user");
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(listMock);

        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);

        //Then
        Assert.assertEquals(2, forumStatistics.getUsersQuantity());
        Assert.assertEquals(1000, forumStatistics.getPostsQuantity());
        Assert.assertEquals(1000, forumStatistics.getCommentsQuantity ());
        Assert.assertEquals(500, forumStatistics.getPostsAveragePerUser());
        Assert.assertEquals(500, forumStatistics.getCommentsAveragePerUser ());
        Assert.assertEquals(1, forumStatistics.getCommentsAveragePerPost());
    }

    @Test
    public void testCalculateAverageStatisticsWithZeroComments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listMock = new ArrayList<>();
        for(int i = 0; i < 2; i++) {
            listMock.add("user");
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(listMock);

        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);

        //Then
        Assert.assertEquals(2, forumStatistics.getUsersQuantity());
        Assert.assertEquals(2, forumStatistics.getPostsQuantity());
        Assert.assertEquals(0, forumStatistics.getCommentsQuantity());
        Assert.assertEquals(1, forumStatistics.getPostsAveragePerUser());
        Assert.assertEquals(0, forumStatistics.getCommentsAveragePerUser ());
        Assert.assertEquals(0, forumStatistics.getCommentsAveragePerPost());
    }

    @Test
    public void testCalculateAverageStatisticsLessCommentsThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listMock = new ArrayList<>();
        for(int i = 0; i < 2; i++) {
            listMock.add("user");
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(8);
        when(statisticsMock.commentsCount()).thenReturn(4);
        when(statisticsMock.usersNames()).thenReturn(listMock);

        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);

        //Then
        Assert.assertEquals(2, forumStatistics.getUsersQuantity());
        Assert.assertEquals(8, forumStatistics.getPostsQuantity());
        Assert.assertEquals(4, forumStatistics.getCommentsQuantity());
        Assert.assertEquals(4, forumStatistics.getPostsAveragePerUser());
        Assert.assertEquals(2, forumStatistics.getCommentsAveragePerUser ());
        Assert.assertEquals(0.5, forumStatistics.getCommentsAveragePerPost());
    }

    @Test
    public void testCalculateAverageStatisticsMoreCommentsThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listMock = new ArrayList<>();
        for(int i = 0; i < 2; i++) {
            listMock.add("user");
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(8);
        when(statisticsMock.usersNames()).thenReturn(listMock);

        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);

        //Then
        Assert.assertEquals(2, forumStatistics.getUsersQuantity());
        Assert.assertEquals(2, forumStatistics.getPostsQuantity());
        Assert.assertEquals(8, forumStatistics.getCommentsQuantity());
        Assert.assertEquals(1, forumStatistics.getPostsAveragePerUser());
        Assert.assertEquals(4, forumStatistics.getCommentsAveragePerUser ());
        Assert.assertEquals(4, forumStatistics.getCommentsAveragePerPost());
    }

    @Test
    public void testCalculateAverageStatisticsWithZeroUsers() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listMock = new ArrayList<>();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.usersNames()).thenReturn(listMock);

        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getUsersQuantity());
        Assert.assertEquals(2, forumStatistics.getPostsQuantity());
        Assert.assertEquals(2, forumStatistics.getCommentsQuantity());
        Assert.assertEquals(0, forumStatistics.getPostsAveragePerUser());
        Assert.assertEquals(0, forumStatistics.getCommentsAveragePerUser ());
        Assert.assertEquals(1, forumStatistics.getCommentsAveragePerPost());
    }

    @Test
    public void testCalculateAverageStatisticsWithHundredUsers() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> listMock = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            listMock.add("user");
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.usersNames()).thenReturn(listMock);


        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, forumStatistics.getUsersQuantity());
        Assert.assertEquals(2, forumStatistics.getPostsQuantity());
        Assert.assertEquals(2, forumStatistics.getCommentsQuantity());
        Assert.assertEquals(0.02, forumStatistics.getPostsAveragePerUser());
        Assert.assertEquals(0.02, forumStatistics.getCommentsAveragePerUser ());
        Assert.assertEquals(1, forumStatistics.getCommentsAveragePerPost());
    }
}





















































