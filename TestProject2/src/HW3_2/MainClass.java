package HW3_2;

public class MainClass {
    public static void main(String[] args) {

        Action[] objects = {new Human(3000, 150), new Cat(100, 100), new Robot(5000, 5)};
        Object[] barrier = {new Treadmill(100), new Wall(100), new Treadmill(1000), new Wall(200)};


        for (int i = 0; i < objects.length; i++) {
            for (int j = 0; j < barrier.length; j++) {

                if (barrier[j] instanceof Treadmill) {
                    if (objects[i].run((Treadmill) barrier[j])) {
                        System.out.println(objects[i].getClass() + " пробежал " + ((Treadmill) barrier[j]).dist + " метров");
                    } else {
                        System.out.println(objects[i].getClass() + " не пробежал " + ((Treadmill) barrier[j]).dist + " метров");
                        break;
                    }

                } else {

                    if (objects[i].jump((Wall) barrier[j])) {
                        System.out.println(objects[i].getClass() + " перепрыгнул " + ((Wall) barrier[j]).height + " см");
                    } else {
                        System.out.println(objects[i].getClass() + " не перепрыгнул " + ((Wall) barrier[j]).height + " см");
                        break;
                    }


                }
            }
        }
    }
}
