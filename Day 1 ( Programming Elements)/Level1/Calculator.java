import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number1 :");
	float number1 = scan.nextFloat();
	System.out.println("Enter number2 :");
	float number2 = scan.nextFloat();
	float addition = number1 + number2;
	float substraction = number1 - number2;
	float multiplication = number1*number2;
	float division = number1/number2;
	System.out.println("The addition, substraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + " , " + substraction + "," + multiplication + " and " + division);
	}
} 