package CreationalDesignPatterns.PrototypeDesignPattern.Shapes;

public interface IShapesPrototype extends Cloneable{
    IShape clone();
}
