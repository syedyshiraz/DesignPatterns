package CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.CarFactory;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Engine.IEngine;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Engine.SedanEngine;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Tire.ITire;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Tire.SedanTire;

public class SedanCarFactory implements ICarFactory{

    @Override
    public IEngine makEngine() {
        return new SedanEngine();
    }

    @Override
    public ITire manufactureTire() {
        return new SedanTire();
    }
    
}
