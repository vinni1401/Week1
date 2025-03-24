import java.util.Scanner;
class Weight{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Weight in pounds :");
		double wp = scan.nextDouble();
		double wk = wp*2.2;
		System.out.println("The weight of the person in pound is " + wp + " and in kg is " + wk );
	}
}
