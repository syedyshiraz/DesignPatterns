package CreationalDesignPatterns.BuilderDesignPattern.Car;

public class Main {
    public static void main(String[] args) {
        ICar car = new SportsCar();
        CarMaker maker = new CarMaker(car);

        Car myCar = maker.buildCar();
        System.out.println(myCar);
    }
}
