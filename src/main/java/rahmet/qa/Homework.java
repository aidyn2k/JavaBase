package rahmet.qa;

public class Homework {
    public static void main(String[] args) {

        Iphone iPhoneXr = new Iphone();
        InfoAboutCamera camera = new InfoAboutCamera();

        iPhoneXr.setModel("XR");
        iPhoneXr.setmPixels(12);
        iPhoneXr.setTouchId(false);

        camera.aboutCamera(iPhoneXr.getModel(),iPhoneXr.getmPixels(), iPhoneXr.getTouchId());

        iPhoneXr.smartphoneGoesSilenceMode();

        Animal cheetah = new Animal();
        cheetah.name = "Гепард";
        cheetah.weight = 50.0;
        cheetah.height = 40;
        cheetah.speed = 123;
        cheetah.vertebrate = true;
        cheetah.run();
        cheetah.voice();

        Animal mouse = new Animal();
        mouse.name = "Мышь";
        mouse.weight = 0.15;
        mouse.height = 15;
        mouse.speed = 2;
        mouse.vertebrate = true;
        mouse.crawl();
        mouse.voice();

        Room pillow = new Room();
        pillow.name = "Подушка";
        pillow.weight = 1;
        pillow.soft = true;
        pillow.moveToLivingRoom();

        Room bowl = new Room();
        bowl.name = "Миска";
        bowl.weight = 2;
        bowl.soft = false;
        bowl.moveToKitchen();
    }
}
