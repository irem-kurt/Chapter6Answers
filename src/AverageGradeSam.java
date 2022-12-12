import java.util.Random;

public class AverageGradeSam {
    public static void main(String[] args) {

        int numbers[] = new int[10]; // an array of 10 integers is defined
        String[] students = {"Ugur", "Emre", "Can", "Irem", "Ezgi", "Sena", "Ali", "Ozge", "Mehmet", "Gonul"} ;

        int grades[] = new int[10]; // defined a 10 slot array
        for (int i=0; i<10; i++) {


            int randomInteger = new Random().nextInt(100-1)+1; // this line creates a random integer between 1 to 100
            grades[i] = randomInteger; // with this line, we assign these random integers to the grades array.
        }
        System.out.println("Students and Grades:\n");

        for (int i = 0; i< students.length; i++) {
            System.out.println(students[i] + ": " + grades[i]);
        }

        int totalgrades = 0; // an integer totalgrades is defined to assign the total value of the integers to be used calculating the average grade.
        for(int i=0; i< grades.length; i++){ // with this for loop,  every value in the grades is summed up.

            totalgrades = totalgrades + grades[i];
        }

        double avg = totalgrades/(grades.length); // the average of determined by dividing the sum by the number of grades. double is used for more accuracy.
        System.out.println("\nAverage grade is: " + avg + "\n");

        int belowaveragecounter = 0; //belowaveragecounter is defined to count the students below the average.
        for (int i = 0; i<grades.length; i++) {
            if (grades[i] < avg) {
                belowaveragecounter = belowaveragecounter + 1;
            }
        }
        System.out.println(belowaveragecounter + " students are below the average.\n");
        System.out.println("List of students are below the average.");

        int j = 1; // a j is defined to count how many students are below the average.
        for (int i = 0; i<grades.length; i++) {	// a for loop and if condition is used to determine which students are below the average.
            if (grades[i] < avg) {

                System.out.println((j) + ". " + students[i] + ": " + grades[i]);
                j=j+1;
            }
        }
    }
}