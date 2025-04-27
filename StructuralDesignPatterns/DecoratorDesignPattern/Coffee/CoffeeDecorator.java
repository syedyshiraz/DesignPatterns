package StructuralDesignPatterns.DecoratorDesignPattern.Coffee;

public abstract class CoffeeDecorator implements ICoffee {

    private ICoffee coffee;

    CoffeeDecorator(ICoffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    
    
}
