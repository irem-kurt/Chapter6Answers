import java.util.Scanner;

public class ReverseIntegerV1 {
    public static int reverse(int number){
        int reversedNumber = 0;
        int reminder;

        while (number >0){
            reminder = number % 10;
            reversedNumber =  (reversedNumber*10)+ reminder;
            number = number / 10;
        }
        return reversedNumber;
    }
    public static void main (String[] args) {
        // int number = 4526;

        System.out.print("Enter a number: ");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Reverse of the number is: " + reverse(n));
    }
}
