package HW3_3;

public class MainClass {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {


        String[][] numArr = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        System.out.println(SumArray(numArr));


    }

    public static int SumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {


        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((arr.length != 4) || (arr[i].length != 4)) {
                    throw new MyArraySizeException();
                }

                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException numberFormatException) {
                    throw new MyArrayDataException();
                }
            }
        }

        return sum;
    }


}

