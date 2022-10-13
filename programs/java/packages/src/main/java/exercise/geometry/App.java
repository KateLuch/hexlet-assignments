// BEGIN
package exercise.geometry;
import exercise.geometry.Segment;
import exercise.geometry.Point;

import java.util.Arrays;

public class App {
    public static double[] getMidpointOfSegment(double[][] resultingSegment) {
        double[] midPointOfSegment = new double[2];
        midPointOfSegment[0] = (resultingSegment[0][0] + resultingSegment[1][0]) / 2;
        midPointOfSegment[1] = (resultingSegment[0][1] + resultingSegment[1][1]) / 2;
        return midPointOfSegment;
    }

//    public static void main(String[] args) {
//        double[] point1 = {2, 3};
//        double[] point2 = {3, -4};
//        isBelongToOneQuadrant(Segment.makeSegment(point1, point2));
////        getMidpointOfSegment(Segment.makeSegment(point1, point2));
//        reverse(Segment.makeSegment(point1, point2));


//    }

    public static double[][] reverse(double[][] resultingSegment) {
        double[][] reversedSegment = new double[2][2];
        reversedSegment[0] = Arrays.copyOfRange(resultingSegment[1], 0, 2);
        reversedSegment[1] = Arrays.copyOfRange(resultingSegment[0], 0, 2);

        return reversedSegment;
    }

    private static String checkSign(double coordinate) {
        if (coordinate > 0) {
            return "positive";
        } else {
            return "negative";
        }
    }

    public static boolean isBelongToOneQuadrant(double[][] resultingSegment) {
        if ((Segment.getBeginPoint(resultingSegment))[0] == 0 || (Segment.getEndPoint(resultingSegment))[0] == 0 || (Segment.getBeginPoint(resultingSegment))[1] == 0 || (Segment.getEndPoint(resultingSegment))[1] == 0) {
            return false;
        }
        return ((checkSign((Segment.getBeginPoint(resultingSegment))[0]) == checkSign((Segment.getEndPoint(resultingSegment))[0])) && (checkSign((Segment.getBeginPoint(resultingSegment))[1]) == checkSign((Segment.getEndPoint(resultingSegment))[1])));
    }
}
// END
