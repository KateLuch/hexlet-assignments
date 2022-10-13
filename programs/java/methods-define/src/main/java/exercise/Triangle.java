package exercise;

class Triangle {
    // BEGIN
    public static double getSquare(int a, int b, int angle) {
        double angleRad = (angle * Math.PI) / 180;
        double square = ((a * b) / 2) * Math.sin(angleRad);
        return square;
    }

    public static void main(String[] args) {
        System.out.println(getSquare(4, 5, 45));
    }

}
// END

