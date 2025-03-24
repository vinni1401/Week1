import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        char unit = sc.next().charAt(0);
        
        if (unit == 'C' || unit == 'c') {
            System.out.println("Converted: " + toCelsius(temp) + "°C");
        } else if (unit == 'F' || unit == 'f') {
            System.out.println("Converted: " + toFahrenheit(temp) + "°F");
        }
        sc.close();
    }

    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
