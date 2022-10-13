package exercise;

import java.util.Arrays;

class Point {
    // BEGIN
    public static int getX(int[] point) {
        return point[0];
    }

    public static int getY(int[] point) {
        return point[1];
    }

    public static int[] makePoint(int x, int y) {
        int[] point = new int[2];
        point[0] = x;
        point[1] = y;
        return point;
    }

    public static String pointToString(int[] point) {
        String pointStr = "(" + Integer.toString(getX(point)) + ", " + Integer.toString(getY(point)) + ")";
        return pointStr;
    }
//    public static void main(String[] args) {
//        System.out.println(pointToString(makePoint(3, 5)));
//    }


    public static int getQuadrant(int[] point) {

        int quadrant = 0;

        if (getX(point) == 0 || getY(point) == 0) {
            quadrant = 0;
        } else if (getX(point) > 0 && getY(point) > 0) {
            quadrant = 1;
        } else if (getX(point) < 0 && getY(point) > 0) {
            quadrant = 2;
        } else if (getX(point) < 0 && getY(point) < 0) {
            quadrant = 3;
        } else if (getX(point) > 0 && getY(point) < 0) {
            quadrant = 4;
        }
        return quadrant;
    }
//    public static void main(String[] args) {
//        System.out.println(getQuadrant(makePoint(3, 5)));
//    }


    public static int[] getSymmetricalPointByX(int[] point) {
        int[] point2 = new int[2];
        point2 = makePoint(getX(point), getY(point) * (-1));
        return point2;
    }
//    public static void main(String[] args) {
//        System.out.println(getSymmetricalPointByX(makePoint(3, 5)));
//    }

    public static double calculateDistance(int[] point, int[] point2) {
        double distance;
        double distanceBetweenXs = getX(point) - getX(point2);
        double distanceBetweenYs = getY(point) - getY(point2);
        double subduplicate = (distanceBetweenXs * distanceBetweenXs) + (distanceBetweenYs * distanceBetweenYs);
        distance = Math.sqrt(subduplicate);
        return distance;
    }

//    public static void main(String[] args) {
//        System.out.println(calculateDistance(makePoint(3, 5), makePoint(-8, -4)));
//    }

}