import java.util.Scanner;

public class findHighestAltitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of altitude changes
        System.out.print("Enter the number of altitude changes: ");
        int n = sc.nextInt();

        int[] gain = new int[n];

        // Input the gain array
        System.out.println("Enter the altitude changes:");
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        int currentAltitude = 0;
        int highestAltitude = 0;

        // Calculate the highest altitude
        for (int i = 0; i < n; i++) {
            currentAltitude += gain[i];

            if (currentAltitude > highestAltitude) {
                highestAltitude = currentAltitude;
            }
        }

        // Print the result
        System.out.println("Highest Altitude: " + highestAltitude);

        sc.close();
    }
}