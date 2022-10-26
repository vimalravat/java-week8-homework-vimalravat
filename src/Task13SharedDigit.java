public class Task13SharedDigit {
    public static void main(String[] args) {
        System.out.println("hasSharedDigit(12,23);" + hasSharedDigit(12, 23));
        System.out.println("hasSharedDigit(9,99);" + hasSharedDigit(9, 99));
        System.out.println("hasShareDigit(15,55);" + hasSharedDigit(15, 55));


    }

    public static boolean hasSharedDigit(int x, int y) {
        if (x < 10 || x > 99 || y < 10 || y > 99)
            return false;

        if (x / 10 == y / 10 || x / 10 == y % 10 ||
                x % 10 == y / 10 || x % 10 == y % 10) {
            return true;
        }

        return false;
    }
}
