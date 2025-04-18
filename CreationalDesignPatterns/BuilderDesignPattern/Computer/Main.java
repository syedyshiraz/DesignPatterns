package CreationalDesignPatterns.BuilderDesignPattern.Computer;

public class Main {
    
    public static void main(String[] args) {
        IComputerBuilder computer = new GamingComputerBuilder();
        ComputerMaker engineer = new ComputerMaker(computer);
        
        Computer gamingComputer = engineer.buildComputer();
        System.out.println(gamingComputer);
    }
}
