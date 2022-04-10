import java.util.Scanner;

// PROGRAM DESCRIPTION: program to find largest and smallest of the numbers in an array
// AUTHOR: gaurav garje

public class LargestSmallestOfArray {
    protected static int largestElement(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int element: arr){
            if(element>max){
                max = element;
            }
        }
        return max;
    }

    protected static int smallestElement(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int element: arr){
            if(element<min){
                min = element;
            }
        }
        return min;
    }
    
    protected static int[] arrayConstructor(int size){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[size];

        for(int i=0; i <size ; i++){
            System.out.print("Enter the element " + (i+1) + ": ");
            arr[i] = scan.nextInt();
            System.out.println();            
        }

        return arr;
    }

    protected static void arrayPrinter(int[] arr){
        for(int element: arr){
            System.out.println( element + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] arr = arrayConstructor(size);
        System.out.println("Largest element in the array is: " + largestElement(arr));
        System.out.println("Smallest element in the array is: " + smallestElement(arr));
        scan.close();
    }
}
