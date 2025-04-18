package CreationalDesignPatterns.BuilderDesignPattern.Sandwich;

public class Chef {
    private ISandwich sandwich;

    Chef(ISandwich sandwich){
        this.sandwich = sandwich;
    }

    public Sandwich makeSandwich(){
        sandwich.addBread();
        sandwich.addCheese();
        sandwich.addSauce();
        sandwich.addVeggies();
        return sandwich.getSandwich();
    }
}
