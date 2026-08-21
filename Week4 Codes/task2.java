import java.util.*;

class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // Input array
        int nums[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Check for duplicate
        boolean result = containsDuplicate(nums);

        System.out.println("Contains duplicate: " + result);

        sc.close();
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                return true;
            }
        }

        return false;
    }
}