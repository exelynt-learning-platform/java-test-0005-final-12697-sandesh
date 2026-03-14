import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= rows; i++) {        // rows
            for (int j = 1; j <= i; j++) {       // numbers in each row
                System.out.print(num + " ");
                num++;
            }
            System.out.println();                // next line
        }

        sc.close();
    }
}