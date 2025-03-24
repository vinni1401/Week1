import java.util.Scanner;

public class Voting{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = scan.nextInt();
		if (age>18){
			System.out.println(" The persons age is " + age + " and they can vote ");
		} else{
			System.out.println(" The persons age is " + age + " and they cannot vote ");
		}
	}
}