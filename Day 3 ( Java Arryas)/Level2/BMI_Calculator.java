import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();

            bmi[i] = weights[i] / (heights[i] * heights[i]);

            if (bmi[i] <= 18.4) status[i] = "Underweight";
            else if (bmi[i] <= 24.9) status[i] = "Normal";
            else if (bmi[i] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nHeight(m)  Weight(kg)  BMI   Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f       %.2f        %.2f   %s\n", heights[i], weights[i], bmi[i], status[i]);
        }
        sc.close();
    }
}
