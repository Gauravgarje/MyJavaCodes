import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if (year % 400 == 0) {
            System.out.println("leap year");
            System.exit(0);
        } else if ((year % 100 == 0) && (year % 4 == 0)) {
            System.out.println("leap year");
            System.exit(0);
        } else {
            System.out.println("Not leap year");
        }

        scan.close();
    }
}
