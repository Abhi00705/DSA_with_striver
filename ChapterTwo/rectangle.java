//3. Area Of Rectangle Program 
import java.util.*;
import java.lang.Math;
public class rectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  side of rectangle:");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		System.out.println("Area of rectangle is "+ side1*side2);
	}
}