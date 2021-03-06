package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        return whatToBuy;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (quantity > 0 && taskName != null) {
            System.out.println("Task: " + taskName + " " +  whatToBuy +"." + " Quantity: " + quantity);
        } return true;
    }
}
