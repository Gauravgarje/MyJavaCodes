// PROGRAM DESCRIPTION: Program to show String formatting in java
// AUTHOR: Gaurav Garje

public class Formatting {
    public static void main(String[] args) {
        System.out.printf("%-10s", "Name");
        System.out.print(" : Gaurav");
        System.out.println();

        System.out.printf("%-10s", "City");
        System.out.print(" : Pune");
        System.out.println();

        System.out.printf("%-10s", "Hobby");
        System.out.print(" : Playing_Chess");
        System.out.println();
    }
}

// OUTPUT

// Name       : Gaurav
// City       : Pune
// Hobby      : Playing_Chess