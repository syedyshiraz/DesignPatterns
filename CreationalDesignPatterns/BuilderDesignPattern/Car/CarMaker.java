package CreationalDesignPatterns.BuilderDesignPattern.Car;

public class CarMaker {

    ICar car;

    CarMaker(ICar car){
        this.car = car;
    }

    Car buildCar(){
        car.addEngine();
        car.addMileage();
        car.addSeating();

        return car.getCar();
    }
    
}
