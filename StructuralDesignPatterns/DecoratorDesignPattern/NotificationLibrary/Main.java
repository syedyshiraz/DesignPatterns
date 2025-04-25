package StructuralDesignPatterns.DecoratorDesignPattern.NotificationLibrary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> emails = new ArrayList<>();
        emails.add("user1@example.com");
        emails.add("user2@example.com");
        emails.add("user3@example.com");
        emails.add("user4@example.com");
        emails.add("user5@example.com");
        INotifier notifier = new BaseNotifier(emails);

        INotifier facebookNotifier = new FacebookNotifier(notifier);
        facebookNotifier.sendMessage("facebook post");

        INotifier slackNotifier = new SlackNotifier(notifier);
        slackNotifier.sendMessage("Slack message");

    }
}
