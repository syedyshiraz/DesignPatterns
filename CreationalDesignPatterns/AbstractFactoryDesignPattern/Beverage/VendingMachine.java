package CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.BeverageClass.IBeverage;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.BeverageFactoryClass.IBeverageFactory;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.ContainerClass.IContainer;

public class VendingMachine {
    private IBeverage beverage;
    private IContainer container;

    public VendingMachine(IBeverageFactory beverageFactory){
        beverage = beverageFactory.makeBeverage();
        container = beverageFactory.chooseContainer();
    }

    public void serve(){
        beverage.prepare();
        container.fill();
    }

}
