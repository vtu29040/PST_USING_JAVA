public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String middle = doubled.substring(1, doubled.length() - 1);

        return middle.contains(s);
    }

    public static void main(String[] args) {
        String s = "abab";
        System.out.println(repeatedSubstringPattern(s));
    }
}