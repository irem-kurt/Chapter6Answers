import java.util.*;

public class CountOfOccurrences {
    static Map<Integer, Integer> listOfNumbers = new HashMap<Integer, Integer>();
    static String USER_PROMPT_TO_SHOW = "Enter the integers between 1 and 100:";

    public static void main(String[] args) {
        takeUserInput();

        List<Integer> listOfNumbersSorted = new ArrayList<>(listOfNumbers.keySet());
        Collections.sort(listOfNumbersSorted);

        printUserInputs(listOfNumbersSorted);
    }

    public static void takeUserInput() {
        System.out.println(USER_PROMPT_TO_SHOW);
        java.util.Scanner input = new java.util.Scanner(System.in);
        while (input.hasNext()) {
            int number = input.nextInt();
            if (number != 0) {
                addNumberToList(number);
            } else {
                break;
            }
        }
    }

    public static void addNumberToList(int number) {
        if (listOfNumbers.containsKey(number)) {
            listOfNumbers.replace(number, listOfNumbers.get(number) + 1);
        } else {
            listOfNumbers.put(number, 1);
        }
    }

    public static void printUserInputs(List<Integer> listOfNumbersSorted) {
        for(int key : listOfNumbersSorted) {
            String lineToPrint = String.valueOf(key) + " occurs " + String.valueOf(listOfNumbers.get(key)) +" time";
            if (listOfNumbers.get(key) > 1) lineToPrint = lineToPrint + "s";
            System.out.println(lineToPrint);
        }
    }
}
