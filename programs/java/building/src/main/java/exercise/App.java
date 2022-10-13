// BEGIN
package exercise;

import com.google.gson.Gson;

class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static String toJson(String[] array) {
        Gson gson = new Gson();
        String jsonString = gson.toJson(array);
        return jsonString;
    }

//    public static void main(String[] args) {
//        String[] arrayExample = {"apple", "pear", "lemon"};
//        toJson(arrayExample);
//    }
}
// END

