package CreationalDesignPatterns.AbstractFactoryDesignPattern.Car.Engine;

public class SUVEngine implements IEngine{

    @Override
    public void assembly() {
        System.out.println("Assembling a powerful SUV engine!");
    }
    
}
