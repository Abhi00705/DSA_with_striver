//23. Input a number and print all the factors of that number (use loops).
 
import java.util.*;
import java.lang.Math;
public class factor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		System.out.print("Factor of "+num+" is ");
		for(int i=1;i<=num;i++){
			if(num%i == 0)System.out.print(i+"  ");
		}
		
	}
}