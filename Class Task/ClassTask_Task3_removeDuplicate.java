import java.util.*;

public class ClassTask_Task3_removeDuplicate {
    public static void main(String[] args) {
        int a[] = { 10, 20, 20, 30, 40, 40 };
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add((a[i]));
        }
        System.out.println(set);
    }
}

