package rahmet.qa;

public class Animal {
    public String name;
    public double weight;
    public int height;
    public int speed;
    public boolean vertebrate;

    public void animalCrawl() {
        System.out.println(name + " ползает со скоростью " + speed + " км/ч");
    }

    public void animalRun() {
        System.out.println(name + " бегает со скоростью " + speed + " км/ч");
    }

    public void animalVoice() {
        System.out.println("Это животное издаёт звук");
    }
}
