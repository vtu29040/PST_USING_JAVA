public class calculateAverage {
    public static void main(String[] args) {
        int nums[] = { 75, 80, 65, 90, 85 };
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double avg = 0.0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        avg = total/nums.length;
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
