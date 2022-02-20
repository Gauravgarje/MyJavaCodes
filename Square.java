import java.util.Scanner;

public class Square {
    static int squareCalculator(int n){
        return (n*n);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();

        System.out.println("The square of " + n + " is = " + squareCalculator(n));

        scan.close();
    }
}

// OUTPUT

// Enter a number: 
// 5
// The square of 5is = 25
// Enter a number: 
// -5
// The square of -5 is = 25