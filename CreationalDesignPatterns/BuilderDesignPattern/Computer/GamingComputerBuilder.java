package CreationalDesignPatterns.BuilderDesignPattern.Computer;

public class GamingComputerBuilder implements IComputerBuilder{

    Computer computer;

    GamingComputerBuilder(){
        computer = new Computer();
    }

    @Override
    public void addCpu() {
        this.computer.setCpu("CPU");
    }

    @Override
    public void addRam() {
        this.computer.setRam("RAM");
    }

    @Override
    public void addGpu() {
        this.computer.setGpu("GPU");
    }

    @Override
    public void addStorage() {
        this.computer.setStorage(123);
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
    
}
