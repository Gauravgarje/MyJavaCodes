import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter X coordinate: ");
        int X = scan.nextInt();
        System.out.println("Enter Y coordinate: ");
        int Y = scan.nextInt();

        int quadrant;
        if(X == 0 || Y == 0)
        {
            System.out.println("the coordinate either lies on the axis or on origin");
            System.exit(0);
        }
        if (X > 0)
            quadrant = (Y > 0) ? 1 : 4;
        else
            quadrant = (Y > 0) ? 2 : 3;

        System.out.println("The point lies on quadrant " + quadrant);
        scan.close();
    }
}

// OUTPUT

// Enter X coordinate: 
// 5
// Enter Y coordinate: 
// 0
// the coordinate either lies on the axis or on origin