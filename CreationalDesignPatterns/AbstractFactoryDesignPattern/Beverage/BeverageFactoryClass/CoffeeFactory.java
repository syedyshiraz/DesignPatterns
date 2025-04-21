package CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.BeverageFactoryClass;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.BeverageClass.Coffee;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.BeverageClass.IBeverage;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.ContainerClass.CoffeeMug;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.ContainerClass.IContainer;

public class CoffeeFactory implements IBeverageFactory {

    @Override
    public IBeverage makeBeverage() {
        return new Coffee();
    }

    @Override
    public IContainer chooseContainer() {
        return new CoffeeMug();
    }
    
}
