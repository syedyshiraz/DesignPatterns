package CreationalDesignPatterns.BuilderDesignPattern.Computer;

public class Computer {
    private String cpu;
    private String ram;
    private String gpu;
    private Integer storage;
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
    public void setStorage(Integer storage) {
        this.storage = storage;
    }
    @Override
    public String toString() {
        return "Computer [cpu=" + cpu + ", ram=" + ram + ", gpu=" + gpu + ", storage=" + storage + "]";
    }
    
}
