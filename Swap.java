// PROGRAM DESCRIPTION: Program to swap two numbers.  
// AUTHOR: Gaurav Garje

public class Swap {
    public static void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;

        System.out.println("the value of first number = " + m);
        System.out.println("the value of second number = " + n);
    }

    public static void main(String[] args) {
        System.out.println("Values before swapping: 3 4");
        System.out.println("Values after swapping: ");
        swap(3, 4);
    }
}

// OUTPUT

// Values before swapping: 3 4
// Values after swapping: 
// the value of first number = 4
// the value of second number = 3