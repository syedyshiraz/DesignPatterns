package CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.BeverageFactoryClass;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.BeverageClass.IBeverage;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.BeverageClass.Tea;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.ContainerClass.IContainer;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.ContainerClass.TeaCup;

public class TeaFactory implements IBeverageFactory {

    @Override
    public IBeverage makeBeverage() {
        return new Tea();
    }

    @Override
    public IContainer chooseContainer() {
        return new TeaCup();
    }
    
}
