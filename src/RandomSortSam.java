import java.util.Arrays;
import java.util.Random;

public class RandomSortSam {

    public static void main(String[] args) {

        int inputArray[] = {4004, 201, 78, 4, 3, 1, 0, 1, 2, 3, 4, 9, -1, -302, 0, 9, -45, 0, 54, 5, 4, 3, 2, 1, -99, 666};
        // an array of 26 integers is defined

        int biggerArray[] = new int[1000];

        for (int i=0; i<1000; i++) {

            int randomInteger = new Random().nextInt(100000); // this line creates a random integer between 1 to 100000

            biggerArray[i] = randomInteger; // with this line, we assign these random integers to the grades array.

        }

        sort(inputArray); // with this function we sorted the array.
    }

    public static boolean isSorted(int[] inputArray) { // this function determines if the array is sorted or not

        for (int i=0; i<inputArray.length-2; i++) {

            if (inputArray[i] > inputArray[i+1]) {

                return false;
            }

        }

        return true;
    }

    public static void sort(int[] inputArray) { // this function takes random two positions as pos1<pos2, swaps the places if smaller indexed number is bigger than the bigger indexed one, counts the operations and halts if the process ends with isSort function.

        System.out.println("Before sort: " + Arrays.toString(inputArray));

        int counter = 0;

        while (isSorted(inputArray) != true) {

            int temp; // we define a temporary integer for comparison purposes

            int pos1 = new Random().nextInt(inputArray.length-1);

            int pos2 = new Random().nextInt(inputArray.length-1-pos1)+pos1;

            counter = counter+1;

            if (inputArray[pos1] > inputArray[pos2]) {

                temp = inputArray[pos1];

                inputArray[pos1] = inputArray[pos2];

                inputArray[pos2] = temp;

            }
        }

        System.out.println("\nNumber of sort iterations: " + counter);

        System.out.println("\nAfter sort: " + Arrays.toString(inputArray));
    }

}
