package rahmet.qa;

public class Animal {
    public String name;
    public double weight;
    public int height;
    public int speed;
    public boolean vertebrate;

    public void crawl() {
        System.out.println(name + " ползает со скоростью " + speed + " км/ч");
    }

    public void run() {
        System.out.println(name + " бегает со скоростью " + speed + " км/ч");
    }

    public void voice() {
        System.out.println("Это животное издаёт звук");
    }
}
