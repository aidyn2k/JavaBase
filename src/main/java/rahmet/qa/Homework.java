package rahmet.qa;

import java.nio.file.WatchEvent;

public class Homework {
    public static void main(String[] args) {
        Animal cheetah = new Animal();
        cheetah.name = "Гепард";
        cheetah.weight = 50.0;
        cheetah.height = 40;
        cheetah.speed = 123;
        cheetah.vertebrate = true;
        cheetah.animalRun();
        cheetah.animalVoice();

        Animal mouse = new Animal();
        mouse.name = "Мышь";
        mouse.weight = 0.15;
        mouse.height = 15;
        mouse.speed = 2;
        mouse.vertebrate = true;
        mouse.animalCrawl();
        mouse.animalVoice();

        Room pillow = new Room();
        pillow.name = "Подушка";
        pillow.weight = 1;
        pillow.soft = true;
        pillow.thingToLivingRoom();

        Room bowl = new Room();
        bowl.name = "Миска";
        bowl.weight = 2;
        bowl.soft = false;
        bowl.thingToKitchen();
    }
}
