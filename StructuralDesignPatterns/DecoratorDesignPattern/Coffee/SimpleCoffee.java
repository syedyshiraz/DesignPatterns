package StructuralDesignPatterns.DecoratorDesignPattern.Coffee;

public class SimpleCoffee implements ICoffee{

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
    
}
