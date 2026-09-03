import java.util.*;

public class ClassTask_Task5_streamPipeline {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12, 25, 30, 12, 45, 50, 25, 60);

        numbers.stream()
                .distinct()              // remove duplicates
                .filter(n -> n > 20)     // greater than 20
                .map(n -> n * 2)         // multiply by 2
                .sorted()                // ascending order
                .forEach(System.out::println);
    }
}
