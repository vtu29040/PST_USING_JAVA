import java.util.Scanner;

public class Week2_Task6_shuffleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input n
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int[] nums = new int[2 * n];
        int[] ans = new int[2 * n];

        // Input array
        System.out.println("Enter " + (2 * n) + " elements:");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }

        int j = 0;

        // Shuffle the array
        for (int i = 0; i < n; i++) {
            ans[j++] = nums[i];
            ans[j++] = nums[i + n];
        }

        // Print shuffled array
        System.out.println("Shuffled Array:");
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}
