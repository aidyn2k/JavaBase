package rahmet.qa;

public class InfoAboutCamera {

    Smartphone iPhone = new Smartphone();
    Smartphone.Camera camera = new Smartphone.Camera();

    public void aboutCamera(String model, int countOfDevices, boolean touchId) {
        System.out.println("Model: " + model);
        System.out.println("Count of devices: " + countOfDevices);
        System.out.println("It has TouchId: " + touchId);
        System.out.println("Device: " + Smartphone.device);
        camera.outputCameraChars();
    }
}
