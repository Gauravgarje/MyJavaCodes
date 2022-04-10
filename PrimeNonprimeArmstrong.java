import java.util.Scanner;

// PROBLEM STATEMENT: WAP which will take a number as input . Print all the prime numbers from 1 to n. For all the non-prime numbers, print whether they are armstrong numbers or not.
// AUTHOR: Gaurav Garje

public class PrimeNonprimeArmstrong {

    protected static boolean IsPrime(int number) {
        if(number == 1){
            return false;
        }
        else if(number == 2 || number == 3){
            return true;
        }
        else{
            int end = number/2;
            for (int i = 2; i<= end ;i++){
                if (number%i == 0){
                    return false;
                }
            }
            return true;
        }
    }

    protected static boolean IsArmstrongNumber(int number){
        int sum = 0;
        int num = number;
        while(num!=0){
            int n = num%10;
            sum = sum + (n*n*n);
            num = num/10;
        }
        
        if(sum == number)
            return true;
        else
            return false;          
        
    }

    protected static void primeNumberLogic_Till_N(int number) {
        for (int i = 1; i <= number; i++) {
            if(IsPrime(i)){
                System.out.println("The number " + i + " is a PRIME NUMBER");
            }
            else if(IsArmstrongNumber(i)){
                System.out.println("The number " + i + " is NOT PRIME NUMBER but an ARMSTRONG NUMBER");
            }
            else{
                System.out.println("The number " + i + " is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();

        primeNumberLogic_Till_N(number);

        scan.close();
    }
}


// OUTPUT

// Enter the number: 
// 50
// The number 1 is NOT PRIME NUMBER but an ARMSTRONG NUMBER
// The number 2 is a PRIME NUMBER
// The number 3 is a PRIME NUMBER
// The number 4 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 5 is a PRIME NUMBER
// The number 6 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 7 is a PRIME NUMBER
// The number 8 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 9 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 10 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 11 is a PRIME NUMBER
// The number 12 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 13 is a PRIME NUMBER
// The number 14 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 15 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 16 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 17 is a PRIME NUMBER
// The number 18 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 19 is a PRIME NUMBER
// The number 20 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 21 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 22 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 23 is a PRIME NUMBER
// The number 24 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 25 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 26 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 27 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 28 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 29 is a PRIME NUMBER
// The number 30 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 31 is a PRIME NUMBER
// The number 32 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 33 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 34 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 35 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 36 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 37 is a PRIME NUMBER
// The number 38 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 39 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 40 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 41 is a PRIME NUMBER
// The number 42 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 43 is a PRIME NUMBER
// The number 44 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 45 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 46 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 47 is a PRIME NUMBER
// The number 48 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 49 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER
// The number 50 is NEITHER PRIME NUMBER NOR ARMSTRONG NUMBER