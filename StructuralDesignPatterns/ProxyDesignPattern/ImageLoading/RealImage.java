package StructuralDesignPatterns.ProxyDesignPattern.ImageLoading;

public class RealImage implements IImage{

    private String image;

    public RealImage(String image){
        this.image = image;
        loadImageFromDisk(image);
    }

    

    private void loadImageFromDisk(String image) {
        System.out.println("Loading image from the disk "+image);
    }



    @Override
    public void display() {
        System.out.println("Displaying image "+ this.image);
    }
    
}
