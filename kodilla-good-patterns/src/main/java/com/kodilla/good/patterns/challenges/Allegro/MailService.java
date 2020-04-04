package com.kodilla.good.patterns.challenges.Allegro;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Thank You " + user.getName() + " for Your order.");
    }
}
