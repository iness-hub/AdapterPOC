public class Client {

    public static void main(String[] args) {

        Vga videoProjector = new VideoProjector();
        Hdmi laptop = new AdapterHdmiToVga(videoProjector);
        laptop.useHdmiPort();

    }
}
