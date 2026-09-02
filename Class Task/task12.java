import java.util.Arrays;

class task12 {
    public static void main(String[] args) {
        String[] departments = {"Marketing", "Finance", "Human Resources", "Engineering", "Sales"};

        Arrays.sort(departments);

        System.out.println("Departments in alphabetical order:");
        for (String department : departments) {
            System.out.println(department);
        }
    }
}