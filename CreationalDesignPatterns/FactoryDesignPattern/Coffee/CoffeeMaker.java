package CreationalDesignPatterns.FactoryDesignPattern.Coffee;

public class CoffeeMaker {

    public static Coffee getCoffee(String coffeeType) {
        Coffee coffee = null;
        if(coffeeType=="Espresso"){
            coffee  =new Espresso();
            return coffee;
        }
        return coffee;
    }

}
