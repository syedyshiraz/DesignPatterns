package CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Tire;

public class SedanTire implements ITire {

    @Override
    public void manufacture() {
        System.out.println("Manufacturing a Sedan Tire!");
    }
    
}
