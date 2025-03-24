import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] distributeChocolates(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter chocolates and children count: ");
        int chocolates = scanner.nextInt(), children = scanner.nextInt();

        int[] result = distributeChocolates(chocolates, children);
        System.out.println("Each child gets: " + result[0] + ", Remaining: " + result[1]);

        scanner.close();
    }
}
