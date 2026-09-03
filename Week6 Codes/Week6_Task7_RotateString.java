public class Week6_Task7_RotateString {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(s, goal));
    }
}
