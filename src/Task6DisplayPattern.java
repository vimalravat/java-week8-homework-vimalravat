import java.util.Scanner;

public class Task6DisplayPattern {
    public static void main(String[] args) {
        int i, j, n;
        System.out.print("Input number of row:   " );
        Scanner Scan = new Scanner(System.in);
        n = Scan.nextInt();
        for (i = 1; i <=n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println("");
        }
    }

}
