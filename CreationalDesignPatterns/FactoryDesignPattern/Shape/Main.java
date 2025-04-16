package CreationalDesignPatterns.FactoryDesignPattern.Shape;
class Main{
    public static void main(String ...args){
        Shape shape = ShapeFactory.getShape("CIRCLE");
        shape.draw();

        shape = ShapeFactory.getShape("RECTANGLE");
        shape.draw();
    }
}