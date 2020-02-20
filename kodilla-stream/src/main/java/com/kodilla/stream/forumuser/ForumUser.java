package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
     private final int IDNumber;
     private final String userName;
     private final char sex;
     private final LocalDate birthday;
     private final int postQuantity;

    public ForumUser(final int IDNumber, final String userName, final char sex, final LocalDate birthday, final int postQuantity) {
        this.IDNumber = IDNumber;
        this.userName = userName;
        this.sex = sex;
        this.birthday = birthday;
        this.postQuantity = postQuantity;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "IDNumber = " + IDNumber +
                ", userName = '" + userName + '\'' +
                ", sex = " + sex +
                ", birthday = " + birthday +
                ", postQuantity = " + postQuantity +
                '}';
    }
}
