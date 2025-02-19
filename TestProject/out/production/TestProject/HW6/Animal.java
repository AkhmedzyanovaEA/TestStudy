package HW6;

public class Animal {

    protected String name;


    public Animal(String name) {
        this.name = name;
    }


    public void run(int r) {
        System.out.println(this.name + " пробежал " + r + " метров");

    }


    public void swim(int s) {
        System.out.println(this.name + " проплыл " + s + " метров");

    }
}
