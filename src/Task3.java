import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        Scanner Scan = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String input = Scan.next().toLowerCase();
        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
        if (input.length() > 1) {
            System.out.println("Error.Not a single character");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error.Enter uppercase or lowercase letter");
        } else if (vowels) {
            System.out.println("Input letter is vowel");
        } else {
            System.out.println("input letter is Consonant");

        }

    }
}
