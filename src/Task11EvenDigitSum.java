public class Task11EvenDigitSum {
    public static void main(String[] args) {
        System.out.println("getEvenDigitSum(123456789): " + getEvenDigitSum(123456789));
        System.out.println("getEvenDigitSum(252): " + getEvenDigitSum(252));
        System.out.println("getEvenDigitSum(-22): " + getEvenDigitSum(-22));


    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int remainder = number % 10;

            if (remainder % 2 == 0) {
                sum += remainder;
            }
            number /= 10;

        }

        return sum;

    }

}
