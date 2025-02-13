public class HomeWork3 {

    public static void main(String[] args) {

        int[] array1 = {1, 1, 0, 0, 1};

        replaceZeroOne(array1);

        printArr(array1);

        int[] array2 = new int[100];

        initArr(array2);

        int[] array3 = {1, 5, 3, 2, 11, -4, 5, 2, 4, 8, 9, 1};

        multValLess(array3, 6);

        printArr(array3);

        int[][] array4 = new int[5][5];

        addDiagVal(array4);

        printArr(array4);


        int[] array5 = newArr(5, 155);

        printArr(array5);


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

    public static void printArr(int[] arr) {
        System.out.println("===========");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void printArr(int[][] arr) {
        System.out.println("===========");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("[" + i + "].[" + j + "] " + arr[i][j]);
            }
        }

    }

    public static void replaceZeroOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
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
            arr[i][i] = 1;
            arr[i][arr[i].length - 1 - i] = 1;
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
