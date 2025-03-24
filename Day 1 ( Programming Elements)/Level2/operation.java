import java.util.Scanner;
class operation{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter values a,b and c:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int op1 = a+b*c;
		int op2 = a*b+c;
		int op3 = c+a/b;
		int op4 = a%b+c;
		System.out.println(" The results of Int Operations are " + op1 + " , " + op2 + " , " + op3 + " and " + op4 );
	}
}

	