import java.lang,*;
import java.util.Scanner;


public class UserFeeDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Student Fee: ");
        double fee = input.nextDouble();

        System.out.print("Enter the Discount Percentage: ");
        double discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        input.close();
    }
}
