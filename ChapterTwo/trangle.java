//2. Area Of Triangle
import java.util.*;
import java.lang.Math;
public class trangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three side of trangle:");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		int s = (side1+side2+side3)/2;
		System.out.println("Area of trangle is "+ Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
	}
}