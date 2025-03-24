import java.util.Scanner;
class Swap{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers 1 and 2 :");
		int a = scan.nextInt();
		int b = scan.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("The swapped numbers are " + a + " and " + b);
	}
}
