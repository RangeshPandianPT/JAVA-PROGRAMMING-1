import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter your destination city: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = scanner.nextDouble();

        System.out.print("Enter the total time taken (in hours): ");
        double timeTaken = scanner.nextDouble();

        
        double totalDistance = fromToVia + viaToFinalCity;

        
        double averageSpeed = totalDistance / timeTaken;

        System.out.print("Enter the travel fee: ");
        int fee = scanner.nextInt();

        System.out.print("Enter the discount percentage: ");
        int discountPercent = scanner.nextInt();

       
        int discountAmount = (fee * discountPercent) / 100;
        int finalFee = fee - discountAmount;

       
        System.out.println("\nTravel Summary:");
        System.out.println("Traveler Name: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Time Taken: " + timeTaken + " hours");
        System.out.println("Average Speed: " + averageSpeed + " mph");
        System.out.println("Final Fee after Discount: " + finalFee);

        int result1 = fee - discountAmount + 10;
        int result2 = fee * 2 - discountAmount;
        int result3 = fee / 2 + discountAmount;

        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", and " + result3);

        scanner.close();
    }
}
