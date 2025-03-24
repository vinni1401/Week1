import java.util.Scanner;

public class Bigof3{
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number 1 : ");
	int a = scan.nextInt();
	System.out.println("Enter number 2 : ");
	int b = scan.nextInt();
	System.out.println("Enter number 3 : ");
	int c = scan.nextInt();
	if (a>b && a>c){
		System.out.println("The biggest number of the three is " + a);
	} else if (b>a && b>c){
		System.out.println("The biggest number of the three is " + b);
	} else {
		System.out.println("The biggest number of the three is " + c);
	}
	}
}