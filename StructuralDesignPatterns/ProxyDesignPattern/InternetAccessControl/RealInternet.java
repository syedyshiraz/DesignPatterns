package StructuralDesignPatterns.ProxyDesignPattern.InternetAccessControl;

public class RealInternet implements IInternet{

    @Override
    public void connectTo(String site) throws Exception {
        System.out.println("Connecting to "+site);
    }
    
}
