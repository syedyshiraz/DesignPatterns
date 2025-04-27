package StructuralDesignPatterns.DecoratorDesignPattern.Coffee;

public class Main {
    public static void main(String[] args) {
        ICoffee coffee = new Cream(
                                new MilkCoffee(
                                        new SimpleCoffee()));
            
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());

    }
}
