import java.util.Scanner;

public class CollinearPointsChecker {
    
    
    static boolean isCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    
    static boolean isCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter x1, y1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Enter x2, y2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print("Enter x3, y3: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        
        boolean collinearSlope = isCollinearSlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = isCollinearArea(x1, y1, x2, y2, x3, y3);

        
        if (collinearSlope && collinearArea) {
            System.out.println("The points (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + "), (" + x3 + "," + y3 + ") are collinear.");
        } else {
            System.out.println("The points are NOT collinear.");
        }

        scanner.close();
    }
}
