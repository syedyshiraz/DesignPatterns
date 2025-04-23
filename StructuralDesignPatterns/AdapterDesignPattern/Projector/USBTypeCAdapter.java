package StructuralDesignPatterns.AdapterDesignPattern.Projector;

public class USBTypeCAdapter  implements IUSBTypeCAdapter{

    private HDMIProjector hdmiProjector;

    public USBTypeCAdapter(HDMIProjector hdmiProjector){
        this.hdmiProjector = hdmiProjector;
    }

    @Override
    public void hdmiToUSBTypeC() {
        hdmiProjector.connect();
    }
    
}
