// BEGIN
package exercise.geometry;

import java.beans.PropertyEditorSupport;

public class Segment {

    public static double[][] makeSegment(double[] point1, double[] point2) {
        double[][] resultingSegment = new double[2][2];
        resultingSegment[0] = point1;
        resultingSegment[1] = point2;
        return resultingSegment;
    }

//        public static void main(String[] args) {
//        double[] point1 = {2 ,3};
//        double[] point2 = {3, 5};
//        makeSegment(point1, point2);
//        getBeginPoint(makeSegment(point1, point2));
//         getEndPoint(makeSegment(point1, point2));


    public static double[] getBeginPoint(double[][] resultingSegment) {
        return resultingSegment[0];
    }

    public static double[] getEndPoint(double[][] resultingSegment) {
        return resultingSegment[1];
    }
}
// END
