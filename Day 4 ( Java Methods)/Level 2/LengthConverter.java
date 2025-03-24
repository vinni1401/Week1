import java.util.Scanner;

public class LengthConverter {
    public static double convert(double value, String fromUnit, String toUnit) {
        switch (fromUnit.toLowerCase()) {
            case "km":
                return toUnit.equalsIgnoreCase("miles") ? value * 0.621371 : value;
            case "miles":
                return toUnit.equalsIgnoreCase("km") ? value * 1.60934 : value;
            case "meters":
                return toUnit.equalsIgnoreCase("feet") ? value * 3.28084 : value;
            case "feet":
                return toUnit.equalsIgnoreCase("meters") ? value * 0.3048 : value;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to convert: ");
        double value = sc.nextDouble();
        System.out.print("Enter the current unit (km, miles, meters, feet): ");
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
