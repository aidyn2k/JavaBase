package rahmet.qa;

public class Room {
    public String name;
    public int weight;
    public boolean soft;

    public void moveToKitchen() {
        System.out.println("Нужно перенести этот предмет на кухню");
    }

    public void moveToLivingRoom() {
        System.out.println("Нужно перенести этот предмет в спальню");
    }
}
