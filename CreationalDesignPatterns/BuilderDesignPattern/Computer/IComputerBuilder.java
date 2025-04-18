package CreationalDesignPatterns.BuilderDesignPattern.Computer;

public interface IComputerBuilder {

    void addCpu();
    void addRam();
    void addGpu();
    void addStorage();

    Computer getComputer();
    
}
