import java.util.Scanner;

public class BMI_2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();

            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            weightStatus[i] = (personData[i][2] <= 18.4) ? "Underweight" :
                              (personData[i][2] <= 24.9) ? "Normal" :
                              (personData[i][2] <= 39.9) ? "Overweight" : "Obese";
        }

        System.out.println("\nHeight(m)  Weight(kg)  BMI   Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f       %.2f        %.2f   %s\n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
        sc.close();
    }
}
