package exercise;

import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.awt.*;
import java.sql.Array;
import java.util.Arrays;

class App {
    // BEGIN

    // TASK 1------
    public static int[] reverse(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            result[arr.length - i - 1] = arr[i];
        }
//
//      ALTERNATIVE SOLUTION:
//      for (int i = 0; i < arr.length; i++) {
//            result[arr.length - 1 - i] = arr[i];
//        }
        return result;
    }
//
//    public static void main(String[] args) {
//        int[] checking = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(reverse(checking)));
//}

    // TASK 2------
    public static int mult(int[] arr) {
        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            result = result * arr[i];
        }
        return result;
    }

    //
//    public static void main(String[] args) {
//        int[] check = {1, 4, 3, 4, 5};
//        System.out.println(mult(check));
//    }

    //    TASK 3------
    public static int[] flattenMatrix(int[][] arrMatrix) {
        if (arrMatrix.length == 0) {
            int[] arrResult = new int[0];
            return arrResult;
        }
        int[] arrResult = new int[arrMatrix.length * arrMatrix[0].length];

        int i = 0;
        for (int[] subArray : arrMatrix) {
            for (int arrResultValue : subArray) {
                arrResult[i] = arrResultValue;
                i++;
            }
        }
        return arrResult;
    }

//    public static void main(String[] args) {
//        int[][] check3 = {
//                {}
//        };
//        System.out.println(flattenMatrix(check3));
//
//    }
}
// END

