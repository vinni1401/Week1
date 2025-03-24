import java.util.Scanner;
class ConversionNew{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Kilometers:");
		double Km = scan.nextDouble();
		double miles = Km/1.6;
		System.out.println("The total miles is " + miles + " for the given " + Km);
	}
}