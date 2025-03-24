import java.util.Scanner;
class Quotient{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number1:");
		int number1 = scan.nextInt();
		System.out.println("Enter number2:");
		int number2 = scan.nextInt();
		int Quotient = number1/number2;
		int reminder = number1%number2;
		System.out.println("The Quotient is " + Quotient + " and Reminder is " + reminder + " of two number " + number1 + " and " + number2 );
	}
}