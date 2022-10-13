package exercise;

import java.util.Arrays;

class App {
    // BEGIN

    //    TASK 1 ---------------------

    public static int getIndexOfMaxNegative(int[] arr) {
        int result = -1;
        if (arr.length == 0) {
            return result;
        }
        int numMaxNegative = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && numMaxNegative < arr[i]) {
                result = i;
                numMaxNegative = arr[i];
            }
        }
        return result;
    }

//    public static void main(String[] args) {
//        int[] arr = {1, 4, -3, 4, -5, -3};
//        System.out.println(getIndexOfMaxNegative(arr));
//    }

    //    TASK 2 -----------------------

    public static int[] getElementsLessAverage(int[] arrInit) {
        int[] arrResult = new int[arrInit.length];
        if (arrInit.length == 0) {
            return arrResult;
        }
        int sum = 0;
        for (int arrValue : arrInit) {
            sum += arrValue;
        }
        double averageValue = sum / arrInit.length;

        int i = 0;
        for (int arrValue : arrInit) {
            if (arrValue <= averageValue) {
                arrResult[i] = arrValue;
                i++;
            }
        }
        int[] arrResultSliced = Arrays.copyOfRange(arrResult, 0, i);
        return arrResultSliced;
    }

//    public static void main(String[] args) {
//        int[] arrInit = {1, 2, 6, 3, 8, 12};
//        System.out.println(getElementsLessAverage(arrInit));
//    }
//
//    //    TASK 3 -----------------------------

    public static int getSumBeforeMinAndMax(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int sum = 0;
        int maxValue = arr[0];
        int minValue = arr[0];
        int indexOfMaxValue = 0;
        int indexOfMinValue = 0;

        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
                indexOfMaxValue = i;
            }
            if (minValue > arr[i]) {
                minValue = arr[i];
                indexOfMinValue = i;
            }
        }

        if (indexOfMaxValue < indexOfMinValue) {
            for (int i = indexOfMaxValue + 1; i < indexOfMinValue; i++) {
                sum += arr[i];
            }
        } else {
            for (int i = indexOfMinValue + 1; i < indexOfMaxValue; i++) {
                sum += arr[i];
            }
        }
        return sum;

    }

//    public static void main(String[] args) {
//        int[] arrInit = {5, 4, 34, 8, 11, -5, 1};
//        System.out.println(getSumBeforeMinAndMax(arrInit));
//    }
}
// END
