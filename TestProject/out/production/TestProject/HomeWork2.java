public class HomeWork2 {
    public static void main(String[] args) {

        if (summ(9, 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        posNum(100);

        if (negNum(5)) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }

        rows("Тестовая строка", 5);


    }


    public static boolean summ(int a, int b) {
        int c = a + b;
        return (c >= 10) & (c <= 20);
    }

    public static void posNum(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean negNum(int a) {
        return (a < 0);
    }

    public static void rows(String str, int a) {
        for (int i=0; i<a; i++)
            System.out.println(str);
    }

        
    }

}
