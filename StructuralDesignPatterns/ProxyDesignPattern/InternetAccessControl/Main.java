package StructuralDesignPatterns.ProxyDesignPattern.InternetAccessControl;

public class Main {
    public static void main(String[] args) throws Exception {
        IInternet internet = new ProxyInternet();

        internet.connectTo("Google");
        internet.connectTo("Facebook");
        internet.connectTo("WhatsApp");
        
    }
}
