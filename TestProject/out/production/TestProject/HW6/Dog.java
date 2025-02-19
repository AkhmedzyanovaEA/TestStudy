package HW6;

public class Dog extends Animal {

    private int maxRun = 500;
    private int maxSwim = 10;
    public static int countDog = 0;


    public Dog(String name) {
        super(name);
        countDog += 1;
    }


    @Override
    public void run(int r) {
        if (r <= this.maxRun) {
            super.run(r);
        } else {
            System.out.println(this.name + " не может пробежать " + r + " метров");
        }

    }

    @Override
    public void swim(int s) {
        if (s <= this.maxSwim) {
            super.swim(s);
        } else {
            System.out.println(this.name + " не может проплыть " + s + " метров");
        }

    }
}
