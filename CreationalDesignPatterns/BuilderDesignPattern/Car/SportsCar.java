package CreationalDesignPatterns.BuilderDesignPattern.Car;

public class SportsCar implements ICar {

    Car car;

    SportsCar(){
        car = new Car();
    }

    @Override
    public void addEngine() {
        car.setEngine("Engine");
    }

    @Override
    public void addMileage() {
        car.setMileage(40);
    }

    @Override
    public void addSeating() {
        car.setSeating(2);
    }

    @Override
    public Car getCar() {
        return car;
    }
    
}
