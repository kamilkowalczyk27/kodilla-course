package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MentorForumTestSuite {
    @Test
    public void testNewExercisesToCheck() {
        //Given
        MentorForum javaJanuary2020 = new JavaJanuary2020();
        MentorForum javaMarch2020 = new JavaMarch2020();
        Mentor janKowaski = new Mentor("Jan Kowalski");
        Mentor adamNowak = new Mentor("Adam Nowak");
        javaJanuary2020.registerObserver(janKowaski);
        javaMarch2020.registerObserver(adamNowak);
        //When
        javaJanuary2020.addExerciseToCheck("Module 2.1");
        javaJanuary2020.addExerciseToCheck("Module 3.5");
        javaMarch2020.addExerciseToCheck("Module 13.5");
        javaJanuary2020.addExerciseToCheck("Module 9.5");
        javaMarch2020.addExerciseToCheck("Module 19.2");
        javaMarch2020.addExerciseToCheck("Module 5.5");
        javaJanuary2020.addExerciseToCheck("Module 1.4");
        //Then
        assertEquals(4, janKowaski.getNewExerciseCount());
        assertEquals(3, adamNowak.getNewExerciseCount());
    }
}
