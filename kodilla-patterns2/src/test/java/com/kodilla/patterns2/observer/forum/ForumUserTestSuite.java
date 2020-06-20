package com.kodilla.patterns2.observer.forum;

import com.kodilla.patterns2.obderver.forum.ForumTopic;
import com.kodilla.patterns2.obderver.forum.ForumUser;
import com.kodilla.patterns2.obderver.forum.JavaHelpForumTopic;
import com.kodilla.patterns2.obderver.forum.JavaToolsForumTopic;
import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmimth = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmimth);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("Hi everyone, can you help me with a loop?");
        javaHelpForum.addPost("Better try use while loop in this case");
        javaToolsForum.addPost("Help pls, MySQL db doesn't want to work");
        javaHelpForum.addPost("Why while? Is is better?");
        javaToolsForum.addPost("When I try to log in I got 'bad credentials' message.");
        //Then
        assertEquals(3, johnSmimth.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}