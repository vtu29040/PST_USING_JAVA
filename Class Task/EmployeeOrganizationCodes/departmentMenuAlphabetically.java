import java.util.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}

public class departmentMenuAlphabetically {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "John", "Finance", 50000));
        employees.add(new Employee(102, "Alice", "HR", 60000));
        employees.add(new Employee(103, "David", "IT", 70000));
        employees.add(new Employee(104, "Bob", "Marketing", 45000));

        // Sort departments alphabetically (A-Z)
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.department.compareTo(e2.department);
            }
        });

        // Display sorted employees
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}