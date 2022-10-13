package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// BEGIN
class App {
    public static boolean scrabble(String characters, String word) {
        List<Character> sourceList = new ArrayList<>();
        for (Character charValue : characters.toLowerCase().toCharArray()) {
            sourceList.add(charValue);
        }
        List<Character> resultingList = new ArrayList<>();
        for (Character charValue : word.toLowerCase().toCharArray()) {
            resultingList.add(charValue);
        }

//        List<String> sourceList = Arrays.asList(characters.toLowerCase().split("")); //создаёт список из строки
//        List<String> resultingList = Arrays.asList(word.toLowerCase().split(""));

        for (Character charValue : resultingList) {
            if (!sourceList.remove(charValue)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = scrabble("javat", "java");
        System.out.println(result);
    }
}


//Реализуйте публичный статический метод scrabble(), который принимает на вход два параметра:
// набор символов для составления слова в нижнем регистре (в виде строки) и слово.
// Метод проверяет, можно ли из переданного набора составить это слово.
// В результате вызова функция возвращает true или false
// При проверке учитывается количество символов, нужных для составления слова
// и не учитывается их регистр (заглавные и строчные символы считаются одинаковыми).

//END
