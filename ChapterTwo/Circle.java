//1. Area Of Circle Java Program
import java.util.*;
public class Circle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		int radius = sc.nextInt();
		System.out.println("Area of circle is "+(3.14*radius*radius));
	}
}