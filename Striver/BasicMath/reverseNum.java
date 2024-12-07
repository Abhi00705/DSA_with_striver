import java.util.*;
public class reverseNum{
	public static void main(String[] args){
		int n=123456789;
		int rev=0;
		while(n!=0){
			int rem = n%10;
			rev = rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse number is : "+rev);
		
	}
}
// output:987654321