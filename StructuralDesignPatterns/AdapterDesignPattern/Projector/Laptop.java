package StructuralDesignPatterns.AdapterDesignPattern.Projector;

public class Laptop {
    IUSBTypeCAdapter usbTypeCAdapter;

    public Laptop(IUSBTypeCAdapter usbTypeCAdapter){
        this.usbTypeCAdapter = usbTypeCAdapter;
    }

    public void project(){
        System.out.println("Connecting to USB-type-C adapter");
        usbTypeCAdapter.hdmiToUSBTypeC();
    }
}
