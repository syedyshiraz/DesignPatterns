package StructuralDesignPatterns.DecoratorDesignPattern.NotificationLibrary;

public class FacebookNotifier extends NotifierDecorator{

    FacebookNotifier(INotifier wrappee) {
        super(wrappee);
    }

    @Override
    public void sendMessage(String message){
        System.out.println("Facebook Notifier!");
        super.sendMessage(message);
    }
    
}
