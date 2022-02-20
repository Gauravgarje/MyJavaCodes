public class MarksGrade {
    public static void main(String[] args) {
        int P = 56;
        int C = 65;
        int M = 34;

        int percentage = (P + C + M) / 3;
        System.out.println("Percentage = " + percentage);
        if (percentage >= 90)
            System.out.println("Grade = A");
        else if (percentage >= 80)
            System.out.println("Grade = B");
        else if (percentage >= 70)
            System.out.println("Grade = C");
        else
            System.out.println("Grade = D");
    }
}
