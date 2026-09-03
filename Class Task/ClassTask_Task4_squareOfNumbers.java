import java.util.*;
public class ClassTask_Task4_squareOfNumbers{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]*a[i]+" ");
        }
    }
}
