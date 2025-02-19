package HW6;

public class Cat extends Animal {

    private int maxRun = 200;
    public static int countCat = 0;


    public Cat(String name) {
        super(name);
        countCat += 1;
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
        System.out.println(this.name + " не умеет плавать");

    }

}
