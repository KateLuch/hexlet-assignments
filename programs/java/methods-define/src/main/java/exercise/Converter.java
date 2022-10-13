package exercise;

class Converter {
    // BEGIN

    public static int convert(int num, String str) {
        int result;
         if (str.equals("Kb")) {
            result = num / 1024;
        } else if (str.equals("b")) {
            result = num * 1024;
        } else {
            result = 0;
        }
        return result;


    }

    public static void main(String[] args) {
        System.out.println(("10 Kb = ") + convert(10, "b") + " b");
    }


    // END
}
