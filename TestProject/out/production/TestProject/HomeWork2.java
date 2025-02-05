public class HomeWork2 {
    public static void main(String[] args) {

        if (Summ(9, 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        PosNum(100);

        if (NegNum(5)) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }

        Rows("Тестовая строка", 5);


    }


    public static boolean Summ(int a, int b) {
        int c = a + b;
        return (c >= 10) & (c <= 20);
    }

    public static void PosNum(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean NegNum(int a) {
        return !(a > 0);
    }

    public static void Rows(String str, int a) {
//        for (int i=0; i<a; i++)  {
//            System.out.println(str);
//        }

        int i = 0;
        while (i < a) {
            i++;
            System.out.println(i + ". " + str);
        }
    }

}
