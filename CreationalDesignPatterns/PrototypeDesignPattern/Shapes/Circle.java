package CreationalDesignPatterns.PrototypeDesignPattern.Shapes;

public class Circle implements IShape{

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle of radius "+radius);
    } 

    @Override
    public IShape clone(){
        return new Circle(this.radius);
    }
    
}
