package CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.ContainerClass;

public class CoffeeMug implements IContainer{

    @Override
    public void fill() {
        System.out.println("Filling coffee in a mug!");
    }
    
}
