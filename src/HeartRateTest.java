import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dateOfBirth = sc.nextLine();

        HeartRates person = new HeartRates(firstName, lastName, dateOfBirth);

        System.out.println("\n" + person.toString());
        person.getTargetHeartRateRange();

        sc.close();
    }
}
