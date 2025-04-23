package CreationalDesignPatterns.FactoryDesignPattern.Coffee;

public class Espresso implements ICoffee {

    @Override
    public void brew() {
        System.out.println("Brewing Espresso...");
    }

}
