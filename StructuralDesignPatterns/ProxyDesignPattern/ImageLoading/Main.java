package StructuralDesignPatterns.ProxyDesignPattern.ImageLoading;

public class Main {
    public static void main(String[] args) {
        IImage image1 = new ProxyImage("Image-1");
        IImage image2 = new ProxyImage("Image-2");

        image1.display();
        image2.display();
        image1.display();
    }
}
