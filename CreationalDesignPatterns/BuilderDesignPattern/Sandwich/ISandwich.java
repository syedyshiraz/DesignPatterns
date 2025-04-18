package CreationalDesignPatterns.BuilderDesignPattern.Sandwich;

public interface ISandwich {
    
    void addBread();
    void addSauce();
    void addVeggies();
    void addCheese();
    Sandwich getSandwich();
    @Override
    String toString();
    
}
