package CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.BeverageClass;

public class Tea implements IBeverage{

    @Override
    public void prepare() {
        System.out.println("Making a soothing tea!");
    }
    
}
