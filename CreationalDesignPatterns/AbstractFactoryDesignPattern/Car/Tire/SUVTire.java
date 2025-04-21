package CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Tire;

public class SUVTire implements ITire{

    @Override
    public void manufacture() {
        System.out.println("Manufacturing a SUV Tire!");
    }

}
