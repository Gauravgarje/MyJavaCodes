// PROBLEM STATEMENT: Program to calculate the square of a number (integer | floating point number | negative number) .
// AUTHOR: Gaurav Garje

import java.util.Scanner;

public class Square {

    // function to calculate square.
    static double squareCalculator(double n){
        return (n*n);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      
        System.out.println("Enter a number: ");
        double n = scan.nextDouble();     // Scanning a number.

        System.out.println("The square of " + n + " is = " + squareCalculator(n));      // Calling the function to calculate square.

        scan.close();   // to avoid memory leak, closing the scanner stream.
    }
}

// OUTPUT

// Enter a number: 
// 5
// The square of 5is = 25
// Enter a number: 
// -5
// The square of -5 is = 25
// Enter a number: 
// 7.7
// The square of 7.7 is = 59.290000000000006