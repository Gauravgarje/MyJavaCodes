import java.util.Scanner;

public class EvenOdd {
    public static boolean odd_even(int n) {
        return (n % 2 != 0) ? true : false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        if (odd_even(number)) {
            System.out.println("Odd number");
        } else {
            System.out.println("Even number");
        }

        scan.close();
    }
}

// OUTPUT

// Enter a number:
// -25
// Odd number