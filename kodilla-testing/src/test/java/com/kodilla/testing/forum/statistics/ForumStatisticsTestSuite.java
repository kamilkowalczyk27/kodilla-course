package com.kodilla.testing.forum.statistics;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;
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
        assertEquals(2, forumStatistics.getUsersQuantity());
        assertEquals(0, forumStatistics.getPostsQuantity ());
        assertEquals(2, forumStatistics.getCommentsQuantity ());
        assertEquals(0, forumStatistics.getPostsAveragePerUser(),0.01);
        assertEquals(1, forumStatistics.getCommentsAveragePerUser (),0.01);
        assertEquals(0, forumStatistics.getCommentsAveragePerPost(),0.01);
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
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.usersNames()).thenReturn(listMock);

        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);

        //Then
        assertEquals(2, forumStatistics.getUsersQuantity());
        assertEquals(1000, forumStatistics.getPostsQuantity());
        assertEquals(2, forumStatistics.getCommentsQuantity ());
        assertEquals(500,forumStatistics.getPostsAveragePerUser(),0.01);
        assertEquals(1, forumStatistics.getCommentsAveragePerUser (),0.01);
        assertEquals(0.002, forumStatistics.getCommentsAveragePerPost(),0.01);
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
        assertEquals(2, forumStatistics.getUsersQuantity());
        assertEquals(2, forumStatistics.getPostsQuantity());
        assertEquals(0, forumStatistics.getCommentsQuantity());
        assertEquals(1, forumStatistics.getPostsAveragePerUser(),0.01);
        assertEquals(0, forumStatistics.getCommentsAveragePerUser (),0.01);
        assertEquals(0, forumStatistics.getCommentsAveragePerPost(),0.01);
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
        assertEquals(2, forumStatistics.getUsersQuantity());
        assertEquals(8, forumStatistics.getPostsQuantity());
        assertEquals(4, forumStatistics.getCommentsQuantity());
        assertEquals(4, forumStatistics.getPostsAveragePerUser(),0.01);
        assertEquals(2, forumStatistics.getCommentsAveragePerUser (),0.01);
        assertEquals(0.5, forumStatistics.getCommentsAveragePerPost(),0.01);
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
        assertEquals(2, forumStatistics.getUsersQuantity());
        assertEquals(2, forumStatistics.getPostsQuantity());
        assertEquals(8, forumStatistics.getCommentsQuantity());
        assertEquals(1, forumStatistics.getPostsAveragePerUser(),0.01);
        assertEquals(4, forumStatistics.getCommentsAveragePerUser (),0.01);
        assertEquals(4, forumStatistics.getCommentsAveragePerPost(),0.01);
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
        assertEquals(0, forumStatistics.getUsersQuantity());
        assertEquals(2, forumStatistics.getPostsQuantity());
        assertEquals(2, forumStatistics.getCommentsQuantity());
        assertEquals(0, forumStatistics.getPostsAveragePerUser(),0.01);
        assertEquals(0, forumStatistics.getCommentsAveragePerUser (),0.01);
        assertEquals(1, forumStatistics.getCommentsAveragePerPost(),0.01);
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
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(listMock);


        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getUsersQuantity());
        assertEquals(10, forumStatistics.getPostsQuantity());
        assertEquals(10, forumStatistics.getCommentsQuantity());
        assertEquals(0.1, forumStatistics.getPostsAveragePerUser(),0.01);
        assertEquals(0.1, forumStatistics.getCommentsAveragePerUser (),0.01);
        assertEquals(1, forumStatistics.getCommentsAveragePerPost(),0.01);
    }
}





















































