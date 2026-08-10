import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + salary;
    }
}

public class salaryDescending {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Alice", 55000));
        employees.add(new Employee(102, "Bob", 42000));
        employees.add(new Employee(103, "Charlie", 75000));
        employees.add(new Employee(104, "David", 38000));

        // Salary descending
        Comparator<Employee> salaryComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        };

        Collections.sort(employees, salaryComparator);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}