import java.util.Scanner;

public class QuadraticEquationSolver {
    public static double[] findRoots(double a, double b, double c) {
        double delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            return new double[0]; // No real roots
        } else if (delta == 0) {
            return new double[]{-b / (2 * a)}; // One root
        } else {
            double sqrtDelta = Math.sqrt(delta);
            double root1 = (-b + sqrtDelta) / (2 * a);
            double root2 = (-b - sqrtDelta) / (2 * a);
            return new double[]{root1, root2}; // Two roots
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);


        if (roots.length == 0) {
            System.out.println("No real roots exist.");
        } else if (roots.length == 1) {
            System.out.printf("One root: x = %.2f\n", roots[0]);
        } else {
            System.out.printf("Two roots: x1 = %.2f, x2 = %.2f\n", roots[0], roots[1]);
        }

        sc.close();
    }
}
