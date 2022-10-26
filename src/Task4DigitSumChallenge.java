public class Task4DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("The sum of the number 125 = "+sumDigits(125));
        System.out.println("The sum of the number -125 = "+sumDigits(-125));
        System.out.println("The sum of the number 4 = "+sumDigits(4));
        System.out.println("The sum of the number 32123 = "+sumDigits(32123));


    }

    private static int sumDigits (int number){

        if(number < 10){
            return -1;
        }
        int sum = 0;
        while(number>0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }
}
