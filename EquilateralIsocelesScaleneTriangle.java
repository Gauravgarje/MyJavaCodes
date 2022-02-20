public class EquilateralIsocelesScaleneTriangle {
    public static void main(String[] args) {
        int a = 75;
        int b = 25;
        int c = 23;

        if ((a == b) && (b == c) && (c == a))
            System.out.println("Equilateral");
        else if ((a == b) || (b == c) || (a == c))
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }
}
