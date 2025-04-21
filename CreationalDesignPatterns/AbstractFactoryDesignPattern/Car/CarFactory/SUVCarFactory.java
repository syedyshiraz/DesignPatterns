package CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.CarFactory;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Engine.IEngine;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Engine.SUVEngine;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Tire.ITire;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Tire.SUVTire;

public class SUVCarFactory implements ICarFactory{

    @Override
    public IEngine makEngine() {
        return new SUVEngine();
    }

    @Override
    public ITire manufactureTire() {
        return new SUVTire();
    }
    
}
