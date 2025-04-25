package StructuralDesignPatterns.DecoratorDesignPattern.NotificationLibrary;

public abstract class NotifierDecorator implements INotifier{

    INotifier wrappee;

    NotifierDecorator(INotifier wrappee){
        this.wrappee = wrappee;
    }
    

    @Override
    public void sendMessage(String message){
        wrappee.sendMessage(message);
    }
}
