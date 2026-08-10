import java.util.*;

public class StudentCount {
    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(65, 80, 90, 72, 76, 55, 88);

        long count = marks.stream()
                .filter(mark -> mark > 75)
                .count();

        System.out.println("Students who scored above 75: " + count);
    }
}