package exercise;

import java.util.Arrays;

class App {
    // BEGIN

    //    TASK 1 BUBBLE SORT ----------------------
//    public static int[] sort(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int tempValue = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tempValue;
//                }
//            }
//        }
//        return arr;
//    }
//    public static void main(String[] args) {
//        int[] array = {3, 10, 4, 3};
//        System.out.println(Arrays.toString(sort(array)));
//    }

    //    TASK 2 SELECTION SORT---------------------------
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minValueIndex]) {
                    minValueIndex = j;
                }
            }
            int tempValue = arr[minValueIndex];
            arr[minValueIndex] = arr[i];
            arr[i] = tempValue;
        }
        return arr;
    }

//    public static void main(String[] args) {
//        int[] array = {34, 64, 10, 12, 25, 11, 90};
//        System.out.println(Arrays.toString(sort(array)));
//    }

// END
}