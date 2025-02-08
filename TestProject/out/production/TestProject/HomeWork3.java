public class HomeWork3 {

    public static void main(String[] args) {

        int[] array1 = {1, 1, 0, 0, 1};

        changeVal(array1);

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        int[] array2 = new int[100];

        initArr(array2);

        System.out.println("===========");
        System.out.println(array2[0]);
        System.out.println(array2[10]);
        System.out.println(array2[99]);

        int[] array3 = {1, 5, 3, 2, 11, -4, 5, 2, 4, 8, 9, 1};

        multValLess(array3, 6);

        System.out.println("===========");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

        int[][] array4 = new int[5][5];

        addDiagVal(array4);

        System.out.println("===========");
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.println("[" + i + "].[" + j + "] " + array4[i][j]);
            }
        }


        int[] array5 = newArr(5, 155);

        System.out.println("===========");
        for (int i = 0; i < array5.length; i++) {
            System.out.println(array5[i]);
        }


        int[] array6 = {10, 3, 2, 11, -4, 5, 2};
        int minvalue = minVal(array6);
        int maxvalue = maxVal(array6);

        System.out.println("===========");
        System.out.println("minvalue: " + minvalue);
        System.out.println("maxvalue: " + maxvalue);

        int[] array7 = {1, 1, 2, 1, 5};
        boolean res = checkBalance(array7);

        System.out.println("===========");
        System.out.println("checkBalance: " + res);

    }

    public static void changeVal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 1:
                    arr[i] = 0;
                    break;
                case 0:
                    arr[i] = 1;
                    break;
            }

        }
    }

    public static void initArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

    }

    public static void multValLess(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < n) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    public static void addDiagVal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i == arr[i].length - 1 - j) {
                    arr[i][j] = 1;
                }
            }
        }
    }

    public static int[] newArr(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static int minVal(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxVal(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean checkBalance(int[] arr) {
        int lpart;
        int rpart;
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            lpart = 0;
            rpart = 0;
            for (int j = 0; j <= i; j++) {
                lpart += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                rpart += arr[j];
            }
            if (lpart == rpart) {
                res = true;
                break;
            }
        }
        return res;
    }


}
