package CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.CarFactory;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Engine.IEngine;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Tire.ITire;

public interface ICarFactory {
    IEngine makEngine();
    ITire manufactureTire();
}
