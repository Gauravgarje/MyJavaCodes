import java.util.Scanner;

public class SimpleCalculator {
    static char response = 'Y';
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while( (response == 'Y') || (response == 'y') ){
            
            System.out.println("Enter first number: ");
            Float a = scan.nextFloat();
            System.out.println("Enter second number: ");
            Float b = scan.nextFloat();

            System.out.println("****MENU****");
            System.out.println(" 1 -> ADDITION ");
            System.out.println(" 2 -> SUBTRACTION ");
            System.out.println(" 3 -> MULTIPLICATION ");
            System.out.println(" 4 -> DIVISION ");
            System.out.println(" 5 -> MODULUS ");
            System.out.println("Enter your response: ");
            int menuRes = scan.nextInt();

            if( (b==0) && ( menuRes==4 || menuRes==5) )
            {
                System.out.println("Divide by zero error!! PLEASE ENTER DIFFERENT VALUE FOR SECOND VARIABLE");
                continue;
            }
            switch(menuRes){
                case 1: System.out.println("ADDITION: a + b (" + a + " + " + b + ") = " + (a+b) ); break;
                case 2: System.out.println("SUBTRACTION: a - b (" + a + " - " + b + ") = " + (a-b) ); break;
                case 3: System.out.println("MULTIPLICATION: a * b (" + a + " * " + b + ") = " + (a*b) ); break;
                case 4: System.out.println("DIVISION: a / b (" + a + " / " + b + ") = " + (a/b) ); break;
                case 5: System.out.println("MODULUS: a % b (" + a + " % " + b + ") = " + (a%b) ); break;
                default: System.out.println("PLEASE ENTER A VALID MENU RESPONSE"); continue;
            }

            System.out.println("Want to do more calculations? (Y/N) : ");
            response = scan.next().charAt(0); // input charachter data type

        }

        scan.close();
    }
}

// OUTPUT

// Enter first number: 
// 25
// Enter second number: 
// 3
// ****MENU****
//  1 -> ADDITION
//  2 -> SUBTRACTION
//  3 -> MULTIPLICATION
//  4 -> DIVISION
//  5 -> MODULUS
// Enter your response:
// 1
// ADDITION: a + b (25.0 + 3.0) = 28.0
// Want to do more calculations? (Y/N) :
// y
// Enter first number: 
// 25
// Enter second number: 
// 3
// ****MENU****
//  1 -> ADDITION
//  2 -> SUBTRACTION
//  3 -> MULTIPLICATION
//  4 -> DIVISION
//  5 -> MODULUS
// Enter your response:
// 2
// SUBTRACTION: a - b (25.0 - 3.0) = 22.0
// Want to do more calculations? (Y/N) :
// y
// Enter first number: 
// 25
// Enter second number: 
// 32
// ****MENU****
//  1 -> ADDITION
//  2 -> SUBTRACTION
//  3 -> MULTIPLICATION
//  4 -> DIVISION
//  5 -> MODULUS
// Enter your response:
// 3
// MULTIPLICATION: a * b (25.0 * 32.0) = 800.0
// Want to do more calculations? (Y/N) :
// y
// Enter first number: 
// 25
// Enter second number: 
// 3
// ****MENU****
//  1 -> ADDITION
//  2 -> SUBTRACTION
//  3 -> MULTIPLICATION
//  4 -> DIVISION
//  5 -> MODULUS
// Enter your response:
// 4
// DIVISION: a / b (25.0 / 3.0) = 8.333333
// Want to do more calculations? (Y/N) :
// y
// Enter first number: 
// 25
// Enter second number: 
// 3
// ****MENU****
//  1 -> ADDITION
//  2 -> SUBTRACTION
//  3 -> MULTIPLICATION
//  4 -> DIVISION
//  5 -> MODULUS
// Enter your response:
// 5
// MODULUS: a % b (25.0 % 3.0) = 1.0
// Want to do more calculations? (Y/N) :
// y
// Enter first number: 
// 25
// Enter second number: 
// 3
// ****MENU****
//  1 -> ADDITION
//  2 -> SUBTRACTION
//  3 -> MULTIPLICATION
//  4 -> DIVISION
//  5 -> MODULUS
// Enter your response:
// 6
// PLEASE ENTER A VALID MENU RESPONSE
// Enter first number:
// 25
// Enter second number: 
// 0 
// ****MENU****
//  1 -> ADDITION
//  2 -> SUBTRACTION
//  3 -> MULTIPLICATION
//  4 -> DIVISION
//  5 -> MODULUS
// Enter your response:
// 4
// Divide by zero error!! PLEASE ENTER DIFFERENT VALUE FOR SECOND VARIABLE
// Enter first number:
// 25
// Enter second number: 
// 0
// ****MENU****
//  1 -> ADDITION
//  2 -> SUBTRACTION
//  3 -> MULTIPLICATION
//  4 -> DIVISION
//  5 -> MODULUS
// Enter your response:
// 5
// Divide by zero error!! PLEASE ENTER DIFFERENT VALUE FOR SECOND VARIABLE
// Enter first number:
// 22
// Enter second number: 
// 3
// ****MENU****
//  1 -> ADDITION
//  2 -> SUBTRACTION
//  3 -> MULTIPLICATION
//  4 -> DIVISION
//  5 -> MODULUS
// Enter your response:
// 6
// PLEASE ENTER A VALID MENU RESPONSE
// Enter first number:
// 25
// Enter second number: 
// 2
// ****MENU****
//  1 -> ADDITION
//  2 -> SUBTRACTION
//  3 -> MULTIPLICATION
//  4 -> DIVISION
//  5 -> MODULUS
// Enter your response:
// 5
// MODULUS: a % b (25.0 % 2.0) = 1.0
// Want to do more calculations? (Y/N) :
// n