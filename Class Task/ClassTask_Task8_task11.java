import java.util.Arrays;
import java.util.Collections;

class task11 {
    public static void main(String[] args) {
        Integer[] salaries = {55000, 72000, 48000, 91000, 60000};

        Arrays.sort(salaries, Collections.reverseOrder());

        System.out.println("Salaries in descending order:");
        for (int salary : salaries) {
            System.out.println(salary);
        }
    }
}
