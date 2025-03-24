import java.util.Scanner;

public class MultiConverter {
    public static double convertTemperature(double value, String fromUnit, String toUnit) {
        if (fromUnit.equalsIgnoreCase("C") && toUnit.equalsIgnoreCase("F"))
            return (value * 9 / 5) + 32;
        else if (fromUnit.equalsIgnoreCase("F") && toUnit.equalsIgnoreCase("C"))
            return (value - 32) * 5 / 9;
        return -1;
    }

    public static double convertWeight(double value, String fromUnit, String toUnit) {
        if (fromUnit.equalsIgnoreCase("kg") && toUnit.equalsIgnoreCase("pounds"))
            return value * 2.20462;
        else if (fromUnit.equalsIgnoreCase("pounds") && toUnit.equalsIgnoreCase("kg"))
            return value * 0.453592;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to convert: ");
        double value = sc.nextDouble();
        System.out.print("Enter the current unit (C, F, kg, pounds): ");
        String fromUnit = sc.next();
        System.out.print("Enter the unit to convert to: ");
        String toUnit = sc.next();

        double result;
        if (fromUnit.equalsIgnoreCase("C") || fromUnit.equalsIgnoreCase("F"))
            result = convertTemperature(value, fromUnit, toUnit);
        else
            result = convertWeight(value, fromUnit, toUnit);

        if (result == -1) {
            System.out.println("Invalid conversion units!");
        } else {
            System.out.println("Converted value: " + result + " " + toUnit);
        }
    }
}
