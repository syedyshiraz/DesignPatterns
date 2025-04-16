package CreationalDesignPatterns.FactoryDesignPattern.Coffee;

public class Main {

    public static void main(String ...args) {
        Coffee coffee = CoffeeMaker.getCoffee("Espresso");
        coffee.brew();
    }

    

    
}
