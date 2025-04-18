package CreationalDesignPatterns.BuilderDesignPattern.Sandwich;

public class ClubSandwich implements ISandwich{

    private Sandwich sandwich;

    ClubSandwich(){
        this.sandwich = new Sandwich();
    }

    @Override
    public void addBread() {
        sandwich.setBread("Bread");
    }

    @Override
    public void addSauce() {
        sandwich.setSauce("Sauce");
    }

    @Override
    public void addVeggies() {
        sandwich.setVeggies("Veggies");
    }

    @Override
    public void addCheese() {
        sandwich.setCheese("Cheese");
    }

    @Override
    public Sandwich getSandwich() {
        System.out.println("Preparing club sandwich");
        return sandwich;
    }

}
