import java.util.Scanner;

public class SwapNo {
	public static void main (String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter First numbers:");
	int num1 = scanner.nextInt();
	
	System.out.print("Enter Second number:");
	int num2 = scanner.nextInt();
	
	System.out.println("Before Swapping:");
	System.out.println("First Number: "+ num1);
	System.out.println("Second Number: " + num2);
	
	System.out.println("After Swapping:");
	int temp = num1;
	num1 = num2;
	num2 = temp;
	System.out.println("First Number:" + num1);
	System.out.println("Second Number:" + num2);
	
	 scanner.close();
    }
}
	  
