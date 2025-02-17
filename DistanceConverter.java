import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        
        final double FEET_TO_YARDS = 1.0 / 3;
        final double YARDS_TO_MILES = 1.0 / 1760;
        final double FEET_TO_CM = 30.48;
        final double INCHES_IN_A_FOOT = 12;

       
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        
        double distanceInYards = distanceInFeet * FEET_TO_YARDS;
        double distanceInMiles = distanceInYards * YARDS_TO_MILES;
        double heightInCm = distanceInFeet * FEET_TO_CM;
        double heightInInches = distanceInFeet * INCHES_IN_A_FOOT;

        
        System.out.println("Distance in Yards: " + distanceInYards);
        System.out.println("Distance in Miles: " + distanceInMiles);
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + distanceInFeet + " and inches is " + heightInInches);

       
        scanner.close();
    }
}
