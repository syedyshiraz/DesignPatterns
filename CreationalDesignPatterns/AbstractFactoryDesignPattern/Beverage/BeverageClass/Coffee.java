package CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.BeverageClass;

public class Coffee implements IBeverage {

    @Override
    public void prepare() {
        System.out.println("Brewing a strong coffee!");
    }
    
}
