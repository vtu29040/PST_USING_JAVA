import java.util.*;

public class TwoStrings {
    public static String twoStrings(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : s1.toCharArray()) {
            set.add(ch);
        }

        for (char ch : s2.toCharArray()) {
            if (set.contains(ch)) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";

        System.out.println(twoStrings(s1, s2));
    }
}