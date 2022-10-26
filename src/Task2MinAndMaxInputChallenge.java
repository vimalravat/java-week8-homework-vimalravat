import java.util.Scanner;

public class Task2MinAndMaxInputChallenge {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:  ");
        int number= sc.nextInt();
        int max = number;
        int min = number;
        while(number!= -1){
            if (number>max) {
                max= number;

            }else if (number<min){
                min = number;
            }
            System.out.println("Enter the number:   ");
            number= sc.nextInt();
        }
        if (max!=-1 && min!=-1){
            System.out.println("maximum was "+ max);
            System.out.println("minimum was"+min);
        }
    }

}
