package exercise;

import org.w3c.dom.DOMStringList;

import javax.management.BadStringOperationException;
import javax.xml.namespace.QName;
import java.lang.reflect.Array;
import java.util.Arrays;


// BEGIN
class Kennel {
    //    String[] puppy = new String[2];
    static String[][] kennel = new String[1000][];
    static int arrValue = 0; //current pointer to a new puppy, or total number of puppies

    public static void addPuppy(String[] puppy) {
        kennel[arrValue] = puppy;
        arrValue += 1;
    }

//    public static void main(String[] args) {
//        String[] puppy = {"Archie", "boston terrier"};
//        String breed = "chihuahua";
//        String[][] somePuppies = {
//                {"Rex", "boxer"},
//                {"Rocky", "terrier"},
//                {"Buddy", "chihuahua"},
//                {"Toby", "chihuahua"},
//        };
//        addPuppy(puppy);
//        getPuppyCount();
//        isContainPuppy("Bob");
//        addSomePuppies(somePuppies);
//        getNamesByBreed(breed);
//        System.out.println(Arrays.toString(puppy));
//    }

    public static void addSomePuppies(String[][] somePuppies) {
        for (String[] currentPuppy : somePuppies) {
            addPuppy(currentPuppy);
        }
    }

    public static int getPuppyCount() {
        return arrValue;
    }

    public static boolean isContainPuppy(String puppyName) {
        boolean result = false;
        for (int i = 0; i < arrValue; i++) {
            if (kennel[i][0].equals(puppyName)) {
                result = true;
            }
        }
        return result;
    }

    public static String[][] getAllPuppies() {
        String[][] allPuppies = new String[arrValue][];
        for (int i = 0; i < arrValue; i++) {
            allPuppies[i] = kennel[i];
        }
        return allPuppies;
    }

    public static String[] getNamesByBreed(String breed) {
        String[] namesByBreed = new String[arrValue];
        int m = 0;

        for (int i = 0; i < arrValue; i++) {
            if (kennel[i][1].equals(breed)) {
                namesByBreed[m] = kennel[i][0];
                m += 1; // nulls are still there at the end since the arrValue is more than the No. of required names
            }
        }
        String[] resultingNamesByBreed = new String[m]; //создаём массив чисто на кол-во нужных щенков, без пустых мест
        for (int k = 0; k < m; k++) {
            resultingNamesByBreed[k] = namesByBreed[k];

        }
        return resultingNamesByBreed;
    }

    public static void resetKennel() {
        arrValue = 0;
    }

    public static boolean removePuppy(String name) {
        boolean result = false;
        for (int i = 0; i < arrValue; i++) {
            if (kennel[i][0].equals(name)) {
                result = true;
                //сдвигаем элементы массива для соблюдения порядка, т.к. щенка удалили из базы. j+1 - перезаписываем текущий каждым последующим
                for (int j = i; j + 1 < arrValue; j++) {
                    kennel[j] = kennel[j + 1];
                }
                arrValue -= 1; //arrValue стал на 1 элемент меньше, т.к. сдвинули элементы
                i = arrValue;
            }
        }
        return result;
    }

}
