import java.util.Scanner;

public class Task10ArmstrongNumber {
    public static void main(String [] args){

        int num, r, sum =0, temp;
        Scanner s =new Scanner(System.in);
        System.out.println("Input any number:  ");
        num = s.nextInt();
        temp = num;

        while (num>0){
            r = num % 10;
            sum= sum+ (r*r*r);
            num= num/10;

        }
        if (temp == sum){
            System.out.println("Armstrong number:  ");
        }
        else{
            System.out.println("Non-armstrong number:   ");

        }
        s.close();
    }
}
