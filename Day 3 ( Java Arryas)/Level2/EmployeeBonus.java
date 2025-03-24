import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEmployees = 10;
        double[] salaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];

        double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;
		
        for (int i = 0; i < numEmployees; i++) {
            while (true) {
                System.out.print("Enter salary of employee " + (i + 1) + ": ");
                salaries[i] = sc.nextDouble();
                System.out.print("Enter years of service: ");
                yearsOfService[i] = sc.nextDouble();
                
                if (salaries[i] > 0 && yearsOfService[i] >= 0) {
                    break;
                }
                System.out.println("Invalid input! Please enter again.");
            }
        }
        for (int i = 0; i < numEmployees; i++) {
            bonuses[i] = (yearsOfService[i] > 5) ? salaries[i] * 0.05 : salaries[i] * 0.02;
            newSalaries[i] = salaries[i] + bonuses[i];

            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        sc.close();
    }
}
