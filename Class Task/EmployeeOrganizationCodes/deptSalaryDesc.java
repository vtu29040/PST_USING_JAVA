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

public class deptSalaryDesc {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "John", "Finance", 50000));
        employees.add(new Employee(102, "Alice", "HR", 60000));
        employees.add(new Employee(103, "David", "IT", 70000));
        employees.add(new Employee(104, "Bob", "Finance", 75000));
        employees.add(new Employee(105, "Mike", "IT", 55000));

        // Department alphabetically + Salary descending
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {

                int departmentCompare =
                        e1.department.compareTo(e2.department);

                if (departmentCompare != 0) {
                    return departmentCompare;
                }

                return Double.compare(e2.salary, e1.salary);
            }
        });

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}