package StructuralDesignPatterns.DecoratorDesignPattern.NotificationLibrary;

import java.util.List;

public class BaseNotifier implements INotifier{

    List<String> emailIds;

    BaseNotifier(List<String> emails){
        this.emailIds = emails;
    }

    @Override
    public void sendMessage(String message) {
        for(String email: emailIds){
            System.out.println("Sending message - "+message+" to the email -> "+email);
        }
    }
    
}
