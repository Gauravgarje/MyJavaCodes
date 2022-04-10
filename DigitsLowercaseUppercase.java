import java.util.Scanner;

// PROGRAM DESCRIPTION: Program to count lowercase, uppercase alphabets and digits in a password string
// AUTHOR: Gaurav Garje



public class DigitsLowercaseUppercase {
    protected static void digitsLowerCaseUpperCase(String password) {
        int digits = 0;
        int lowerCase = 0;
        int upperCase = 0;

        for(char i : password.toCharArray()) {
            // ASCII value of digits is 48-57 (included)
            // ASCII value of upper case alphabet is 65-90 (included)
            // ASCII value of lower case alphabet is 97-122 (included)

            if (i >= 48 && i <= 57) {
                digits++;
            }
            else if (i >=65 && i <=90){
                upperCase++;
            }
            else if (i >=97 && i <= 122){
                lowerCase++;
            }
            else{
                continue;
            }
        }

        System.out.println("Number of digits: " + digits);
        System.out.println("Number of upper case: " + upperCase);
        System.out.println("Number of lower case: " + lowerCase);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // while inputting password value don't enter spaces else it would not work
        System.out.println("Enter your password: ");
        String password = scan.next();

        digitsLowerCaseUpperCase(password);

        scan.close();
    }
}

// OUTPUT

// Enter your password: 
// hlierHeld544
// Number of digits: 3
// Number of upper case: 1
// Number of lower case: 8
