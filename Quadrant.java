import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter X coordinate: ");
        int X = scan.nextInt();
        System.out.println("Enter Y coordinate: ");
        int Y = scan.nextInt();

        int quadrant;
        if (X > 0)
        {
            quadrant = (Y > 0) ? 1 : 4;
            System.out.println("Point lies on quadrant " + quadrant);
        }
        else if(X < 0)
        {
            quadrant = (Y > 0) ? 2 : 3;
            System.out.println("Point lies on quadrant " + quadrant);
        }
        else if(X == 0 && Y != 0)
            System.out.println("Point lies on Y axis");
        else if(X != 0 && Y == 0)
            System.out.println("Point lies on X axis");
        else 
            System.out.println("Point lies on Origin");

        scan.close();
    }
}

// OUTPUT

// Enter X coordinate: 
// 5
// Enter Y coordinate: 
// 0
// the coordinate either lies on the axis or on origin