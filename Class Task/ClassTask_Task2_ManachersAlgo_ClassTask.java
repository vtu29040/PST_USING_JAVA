public class ClassTask_Task2_ManachersAlgo_ClassTask {

    public static String longestPalindrome(String s) {

        // Transform string
        StringBuilder t = new StringBuilder("^");

        for (char c : s.toCharArray()) {
            t.append("#").append(c);
        }

        t.append("#$");

        int n = t.length();
        int[] p = new int[n];

        int center = 0;
        int right = 0;

        int maxLen = 0;
        int maxCenter = 0;

        for (int i = 1; i < n - 1; i++) {

            // Mirror of i around center
            int mirror = 2 * center - i;

            // Reuse previous palindrome information
            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            // Expand around i
            while (t.charAt(i + 1 + p[i]) == t.charAt(i - 1 - p[i])) {

                p[i]++;
            }

            // Update center and right boundary
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            // Track longest palindrome
            if (p[i] > maxLen) {
                maxLen = p[i];
                maxCenter = i;
            }
        }

        // Convert transformed index back to original index
        int start = (maxCenter - maxLen) / 2;

        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {

        String s = "babad";

        String result = longestPalindrome(s);

        System.out.println("Longest palindrome: " + result);
    }
}
