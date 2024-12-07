//3. Calculate Average Of N Numbers
import java.util.*;
public class average{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("How many number you want to enter : ");
		int num = sc.nextInt();
		int a ,sum=0;
		for(int i =0 ;i<=num;i++){
			System.out.println("Enter the number : ");
			a= sc.nextInt();
			sum=sum+a;
		}
		System.out.println("Average : " + sum/num);	
	}
}