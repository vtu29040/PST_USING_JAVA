public class CircularPalindromes {
    public static int longestPalindrome(String s) {
        int n = s.length();
        String doubled = s + s;
        int maxLength = 1;

        for (int center = 0; center < doubled.length(); center++) {
            int left = center;
            int right = center;

            while (left >= 0 && right < doubled.length()
                    && doubled.charAt(left) == doubled.charAt(right)
                    && right - left + 1 <= n) {
                maxLength = Math.max(maxLength, right - left + 1);
                left--;
                right++;
            }

            left = center;
            right = center + 1;

            while (left >= 0 && right < doubled.length()
                    && doubled.charAt(left) == doubled.charAt(right)
                    && right - left + 1 <= n) {
                maxLength = Math.max(maxLength, right - left + 1);
                left--;
                right++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "aab";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            String rotation = s.substring(i) + s.substring(0, i);
            System.out.println(rotation + " -> " + longestPalindrome(rotation));
        }
    }
}