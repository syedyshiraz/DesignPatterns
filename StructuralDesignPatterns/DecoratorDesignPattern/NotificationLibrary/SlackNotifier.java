package StructuralDesignPatterns.DecoratorDesignPattern.NotificationLibrary;

public class SlackNotifier extends NotifierDecorator{

    SlackNotifier(INotifier wrappee) {
        super(wrappee);
    }

    @Override
    public void sendMessage(String message){
        System.out.println("Slack notifier");
        super.sendMessage(message);
    }
    
}
