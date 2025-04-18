package CreationalDesignPatterns.BuilderDesignPattern.Sandwich;

public class Main {
    public static void main(String[] args) {
        ISandwich sandwich = new ClubSandwich();
        Chef chef = new Chef(sandwich);

        Sandwich food = chef.makeSandwich();
        System.out.println(food);
    }
}
