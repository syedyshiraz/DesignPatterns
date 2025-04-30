package StructuralDesignPatterns.ProxyDesignPattern.ImageLoading;

public class ProxyImage implements IImage{

    private RealImage realImage;
    private String image;


    public ProxyImage(String image){
        this.image = image;
    }

    @Override
    public void display() {
        if(realImage==null){
            realImage = new RealImage(image);
        }
        realImage.display();
    }
    
}
