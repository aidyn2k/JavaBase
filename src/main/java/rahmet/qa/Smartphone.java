package rahmet.qa;

public class Smartphone {
    public static String device = "iPhone";
    private String model;
    private int countOfDevices;
    private boolean touchId;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCountOfDevices() {
        return countOfDevices;
    }

    public void setCountOfDevices(int countOfDevices) {
        this.countOfDevices = countOfDevices;
    }

    public boolean getTouchId() {
        return touchId;
    }

    public void setTouchId(boolean touchId) {
        this.touchId = touchId;
    }


    public void smartphoneGoesSilenceMode() {
        System.out.println("Телефон переходит в беззвучный режим");
    }

    static class Camera {
        static int count = 2;
        static int mPixels = 12;
        static boolean opticCarlZeiss = true;

        public void outputCameraChars() {
            System.out.println("\n static class Camera: ");
            System.out.println("Количество камер: " + count);
            System.out.println("Количество мегапикселей: " + mPixels);
            System.out.println("Наличие оптики CarlZeiss: " + opticCarlZeiss);
        }
    }
}
