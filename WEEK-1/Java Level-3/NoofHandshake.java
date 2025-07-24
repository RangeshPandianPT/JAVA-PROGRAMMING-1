import java.util.Scanner;

public class NoofHandshake{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
		
		System.out.print("Total Number of Students in a class:");
		int numberOfStudents = scanner.nextInt();
		
		int TotalnoofHandshake = (numberOfStudents * (numberOfStudents - 1)) / 2 ;
		System.out.println("The maximum number of handshakes among N number of students are " + TotalnoofHandshake);
		
	
        scanner.close();
    }
}
		