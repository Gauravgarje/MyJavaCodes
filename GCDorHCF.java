import java.util.Scanner;

public class GCDorHCF {
    public static void main(String[] args) {
        int a, b, i, hcf = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = scan.nextInt();
        System.out.println("Enter second number: ");
        b = scan.nextInt();

        for (i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        System.out.println("HCF of given two numbers is = " + hcf);

        scan.close();
    }
}
