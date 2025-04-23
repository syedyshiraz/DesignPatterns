package CreationalDesignPatterns.FactoryDesignPattern.Coffee;

public class CoffeeMaker {

    public static ICoffee getCoffee(String coffeeType) {
        ICoffee coffee = null;
        if(coffeeType=="Espresso"){
            coffee  =new Espresso();
            return coffee;
        }
        return coffee;
    }

}
