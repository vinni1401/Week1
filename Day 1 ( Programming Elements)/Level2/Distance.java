import java.util.Scanner;
class Distance{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name, fromcity, viacity, tocity :" );
		String name = scan.next();
		String fromcity = scan.next();
		String viacity = scan.next();
		String tocity = scan.next();
		System.out.println("Enter distance of fromtovia and viatoFinalcity:" );
		double fromtovia = scan.nextDouble();
		double viatoFinalcity = scan.nextDouble();
		System.out.println("Enter time of fromtoviat1 and viatoFinalcityt2:" );
		int fromtoviat1 = scan.nextInt();
		int viatoFinalcityt2 = scan.nextInt();
		double totalDistance = fromtovia + viatoFinalcity;
		int totaltime = fromtoviat1 + viatoFinalcityt2;
		System.out.println(" The Total Distance travelled by " + name + " from " + 
                         fromcity + " to " + tocity + " via " + viacity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totaltime + " hours);
	}
}

