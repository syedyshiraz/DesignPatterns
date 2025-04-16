package CreationalDesignPatterns.FactoryDesignPattern.Shape;



public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        Shape shape = null;
        if (shapeType=="CIRCLE"){
            shape = new Circle();
        }else if(shapeType=="RECTANGLE"){
            shape = new Rectangle();
        }
        return shape;
    }

}
