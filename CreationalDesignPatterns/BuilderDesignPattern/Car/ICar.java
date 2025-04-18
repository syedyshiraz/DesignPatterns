package CreationalDesignPatterns.BuilderDesignPattern.Car;

public interface ICar {

    void addEngine();
    void addMileage();
    void addSeating();

    Car getCar();
    
}
