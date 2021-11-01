package rahmet.qa;

public class Room {
    public String name;
    public int weight;
    public boolean soft;

    public void thingToKitchen() {
        System.out.println("Нужно перенести этот предмет на кухню");
    }

    public void thingToLivingRoom() {
        System.out.println("Нужно перенести этот предмет в спальню");
    }
}
