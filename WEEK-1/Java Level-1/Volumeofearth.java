import java.lang.*;
import java.math.*;
public class volumeofearth{
	public static void main(String[] arg){
		int radius = 6378;
		int volume;
		int radiusinmile = radius/1.6;
		int voeik3 = (4/3)* pi*radius*radius*radius;
		int voeimle = (4/3)* pi*radiusinmile*radiusinmile*radiusinmile;
		System.out.println("The volume of earth in cubic kilometers is " + voeik3+ " and cubic miles is " + voeinmle+);	
	}
}
