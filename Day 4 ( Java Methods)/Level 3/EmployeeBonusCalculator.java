import java.util.Random;

public class EmployeeBonusCalculator {
    static int[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        int[][] data = new int[numEmployees][2]; // [][0] -> Salary, [][1] -> Years of Service
        
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = random.nextInt(90000) + 10000; // Random salary between 10000-99999
            data[i][1] = random.nextInt(10) + 1;       // Random years of service between 1-10
        }
        
        return data;
    }

    
    static double[][] calculateBonus(int[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] result = new double[numEmployees][3]; // [][0] -> Old Salary, [][1] -> Bonus, [][2] -> New Salary
        
        for (int i = 0; i < numEmployees; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            
            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        
        return result;
    }

    
    static void displayResults(int[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < employeeData.length; i++) {
            totalOldSalary += bonusData[i][0];
            totalBonus += bonusData[i][1];
            totalNewSalary += bonusData[i][2];

            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Years of Service: " + employeeData[i][1]);
            System.out.println("Old Salary: " + bonusData[i][0]);
            System.out.println("Bonus: " + bonusData[i][1]);
            System.out.println("New Salary: " + bonusData[i][2]);
            System.out.println("-------------------------");
        }

        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        
        
        int[][] employeeData = generateEmployeeData(numEmployees);
        
        
        double[][] bonusData = calculateBonus(employeeData);
        
        
        displayResults(employeeData, bonusData);
    }
}
