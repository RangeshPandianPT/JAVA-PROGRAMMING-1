import java.util.Scanner;

public class TriangleParkRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the first side of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the second side of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the third side of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();
        
       
        double perimeter = side1 + side2 + side3;
        
      
        double totalDistance = 5000; // 5 km = 5000 meters
        
        
        double rounds = totalDistance / perimeter;
        
       
        int totalRounds = (int) Math.ceil(rounds);
        
      
        System.out.println("The total number of rounds the athlete will run is " + totalRounds + " to complete 5 km.");
        
        scanner.close();
    }
}