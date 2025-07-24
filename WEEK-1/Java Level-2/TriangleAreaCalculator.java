import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = scanner.nextDouble();

        
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516; 

       
        double heightInCm = height * 2.54; 
        double heightInFeet = height / 12; 

       
        System.out.println("Area of the triangle:");
        System.out.println(" - " + areaInInches + " square inches");
        System.out.println(" - " + areaInCm + " square centimeters");

        System.out.println("Your height in:");
        System.out.println(" - Centimeters: " + heightInCm);
        System.out.println(" - Feet: " + heightInFeet);
        System.out.println(" - Inches: " + height);

        scanner.close();
    }
}
