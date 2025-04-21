package CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Engine;

public class SedanEngine implements IEngine {

    @Override
    public void assembly() {
        System.out.println("Assembling a amazing Sedan engine!");
    }
    
}
