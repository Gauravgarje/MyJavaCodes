import java.util.Scanner;

public class LargestSmallestOfThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int largest, smallest;

        if (a < b)
        {
            largest = (b < c)?c:b;
            smallest = (a < c )?a:c;
        }
        else
        {
            largest = (a < c)?c:a;
            smallest = (b < c )?b:c;
        }

        System.out.println("largest is = " + largest);
        System.out.println("smallest is = " + smallest);
        scan.close();
    }
}

// OUTPUT

// -59
// 12
// 25
// largest is = 25
// smallest is = -59