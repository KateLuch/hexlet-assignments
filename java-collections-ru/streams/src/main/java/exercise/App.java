package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> allEmails) {
        long freeEmails = allEmails.stream()
                .filter(freeEmail -> (freeEmail.endsWith("gmail.com") || freeEmail.endsWith("yandex.ru") || freeEmail.endsWith("hotmail.com")))
                .count();
        return freeEmails;
    }
}
// END
