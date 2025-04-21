package CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.BeverageFactoryClass;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.BeverageClass.IBeverage;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.ContainerClass.IContainer;

public interface IBeverageFactory {
    IBeverage makeBeverage();
    IContainer chooseContainer();
}
