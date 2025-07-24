import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter Weight in Pounds : ");
        double Pounds = scanner.nextDouble();
		
		double Kilogram = (Pounds * 2.2);
       
        
        System.out.println("The weight of the person in pound is " + Pounds + " and in kg is " + Kilogram );

        
       
        scanner.close();
    }
}
