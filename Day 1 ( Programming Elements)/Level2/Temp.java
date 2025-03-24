import java.util.Scanner;
class Temp{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Temperature in celsius:");
		Float Celsius = scan.nextFloat();
		Float FahrenheitResult = (Celsius * 9/5) + 32;
		System.out.println("The " + Celsius + " celsius is " + FahrenheitResult + " fahrenheit ");
	}
}