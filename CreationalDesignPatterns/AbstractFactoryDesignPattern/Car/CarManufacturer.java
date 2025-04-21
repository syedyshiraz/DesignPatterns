package CreationalDesignPatterns.AbstractFactoryDesignPattern.Car;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.CarFactory.ICarFactory;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Engine.IEngine;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Tire.ITire;

public class CarManufacturer {
    
    IEngine engine;
    ITire tire;

    public CarManufacturer(ICarFactory carFactory){
        engine = carFactory.makEngine();
        tire = carFactory.manufactureTire();
    }

    public void buildCar(){
        engine.assembly();
        tire.manufacture();
    }
    
}
