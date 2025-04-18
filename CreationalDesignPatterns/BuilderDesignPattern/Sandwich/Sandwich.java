package CreationalDesignPatterns.BuilderDesignPattern.Sandwich;

public class Sandwich {
    private String bread;
    private String veggies;
    private String sauce;
    private String cheese;
    
    public void setBread(String bread) {
        this.bread = bread;
    }
    public void setVeggies(String veggies) {
        this.veggies = veggies;
    }
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
    @Override
    public String toString() {
        return "Sandwich [bread=" + bread + ", veggies=" + veggies + ", sauce=" + sauce + ", cheese=" + cheese + "]";
    }
}
