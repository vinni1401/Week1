import java.util.Scanner;

public class EuclideanLineEquation {

    public static double findEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        if (x1 == x2) {
            System.out.println("The line is vertical. No slope and y-intercept.");
            return null;
        }
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        result[0] = slope;
        result[1] = yIntercept;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = findEuclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);

        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        if (lineEquation != null) {
            System.out.printf("Equation of line: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);
        }
        sc.close();
    }
}
