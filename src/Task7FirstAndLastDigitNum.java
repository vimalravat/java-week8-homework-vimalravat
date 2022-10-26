public class Task7FirstAndLastDigitNum {
    public static void main(String[] args) {
        System.out.println("sumFirstAndLastDigit(252): "+sumFirstAndLastDigit(252));
        System.out.println("sumFirstAndLastDigit(257): "+sumFirstAndLastDigit(257));
        System.out.println("sumFirstAndLastDigit(0): "+sumFirstAndLastDigit(0));
        System.out.println("sumFirstAndLastDigit(5): "+sumFirstAndLastDigit(5));
        System.out.println("sumFirstAndLastDigit(-10): "+sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;

        while (number > 0) {

            if (number < 10) {
                firstDigit = number;
                break;
            }
            number /= 10;
        }

        return lastDigit + firstDigit;
    }
}