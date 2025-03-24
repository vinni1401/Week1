import java.util.Scanner;
class Income{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Salary :");
		double Salary = scan.nextDouble();
		System.out.println("Enter Bonus :");
		double Bonus = scan.nextDouble();
		double Income = Salary + Bonus;
		System.out.println(" The Salary is INR " + Salary + " and bonus is INR " + Bonus + " .Hence Total income is INR " + Income );
	
	}
}