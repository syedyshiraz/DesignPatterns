package StructuralDesignPatterns.AdapterDesignPattern.Projector;

public class Main {
    public static void main(String[] args) {
        HDMIProjector hdmiProjector = new HDMIProjector();
        IUSBTypeCAdapter usbTypeCAdapter = new USBTypeCAdapter(hdmiProjector);

        Laptop laptop = new Laptop(usbTypeCAdapter);
        laptop.project();
    }
    
}
