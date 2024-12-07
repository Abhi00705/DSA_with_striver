//9. To find Armstrong Number between two given number.
import java.util.*;
import java.lang.Math;
public class Armstrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number for range: ");	
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(;a<=b;a++){
			int sum = checkArmstrong(a);
			if(sum == a){
				System.out.println(a+" is Armstrong");
			}
			
		}
	}
	static int checkArmstrong(int b){
		int temp = b,count=0,rem,sum=0;
		while(temp>0){
			temp=temp/10;
			count++;
		}
		while(b>0){
			rem=b%10;
			sum=sum+(int)Math.pow(rem,count);
			b=b/10;
		}
	return sum;
	}
}