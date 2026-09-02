import java.util.Arrays;
import java.util.Collections;

class task13 {
    public static void main(String[] args) {
        Integer[] salaries = {55000, 72000, 48000, 91000, 60000};
        String[] departments = {"Marketing", "Finance", "Human Resources", "Engineering", "Sales"};

        Arrays.sort(salaries, Collections.reverseOrder());
        Arrays.sort(departments);

        System.out.println("Salaries in descending order:");
        for (int salary : salaries) {
            System.out.println(salary);
        }

        System.out.println();
        System.out.println("Departments in alphabetical order:");
        for (String department : departments) {
            System.out.println(department);
        }
    }
}