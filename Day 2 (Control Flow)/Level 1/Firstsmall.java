import java.util.Scanner;

public class Firstsmall{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number 1: ");
	int a = scan.nextInt();
	System.out.println("Enter number 2: ");
	int b = scan.nextInt();
	System.out.println("Enter number 3: ");
	int c = scan.nextInt();
	if(a<b && a<c){
		System.out.println("yes, the first number is smallest");
	} else{
		System.out.println("No, the first number is not the smallest");
		}
	}
}
	
	