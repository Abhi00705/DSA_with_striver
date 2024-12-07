//24. Take integer inputs till the user enters 0 and print the sum of all numbers
//(HINT: while loop)
import java.util.*;
import java.lang.Math;
public class sum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = 1,sum=0;
		while(num != 0){
			System.out.print("Ente the num:  ");

			num = sc.nextInt();
			sum=sum+num;
		}
		System.out.println("Sum of input are " + sum );
				
	}
}