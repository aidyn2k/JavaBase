package rahmet.qa;

public class Iphone {
    public static String device = "iPhone";
    private String model;
    private int mPixels;
    private boolean touchId;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getmPixels() {
        return mPixels;
    }

    public void setmPixels(int mPixels) {
        this.mPixels = mPixels;
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

    static class Characteristics {
        static String material = "plastic";
        static String display = "GorillaGlass";
        static boolean homeButton = false;

        public void outputIphoneChars() {
            System.out.println("\n static class Characteristics: ");
            System.out.println("Материал смартфона: " + material);
            System.out.println("Технология дисплея: " + display);
            System.out.println("Наличие кнопки домой: " + homeButton);
        }
    }
}
