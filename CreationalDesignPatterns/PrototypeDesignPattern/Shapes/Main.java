package CreationalDesignPatterns.PrototypeDesignPattern.Shapes;

public class Main {
    public static void main(String[] args) {
        Circle cOne = new Circle(5);
        Rectangle rOne = new Rectangle(5, 5);

        cOne.draw();
        rOne.draw();

        IShape sOne = cOne.clone();
        IShape sTwo = rOne.clone();

        sOne.draw();
        sTwo.draw();
    }
}
