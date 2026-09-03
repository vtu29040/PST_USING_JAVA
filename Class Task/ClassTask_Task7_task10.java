import java.util.*;

public class ClassTask_Task7_task10 {
    public static void main(String[] args) {
        List<Integer> salaries = new ArrayList<>();
        salaries.add(45000);
        salaries.add(32000);
        salaries.add(60000);
        salaries.add(28000);
        salaries.add(50000);

        for (int i = 0; i < salaries.size(); i++) {
            for (int j = i + 1; j < salaries.size(); j++) {
                if (salaries.get(i) > salaries.get(j)) {
                    int temp = salaries.get(i);
                    salaries.set(i, salaries.get(j));
                    salaries.set(j, temp);
                }
            }
        }

        System.out.println("Salaries in ascending order: " + salaries);
    }
} 
