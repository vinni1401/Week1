import java.util.Scanner;
public class pnz{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int num = scan.nextInt();
		if(num>0){
			System.out.println("The number " + num + " is positive ");
		} else if (num<0){
			System.out.println("The number " + num + " is negative ");
		} else {
			System.out.println("The number " + num + " is zero ");
		}
	}
}