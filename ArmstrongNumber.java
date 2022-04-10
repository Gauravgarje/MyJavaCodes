import java.util.Scanner;

// PROGRAM DESCRIPTION: Program to print whether a number is armstrong number or not
// Armstrong number is a number whose sum of individual digits cube is the number itself.
// Ex: 153 -> 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
// AUTHOR: Gaurav Garje

public class ArmstrongNumber {
    protected static void armstrong(int number){
        int sum = 0;
        int num = number;
        while(num!=0){
            int n = num%10;
            sum = sum + (n*n*n);
            num = num/10;
        }
        
        if(sum == number){
            System.out.println("The number " + number + " is an ARMSTRONG NUMBER :)");
        }else{
            System.out.println("The number " + number + " is NOT an ARMSTRONG NUMBER :(");          
        }
    }

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();

        armstrong(number);
    }
    
}


// OUTPUT

// Enter the number: 
// 4352
// The number 4352 is NOT an ARMSTRONG NUMBER :(
// Enter the number: 
// 153
// The number 153 is an ARMSTRONG NUMBER :)