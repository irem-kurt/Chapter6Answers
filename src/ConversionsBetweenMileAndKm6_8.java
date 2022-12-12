import java.util.Scanner;

public class ConversionsBetweenMileAndKm6_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double mile = input.nextDouble();
        System.out.print("Enter mile to be converted to km: " + mileToKm(mile));


    }

    public static double mileToKm(double mile){
        // 1 mile = 1.6 km

        double km = 0;
    return  (mile * 1.6)/km ;
    }
}
