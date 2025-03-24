import java.util.Scanner;
class Tempftc{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit:");
		Float Fahrenheit = scan.nextFloat();
		Float celsiusResult = (Fahrenheit - 32) * 5/9;
		System.out.println("The " + Fahrenheit + " celsius is " + celsiusResult + " celsius ");
	}
}