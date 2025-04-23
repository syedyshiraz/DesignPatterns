package CreationalDesignPatterns.PrototypeDesignPattern.Shapes;

public class Rectangle implements IShape{

    private int width, height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle of width "+width+" and height "+height);
    }

    @Override
    public IShape clone(){

        return new Rectangle(this.width, this.height);
    }
    
}
