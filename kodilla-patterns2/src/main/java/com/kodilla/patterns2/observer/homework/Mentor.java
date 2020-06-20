package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int newExerciseCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void newExerciseToCheck(MentorForum mentorForum) {
        System.out.println(mentorName + ": New exercise to check " + "\n"
                + " (total: " + mentorForum.getExercises().size() + " exercises)");
        newExerciseCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getNewExerciseCount() {
        return newExerciseCount;
    }
}
