package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class MentorForum implements Observable {
    private final List<Observer> observers;
    private final List<String> exercises;
    private final String name;

    public MentorForum(String name) {
        observers = new ArrayList<>();
        exercises = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observers);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.newExerciseToCheck(this);
        }
    }

    public void addExerciseToCheck(String post) {
        exercises.add(post);
        notifyObservers();
    }

    public List<String> getExercises() {
        return exercises;
    }

    public String getName() {
        return name;
    }
}
