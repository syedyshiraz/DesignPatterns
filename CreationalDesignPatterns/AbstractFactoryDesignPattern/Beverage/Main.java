package CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage;

import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.BeverageFactoryClass.CoffeeFactory;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.BeverageFactoryClass.IBeverageFactory;
import CreationalDesignPatterns.AbstractFactoryDesignPattern.Beverage.BeverageFactoryClass.TeaFactory;

public class Main {
    public static void main(String[] args) {
        IBeverageFactory beverageFactory;

        String beverage = "Coffee";

        if(beverage.equalsIgnoreCase("TEA")){
            beverageFactory = new TeaFactory();
        }else{
            beverageFactory = new CoffeeFactory();
        }

        VendingMachine vendingMachine = new VendingMachine(beverageFactory);
        vendingMachine.serve();
    }
    
}
