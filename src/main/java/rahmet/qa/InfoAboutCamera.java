package rahmet.qa;

public class InfoAboutCamera {

    Iphone iPhone = new Iphone();
    Iphone.Characteristics chars = new Iphone.Characteristics();

    public void aboutCamera(String model, int countOfDevices, boolean touchId) {
        System.out.println("Model: " + model);
        System.out.println("Count of megapixels: " + countOfDevices);
        System.out.println("It has TouchId: " + touchId);
        System.out.println("Device: " + Iphone.device);
        chars.outputIphoneChars();
    }
}
