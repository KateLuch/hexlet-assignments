package exercise;

class App {
    // BEGIN
    public static String getTypeOfTriangle(int a, int b, int c) {
        String result = "";

        if ((a + b) > c) {
            if (a == b && a == c) {
                result = "Равносторонний";
            } else if ((a == b) || (a == c) || (c == b)) {
                result = "Равнобедренный";
            } else if (a != b && a != c && b != c) {
                result = "Разносторонний";
            }
        }
        if ((a + b) <= c) {
            result = "Треугольник не существует";
        }
        return result;
    }
    //САМОСТОЯТЕЛЬНОЕ ЗАДАНИЕ

    public static int getFinalGrade(int exam, int project) {
        if (exam > 90 || project > 10) {
            return 100;
        } else if (exam > 75 && project >= 5) {
            return 90;
        } else if (exam > 50 && project >= 2) {
            return 75;
        } else {
            return 0;
        }

    }

    // END
//    public static void main(String[] args) {
//        getTypeOfTriangle(3, 7, 6);
//    }

//    public static void main(String[] args) {
//        getFinalGrade(90, 10);
//    }
}
