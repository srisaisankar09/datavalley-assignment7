import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days the member is late to return the book: ");
        int daysLate = scanner.nextInt();

        double fine = 0.0;

        if (daysLate >= 1 && daysLate <= 7) {
            fine = daysLate * 0.5; // 50 paise per day
        } else if (daysLate >= 8 && daysLate <= 14) {
            fine = (7 * 0.5) + ((daysLate - 7) * 1);
        } else if (daysLate > 14 && daysLate <= 21) {
            fine = (7 * 0.5) + (7 * 1) + ((daysLate - 14) * 5);
        } else if (daysLate > 21) {
            System.out.println("Your membership has been canceled due to returning the book more than 21 days late.");
            scanner.close();
            return;
        }

        System.out.println("Fine for returning the book " + daysLate + " days late: Rs. " + fine);

        scanner.close();
    }
}
