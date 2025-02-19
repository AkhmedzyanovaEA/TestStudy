package HW6;

import static HW6.Cat.countCat;
import static HW6.Dog.countDog;

public class MainRun {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        cat1.run(300);
        cat1.swim(5);
        Dog dog1 = new Dog("Рекс");
        dog1.run(300);
        dog1.swim(10);

        System.out.println("Количество котов: " + countCat);
        System.out.println("Количество собак: " + countDog);

    }
}
