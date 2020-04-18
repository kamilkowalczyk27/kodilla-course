package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.doTask(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertEquals("Driving to", driving.getTaskName());
        Assert.assertEquals("Wroclaw", driving.executeTask());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }
    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.doTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals("Painting", painting.getTaskName());
        Assert.assertEquals("House", painting.executeTask());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.doTask(TaskFactory.SHOPPING_TASK);
        //When
        Assert.assertEquals("Shopping", shopping.getTaskName());
        Assert.assertEquals("Computer", shopping.executeTask());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }
}
