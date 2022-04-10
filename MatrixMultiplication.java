import java.util.Scanner;

// PROGRAM DESCRIPTION: program to multiply two matrix
// AUTHOR: gaurav garje

public class MatrixMultiplication {
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

    protected static int[][] multiplyMatrix(int[][] arr1, int[][] arr2, int m, int n, int p){
        
        int[][] resultMatrix = new int[m][p];
        for(int i=0 ; i<m ; i++){
            for(int k=0 ; k<p ; k++){
                int sum = 0;
                for(int j=0 ; j<n ; j++){
                    sum += ( arr1[i][j] * arr2[j][k] ); 
                }
                resultMatrix[i][k] = sum;
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
        
        System.out.println("\t\t\tENTER THE SECOND MATRIX: ");
        System.out.println("Enter m: " + n);
        System.out.println("Enter n: ");
        int p = scan.nextInt();
        int[][] arr2 = inputMatrix(n, p);
        // System.out.println(arr2.hashCode());
        System.out.println("\t\t\tPRINTING THE FIRST MATRIX");
        printMatrix(arr1);
        System.out.println("\t\t\tPRINTING THE SECOND MATRIX");
        printMatrix(arr2);

        System.out.println("\t\t\tMULTIPLICATION OF THE MATRIX");
        int[][] res = multiplyMatrix(arr1, arr2, m, n, p);
        printMatrix(res);

        scan.close();
    }

}
