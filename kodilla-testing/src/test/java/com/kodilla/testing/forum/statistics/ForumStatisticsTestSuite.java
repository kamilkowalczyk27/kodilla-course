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
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getPostsQuantity());
    }

    @Test
    public void testCalculateAverageStatisticsWithThousendPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, forumStatistics.getPostsQuantity());
    }

    @Test
    public void testCalculateAverageStatisticsWithZeroComments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getCommentsQuantity());
    }

    @Test
    public void testCalculateAverageStatisticsLessCommentsThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(4);
        when(statisticsMock.postsCount()).thenReturn(6);
        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);
        //Then
        Assert.assertEquals(6, forumStatistics.getPostsQuantity());
        Assert.assertEquals(4, forumStatistics.getCommentsQuantity());
    }

    @Test
    public void testCalculateAverageStatisticsMoreCommentsThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(8);
        when(statisticsMock.postsCount()).thenReturn(2);
        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2, forumStatistics.getPostsQuantity());
        Assert.assertEquals(8, forumStatistics.getCommentsQuantity());
    }

    @Test
    public void testCalculateAverageStatisticsWithZeroUsers() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getUsersQuantity());
    }

    @Test
    public void testCalculateAverageStatisticsWithHundredUsers() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> listMock = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listMock.add("Users");
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAverageStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, forumStatistics.getUsersQuantity());
    }
}





















































