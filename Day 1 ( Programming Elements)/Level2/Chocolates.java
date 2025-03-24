import java.util.Scanner;
class Chocolates{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numberofChocolates and numberofChildren:");
		int numberofChocolates = scan.nextInt();
		int numberofChildren = scan.nextInt();
		int chocperchild = numberofChocolates/numberofChildren;
		int reminder = numberofChocolates%numberofChildren;
		System.out.println("The number of chocolates each child gets is " + chocperchild + " and the number of remaning chocolates are " + reminder );
	}
}