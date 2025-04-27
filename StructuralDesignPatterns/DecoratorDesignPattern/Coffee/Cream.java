package StructuralDesignPatterns.DecoratorDesignPattern.Coffee;

public class Cream extends CoffeeDecorator{

    Cream(ICoffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost()+3.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Cream";
    }

    
    
}
