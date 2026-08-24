public class MarsExploration {
    public static int marsExploration(String s) {
        String message = "SOS";
        int changes = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != message.charAt(i % 3)) {
                changes++;
            }
        }

        return changes;
    }

    public static void main(String[] args) {
        String s = "SOSSPSSQSSOR";
        System.out.println(marsExploration(s));
    }
}