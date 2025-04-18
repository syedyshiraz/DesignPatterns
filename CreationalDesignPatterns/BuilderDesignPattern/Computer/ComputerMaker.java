package CreationalDesignPatterns.BuilderDesignPattern.Computer;

public class ComputerMaker {
    
    private IComputerBuilder computer;

    ComputerMaker(IComputerBuilder computer){
        this.computer = computer;
    }

    public Computer buildComputer(){
        computer.addCpu();
        computer.addGpu();
        computer.addRam();
        computer.addStorage();
        return computer.getComputer();
    }
}
