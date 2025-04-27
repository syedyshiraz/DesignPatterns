package StructuralDesignPatterns.DecoratorDesignPattern.Coffee;

public class MilkCoffee extends CoffeeDecorator{

    MilkCoffee(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost()+2.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Milk";
    }
    
    
}
