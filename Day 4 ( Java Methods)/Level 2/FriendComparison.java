import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3], heights = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age and height: ");
            ages[i] = sc.nextInt();
            heights[i] = sc.nextInt();
        }
        int youngest = Math.min(ages[0], Math.min(ages[1], ages[2]));
        int tallest = Math.max(heights[0], Math.max(heights[1], heights[2]));
        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);
    }
}
