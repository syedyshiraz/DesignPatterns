package CreationalDesignPatterns.FactoryDesignPattern.Coffee;

public class Main {

    public static void main(String ...args) {
        ICoffee coffee = CoffeeMaker.getCoffee("Espresso");
        coffee.brew();
    }


    
}
