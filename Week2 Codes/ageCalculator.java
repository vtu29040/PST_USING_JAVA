import java.time.*;
import java.util.*;

public class ageCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int year = in.nextInt();

        System.out.print("Enter your birth month: ");
        int month = in.nextInt();

        System.out.print("Enter your birth day: ");
        int day = in.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        System.out.println("Age: " +
                age.getYears() + " years " +
                age.getMonths() + " months " +
                age.getDays() + " days");

        in.close();
    }
}