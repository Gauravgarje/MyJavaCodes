import java.util.Scanner;

public class ZeroOneMinusone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();

        if (m > 0) {
            System.out.println("n = 1");
        } else if (m == 0) {
            System.out.println("n = 0");
        } else {
            System.out.println("n = -1");
        }

        scan.close();
    }
}
