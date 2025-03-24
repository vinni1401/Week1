import java.util.Scanner;
class doperations{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter values a,b and c:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double op1 = a+b*c;
		double op2 = a*b+c;
		double op3 = c+a/b;
		double op4 = a%b+c;
		System.out.println(" The results of Int Operations are " + op1 + " , " + op2 + " , " + op3 + " and " + op4 );
	}
}

	