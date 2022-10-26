import java.util.Scanner;

public class Task1ReadingUserInputChallenge {
    public static void main(String[] args) {
        int sum = 0;
        int total = 1;


        Scanner scanner = new Scanner(System.in);


        while (total <= 10) {
            System.out.println("Enter number:  " + total);
            boolean validNumber = scanner.hasNextInt();

            if (validNumber) {
                int number = scanner.nextInt();
                sum += number;
                total++;


            } else {
                System.out.println("Invalid number");

            }
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers= " + sum);
        scanner.close();
    }
}