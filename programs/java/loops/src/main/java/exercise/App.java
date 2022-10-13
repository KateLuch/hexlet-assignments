package exercise;

class App {
    // BEGIN
    public static String getAbbreviation(String str) {
        String modifiedStr = "";

        if (str.charAt(0) != ' ') {
            modifiedStr = modifiedStr + Character.toUpperCase(str.charAt(0));
        }

        for (int i = 1; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (str.charAt(i - 1) == ' ' && symbol != ' ') {
                modifiedStr = modifiedStr + Character.toUpperCase(symbol);
            }

        }
        return modifiedStr;

    }

    public static void main(String[] args) {
        System.out.println(getAbbreviation("Portable Network Graphics"));
        // END
    }
}
// the first symbol of a word (preceded by a space) - toUpperCase
// the rest of symbols get deleted/ignored? modifiedStr + Character.toUpperCase(chartAt(i));
