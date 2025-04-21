package CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.ContainerClass;

public class TeaCup implements IContainer{

    @Override
    public void fill() {
        System.out.println("Filling tea in a cup!");
    }
    
}
