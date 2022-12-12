import java.util.Scanner;

public class CountNumberOfLettersInString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt user to enter a string
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        // Display the number of letters in the string
        System.out.println(
                "The number of letters in the string is " + countLetters(string));
    }
    public static int countLetters(String s){
        int numberOfLetters = 0;
        for (int i = 0; i < s.length(); i++) {
            //Test if character is letter
            if (Character.isLetter(s.charAt(i)))
                numberOfLetters++; //increment number of letters
        }
        return numberOfLetters;
    }
}

