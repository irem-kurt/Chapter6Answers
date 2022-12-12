        import java.util.Scanner;

        public class PrintCalendar {
            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                // Prompt the user to enter year
                System.out.print("Enter full year (e.g., 2012): ");
                // keep the year that user enters
                int year = input.nextInt();

                System.out.print(" Enter month as a number between 1 to 12: ");
                int month = input.nextInt();

                // Print calendar for the month of the year
                printMonth(year, month);
            }
            // A stub for printMonth may look like this
            public static void printMonth(int year, int month){
                System.out.print(month + " " + year);
            }
            public static void printMonthTitle(int year, int month ){
                System.out.println(" " + getMonthName(month) + " " + year);
                System.out.println("−−−−−−−−−−−−−−−−−−−−−−−−−−−−−");
                System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
            }
            public static String getMonthName(int month){
                String montName ="";
                switch (month) {
                    case 1: montName = "January"; break;
                    case 2: montName = "February"; break;
                    case 3: montName = "March"; break;
                    case 4: montName = "April"; break;
                    case 5: montName = "May"; break;
                    case 6: montName = "June"; break;
                    case 7: montName = "July"; break;
                    case 8: montName = "August"; break;
                    case 9: montName = "September"; break;
                    case 10: montName = "October"; break;
                    case 11: montName = "November"; break;
                    case 12: montName = "December"; break;
                }
                return montName;
            }
         public static void printMonthBody(int year, int month) {
                 // Get start day of the week for the first date in the month
                 int startDay = getStartDay(year, month);

                 // Get number of days in the month
                 int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

                 // Pad space before the first day of the month
                 int i = 0;
                 for (i = 0; i < startDay; i++)
                     System.out.print(" ");

                 for (i = 1; i <= numberOfDaysInMonth; i++) {
                     System.out.printf("%4d", i);

                     if ((i + startDay) % 7 == 0)
                         System.out.println();
                     }

                 System.out.println();
                 }

            public static int getStartDay(int year, int month) {
                 final int START_DAY_FOR_JAN_1_1800 = 3;
                 // Get total number of days from 1/1/1800 to month/1/year
                 int totalNumberOfDays = getTotalNumberOfDays(year, month);

                 // Return the start day for month/1/year
                 return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
                 }

            /** Get the total number of days since January 1, 1800 */
      public static int getTotalNumberOfDays(int year, int month) {
                 int total = 0;

                // Get the total days from 1800 to 1/1/year
               for (int i = 1800; i < year; i++)
                    if (isLeapYear(i))
                     total = total + 366;
                else
                 total = total + 365;

                 // Add days from Jan to the month prior to the calendar month
                 for (int i = 1; i < month; i++)
                     total = total + getNumberOfDaysInMonth(year, i);

                 return total;
                 }

             /** Get the number of days in a month */
             public static int getNumberOfDaysInMonth(int year, int month) {
                 if (month == 1 || month == 3 || month == 5 || month == 7 ||
                         month == 8 || month == 10 || month == 12)
                 return 31;

                 if (month == 4 || month == 6 || month == 9 || month == 11)
                     return 30;

                 if (month == 2) return isLeapYear(year) ? 29 : 28;

                 return 0; // If month is incorrect
                  }

             /** Determine if it is a leap year */
             public static boolean isLeapYear(int year) {
                 return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
                 }


        }