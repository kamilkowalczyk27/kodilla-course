package com.kodilla.stream.forumuser;

import java.sql.Array;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> usersList = new ArrayList<>();
    public Forum() {
        usersList.add(new ForumUser(1, "Kamil", 'M', LocalDate.of(1990, Month.MARCH, 5), 10));
        usersList.add(new ForumUser(2, "Magda", 'F', LocalDate.of(2005, Month.APRIL, 30),0));
        usersList.add(new ForumUser(3, "Wiesław", 'M', LocalDate.of(1967, Month.MAY, 13),3));
        usersList.add(new ForumUser(4, "Maria", 'F', LocalDate.of(1978, Month.JUNE, 3),5));
        usersList.add(new ForumUser(5, "Zbigniew", 'M', LocalDate.of(2005, Month.DECEMBER, 1),30));
    }

    public List<ForumUser> getList(){
        return new ArrayList<>(usersList);
    }
}





