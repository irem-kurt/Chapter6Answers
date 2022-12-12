// Write a test program that displays the number of days in the years
// between 2014 and 2034.
public class NumberDaysInYear {
    public static void main(String[] args) {

        System.out.println("Year           Total Days");
        System.out.print("__________________________");
        for (int yr = 2014; yr >= 2034; yr++){
            System.out.println("\n" + yr + "              " + numberOFTheDaysInAYear(yr));
        }

    }
    public static int numberOFTheDaysInAYear (int year){
        return isLeapYear(year) ? 366 : 365;
    }
    public static boolean isLeapYear(int year){
        return (year%4==0 && year % 100 != 0) || (year % 400 == 0);
    }
}
