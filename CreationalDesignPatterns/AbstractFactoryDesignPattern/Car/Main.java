package CreationalDesignPatterns.AbstractFactoryDesignPattern.Car;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.CarFactory.ICarFactory;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.CarFactory.SUVCarFactory;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.CarFactory.SedanCarFactory;

public class Main {
    public static void main(String[] args) {
        ICarFactory carFactory;

        String carType = "SUV";

        if(carType.equalsIgnoreCase("SUV")){
            carFactory = new SUVCarFactory();
        }else{
            carFactory = new SedanCarFactory();
        }

        CarManufacturer carManufacturer = new CarManufacturer(carFactory);
        carManufacturer.buildCar();
    }
}
