import java.util.Scanner;

public class TotalIncome {
      public static void main(String[] args){
	  
		Scanner scanner = new Scanner(System.in);
	  
		System.out.print("Enter the Salary Amount:");
		double salary = scanner.nextDouble();
	  
		System.out.print("Enter the bonus Amount:");
		double bonus = scanner.nextDouble();
	  
		double totalIncome = (salary + bonus);
		
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + " Hence Total Income is INR "+ totalIncome) ;
	  
	   scanner.close();
    }
}
	  
	  