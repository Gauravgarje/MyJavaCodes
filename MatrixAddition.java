import java.util.Scanner;

// PROGRAM DESCRIPTION: program to add two matrix
// AUTHOR: gaurav garje

public class MatrixAddition {
    protected static int[][] inputMatrix(int m, int n){
        Scanner scan = new Scanner(System.in);

        int[][] arr = new int[m][n];
        // System.out.println(arr.hashCode());

        for(int i=0; i<m ; i++) {
            System.out.println();
            System.out.println("Enter row " + (i+1));
            for(int j=0 ; j<n ; j++){
                System.out.print("Enter element " + (j+1) + ": ");
                arr[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        // scan.close();
        return arr;
    }

    protected static void printMatrix(int[][] arr){
        System.out.println();

        for(int[] row: arr){
            for(int element: row){
                System.out.printf("%-5s" , element);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    protected static int[][] addMatrix(int[][] arr1, int[][] arr2, int m, int n){
        int[][] resultMatrix = new int[m][n];
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                resultMatrix[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return resultMatrix;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\t\t\tENTER THE DIMENSIONS OF THE FIRST MATRIX (M*N): ");
        System.out.println("Enter m: ");
        int m = scan.nextInt();
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        int[][] arr1 = inputMatrix(m, n);
        // System.out.println(arr1.hashCode());
        
        System.out.println("\t\t\tENTER THE SECOND MATRIX: "); //dimensions for addition will be the same for both matrix
        int[][] arr2 = inputMatrix(m, n);
        // System.out.println(arr2.hashCode());
        System.out.println("\t\t\tPRINTING THE FIRST MATRIX");
        printMatrix(arr1);
        System.out.println("\t\t\tPRINTING THE SECOND MATRIX");
        printMatrix(arr2);

        System.out.println("\t\t\tADDITION OF THE MATRIX");
        int[][] res = addMatrix(arr1, arr2, m, n);
        printMatrix(res);

        scan.close();
    }
}


// OUTPUT

// ENTER THE DIMENSIONS OF THE FIRST MATRIX (M*N): 
// Enter m: 
// 2
// Enter n: 
// 3

// Enter row 1
// Enter element 1: 1
// Enter element 2: 1
// Enter element 3: 1


// Enter row 2
// Enter element 1: 1
// Enter element 2: 1
// Enter element 3: 1

//                         ENTER THE SECOND MATRIX:

// Enter row 1
// Enter element 1: 2
// Enter element 2: 2
// Enter element 3: 2


// Enter row 2
// Enter element 1: 2
// Enter element 2: 2
// Enter element 3: 2

//                         PRINTING THE FIRST MATRIX

// 1     1     1
// 1     1     1
//                         PRINTING THE SECOND MATRIX

// 2     2     2
// 2     2     2
//                         ADDITION OF THE MATRIX

// 3     3     3
// 3     3     3