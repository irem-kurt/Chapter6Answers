import java.util.Scanner;
public class SortDefinedArrayAndPrintMinInteger_Sam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //
        System.out.println("Enter 10 numbers here:"); // ask user to enter a number

        int numbers[] = new int[10]; // an array of 10 integers is defined

        for(int i=0; i<10; i++) { // this for loop enables user to enter integers 10 times
            numbers[i] = input.nextInt();
        }
        int temp; // we define a temporary integer for comparison purposes
        for(int i=0;i<numbers.length-1;i++){ //this will be our main comparison loop
            for(int j=0;j<numbers.length-1;j++){ // this for loop enables us to compare changing integers and sort in the array
                if(numbers[j] > numbers[j+1]){
                    temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.printf("Minimum is: %d", numbers[0]); //after we sort the array in an increasing order, we print the first integer which is the minimum.
    }
}