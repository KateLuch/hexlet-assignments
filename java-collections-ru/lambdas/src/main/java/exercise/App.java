package exercise;

import javax.imageio.stream.ImageInputStream;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;
import java.util.stream.Stream;
import org.apache.commons.lang3.ArrayUtils;

// BEGIN
class App {
    //    public static String[][] enlargeArrayImage(String[][] originalImage) {
//        String[][] enlargedImage = Arrays.stream(originalImage)//сделали поток одномерных массивов
//                .flatMap(y -> Stream.of(y,y))
//                .flatMap(Arrays::stream)//сделали поток строк
//                .toArray(String[][]::new);
//        return enlargedImage;
//    }
//
//    public static void main(String[] args) {
//        String[][] originalImage = {
//                {"@", "@"},
//                {"@", "|"},
//                {"—", "|"},
//                {"@", "|"},
//                {"@", "@"},
//        };
//        String[][] kljxdfgzhdffvujhgfiuzxcguyd = enlargeArrayImage(originalImage);
//        System.out.println("Vasya");
//    }
//    public static int[] flattenMatrix(int[][] matrix) {
//        int length1 = matrix.length;
//        int length2 = matrix[0].length;
//        int[] result = new int[length1 * length2];
//        int k = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                result[k] = matrix[i][j];
//                k++;
//            }
//        }
//        return result;
//    }
    public static int countUniqChars(String text) {
        char[] array = text.toCharArray();
        int numOfChars = 0;
        for (int i = 0; i < array.length; i++) {
            char[] charsBeforeUniqueChar = Arrays.copyOfRange(array, 0, i);
            char[] charsAfterUniqueChar = Arrays.copyOfRange(array, i + 1, array.length);
            boolean check1 = ArrayUtils.contains(charsBeforeUniqueChar, array[i]);
            boolean check2 = ArrayUtils.contains(charsAfterUniqueChar, array[i]);
            if (check1 || check2) {
                numOfChars += 0;
            } else {
                numOfChars += 1;
            }
        }
        return numOfChars;
        // END
}

    public static void main(String[] args) {
//        int[][] matrixTest = {{1, 2, 3}, {4, 5, 6}};
//        flattenMatrix(matrixTest);
        String text1 = "You know nothing Jon Snow";
        countUniqChars(text1);
    }
}

// END
//Создайте класс App с публичным статическим методом enlargeArrayImage().
// Метод принимает в качестве аргумента изображение в виде двумерного массива строк и возвращает двумерный массив,
// увеличенный в два раза (и по горизонтали и по вертикали).
//Метод flatMap() — преобразует стрим стримов в один плоский стрим.
// В качестве аргумента принимает лямбду, преобразующую текущий элемент в поток.
//Для преобразования потока в массив строк потребуется передать в метод toArray() ссылку//
// на конструктор массива: String[][]::new
//Я бы посоветовал начать с небольших шагов. Для начала можно разобраться как двумерный массив String[][] преобразовать
// в Stream<String[]>, затем Stream<Stream<String>> и обратно в String[][]. Убедиться, что преобразование
// работает как надо.
//Затем начать пытаться сперва увеличить переданную картинку в высоту. А затем, как получится,
// уже пытаться её увеличить в ширину (это чуть сложнее будет). (edited)