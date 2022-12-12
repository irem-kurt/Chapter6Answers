import java.util.Scanner;
public class sumDigitsOfInteger6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("The sum of the digits of the number is: " + sumDigits(num));
    }
    public static int sumDigits(int number){
        int sum;
        for (sum =0; number >0; sum = sum + number%10, number = number/10){
        }
        return sum;
    }
}
