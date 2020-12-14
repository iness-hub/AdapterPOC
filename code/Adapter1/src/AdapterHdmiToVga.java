
//adapter
public class AdapterHdmiToVga implements Hdmi {
    private  Vga vgaInterface;

    public AdapterHdmiToVga(Vga vgaInterface){
        this.vgaInterface=vgaInterface;
    }

    @Override
    public void useHdmiPort() {
        System.out.println("want to use HDMI to VGA adapter");
        this.vgaInterface.useVgaPort();
    }

}
