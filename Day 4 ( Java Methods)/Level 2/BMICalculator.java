import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double height) {
        height = height / 100; // Convert cm to meters
        return weight / (height * height);
    }
    public static String determineBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // Columns: Weight, Height, BMI
        String[] status = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.println("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            status[i] = determineBMIStatus(data[i][2]);
        }
        System.out.println("\nBMI Results:");
        System.out.println("Weight (kg) | Height (cm) | BMI | Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f kg    | %.2f cm    | %.2f | %s\n", 
                              data[i][0], data[i][1], data[i][2], status[i]);
        }
        
        sc.close();
    }
}
