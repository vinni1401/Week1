import java.util.Scanner;

public class LengthConverter2 {
    public static double convert(double value, String fromUnit, String toUnit) {
        switch (fromUnit.toLowerCase()) {
            case "yards":
                return toUnit.equalsIgnoreCase("feet") ? value * 3 : value;
            case "feet":
                return toUnit.equalsIgnoreCase("yards") ? value * 0.333333 : value;
            case "meters":
                return toUnit.equalsIgnoreCase("inches") ? value * 39.3701 : value;
            case "inches":
                return toUnit.equalsIgnoreCase("meters") ? value * 0.0254 : 
                       toUnit.equalsIgnoreCase("cm") ? value * 2.54 : value;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to convert: ");
        double value = sc.nextDouble();
        System.out.print("Enter the current unit (yards, feet, meters, inches, cm): ");
        String fromUnit = sc.next();
        System.out.print("Enter the unit to convert to: ");
        String toUnit = sc.next();

        double result = convert(value, fromUnit, toUnit);
        if (result == -1) {
            System.out.println("Invalid conversion units!");
        } else {
            System.out.println("Converted value: " + result + " " + toUnit);
        }
    }
}
