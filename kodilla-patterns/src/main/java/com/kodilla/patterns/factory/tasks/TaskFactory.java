package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING";
    public static final String PAINTING_TASK = "PAINTING";
    public static final String SHOPPING_TASK = "SHOPPING";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Driving to", "Wroclaw", "Car");
            case PAINTING_TASK:
                return new PaintingTask("Painting", "White", "House");
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping", "Computer",1);
            default:
                return null;
        }
    }
}
