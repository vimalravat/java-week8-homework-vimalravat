import java.util.Scanner;

public class Task12PrimeOrNot {
    public static void main(String[] args) {
        int myNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        myNumber = sc.nextInt();
        boolean isPrimeNumber = false;
        for (int i = 2; i <= myNumber / 2; ++i) {
            if (myNumber % i == 0) ;
            isPrimeNumber = true;
            break;
        }
        if (!isPrimeNumber)
            System.out.println("The number " + myNumber + " is a prime number");
        else
            System.out.println("The number " + myNumber + " is not a prime number");

    }
}
