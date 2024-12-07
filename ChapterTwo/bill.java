//2. Calculate Electricity Bill
import java.util.*;
public class bill{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Electricity Bill unit : ");
		int unit = sc.nextInt();
		System.out.println("Electricity Bill unit is "+unit*8);	
	}
}