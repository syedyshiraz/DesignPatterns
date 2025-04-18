package CreationalDesignPatterns.BuilderDesignPattern.Car;

public class Car {

    public String engine;
    public Integer mileage;
    public Integer seating;

    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }
    public void setSeating(Integer seating) {
        this.seating = seating;
    }
    @Override
    public String toString() {
        return "Car [engine=" + engine + ", mileage=" + mileage + ", seating=" + seating + "]";
    }
    
}
